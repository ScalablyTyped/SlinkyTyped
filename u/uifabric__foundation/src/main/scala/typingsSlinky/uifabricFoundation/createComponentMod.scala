package typingsSlinky.uifabricFoundation

import slinky.core.ReactComponentClass
import typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IViewComponent
import typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/createComponent", JSImport.Namespace)
@js.native
object createComponentMod extends js.Object {
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): ReactComponentClass[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): ReactComponentClass[TComponentProps] with TStatics = js.native
}

