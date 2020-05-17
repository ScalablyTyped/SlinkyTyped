package typingsSlinky.uifabricFoundation.icomponentMod

import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots]
  - js.Function1[
/ * props * / TComponentProps, 
typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots]]
*/
trait IPartialSlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] extends js.Object

object IPartialSlotComponent {
  @scala.inline
  implicit def apply[TComponentProps, TComponentSlots](value: js.Function1[/* props */ TComponentProps, ISlotDefinition[TComponentSlots]]): IPartialSlotComponent[TComponentProps, TComponentSlots] = value.asInstanceOf[IPartialSlotComponent[TComponentProps, TComponentSlots]]
  @scala.inline
  implicit def apply[TComponentProps, TComponentSlots](value: ISlotDefinition[TComponentSlots]): IPartialSlotComponent[TComponentProps, TComponentSlots] = value.asInstanceOf[IPartialSlotComponent[TComponentProps, TComponentSlots]]
}

