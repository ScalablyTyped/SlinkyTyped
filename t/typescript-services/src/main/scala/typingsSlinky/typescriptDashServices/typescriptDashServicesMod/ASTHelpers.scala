package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.IASTSpan
import typingsSlinky.typescriptDashServices.TypeScript.IParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ASTHelpers")
@js.native
object ASTHelpers extends js.Object {
  def docComments(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Comment] = js.native
  def enumIsElided(declaration: typingsSlinky.typescriptDashServices.TypeScript.EnumDeclaration): Boolean = js.native
  def getAstAtPosition(script: typingsSlinky.typescriptDashServices.TypeScript.AST, pos: Double): typingsSlinky.typescriptDashServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptDashServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typingsSlinky.typescriptDashServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptDashServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typingsSlinky.typescriptDashServices.TypeScript.AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): typingsSlinky.typescriptDashServices.TypeScript.MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): typingsSlinky.typescriptDashServices.TypeScript.ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): typingsSlinky.typescriptDashServices.TypeScript.Parameter = js.native
  def getExtendsHeritageClause(clauses: typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptDashServices.TypeScript.HeritageClause = js.native
  def getImplementsHeritageClause(clauses: typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptDashServices.TypeScript.HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): typingsSlinky.typescriptDashServices.TypeScript.ModuleDeclaration = js.native
  def getModuleNames(name: typingsSlinky.typescriptDashServices.TypeScript.AST): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Identifier] = js.native
  def getModuleNames(
    name: typingsSlinky.typescriptDashServices.TypeScript.AST,
    result: js.Array[typingsSlinky.typescriptDashServices.TypeScript.Identifier]
  ): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: typingsSlinky.typescriptDashServices.TypeScript.AST): String = js.native
  def getParameterList(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): typingsSlinky.typescriptDashServices.TypeScript.ParameterList = js.native
  def getType(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): typingsSlinky.typescriptDashServices.TypeScript.AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typingsSlinky.typescriptDashServices.TypeScript.VariableDeclarator): js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullElementFlags] = js.native
  def isCallExpression(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isCallExpressionTarget(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isDeclarationAST(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isIntegerLiteralAST(expression: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isLastNameOfModule(
    ast: typingsSlinky.typescriptDashServices.TypeScript.ModuleDeclaration,
    astName: typingsSlinky.typescriptDashServices.TypeScript.AST
  ): Boolean = js.native
  def isNameOfFunction(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberAccessExpression(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberFunction(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isRightSideOfQualifiedName(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  def moduleIsElided(declaration: typingsSlinky.typescriptDashServices.TypeScript.ModuleDeclaration): Boolean = js.native
  def parametersFromIdentifier(id: typingsSlinky.typescriptDashServices.TypeScript.Identifier): IParameters = js.native
  def parametersFromParameter(parameter: typingsSlinky.typescriptDashServices.TypeScript.Parameter): IParameters = js.native
  def parametersFromParameterList(list: typingsSlinky.typescriptDashServices.TypeScript.ParameterList): IParameters = js.native
  def parentIsModuleDeclaration(ast: typingsSlinky.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def scriptIsElided(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnit): Boolean = js.native
}

