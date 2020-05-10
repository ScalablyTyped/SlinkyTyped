package typingsSlinky.yaml.typesMod.Schema

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyContext
  extends /* key */ StringDictionary[js.Any] {
  var forceBlockIndent: js.UndefOr[Boolean] = js.native
  var implicitKey: js.UndefOr[Boolean] = js.native
  var inFlow: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[String] = js.native
  var indentAtStart: js.UndefOr[Double] = js.native
}

object StringifyContext {
  @scala.inline
  def apply(): StringifyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyContext]
  }
  @scala.inline
  implicit class StringifyContextOps[Self <: StringifyContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceBlockIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBlockIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceBlockIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBlockIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInFlow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentAtStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentAtStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentAtStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentAtStart")(js.undefined)
        ret
    }
  }
  
}

