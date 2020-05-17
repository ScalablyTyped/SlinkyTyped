package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST extends IASTSpan {
  var _astID: js.Any = js.native
  var _postComments: js.Any = js.native
  var _preComments: js.Any = js.native
  var _trailingTriviaWidth: Double = js.native
  var parent: AST = js.native
  def fileName(): String = js.native
  def isExpression(): Boolean = js.native
  def kind(): SyntaxKind = js.native
  def postComments(): js.Array[Comment] = js.native
  def preComments(): js.Array[Comment] = js.native
  def setPostComments(comments: js.Array[Comment]): Unit = js.native
  def setPreComments(comments: js.Array[Comment]): Unit = js.native
  def structuralEquals(ast: AST, includingPosition: Boolean): Boolean = js.native
  def syntaxID(): Double = js.native
  def trailingTriviaWidth(): Double = js.native
  def width(): Double = js.native
}

object AST {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): AST = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  implicit class ASTOps[Self <: AST] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_astID(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_astID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_postComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_postComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_preComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_preComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_trailingTriviaWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_trailingTriviaWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsExpression(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKind(value: () => SyntaxKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostComments(value: () => js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postComments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreComments(value: () => js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preComments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPostComments(value: js.Array[Comment] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPostComments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPreComments(value: js.Array[Comment] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreComments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStructuralEquals(value: (AST, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuralEquals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSyntaxID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntaxID")(js.Any.fromFunction0(value))
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

