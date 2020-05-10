package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LabeledStatementSyntax")
@js.native
class LabeledStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    identifier: ISyntaxToken,
    colonToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var colonToken: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): LabeledStatementSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): LabeledStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): LabeledStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.LabeledStatementSyntax")
@js.native
object LabeledStatementSyntax extends js.Object {
  def create1(identifier: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax = js.native
}

