package typingsSlinky.swaggerStats.mod

import typingsSlinky.std.Record
import typingsSlinky.swaggerStats.anon.RecordHTTPMethodAPIOperat
import typingsSlinky.swaggerStats.anon.RecordHTTPMethodAPIOperatDELETE
import typingsSlinky.swaggerStats.anon.RecordHTTPMethodReqResSta
import typingsSlinky.swaggerStats.anon.RecordHTTPMethodSubsetReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreStats extends js.Object {
  var all: ReqResStats = js.native
  var apdexThreshold: Double = js.native
  var apidefs: js.UndefOr[Record[String, RecordHTTPMethodAPIOperat]] = js.native
  var apiop: js.UndefOr[Record[String, RecordHTTPMethodAPIOperatDELETE]] = js.native
  var apistats: js.UndefOr[Record[String, RecordHTTPMethodReqResSta]] = js.native
  var egress: ReqResStats = js.native
  var errors: js.UndefOr[ErrorsStats] = js.native
  var hostname: String = js.native
  var ip: String = js.native
  var lasterrors: js.UndefOr[js.Array[RequestResponseRecord]] = js.native
  var longestreq: js.UndefOr[js.Array[RequestResponseRecord]] = js.native
  var method: js.UndefOr[RecordHTTPMethodSubsetReq] = js.native
  var name: String = js.native
  var startts: Double = js.native
  var sys: SysStats = js.native
  var timeline: js.UndefOr[TimelineStats] = js.native
  var version: String = js.native
}

object CoreStats {
  @scala.inline
  def apply(
    all: ReqResStats,
    apdexThreshold: Double,
    egress: ReqResStats,
    hostname: String,
    ip: String,
    name: String,
    startts: Double,
    sys: SysStats,
    version: String
  ): CoreStats = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], apdexThreshold = apdexThreshold.asInstanceOf[js.Any], egress = egress.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreStats]
  }
  @scala.inline
  implicit class CoreStatsOps[Self <: CoreStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApdexThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apdexThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEgress(value: ReqResStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSys(value: SysStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApidefs(value: Record[String, RecordHTTPMethodAPIOperat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apidefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApidefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apidefs")(js.undefined)
        ret
    }
    @scala.inline
    def withApiop(value: Record[String, RecordHTTPMethodAPIOperatDELETE]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiop")(js.undefined)
        ret
    }
    @scala.inline
    def withApistats(value: Record[String, RecordHTTPMethodReqResSta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apistats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApistats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apistats")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: ErrorsStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withLasterrors(value: js.Array[RequestResponseRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lasterrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLasterrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lasterrors")(js.undefined)
        ret
    }
    @scala.inline
    def withLongestreq(value: js.Array[RequestResponseRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longestreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongestreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longestreq")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: RecordHTTPMethodSubsetReq): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: TimelineStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.undefined)
        ret
    }
  }
  
}

