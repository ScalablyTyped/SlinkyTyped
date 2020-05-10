package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DefaultSwitchClauseSyntax")
@js.native
class DefaultSwitchClauseSyntax protected ()
  extends SyntaxNode
     with ISwitchClauseSyntax {
  def this(
    defaultKeyword: ISyntaxToken,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
  var colonToken: ISyntaxToken = js.native
  var defaultKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isSwitchClause(): Boolean = js.native
  def update(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  def withDefaultKeyword(defaultKeyword: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  def withStatement(statement: IStatementSyntax): DefaultSwitchClauseSyntax = js.native
  def withStatements(statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.DefaultSwitchClauseSyntax")
@js.native
object DefaultSwitchClauseSyntax extends js.Object {
  def create(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  def create1(): DefaultSwitchClauseSyntax = js.native
}

