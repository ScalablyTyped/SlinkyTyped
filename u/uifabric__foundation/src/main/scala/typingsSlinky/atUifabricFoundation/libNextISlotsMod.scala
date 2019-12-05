package typingsSlinky.atUifabricFoundation

import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlottableProps
import typingsSlinky.atUifabricFoundation.libISlotsMod.ValidProps
import typingsSlinky.atUifabricFoundation.libNextIComponentMod.IComponentOptions
import typingsSlinky.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/next/ISlots", JSImport.Namespace)
@js.native
object libNextISlotsMod extends js.Object {
  @js.native
  trait IFoundationComponent[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics]
    extends FunctionComponent[js.Object] {
    var __options: js.UndefOr[
        IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
      ] = js.native
  }
  
}

