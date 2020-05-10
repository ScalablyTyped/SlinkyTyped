package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRightColorProps extends js.Object {
  val borderRightColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.native
}

object BorderRightColorProps {
  @scala.inline
  def apply(): BorderRightColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightColorProps]
  }
  @scala.inline
  implicit class BorderRightColorPropsOps[Self <: BorderRightColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderRightColor(value: ResponsiveValue[BorderColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(js.undefined)
        ret
    }
  }
  
}

