package typingsSlinky.uifabricFoundation.libIcomponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunction[TViewProps, TTokens]
  - TTokens
*/
trait ITokenFunctionOrObject[TViewProps, TTokens] extends ITokenBase[TViewProps, TTokens]

object ITokenFunctionOrObject {
  @scala.inline
  implicit def apply[TViewProps, TTokens](value: ITokenFunction[TViewProps, TTokens]): ITokenFunctionOrObject[TViewProps, TTokens] = value.asInstanceOf[ITokenFunctionOrObject[TViewProps, TTokens]]
  @scala.inline
  implicit def apply[TViewProps, TTokens](value: TTokens): ITokenFunctionOrObject[TViewProps, TTokens] = value.asInstanceOf[ITokenFunctionOrObject[TViewProps, TTokens]]
}

