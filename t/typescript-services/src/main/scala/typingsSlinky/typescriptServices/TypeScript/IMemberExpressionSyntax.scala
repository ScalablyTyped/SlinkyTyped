package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMemberExpressionSyntax extends IPostfixExpressionSyntax {
  
  def isMemberExpression(): Boolean = js.native
}
object IMemberExpressionSyntax {
  
  @scala.inline
  def apply(
    accept: ISyntaxVisitor => js.Any,
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    isExpression: () => Boolean,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isMemberExpression: () => Boolean,
    isNode: () => Boolean,
    isPostfixExpression: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    isUnaryExpression: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): IMemberExpressionSyntax = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[IMemberExpressionSyntax]
  }
  
  @scala.inline
  implicit class IMemberExpressionSyntaxMutableBuilder[Self <: IMemberExpressionSyntax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMemberExpression(value: () => Boolean): Self = StObject.set(x, "isMemberExpression", js.Any.fromFunction0(value))
  }
}
