package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.PositionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionProps extends js.Object {
  val position: js.UndefOr[ResponsiveValue[PositionProperty]] = js.native
}

object PositionProps {
  @scala.inline
  def apply(): PositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionProps]
  }
  @scala.inline
  implicit class PositionPropsOps[Self <: PositionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: ResponsiveValue[PositionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

