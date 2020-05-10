package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EmptyStatementSyntax")
@js.native
class EmptyStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(semicolonToken: ISyntaxToken, parsedInStrictMode: Boolean) = this()
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.EmptyStatementSyntax")
@js.native
object EmptyStatementSyntax extends js.Object {
  def create1(): EmptyStatementSyntax = js.native
}

