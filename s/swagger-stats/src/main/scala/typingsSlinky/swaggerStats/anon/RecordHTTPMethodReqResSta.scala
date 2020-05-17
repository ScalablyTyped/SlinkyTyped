package typingsSlinky.swaggerStats.anon

import typingsSlinky.swaggerStats.mod.ReqResStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.ReqResStats> */
@js.native
trait RecordHTTPMethodReqResSta extends js.Object {
  var DELETE: ReqResStats = js.native
  var GET: ReqResStats = js.native
  var HEAD: ReqResStats = js.native
  var OPTIONS: ReqResStats = js.native
  var PATCH: ReqResStats = js.native
  var POST: ReqResStats = js.native
  var PUT: ReqResStats = js.native
  var TRACE: ReqResStats = js.native
}

object RecordHTTPMethodReqResSta {
  @scala.inline
  def apply(
    DELETE: ReqResStats,
    GET: ReqResStats,
    HEAD: ReqResStats,
    OPTIONS: ReqResStats,
    PATCH: ReqResStats,
    POST: ReqResStats,
    PUT: ReqResStats,
    TRACE: ReqResStats
  ): RecordHTTPMethodReqResSta = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], PATCH = PATCH.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordHTTPMethodReqResSta]
  }
  @scala.inline
  implicit class RecordHTTPMethodReqResStaOps[Self <: RecordHTTPMethodReqResSta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDELETE(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGET(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHEAD(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPTIONS(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPATCH(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATCH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPOST(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPUT(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACE(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

