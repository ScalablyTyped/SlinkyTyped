package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyntaxElement extends js.Object {
  def childAt(index: Double): ISyntaxElement = js.native
  def childCount(): Double = js.native
  def collectTextElements(elements: js.Array[String]): Unit = js.native
  def firstToken(): ISyntaxToken = js.native
  def fullText(): String = js.native
  def fullWidth(): Double = js.native
  def isIncrementallyUnusable(): Boolean = js.native
  def isList(): Boolean = js.native
  def isNode(): Boolean = js.native
  def isSeparatedList(): Boolean = js.native
  def isToken(): Boolean = js.native
  def isTypeScriptSpecific(): Boolean = js.native
  def kind(): SyntaxKind = js.native
  def lastToken(): ISyntaxToken = js.native
  def leadingTrivia(): ISyntaxTriviaList = js.native
  def leadingTriviaWidth(): Double = js.native
  def trailingTrivia(): ISyntaxTriviaList = js.native
  def trailingTriviaWidth(): Double = js.native
  def width(): Double = js.native
}

object ISyntaxElement {
  @scala.inline
  def apply(
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isNode: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISyntaxElement = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISyntaxElement]
  }
  @scala.inline
  implicit class ISyntaxElementOps[Self <: ISyntaxElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildAt(value: Double => ISyntaxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollectTextElements(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectTextElements")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstToken(value: () => ISyntaxToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFullText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFullWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIncrementallyUnusable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIncrementallyUnusable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsList(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSeparatedList(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSeparatedList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsToken(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTypeScriptSpecific(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypeScriptSpecific")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKind(value: () => SyntaxKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastToken(value: () => ISyntaxToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeadingTrivia(value: () => ISyntaxTriviaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingTrivia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeadingTriviaWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingTriviaWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrailingTrivia(value: () => ISyntaxTriviaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingTrivia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrailingTriviaWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingTriviaWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

