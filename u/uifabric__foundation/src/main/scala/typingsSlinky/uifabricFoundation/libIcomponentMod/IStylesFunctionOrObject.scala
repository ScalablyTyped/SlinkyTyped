package typingsSlinky.uifabricFoundation.libIcomponentMod

import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunction[TViewProps, TTokens, TStyleSet]
  - TStyleSet
*/
trait IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object

object IStylesFunctionOrObject {
  @scala.inline
  implicit def apply[TViewProps, TTokens, TStyleSet](value: IStylesFunction[TViewProps, TTokens, TStyleSet]): IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = value.asInstanceOf[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]]
  @scala.inline
  implicit def apply[TViewProps, TTokens, TStyleSet](value: TStyleSet): IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = value.asInstanceOf[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]]
}

