package typingsSlinky.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object icomponentMod {
  type IPartialSlotComponent[TComponentProps /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */, TComponentSlots] = typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots] | (js.Function1[
    /* props */ TComponentProps, 
    typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[TComponentSlots]
  ])
  type ISlotComponent[TComponentProps /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */, TComponentSlots] = typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[typingsSlinky.std.Required[TComponentSlots]] | (js.Function1[
    /* props */ TComponentProps, 
    typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition[typingsSlinky.std.Required[TComponentSlots]]
  ])
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ typingsSlinky.react.mod.PropsWithChildren[TViewProps], 
    /* slots */ typingsSlinky.uifabricFoundation.libIslotsMod.ISlots[typingsSlinky.std.Required[TComponentSlots]], 
    typingsSlinky.std.ReturnType[slinky.core.ReactComponentClass[js.Object]]
  ]
}
