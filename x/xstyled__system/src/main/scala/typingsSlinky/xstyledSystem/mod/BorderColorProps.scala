package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorProps extends js.Object {
  val borderColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.native
}

object BorderColorProps {
  @scala.inline
  def apply(): BorderColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorProps]
  }
  @scala.inline
  implicit class BorderColorPropsOps[Self <: BorderColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: ResponsiveValue[BorderColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
  }
  
}

