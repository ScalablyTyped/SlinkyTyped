package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyntaxTrivia extends js.Object {
  def fullText(): String = js.native
  def fullWidth(): Double = js.native
  def isComment(): Boolean = js.native
  def isNewLine(): Boolean = js.native
  def isSkippedToken(): Boolean = js.native
  def isWhitespace(): Boolean = js.native
  def kind(): SyntaxKind = js.native
  def skippedToken(): ISyntaxToken = js.native
}

object ISyntaxTrivia {
  @scala.inline
  def apply(
    fullText: () => String,
    fullWidth: () => Double,
    isComment: () => Boolean,
    isNewLine: () => Boolean,
    isSkippedToken: () => Boolean,
    isWhitespace: () => Boolean,
    kind: () => SyntaxKind,
    skippedToken: () => ISyntaxToken
  ): ISyntaxTrivia = {
    val __obj = js.Dynamic.literal(fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isComment = js.Any.fromFunction0(isComment), isNewLine = js.Any.fromFunction0(isNewLine), isSkippedToken = js.Any.fromFunction0(isSkippedToken), isWhitespace = js.Any.fromFunction0(isWhitespace), kind = js.Any.fromFunction0(kind), skippedToken = js.Any.fromFunction0(skippedToken))
    __obj.asInstanceOf[ISyntaxTrivia]
  }
  @scala.inline
  implicit class ISyntaxTriviaOps[Self <: ISyntaxTrivia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIsComment(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNewLine(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSkippedToken(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippedToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWhitespace(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWhitespace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKind(value: () => SyntaxKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSkippedToken(value: () => ISyntaxToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippedToken")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

