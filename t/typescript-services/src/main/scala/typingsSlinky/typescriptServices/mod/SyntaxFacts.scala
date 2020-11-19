package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxFacts")
@js.native
object SyntaxFacts extends js.Object {
  
  def getBinaryExpressionFromOperatorToken(tokenKind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getOperatorTokenFromBinaryExpression(tokenKind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def getText(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): String = js.native
  
  def getTokenKind(text: String): typingsSlinky.typescriptServices.TypeScript.SyntaxKind = js.native
  
  def isAnyDivideOrRegularExpressionToken(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isAnyDivideToken(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isAnyKeyword(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isAnyPunctuation(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isBinaryExpressionOperatorToken(tokenKind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  
  def isFutureReservedKeyword(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isFutureReservedStrictKeyword(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isStandardKeyword(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isTokenKind(kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}
