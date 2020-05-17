package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescriptServices.TypeScript.IASTSpan because Already inherited
- typingsSlinky.typescriptServices.TypeScript.ICallExpression because var conflicts: _end, _start. Inlined expression, argumentList */ @js.native
trait ObjectCreationExpression extends AST {
  var argumentList: ArgumentList = js.native
  var expression: AST = js.native
  def structuralEquals(ast: ObjectCreationExpression, includingPosition: Boolean): Boolean = js.native
}

object ObjectCreationExpression {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    argumentList: ArgumentList,
    end: () => Double,
    expression: AST,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ObjectCreationExpression, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ObjectCreationExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], argumentList = argumentList.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ObjectCreationExpression]
  }
  @scala.inline
  implicit class ObjectCreationExpressionOps[Self <: ObjectCreationExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentList(value: ArgumentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructuralEquals(value: (ObjectCreationExpression, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuralEquals")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

