package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICallExpression extends IASTSpan {
  var argumentList: ArgumentList = js.native
  var expression: AST = js.native
}

object ICallExpression {
  @scala.inline
  def apply(
    _end: Double,
    _start: Double,
    argumentList: ArgumentList,
    end: () => Double,
    expression: AST,
    start: () => Double
  ): ICallExpression = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], argumentList = argumentList.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ICallExpression]
  }
  @scala.inline
  implicit class ICallExpressionOps[Self <: ICallExpression] (val x: Self) extends AnyVal {
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
  }
  
}

