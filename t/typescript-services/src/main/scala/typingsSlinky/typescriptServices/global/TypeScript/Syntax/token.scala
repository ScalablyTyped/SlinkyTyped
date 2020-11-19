package typingsSlinky.typescriptServices.global.TypeScript.Syntax

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITokenInfo
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Syntax.token")
@js.native
object token extends js.Object {
  
  def apply(kind: SyntaxKind): ISyntaxToken = js.native
  def apply(kind: SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
}
