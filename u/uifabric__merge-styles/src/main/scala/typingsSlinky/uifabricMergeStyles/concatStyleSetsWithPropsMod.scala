package typingsSlinky.uifabricMergeStyles

import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/merge-styles/lib/concatStyleSetsWithProps", JSImport.Namespace)
@js.native
object concatStyleSetsWithPropsMod extends js.Object {
  
  def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): DeepPartial[TStyleSet] = js.native
}
