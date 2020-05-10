package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.DisplayProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayProps extends js.Object {
  val display: js.UndefOr[ResponsiveValue[DisplayProperty]] = js.native
}

object DisplayProps {
  @scala.inline
  def apply(): DisplayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayProps]
  }
  @scala.inline
  implicit class DisplayPropsOps[Self <: DisplayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: ResponsiveValue[DisplayProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
  }
  
}

