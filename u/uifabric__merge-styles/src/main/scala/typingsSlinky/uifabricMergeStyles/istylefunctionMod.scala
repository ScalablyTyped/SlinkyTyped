package typingsSlinky.uifabricMergeStyles

import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/merge-styles/lib/IStyleFunction", JSImport.Namespace)
@js.native
object istylefunctionMod extends js.Object {
  type IStyleFunction[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = js.Function1[/* props */ TStylesProps, Partial[TStyleSet]]
  type IStyleFunctionOrObject[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = (IStyleFunction[TStylesProps, TStyleSet]) | Partial[TStyleSet]
}

