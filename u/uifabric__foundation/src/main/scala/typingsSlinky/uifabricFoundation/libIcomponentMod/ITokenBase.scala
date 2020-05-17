package typingsSlinky.uifabricFoundation.libIcomponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[TViewProps, TTokens]
  - typingsSlinky.uifabricFoundation.uifabricFoundationBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait ITokenBase[TViewProps, TTokens] extends IToken[TViewProps, TTokens]

object ITokenBase {
  @scala.inline
  def `false`[TViewProps, TTokens]: typingsSlinky.uifabricFoundation.uifabricFoundationBooleans.`false` = false.asInstanceOf[typingsSlinky.uifabricFoundation.uifabricFoundationBooleans.`false`]
  @scala.inline
  implicit def apply[TViewProps, TTokens](value: ITokenFunctionOrObject[TViewProps, TTokens]): ITokenBase[TViewProps, TTokens] = value.asInstanceOf[ITokenBase[TViewProps, TTokens]]
  @scala.inline
  implicit def apply[TViewProps, TTokens](value: Null): ITokenBase[TViewProps, TTokens] = value.asInstanceOf[ITokenBase[TViewProps, TTokens]]
  @scala.inline
  implicit def fromUndef[TViewProps, TTokens, T](value: js.UndefOr[T])(implicit ev: T => ITokenBase[TViewProps, TTokens]): ITokenBase[TViewProps, TTokens] = value.asInstanceOf[ITokenBase[TViewProps, TTokens]]
}

