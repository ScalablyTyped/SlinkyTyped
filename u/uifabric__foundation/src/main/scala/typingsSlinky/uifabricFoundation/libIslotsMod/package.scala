package typingsSlinky.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libIslotsMod {
  
  type ExtractProps[TUnion] = js.Any
  
  type ExtractShorthand[TUnion] = java.lang.String | scala.Double | scala.Boolean
  
  type ISlotDefinition[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: react.react.ElementType<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typingsSlinky.uifabricFoundation.uifabricFoundationStrings.ISlotDefinition with org.scalablytyped.runtime.TopLevel[TSlots]
  
  type ISlotFactory[TProps /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidShorthand */] = js.Function5[
    /* componentProps */ TProps with typingsSlinky.uifabricFoundation.libIslotsMod.IProcessedSlotProps, 
    /* userProps */ typingsSlinky.uifabricFoundation.libIslotsMod.ISlotProp[TProps, TShorthandProp], 
    /* slotOptions */ js.UndefOr[typingsSlinky.uifabricFoundation.libIslotsMod.ISlotOptions[TProps]], 
    /* defaultStyles */ typingsSlinky.uifabricMergeStyles.istyleMod.IStyle, 
    /* theme */ js.UndefOr[typingsSlinky.fluentuiTheme.ithemeMod.ITheme], 
    typingsSlinky.std.ReturnType[slinky.core.ReactComponentClass[TProps]]
  ]
  
  type ISlotProp[TProps /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidShorthand */] = TShorthandProp | TProps
  
  type ISlotRender[TProps] = js.Function2[
    /* props */ typingsSlinky.react.mod.PropsWithChildren[TProps], 
    /* defaultComponent */ slinky.core.ReactComponentClass[TProps], 
    typingsSlinky.std.ReturnType[slinky.core.ReactComponentClass[TProps]]
  ]
  
  type ISlots[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlot<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typingsSlinky.uifabricFoundation.uifabricFoundationStrings.ISlots with org.scalablytyped.runtime.TopLevel[TSlots]
  
  type ISlottableComponentType[TProps /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidShorthand */] = slinky.core.ReactComponentClass[TProps] with (typingsSlinky.uifabricFoundation.libIslotsMod.ISlotCreator[TProps, TShorthandProp])
  
  type ISlottableProps[TSlots] = TSlots with typingsSlinky.uifabricFoundation.anon.Slots[TSlots]
  
  type ISlottableReactType[TProps /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typingsSlinky.uifabricFoundation.libIslotsMod.ValidShorthand */] = slinky.core.facade.ReactElement with (typingsSlinky.uifabricFoundation.libIslotsMod.ISlotCreator[TProps, TShorthandProp])
  
  type ValidProps = js.Object
  
  type ValidShorthand = java.lang.String | scala.Double | scala.Boolean
}
