package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnscopedEmitHelper extends EmitHelper {
  @JSName("scoped")
  val scoped_UnscopedEmitHelper: `false` = js.native
  @JSName("text")
  val text_UnscopedEmitHelper: java.lang.String = js.native
}

object UnscopedEmitHelper {
  @scala.inline
  def apply(name: java.lang.String, scoped: `false`, text: java.lang.String): UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnscopedEmitHelper]
  }
  @scala.inline
  implicit class UnscopedEmitHelperOps[Self <: UnscopedEmitHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScoped(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

