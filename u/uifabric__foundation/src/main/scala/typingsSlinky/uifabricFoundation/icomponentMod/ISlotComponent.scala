package typingsSlinky.uifabricFoundation.icomponentMod

import typingsSlinky.std.Required
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[typingsSlinky.std.Required[TComponentSlots]]
  - js.Function1[
/ * props * / TComponentProps, 
typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[typingsSlinky.std.Required[TComponentSlots]]]
*/
trait ISlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] extends js.Object

object ISlotComponent {
  @scala.inline
  implicit def apply[TComponentProps, TComponentSlots](value: js.Function1[/* props */ TComponentProps, ISlotDefinition[Required[TComponentSlots]]]): ISlotComponent[TComponentProps, TComponentSlots] = value.asInstanceOf[ISlotComponent[TComponentProps, TComponentSlots]]
  @scala.inline
  implicit def apply[TComponentProps, TComponentSlots](value: ISlotDefinition[Required[TComponentSlots]]): ISlotComponent[TComponentProps, TComponentSlots] = value.asInstanceOf[ISlotComponent[TComponentProps, TComponentSlots]]
}

