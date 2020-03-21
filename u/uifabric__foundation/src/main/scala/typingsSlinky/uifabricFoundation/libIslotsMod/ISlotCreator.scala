package typingsSlinky.uifabricFoundation.libIslotsMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends js.Object {
  var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.undefined
}

object ISlotCreator {
  @scala.inline
  def apply[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](
    create: (/* componentProps */ TProps with IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle) => ReturnType[ReactComponentClass[TProps]] = null
  ): ISlotCreator[TProps, TShorthandProp] = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction4(create))
    __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
  }
}

