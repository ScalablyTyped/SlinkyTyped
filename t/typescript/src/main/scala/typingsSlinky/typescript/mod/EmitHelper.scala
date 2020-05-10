package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitHelper extends js.Object {
  val name: java.lang.String = js.native
  val priority: js.UndefOr[Double] = js.native
  val scoped: Boolean = js.native
  val text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String]) = js.native
}

object EmitHelper {
  @scala.inline
  def apply(
    name: java.lang.String,
    scoped: Boolean,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
  ): EmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitHelper]
  }
  @scala.inline
  implicit class EmitHelperOps[Self <: EmitHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScoped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextFunction1(value: /* node */ EmitHelperUniqueNameCallback => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(
      value: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

