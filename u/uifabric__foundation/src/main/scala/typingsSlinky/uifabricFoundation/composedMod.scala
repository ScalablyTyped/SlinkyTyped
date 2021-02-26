package typingsSlinky.uifabricFoundation

import slinky.core.ReactComponentClass
import typingsSlinky.std.Required
import typingsSlinky.uifabricFoundation.icomponentMod.IComponentOptions
import typingsSlinky.uifabricFoundation.icomponentMod.IPartialSlotComponent
import typingsSlinky.uifabricFoundation.icomponentMod.IRecompositionComponentOptions
import typingsSlinky.uifabricFoundation.icomponentMod.ISlotComponent
import typingsSlinky.uifabricFoundation.islotsMod.IFoundationComponent
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composedMod {
  
  @JSImport("@uifabric/foundation/lib/next/composed", "composed")
  @js.native
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    baseComponent: ReactComponentClass[js.Object],
    options: IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  @JSImport("@uifabric/foundation/lib/next/composed", "composed")
  @js.native
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  
  @JSImport("@uifabric/foundation/lib/next/composed", "resolveSlots")
  @js.native
  def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](
    slots: js.UndefOr[
      (IPartialSlotComponent[TComponentProps, TComponentSlots]) | (ISlotComponent[TComponentProps, TComponentSlots])
    ],
    data: TComponentProps
  ): ISlotDefinition[Required[TComponentSlots]] = js.native
}
