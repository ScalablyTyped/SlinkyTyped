package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyntaxToken extends IPrimaryExpressionSyntax {
  var tokenKind: SyntaxKind = js.native
  def hasLeadingComment(): Boolean = js.native
  def hasLeadingNewLine(): Boolean = js.native
  def hasLeadingSkippedText(): Boolean = js.native
  def hasLeadingTrivia(): Boolean = js.native
  def hasSkippedToken(): Boolean = js.native
  def hasTrailingComment(): Boolean = js.native
  def hasTrailingNewLine(): Boolean = js.native
  def hasTrailingSkippedText(): Boolean = js.native
  def hasTrailingTrivia(): Boolean = js.native
  def text(): String = js.native
  def value(): js.Any = js.native
  def valueText(): String = js.native
}

object ISyntaxToken {
  @scala.inline
  def apply(
    accept: ISyntaxVisitor => js.Any,
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    hasLeadingComment: () => Boolean,
    hasLeadingNewLine: () => Boolean,
    hasLeadingSkippedText: () => Boolean,
    hasLeadingTrivia: () => Boolean,
    hasSkippedToken: () => Boolean,
    hasTrailingComment: () => Boolean,
    hasTrailingNewLine: () => Boolean,
    hasTrailingSkippedText: () => Boolean,
    hasTrailingTrivia: () => Boolean,
    isExpression: () => Boolean,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isMemberExpression: () => Boolean,
    isNode: () => Boolean,
    isPostfixExpression: () => Boolean,
    isPrimaryExpression: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    isUnaryExpression: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    text: () => String,
    tokenKind: SyntaxKind,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    value: () => js.Any,
    valueText: () => String,
    width: () => Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): ISyntaxToken = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), text = js.Any.fromFunction0(text), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[ISyntaxToken]
  }
  @scala.inline
  implicit class ISyntaxTokenOps[Self <: ISyntaxToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasLeadingComment(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLeadingComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasLeadingNewLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLeadingNewLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasLeadingSkippedText(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLeadingSkippedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasLeadingTrivia(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLeadingTrivia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSkippedToken(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSkippedToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasTrailingComment(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTrailingComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasTrailingNewLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTrailingNewLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasTrailingSkippedText(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTrailingSkippedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasTrailingTrivia(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTrailingTrivia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTokenKind(value: SyntaxKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueText")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

