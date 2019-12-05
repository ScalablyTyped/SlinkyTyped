package typingsSlinky.atUifabricFoundation

import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotDefinition
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlottableProps
import typingsSlinky.atUifabricFoundation.libISlotsMod.ValidProps
import typingsSlinky.atUifabricFoundation.libNextIComponentMod.IComponentOptions
import typingsSlinky.atUifabricFoundation.libNextIComponentMod.IPartialSlotComponent
import typingsSlinky.atUifabricFoundation.libNextIComponentMod.IRecompositionComponentOptions
import typingsSlinky.atUifabricFoundation.libNextIComponentMod.ISlotComponent
import typingsSlinky.atUifabricFoundation.libNextISlotsMod.IFoundationComponent
import typingsSlinky.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typingsSlinky.react.reactMod.FunctionComponent
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/next/composed", JSImport.Namespace)
@js.native
object libNextComposedMod extends js.Object {
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    baseComponent: FunctionComponent[js.Object],
    options: IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](
    slots: js.UndefOr[
      (IPartialSlotComponent[TComponentProps, TComponentSlots]) | (ISlotComponent[TComponentProps, TComponentSlots])
    ],
    data: TComponentProps
  ): ISlotDefinition[Required[TComponentSlots]] = js.native
}

