package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  var _end: Double = js.native
  var _start: Double = js.native
  var _trivia: js.Any = js.native
  var endsLine: Boolean = js.native
  def end(): Double = js.native
  def fullText(): String = js.native
  def kind(): SyntaxKind = js.native
  def start(): Double = js.native
  def structuralEquals(ast: Comment, includingPosition: Boolean): Boolean = js.native
}

object Comment {
  @scala.inline
  def apply(
    _end: Double,
    _start: Double,
    _trivia: js.Any,
    end: () => Double,
    endsLine: Boolean,
    fullText: () => String,
    kind: () => SyntaxKind,
    start: () => Double,
    structuralEquals: (Comment, Boolean) => Boolean
  ): Comment = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trivia = _trivia.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endsLine = endsLine.asInstanceOf[js.Any], fullText = js.Any.fromFunction0(fullText), kind = js.Any.fromFunction0(kind), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals))
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_trivia(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_trivia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndsLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKind(value: () => SyntaxKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStructuralEquals(value: (Comment, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuralEquals")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

