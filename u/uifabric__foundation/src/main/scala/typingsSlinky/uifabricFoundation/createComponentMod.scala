package typingsSlinky.uifabricFoundation

import slinky.core.ReactComponentClass
import typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IViewComponent
import typingsSlinky.uifabricFoundation.libIslotsMod.ValidProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createComponentMod {
  
  @JSImport("@uifabric/foundation/lib/createComponent", "createComponent")
  @js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): ReactComponentClass[TComponentProps] with TStatics = js.native
  @JSImport("@uifabric/foundation/lib/createComponent", "createComponent")
  @js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): ReactComponentClass[TComponentProps] with TStatics = js.native
}
