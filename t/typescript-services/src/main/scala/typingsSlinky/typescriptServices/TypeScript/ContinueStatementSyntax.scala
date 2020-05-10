package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ContinueStatementSyntax")
@js.native
class ContinueStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    continueKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var continueKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
  def withContinueKeyword(continueKeyword: ISyntaxToken): ContinueStatementSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ContinueStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ContinueStatementSyntax")
@js.native
object ContinueStatementSyntax extends js.Object {
  def create(continueKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
  def create1(): ContinueStatementSyntax = js.native
}

