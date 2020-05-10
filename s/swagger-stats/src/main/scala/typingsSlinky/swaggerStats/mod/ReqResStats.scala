package typingsSlinky.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReqResStats extends js.Object {
  var apdex_satisfied: Double = js.native
  var apdex_score: Double = js.native
  var apdex_threshold: Double = js.native
  var apdex_tolerated: Double = js.native
  var avg_req_clength: Double = js.native
  var avg_res_clength: Double = js.native
  var avg_time: Double = js.native
  var client_error: Double = js.native
  var err_rate: Double = js.native
  var errors: Double = js.native
  var info: Double = js.native
  var max_req_clength: Double = js.native
  var max_res_clength: Double = js.native
  var max_time: Double = js.native
  var redirect: Double = js.native
  var req_rate: Double = js.native
  var requests: Double = js.native
  var responses: Double = js.native
  var server_error: Double = js.native
  var success: Double = js.native
  var total_req_clength: Double = js.native
  var total_res_clength: Double = js.native
  var total_time: Double = js.native
}

object ReqResStats {
  @scala.inline
  def apply(
    apdex_satisfied: Double,
    apdex_score: Double,
    apdex_threshold: Double,
    apdex_tolerated: Double,
    avg_req_clength: Double,
    avg_res_clength: Double,
    avg_time: Double,
    client_error: Double,
    err_rate: Double,
    errors: Double,
    info: Double,
    max_req_clength: Double,
    max_res_clength: Double,
    max_time: Double,
    redirect: Double,
    req_rate: Double,
    requests: Double,
    responses: Double,
    server_error: Double,
    success: Double,
    total_req_clength: Double,
    total_res_clength: Double,
    total_time: Double
  ): ReqResStats = {
    val __obj = js.Dynamic.literal(apdex_satisfied = apdex_satisfied.asInstanceOf[js.Any], apdex_score = apdex_score.asInstanceOf[js.Any], apdex_threshold = apdex_threshold.asInstanceOf[js.Any], apdex_tolerated = apdex_tolerated.asInstanceOf[js.Any], avg_req_clength = avg_req_clength.asInstanceOf[js.Any], avg_res_clength = avg_res_clength.asInstanceOf[js.Any], avg_time = avg_time.asInstanceOf[js.Any], client_error = client_error.asInstanceOf[js.Any], err_rate = err_rate.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], max_req_clength = max_req_clength.asInstanceOf[js.Any], max_res_clength = max_res_clength.asInstanceOf[js.Any], max_time = max_time.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], req_rate = req_rate.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], server_error = server_error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total_req_clength = total_req_clength.asInstanceOf[js.Any], total_res_clength = total_res_clength.asInstanceOf[js.Any], total_time = total_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqResStats]
  }
  @scala.inline
  implicit class ReqResStatsOps[Self <: ReqResStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApdex_satisfied(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apdex_satisfied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApdex_score(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apdex_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApdex_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apdex_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApdex_tolerated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apdex_tolerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvg_req_clength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg_req_clength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvg_res_clength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg_res_clength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvg_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_error(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErr_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_req_clength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_req_clength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_res_clength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_res_clength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer_error(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_req_clength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_req_clength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_res_clength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_res_clength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

