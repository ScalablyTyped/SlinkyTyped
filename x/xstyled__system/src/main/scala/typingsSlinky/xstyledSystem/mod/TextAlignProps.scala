package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.TextAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAlignProps extends js.Object {
  val textAlign: js.UndefOr[ResponsiveValue[TextAlignProperty]] = js.native
}

object TextAlignProps {
  @scala.inline
  def apply(): TextAlignProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAlignProps]
  }
  @scala.inline
  implicit class TextAlignPropsOps[Self <: TextAlignProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextAlign(value: ResponsiveValue[TextAlignProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
  }
  
}

