package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IASTSpan
import typingsSlinky.typescriptServices.TypeScript.IParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ASTHelpers {
  
  @JSImport("typescript-services", "ASTHelpers.docComments")
  @js.native
  def docComments(ast: typingsSlinky.typescriptServices.TypeScript.AST): js.Array[typingsSlinky.typescriptServices.TypeScript.Comment] = js.native
  
  @JSImport("typescript-services", "ASTHelpers.enumIsElided")
  @js.native
  def enumIsElided(declaration: typingsSlinky.typescriptServices.TypeScript.EnumDeclaration): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(script: typingsSlinky.typescriptServices.TypeScript.AST, pos: Double): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: js.UndefOr[scala.Nothing],
    forceInclusive: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typingsSlinky.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getEnclosingMemberVariableDeclaration")
  @js.native
  def getEnclosingMemberVariableDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclaration = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getEnclosingModuleDeclaration")
  @js.native
  def getEnclosingModuleDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getEnclosingParameterForInitializer")
  @js.native
  def getEnclosingParameterForInitializer(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.Parameter = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getExtendsHeritageClause")
  @js.native
  def getExtendsHeritageClause(clauses: typingsSlinky.typescriptServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getImplementsHeritageClause")
  @js.native
  def getImplementsHeritageClause(clauses: typingsSlinky.typescriptServices.TypeScript.ISyntaxList2): typingsSlinky.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getModuleDeclarationFromNameAST")
  @js.native
  def getModuleDeclarationFromNameAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(name: typingsSlinky.typescriptServices.TypeScript.AST): js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier] = js.native
  @JSImport("typescript-services", "ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(
    name: typingsSlinky.typescriptServices.TypeScript.AST,
    result: js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier]
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.Identifier] = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getNameOfIdenfierOrQualifiedName")
  @js.native
  def getNameOfIdenfierOrQualifiedName(name: typingsSlinky.typescriptServices.TypeScript.AST): String = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getParameterList")
  @js.native
  def getParameterList(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.ParameterList = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getType")
  @js.native
  def getType(ast: typingsSlinky.typescriptServices.TypeScript.AST): typingsSlinky.typescriptServices.TypeScript.AST = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getVariableDeclaratorModifiers")
  @js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typingsSlinky.typescriptServices.TypeScript.VariableDeclarator): js.Array[typingsSlinky.typescriptServices.TypeScript.PullElementFlags] = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isCallExpression")
  @js.native
  def isCallExpression(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isCallExpressionTarget")
  @js.native
  def isCallExpressionTarget(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isDeclarationAST")
  @js.native
  def isDeclarationAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isDeclarationASTOrDeclarationNameAST")
  @js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isIntegerLiteralAST")
  @js.native
  def isIntegerLiteralAST(expression: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isLastNameOfModule")
  @js.native
  def isLastNameOfModule(
    ast: typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typingsSlinky.typescriptServices.TypeScript.AST
  ): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isNameOfFunction")
  @js.native
  def isNameOfFunction(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isNameOfMemberAccessExpression")
  @js.native
  def isNameOfMemberAccessExpression(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isNameOfMemberFunction")
  @js.native
  def isNameOfMemberFunction(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isRightSideOfQualifiedName")
  @js.native
  def isRightSideOfQualifiedName(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isValidAstNode")
  @js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.moduleIsElided")
  @js.native
  def moduleIsElided(declaration: typingsSlinky.typescriptServices.TypeScript.ModuleDeclaration): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parametersFromIdentifier")
  @js.native
  def parametersFromIdentifier(id: typingsSlinky.typescriptServices.TypeScript.Identifier): IParameters = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parametersFromParameter")
  @js.native
  def parametersFromParameter(parameter: typingsSlinky.typescriptServices.TypeScript.Parameter): IParameters = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parametersFromParameterList")
  @js.native
  def parametersFromParameterList(list: typingsSlinky.typescriptServices.TypeScript.ParameterList): IParameters = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parentIsModuleDeclaration")
  @js.native
  def parentIsModuleDeclaration(ast: typingsSlinky.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.scriptIsElided")
  @js.native
  def scriptIsElided(sourceUnit: typingsSlinky.typescriptServices.TypeScript.SourceUnit): Boolean = js.native
}
