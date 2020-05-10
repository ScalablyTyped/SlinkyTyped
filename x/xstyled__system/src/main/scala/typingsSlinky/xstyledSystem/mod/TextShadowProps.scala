package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.TextShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextShadowProps extends js.Object {
  val textShadow: js.UndefOr[ResponsiveValue[TextShadowProperty | Double]] = js.native
}

object TextShadowProps {
  @scala.inline
  def apply(): TextShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps]
  }
  @scala.inline
  implicit class TextShadowPropsOps[Self <: TextShadowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextShadow(value: ResponsiveValue[TextShadowProperty | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadow")(js.undefined)
        ret
    }
  }
  
}

