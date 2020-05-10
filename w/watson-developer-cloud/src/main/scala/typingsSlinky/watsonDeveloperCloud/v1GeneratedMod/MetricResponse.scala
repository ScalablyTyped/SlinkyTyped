package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response generated from a call to a **metrics** method. */
@js.native
trait MetricResponse extends js.Object {
  /** Array of metric aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricAggregation]] = js.native
}

object MetricResponse {
  @scala.inline
  def apply(): MetricResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricResponse]
  }
  @scala.inline
  implicit class MetricResponseOps[Self <: MetricResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregations(value: js.Array[MetricAggregation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(js.undefined)
        ret
    }
  }
  
}

