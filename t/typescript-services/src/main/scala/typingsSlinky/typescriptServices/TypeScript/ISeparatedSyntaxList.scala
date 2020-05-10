package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISeparatedSyntaxList extends ISyntaxElement {
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
  def nonSeparatorAt(index: Double): ISyntaxNodeOrToken = js.native
  def nonSeparatorCount(): Double = js.native
  def separatorAt(index: Double): ISyntaxToken = js.native
  def separatorCount(): Double = js.native
  def toArray(): js.Array[ISyntaxNodeOrToken] = js.native
  def toNonSeparatorArray(): js.Array[ISyntaxNodeOrToken] = js.native
}

object ISeparatedSyntaxList {
  @scala.inline
  def apply(
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    insertChildrenInto: (js.Array[ISyntaxElement], Double) => Unit,
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
    nonSeparatorAt: Double => ISyntaxNodeOrToken,
    nonSeparatorCount: () => Double,
    separatorAt: Double => ISyntaxToken,
    separatorCount: () => Double,
    toArray: () => js.Array[ISyntaxNodeOrToken],
    toNonSeparatorArray: () => js.Array[ISyntaxNodeOrToken],
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISeparatedSyntaxList = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), insertChildrenInto = js.Any.fromFunction2(insertChildrenInto), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), nonSeparatorAt = js.Any.fromFunction1(nonSeparatorAt), nonSeparatorCount = js.Any.fromFunction0(nonSeparatorCount), separatorAt = js.Any.fromFunction1(separatorAt), separatorCount = js.Any.fromFunction0(separatorCount), toArray = js.Any.fromFunction0(toArray), toNonSeparatorArray = js.Any.fromFunction0(toNonSeparatorArray), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISeparatedSyntaxList]
  }
  @scala.inline
  implicit class ISeparatedSyntaxListOps[Self <: ISeparatedSyntaxList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertChildrenInto(value: (js.Array[ISyntaxElement], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertChildrenInto")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNonSeparatorAt(value: Double => ISyntaxNodeOrToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSeparatorAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNonSeparatorCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonSeparatorCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeparatorAt(value: Double => ISyntaxToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSeparatorCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[ISyntaxNodeOrToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToNonSeparatorArray(value: () => js.Array[ISyntaxNodeOrToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNonSeparatorArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

