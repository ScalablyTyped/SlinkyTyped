package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IASTSpan
import typingsSlinky.typescriptServices.TypeScript.IParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ASTHelpers {
  
  @JSGlobal("TypeScript.ASTHelpers.docComments")
  @js.native
  def docComments(ast: typingsSlinky.typescriptServices.TypeScript.AST): js.Array[typingsSlinky.typescriptServices.TypeScript.Comment] = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.enumIsElided")
  @js.native
  def enumIsElided(declaration: typingsSlinky.typescriptServices.TypeScript.EnumDeclaration): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(script: typingsSlinky.typescriptServices.TypeScript.AST, pos: Double): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: js.UndefOr[scala.Nothing],
    forceInclusive: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getEnclosingMemberVariableDeclaration")
  @js.native
  def getEnclosingMemberVariableDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclaration = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getEnclosingModuleDeclaration")
  @js.native
  def getEnclosingModuleDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getEnclosingParameterForInitializer")
  @js.native
  def getEnclosingParameterForInitializer(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.Parameter = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getExtendsHeritageClause")
  @js.native
  def getExtendsHeritageClause(clauses: typingsSlinky.typescriptServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getImplementsHeritageClause")
  @js.native
  def getImplementsHeritageClause(clauses: typingsSlinky.typescriptServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getModuleDeclarationFromNameAST")
  @js.native
  def getModuleDeclarationFromNameAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(name: typingsSlinky.typescriptServices.TypeScript.AST): js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier] = js.native
  @JSGlobal("TypeScript.ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(
    name: typingsSlinky.typescriptServices.TypeScript.AST,
    result: js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier]
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier] = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getNameOfIdenfierOrQualifiedName")
  @js.native
  def getNameOfIdenfierOrQualifiedName(name: typingsSlinky.typescriptServices.TypeScript.AST): String = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getParameterList")
  @js.native
  def getParameterList(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ParameterList = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getType")
  @js.native
  def getType(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getVariableDeclaratorModifiers")
  @js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typingsSlinky.typescriptServices.TypeScript.VariableDeclarator): js.Array[typingsSlinky.typescriptServices.TypeScript.PullElementFlags] = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isCallExpression")
  @js.native
  def isCallExpression(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isCallExpressionTarget")
  @js.native
  def isCallExpressionTarget(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isDeclarationAST")
  @js.native
  def isDeclarationAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isDeclarationASTOrDeclarationNameAST")
  @js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isIntegerLiteralAST")
  @js.native
  def isIntegerLiteralAST(expression: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isLastNameOfModule")
  @js.native
  def isLastNameOfModule(
    ast: typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typingsSlinky.typescriptServices.TypeScript.AST
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isNameOfFunction")
  @js.native
  def isNameOfFunction(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isNameOfMemberAccessExpression")
  @js.native
  def isNameOfMemberAccessExpression(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isNameOfMemberFunction")
  @js.native
  def isNameOfMemberFunction(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isRightSideOfQualifiedName")
  @js.native
  def isRightSideOfQualifiedName(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isValidAstNode")
  @js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.moduleIsElided")
  @js.native
  def moduleIsElided(declaration: typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parametersFromIdentifier")
  @js.native
  def parametersFromIdentifier(id: typingsSlinky.typescriptServices.TypeScript.Identifier): IParameters = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parametersFromParameter")
  @js.native
  def parametersFromParameter(parameter: typingsSlinky.typescriptServices.TypeScript.Parameter): IParameters = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parametersFromParameterList")
  @js.native
  def parametersFromParameterList(list: typingsSlinky.typescriptServices.TypeScript.ParameterList): IParameters = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parentIsModuleDeclaration")
  @js.native
  def parentIsModuleDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.scriptIsElided")
  @js.native
  def scriptIsElided(sourceUnit: typingsSlinky.typescriptServices.TypeScript.SourceUnit): Boolean = js.native
}
