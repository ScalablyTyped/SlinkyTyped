package typingsSlinky.uifabricFoundation.libIslotsMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends js.Object {
  var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.native
}

object ISlotCreator {
  @scala.inline
  def apply[TProps, TShorthandProp](): ISlotCreator[TProps, TShorthandProp] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
  }
  @scala.inline
  implicit class ISlotCreatorOps[Self[tprops, tshorthandprop] <: ISlotCreator[tprops, tshorthandprop], TProps, TShorthandProp] (val x: Self[TProps, TShorthandProp]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps, TShorthandProp] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps, TShorthandProp]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProps, TShorthandProp]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProps, TShorthandProp]) with Other]
    @scala.inline
    def withCreate(
      value: (/* componentProps */ TProps with IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle) => ReturnType[ReactComponentClass[TProps]]
    ): Self[TProps, TShorthandProp] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self[TProps, TShorthandProp] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
  }
  
}

