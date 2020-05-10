package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response generated from a call to a **metrics** method that evaluates tokens. */
@js.native
trait MetricTokenResponse extends js.Object {
  /** Array of metric token aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricTokenAggregation]] = js.native
}

object MetricTokenResponse {
  @scala.inline
  def apply(): MetricTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenResponse]
  }
  @scala.inline
  implicit class MetricTokenResponseOps[Self <: MetricTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregations(value: js.Array[MetricTokenAggregation]): Self = {
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

