package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxNodeOrToken
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxFacts")
@js.native
object SyntaxFacts extends js.Object {
  def getBinaryExpressionFromOperatorToken(tokenKind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getOperatorTokenFromBinaryExpression(tokenKind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def getText(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): String = js.native
  def getTokenKind(text: String): typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind = js.native
  def isAnyDivideOrRegularExpressionToken(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyDivideToken(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyKeyword(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyPunctuation(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isBinaryExpressionOperatorToken(tokenKind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  def isFutureReservedKeyword(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isFutureReservedStrictKeyword(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isStandardKeyword(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isTokenKind(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}

