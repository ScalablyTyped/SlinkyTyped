package typingsSlinky.uifabricFoundation.libIcomponentMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenFunction[TViewProps, TTokens] extends ITokenFunctionOrObject[TViewProps, TTokens] {
  def apply(props: TViewProps, theme: ITheme): IToken[TViewProps, TTokens] = js.native
}

