package typingsSlinky.semanticUiReact.visibilityVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityEventData extends VisibilityProps {
  var calculations: VisibilityCalculations = js.native
}

object VisibilityEventData {
  @scala.inline
  def apply(calculations: VisibilityCalculations): VisibilityEventData = {
    val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityEventData]
  }
  @scala.inline
  implicit class VisibilityEventDataOps[Self <: VisibilityEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculations(value: VisibilityCalculations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

