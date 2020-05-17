package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IASTSpan
import typingsSlinky.typescriptServices.TypeScript.IParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ASTHelpers")
@js.native
object ASTHelpers extends js.Object {
  def docComments(ast: typingsSlinky.typescriptServices.TypeScript.AST): js.Array[typingsSlinky.typescriptServices.TypeScript.Comment] = js.native
  def enumIsElided(declaration: typingsSlinky.typescriptServices.TypeScript.EnumDeclaration): Boolean = js.native
  def getAstAtPosition(script: typingsSlinky.typescriptServices.TypeScript.AST, pos: Double): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.Parameter = js.native
  def getExtendsHeritageClause(clauses: typingsSlinky.typescriptServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptServices.TypeScript.HeritageClause = js.native
  def getImplementsHeritageClause(clauses: typingsSlinky.typescriptServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptServices.TypeScript.HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration = js.native
  def getModuleNames(name: typingsSlinky.typescriptServices.TypeScript.AST): js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier] = js.native
  def getModuleNames(
    name: typingsSlinky.typescriptServices.TypeScript.AST,
    result: js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier]
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: typingsSlinky.typescriptServices.TypeScript.AST): String = js.native
  def getParameterList(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ParameterList = js.native
  def getType(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typingsSlinky.typescriptServices.TypeScript.VariableDeclarator): js.Array[typingsSlinky.typescriptServices.TypeScript.PullElementFlags] = js.native
  def isCallExpression(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isCallExpressionTarget(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isDeclarationAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isIntegerLiteralAST(expression: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isLastNameOfModule(
    ast: typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typingsSlinky.typescriptServices.TypeScript.AST
  ): Boolean = js.native
  def isNameOfFunction(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberAccessExpression(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberFunction(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isRightSideOfQualifiedName(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  def moduleIsElided(declaration: typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration): Boolean = js.native
  def parametersFromIdentifier(id: typingsSlinky.typescriptServices.TypeScript.Identifier): IParameters = js.native
  def parametersFromParameter(parameter: typingsSlinky.typescriptServices.TypeScript.Parameter): IParameters = js.native
  def parametersFromParameterList(list: typingsSlinky.typescriptServices.TypeScript.ParameterList): IParameters = js.native
  def parentIsModuleDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  def scriptIsElided(sourceUnit: typingsSlinky.typescriptServices.TypeScript.SourceUnit): Boolean = js.native
}

