package typingsSlinky.atUifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libISlotsMod {
  import slinky.core.ReactComponentClass
  import slinky.core.facade.ReactElement
  import typingsSlinky.atUifabricFoundation.Anon_Slots
  import typingsSlinky.atUifabricMergeDashStyles.libIStyleMod.IStyle
  import typingsSlinky.react.reactMod.PropsWithChildren
  import typingsSlinky.std.ReturnType

  type ExtractProps[TUnion] = js.Any
  type ExtractShorthand[TUnion] = String | Double | Boolean
  type ISlotDefinition[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: react.react.ElementType<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typingsSlinky.atUifabricFoundation.atUifabricFoundationStrings.ISlotDefinition with TSlots
  type ISlotFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = js.Function4[
    /* componentProps */ TProps with IProcessedSlotProps, 
    /* userProps */ ISlotProp[TProps, TShorthandProp], 
    /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], 
    /* defaultStyles */ IStyle, 
    ReturnType[ReactComponentClass[TProps]]
  ]
  type ISlotProp[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = TShorthandProp | TProps
  type ISlotRender[TProps] = js.Function2[
    /* props */ PropsWithChildren[TProps], 
    /* defaultComponent */ ReactComponentClass[TProps], 
    ReturnType[ReactComponentClass[TProps]]
  ]
  type ISlots[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlot<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typingsSlinky.atUifabricFoundation.atUifabricFoundationStrings.ISlots with TSlots
  type ISlottableComponentType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ReactComponentClass[TProps] with (ISlotCreator[TProps, TShorthandProp])
  type ISlottableProps[TSlots] = TSlots with Anon_Slots[TSlots]
  type ISlottableReactType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ReactElement with (ISlotCreator[TProps, TShorthandProp])
  type ValidProps = js.Object
  type ValidShorthand = String | Double | Boolean
}
