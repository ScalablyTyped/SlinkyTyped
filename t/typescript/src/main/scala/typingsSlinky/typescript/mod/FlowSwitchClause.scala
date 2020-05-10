package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowSwitchClause
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode = js.native
  var clauseEnd: Double = js.native
  var clauseStart: Double = js.native
  var switchStatement: SwitchStatement = js.native
}

object FlowSwitchClause {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSwitchClause]
  }
  @scala.inline
  implicit class FlowSwitchClauseOps[Self <: FlowSwitchClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntecedent(value: FlowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antecedent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClauseEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauseEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClauseStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchStatement(value: SwitchStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchStatement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

