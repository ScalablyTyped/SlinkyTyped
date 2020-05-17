package typingsSlinky.uifabricFoundation.libIcomponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenBase[TViewProps, TTokens]
  - typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenBaseArray[TViewProps, TTokens]
*/
trait IToken[TViewProps, TTokens] extends js.Object

object IToken {
  @scala.inline
  implicit def apply[TViewProps, TTokens](value: ITokenBase[TViewProps, TTokens]): IToken[TViewProps, TTokens] = value.asInstanceOf[IToken[TViewProps, TTokens]]
  @scala.inline
  implicit def apply[TViewProps, TTokens](value: ITokenBaseArray[TViewProps, TTokens]): IToken[TViewProps, TTokens] = value.asInstanceOf[IToken[TViewProps, TTokens]]
}

