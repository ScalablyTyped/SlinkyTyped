package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStatement extends AST {
  var closeParenToken: ASTSpan = js.native
  var expression: AST = js.native
  var switchClauses: ISyntaxList2 = js.native
  def structuralEquals(ast: SwitchStatement, includingPosition: Boolean): Boolean = js.native
}

object SwitchStatement {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    closeParenToken: ASTSpan,
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
    structuralEquals: (SwitchStatement, Boolean) => Boolean,
    switchClauses: ISyntaxList2,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], closeParenToken = closeParenToken.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), switchClauses = switchClauses.asInstanceOf[js.Any], syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SwitchStatement]
  }
  @scala.inline
  implicit class SwitchStatementOps[Self <: SwitchStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseParenToken(value: ASTSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeParenToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructuralEquals(value: (SwitchStatement, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuralEquals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSwitchClauses(value: ISyntaxList2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchClauses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

