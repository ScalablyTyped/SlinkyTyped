package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryEventConstants.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getMetricsQueryEvent` operation. */
@js.native
trait GetMetricsQueryEventParams extends js.Object {
  /** Metric is computed from data recorded before this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var end_time: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The type of result to consider when calculating the metric. */
  var result_type: js.UndefOr[ResultType | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Metric is computed from data recorded after this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var start_time: js.UndefOr[String] = js.native
}

object GetMetricsQueryEventParams {
  @scala.inline
  def apply(): GetMetricsQueryEventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricsQueryEventParams]
  }
  @scala.inline
  implicit class GetMetricsQueryEventParamsOps[Self <: GetMetricsQueryEventParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withResult_type(value: ResultType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_type")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(js.undefined)
        ret
    }
  }
  
}

