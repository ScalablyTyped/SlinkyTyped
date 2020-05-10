package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var block: BlockSyntax = js.native
  var catchClause: CatchClauseSyntax = js.native
  var finallyClause: FinallyClauseSyntax = js.native
  var tryKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax
  ): TryStatementSyntax = js.native
  def withBlock(block: BlockSyntax): TryStatementSyntax = js.native
  def withCatchClause(catchClause: CatchClauseSyntax): TryStatementSyntax = js.native
  def withFinallyClause(finallyClause: FinallyClauseSyntax): TryStatementSyntax = js.native
  def withTryKeyword(tryKeyword: ISyntaxToken): TryStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  def create(tryKeyword: ISyntaxToken, block: BlockSyntax): TryStatementSyntax = js.native
  def create1(): TryStatementSyntax = js.native
}

