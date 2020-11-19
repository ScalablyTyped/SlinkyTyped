package typingsSlinky.typescriptServices.mod.Syntax

import typingsSlinky.typescriptServices.TypeScript.ISyntaxTrivia
import typingsSlinky.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Syntax.trivia")
@js.native
object trivia extends js.Object {
  
  def apply(kind: SyntaxKind, text: String): ISyntaxTrivia = js.native
}
