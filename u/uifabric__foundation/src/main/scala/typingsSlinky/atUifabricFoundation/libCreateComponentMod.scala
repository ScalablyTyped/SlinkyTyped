package typingsSlinky.atUifabricFoundation

import slinky.core.ReactComponentClass
import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponentOptions
import typingsSlinky.atUifabricFoundation.libIComponentMod.IViewComponent
import typingsSlinky.atUifabricFoundation.libISlotsMod.ValidProps
import typingsSlinky.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/createComponent", JSImport.Namespace)
@js.native
object libCreateComponentMod extends js.Object {
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): ReactComponentClass[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): ReactComponentClass[TComponentProps] with TStatics = js.native
}

