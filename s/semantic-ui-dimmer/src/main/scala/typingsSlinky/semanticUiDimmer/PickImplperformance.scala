package typingsSlinky.semanticUiDimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'performance'> */
@js.native
trait PickImplperformance extends js.Object {
  var performance: Boolean = js.native
}

object PickImplperformance {
  @scala.inline
  def apply(performance: Boolean): PickImplperformance = {
    val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplperformance]
  }
  @scala.inline
  implicit class PickImplperformanceOps[Self <: PickImplperformance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

