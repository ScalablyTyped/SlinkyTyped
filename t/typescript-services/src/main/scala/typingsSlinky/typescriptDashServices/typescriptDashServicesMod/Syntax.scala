package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISimpleText
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxElement
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxNodeOrToken
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxTrivia
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxTriviaList
import typingsSlinky.typescriptDashServices.TypeScript.ITokenInfo
import typingsSlinky.typescriptDashServices.TypeScript.IUnaryExpressionSyntax
import typingsSlinky.typescriptDashServices.TypeScript.Syntax.IFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Syntax")
@js.native
object Syntax extends js.Object {
  @js.native
  class EmptySyntaxList ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.EmptySyntaxList
  
  @js.native
  class FixedWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class FixedWidthTokenWithLeadingTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.FixedWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class FixedWidthTokenWithNoTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.FixedWidthTokenWithNoTrivia {
    def this(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind) = this()
  }
  
  @js.native
  class FixedWidthTokenWithTrailingTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.FixedWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class NormalModeFactory ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.NormalModeFactory
  
  @js.native
  class StrictModeFactory ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.StrictModeFactory
  
  @js.native
  class VariableWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class VariableWidthTokenWithLeadingTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.VariableWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
  }
  
  @js.native
  class VariableWidthTokenWithNoTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.VariableWidthTokenWithNoTrivia {
    def this(fullText: String, kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind) = this()
  }
  
  @js.native
  class VariableWidthTokenWithTrailingTrivia protected ()
    extends typingsSlinky.typescriptDashServices.TypeScript.Syntax.VariableWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
  }
  
  var carriageReturnLineFeedTrivia: ISyntaxTrivia = js.native
  var carriageReturnTrivia: ISyntaxTrivia = js.native
  var emptyList: ISyntaxList = js.native
  var emptySeparatedList: ISeparatedSyntaxList = js.native
  var emptyTriviaList: ISyntaxTriviaList = js.native
  var lineFeedTrivia: ISyntaxTrivia = js.native
  var normalModeFactory: IFactory = js.native
  var spaceTrivia: ISyntaxTrivia = js.native
  var spaceTriviaList: ISyntaxTriviaList = js.native
  var strictModeFactory: IFactory = js.native
  def assignmentExpression(left: IExpressionSyntax, token: ISyntaxToken, right: IExpressionSyntax): typingsSlinky.typescriptDashServices.TypeScript.BinaryExpressionSyntax = js.native
  def childIndex(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  def childOffset(parent: ISyntaxElement, child: ISyntaxElement): Double = js.native
  def childOffsetAt(parent: ISyntaxElement, index: Double): Double = js.native
  def convertToIdentifierName(token: ISyntaxToken): ISyntaxToken = js.native
  def deferredTrivia(
    kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind,
    text: ISimpleText,
    fullStart: Double,
    fullWidth: Double
  ): ISyntaxTrivia = js.native
  def elementStructuralEquals(element1: ISyntaxElement, element2: ISyntaxElement): Boolean = js.native
  def emptySourceUnit(): typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax = js.native
  def emptyToken(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  def falseExpression(): IUnaryExpressionSyntax = js.native
  def findSkippedTokenInLeadingTriviaList(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken, position: Double): typingsSlinky.typescriptDashServices.TypeScript.PositionedSkippedToken = js.native
  def findSkippedTokenInPositionedToken(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken, position: Double): typingsSlinky.typescriptDashServices.TypeScript.PositionedSkippedToken = js.native
  def findSkippedTokenInTrailingTriviaList(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken, position: Double): typingsSlinky.typescriptDashServices.TypeScript.PositionedSkippedToken = js.native
  def findSkippedTokenOnLeft(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken, position: Double): typingsSlinky.typescriptDashServices.TypeScript.PositionedSkippedToken = js.native
  def getAncestorOfKind(
    positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedElement,
    kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind
  ): typingsSlinky.typescriptDashServices.TypeScript.PositionedElement = js.native
  def getStandaloneExpression(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken): typingsSlinky.typescriptDashServices.TypeScript.PositionedNodeOrToken = js.native
  def hasAncestorOfKind(
    positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedElement,
    kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind
  ): Boolean = js.native
  def identifier(text: String): ISyntaxToken = js.native
  def identifier(text: String, info: ITokenInfo): ISyntaxToken = js.native
  def identifierName(text: String): ISyntaxToken = js.native
  def identifierName(text: String, info: ITokenInfo): ISyntaxToken = js.native
  def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isEntirelyInsideComment(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isEntirelyInsideCommentTrivia(trivia: ISyntaxTrivia, fullStart: Double, position: Double): Boolean = js.native
  def isExpression(token: ISyntaxToken): Boolean = js.native
  def isInModuleOrTypeContext(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken): Boolean = js.native
  def isInTypeOnlyContext(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken): Boolean = js.native
  def isIntegerLiteral(expression: IExpressionSyntax): Boolean = js.native
  def isSuperInvocationExpression(node: IExpressionSyntax): Boolean = js.native
  def isSuperInvocationExpressionStatement(node: typingsSlinky.typescriptDashServices.TypeScript.SyntaxNode): Boolean = js.native
  def isSuperMemberAccessExpression(node: IExpressionSyntax): Boolean = js.native
  def isSuperMemberAccessInvocationExpression(node: typingsSlinky.typescriptDashServices.TypeScript.SyntaxNode): Boolean = js.native
  def isUnterminatedMultilineCommentTrivia(trivia: ISyntaxTrivia): Boolean = js.native
  def isUnterminatedStringLiteral(token: ISyntaxToken): Boolean = js.native
  def list(nodes: js.Array[ISyntaxNodeOrToken]): ISyntaxList = js.native
  def listStructuralEquals(list1: ISyntaxList, list2: ISyntaxList): Boolean = js.native
  def massageEscapes(text: String): String = js.native
  def multiLineComment(text: String): ISyntaxTrivia = js.native
  def nodeHasSkippedOrMissingTokens(node: typingsSlinky.typescriptDashServices.TypeScript.SyntaxNode): Boolean = js.native
  def nodeOrTokenStructuralEquals(node1: ISyntaxNodeOrToken, node2: ISyntaxNodeOrToken): Boolean = js.native
  def nodeStructuralEquals(
    node1: typingsSlinky.typescriptDashServices.TypeScript.SyntaxNode,
    node2: typingsSlinky.typescriptDashServices.TypeScript.SyntaxNode
  ): Boolean = js.native
  def numericLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  def realizeToken(token: ISyntaxToken): ISyntaxToken = js.native
  def separatedList(nodes: js.Array[ISyntaxNodeOrToken]): ISeparatedSyntaxList = js.native
  def separatedListStructuralEquals(list1: ISeparatedSyntaxList, list2: ISeparatedSyntaxList): Boolean = js.native
  def singleLineComment(text: String): ISyntaxTrivia = js.native
  def skippedTokenTrivia(token: ISyntaxToken): ISyntaxTrivia = js.native
  def spaces(count: Double): ISyntaxTrivia = js.native
  def splitMultiLineCommentTriviaIntoMultipleLines(trivia: ISyntaxTrivia): js.Array[String] = js.native
  def stringLiteralExpression(text: String): IUnaryExpressionSyntax = js.native
  def token(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  def token(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind, info: ITokenInfo): ISyntaxToken = js.native
  def tokenStructuralEquals(token1: ISyntaxToken, token2: ISyntaxToken): Boolean = js.native
  def tokenToJSON(token: ISyntaxToken): js.Any = js.native
  def trivia(kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind, text: String): ISyntaxTrivia = js.native
  def triviaList(trivia: js.Array[ISyntaxTrivia]): ISyntaxTriviaList = js.native
  def triviaListStructuralEquals(triviaList1: ISyntaxTriviaList, triviaList2: ISyntaxTriviaList): Boolean = js.native
  def triviaStructuralEquals(trivia1: ISyntaxTrivia, trivia2: ISyntaxTrivia): Boolean = js.native
  def trueExpression(): IUnaryExpressionSyntax = js.native
  def value(token: ISyntaxToken): js.Any = js.native
  def valueText(token: ISyntaxToken): String = js.native
  def whitespace(text: String): ISyntaxTrivia = js.native
}

