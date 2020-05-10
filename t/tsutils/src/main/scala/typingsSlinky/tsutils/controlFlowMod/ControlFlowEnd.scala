package typingsSlinky.tsutils.controlFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlFlowEnd extends js.Object {
  val end: Boolean = js.native
  val statements: js.Array[ControlFlowStatement] = js.native
}

object ControlFlowEnd {
  @scala.inline
  def apply(end: Boolean, statements: js.Array[ControlFlowStatement]): ControlFlowEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlFlowEnd]
  }
  @scala.inline
  implicit class ControlFlowEndOps[Self <: ControlFlowEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatements(value: js.Array[ControlFlowStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

