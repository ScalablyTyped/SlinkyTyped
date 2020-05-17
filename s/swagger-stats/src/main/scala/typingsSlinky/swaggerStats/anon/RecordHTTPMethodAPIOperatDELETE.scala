package typingsSlinky.swaggerStats.anon

import typingsSlinky.swaggerStats.mod.APIOperationStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationStats> */
@js.native
trait RecordHTTPMethodAPIOperatDELETE extends js.Object {
  var DELETE: APIOperationStats = js.native
  var GET: APIOperationStats = js.native
  var HEAD: APIOperationStats = js.native
  var OPTIONS: APIOperationStats = js.native
  var PATCH: APIOperationStats = js.native
  var POST: APIOperationStats = js.native
  var PUT: APIOperationStats = js.native
  var TRACE: APIOperationStats = js.native
}

object RecordHTTPMethodAPIOperatDELETE {
  @scala.inline
  def apply(
    DELETE: APIOperationStats,
    GET: APIOperationStats,
    HEAD: APIOperationStats,
    OPTIONS: APIOperationStats,
    PATCH: APIOperationStats,
    POST: APIOperationStats,
    PUT: APIOperationStats,
    TRACE: APIOperationStats
  ): RecordHTTPMethodAPIOperatDELETE = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], PATCH = PATCH.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordHTTPMethodAPIOperatDELETE]
  }
  @scala.inline
  implicit class RecordHTTPMethodAPIOperatDELETEOps[Self <: RecordHTTPMethodAPIOperatDELETE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDELETE(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGET(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHEAD(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HEAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPTIONS(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPATCH(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATCH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPOST(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPUT(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACE(value: APIOperationStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

