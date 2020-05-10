package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BlockSyntax")
@js.native
class BlockSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    statements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var openBraceToken: ISyntaxToken = js.native
  var statements: ISyntaxList = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): BlockSyntax = js.native
  def withStatement(statement: IStatementSyntax): BlockSyntax = js.native
  def withStatements(statements: ISyntaxList): BlockSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.BlockSyntax")
@js.native
object BlockSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  def create1(): BlockSyntax = js.native
}

