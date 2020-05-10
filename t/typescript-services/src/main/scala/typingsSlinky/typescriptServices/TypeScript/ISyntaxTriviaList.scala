package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyntaxTriviaList extends js.Object {
  def collectTextElements(elements: js.Array[String]): Unit = js.native
  def concat(trivia: ISyntaxTriviaList): ISyntaxTriviaList = js.native
  def count(): Double = js.native
  def fullText(): String = js.native
  def fullWidth(): Double = js.native
  def hasComment(): Boolean = js.native
  def hasNewLine(): Boolean = js.native
  def hasSkippedToken(): Boolean = js.native
  def last(): ISyntaxTrivia = js.native
  def syntaxTriviaAt(index: Double): ISyntaxTrivia = js.native
  def toArray(): js.Array[ISyntaxTrivia] = js.native
}

object ISyntaxTriviaList {
  @scala.inline
  def apply(
    collectTextElements: js.Array[String] => Unit,
    concat: ISyntaxTriviaList => ISyntaxTriviaList,
    count: () => Double,
    fullText: () => String,
    fullWidth: () => Double,
    hasComment: () => Boolean,
    hasNewLine: () => Boolean,
    hasSkippedToken: () => Boolean,
    last: () => ISyntaxTrivia,
    syntaxTriviaAt: Double => ISyntaxTrivia,
    toArray: () => js.Array[ISyntaxTrivia]
  ): ISyntaxTriviaList = {
    val __obj = js.Dynamic.literal(collectTextElements = js.Any.fromFunction1(collectTextElements), concat = js.Any.fromFunction1(concat), count = js.Any.fromFunction0(count), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasComment = js.Any.fromFunction0(hasComment), hasNewLine = js.Any.fromFunction0(hasNewLine), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), last = js.Any.fromFunction0(last), syntaxTriviaAt = js.Any.fromFunction1(syntaxTriviaAt), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[ISyntaxTriviaList]
  }
  @scala.inline
  implicit class ISyntaxTriviaListOps[Self <: ISyntaxTriviaList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectTextElements(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectTextElements")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConcat(value: ISyntaxTriviaList => ISyntaxTriviaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
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
    def withHasComment(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasNewLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSkippedToken(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSkippedToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLast(value: () => ISyntaxTrivia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSyntaxTriviaAt(value: Double => ISyntaxTrivia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntaxTriviaAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[ISyntaxTrivia]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

