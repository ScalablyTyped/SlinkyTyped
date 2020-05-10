package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BreakStatementSyntax")
@js.native
class BreakStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    breakKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var breakKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
  def withBreakKeyword(breakKeyword: ISyntaxToken): BreakStatementSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): BreakStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.BreakStatementSyntax")
@js.native
object BreakStatementSyntax extends js.Object {
  def create(breakKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
  def create1(): BreakStatementSyntax = js.native
}

