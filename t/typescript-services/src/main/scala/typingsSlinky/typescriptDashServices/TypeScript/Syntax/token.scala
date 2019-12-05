package typingsSlinky.typescriptDashServices.TypeScript.Syntax

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptDashServices.TypeScript.ITokenInfo
import typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.token")
@js.native
object token extends js.Object {
  def apply(kind: SyntaxKind): ISyntaxToken = js.native
  def apply(kind: SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
}

