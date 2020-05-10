package typingsSlinky.uifabricFoundation.libIslotsMod

import typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaultSlotProps[TSlots] extends js.Object {
  var _defaultStyles: IComponentStyles[TSlots] = js.native
}

object IDefaultSlotProps {
  @scala.inline
  def apply[TSlots](_defaultStyles: IComponentStyles[TSlots]): IDefaultSlotProps[TSlots] = {
    val __obj = js.Dynamic.literal(_defaultStyles = _defaultStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaultSlotProps[TSlots]]
  }
  @scala.inline
  implicit class IDefaultSlotPropsOps[Self[tslots] <: IDefaultSlotProps[tslots], TSlots] (val x: Self[TSlots]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSlots] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSlots]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSlots] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSlots] with Other]
    @scala.inline
    def with_defaultStyles(value: IComponentStyles[TSlots]): Self[TSlots] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultStyles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

