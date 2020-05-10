package typingsSlinky.swaggerStats.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.swaggerStats.AnonDeprecated
import typingsSlinky.swaggerStats.AnonHostname
import typingsSlinky.swaggerStats.AnonRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestResponseRecord
  extends /* field */ StringDictionary[js.Any] {
  var `@timestamp`: String = js.native
  var api: AnonDeprecated = js.native
  var attrs: js.UndefOr[Record[String, String]] = js.native
  var attrsint: js.UndefOr[Record[String, Double]] = js.native
  var endts: Double = js.native
  var http: AnonRequest = js.native
  var ip: String = js.native
  var method: String = js.native
  var node: AnonHostname = js.native
  var path: String = js.native
  var port: String = js.native
  var query: String = js.native
  var real_ip: String = js.native
  var responsetime: Double = js.native
  var startts: Double = js.native
}

object RequestResponseRecord {
  @scala.inline
  def apply(
    `@timestamp`: String,
    api: AnonDeprecated,
    endts: Double,
    http: AnonRequest,
    ip: String,
    method: String,
    node: AnonHostname,
    path: String,
    port: String,
    query: String,
    real_ip: String,
    responsetime: Double,
    startts: Double
  ): RequestResponseRecord = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], endts = endts.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], real_ip = real_ip.asInstanceOf[js.Any], responsetime = responsetime.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any])
    __obj.updateDynamic("@timestamp")(`@timestamp`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponseRecord]
  }
  @scala.inline
  implicit class RequestResponseRecordOps[Self <: RequestResponseRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with@timestamp`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi(value: AnonDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: AnonRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: AnonHostname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReal_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponsetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrsint(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrsint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrsint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrsint")(js.undefined)
        ret
    }
  }
  
}

