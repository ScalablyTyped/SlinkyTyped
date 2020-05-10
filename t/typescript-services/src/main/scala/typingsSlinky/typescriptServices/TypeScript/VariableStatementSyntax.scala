package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.VariableStatementSyntax")
@js.native
class VariableStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  var variableDeclaration: VariableDeclarationSyntax = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): VariableStatementSyntax = js.native
  def withModifier(modifier: ISyntaxToken): VariableStatementSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): VariableStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): VariableStatementSyntax = js.native
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): VariableStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.VariableStatementSyntax")
@js.native
object VariableStatementSyntax extends js.Object {
  def create(variableDeclaration: VariableDeclarationSyntax, semicolonToken: ISyntaxToken): VariableStatementSyntax = js.native
  def create1(variableDeclaration: VariableDeclarationSyntax): VariableStatementSyntax = js.native
}

