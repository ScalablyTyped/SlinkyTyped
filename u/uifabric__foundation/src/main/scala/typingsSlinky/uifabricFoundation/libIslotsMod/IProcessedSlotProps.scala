package typingsSlinky.uifabricFoundation.libIslotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProcessedSlotProps extends js.Object {
  var className: js.UndefOr[String] = js.native
}

object IProcessedSlotProps {
  @scala.inline
  def apply(): IProcessedSlotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProcessedSlotProps]
  }
  @scala.inline
  implicit class IProcessedSlotPropsOps[Self <: IProcessedSlotProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
  }
  
}

