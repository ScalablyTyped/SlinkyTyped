package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowLabel
  extends FlowNodeBase
     with FlowNode {
  var antecedents: js.UndefOr[js.Array[FlowNode]] = js.native
}

object FlowLabel {
  @scala.inline
  def apply(flags: FlowFlags): FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLabel]
  }
  @scala.inline
  implicit class FlowLabelOps[Self <: FlowLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntecedents(value: js.Array[FlowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antecedents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntecedents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antecedents")(js.undefined)
        ret
    }
  }
  
}

