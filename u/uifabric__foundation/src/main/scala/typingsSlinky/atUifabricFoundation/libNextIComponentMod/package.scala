package typingsSlinky.atUifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNextIComponentMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotDefinition
  import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlots
  import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlottableProps
  import typingsSlinky.react.reactMod.PropsWithChildren
  import typingsSlinky.std.Required
  import typingsSlinky.std.ReturnType

  type IPartialSlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[TComponentSlots] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[TComponentSlots]])
  type ISlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[Required[TComponentSlots]] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[Required[TComponentSlots]]])
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ PropsWithChildren[TViewProps], 
    /* slots */ ISlots[Required[TComponentSlots]], 
    ReturnType[ReactComponentClass[js.Object]]
  ]
}
