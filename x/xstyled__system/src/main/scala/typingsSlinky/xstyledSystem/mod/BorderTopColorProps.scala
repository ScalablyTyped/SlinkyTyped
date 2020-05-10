package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderTopColorProps extends js.Object {
  val borderTopColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.native
}

object BorderTopColorProps {
  @scala.inline
  def apply(): BorderTopColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopColorProps]
  }
  @scala.inline
  implicit class BorderTopColorPropsOps[Self <: BorderTopColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderTopColor(value: ResponsiveValue[BorderColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(js.undefined)
        ret
    }
  }
  
}

