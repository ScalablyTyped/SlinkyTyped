package typingsSlinky.uifabricMergeStyles.istylefunctionMod

import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunction[TStylesProps, TStyleSet]
  - typingsSlinky.std.Partial[TStyleSet]
*/
trait IStyleFunctionOrObject[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object

object IStyleFunctionOrObject {
  @scala.inline
  implicit def apply[TStylesProps, TStyleSet](value: IStyleFunction[TStylesProps, TStyleSet]): IStyleFunctionOrObject[TStylesProps, TStyleSet] = value.asInstanceOf[IStyleFunctionOrObject[TStylesProps, TStyleSet]]
  @scala.inline
  implicit def apply[TStylesProps, TStyleSet](value: Partial[TStyleSet]): IStyleFunctionOrObject[TStylesProps, TStyleSet] = value.asInstanceOf[IStyleFunctionOrObject[TStylesProps, TStyleSet]]
}

