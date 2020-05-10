package typingsSlinky.swaggerStats.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  hostname  :string,   name  :string,   version  :string,   ip  :string,   swaggerSpec  :std.Record<any, any>,   uriPath  :string,   timelineBucketDuration  :number,   durationBuckets  :std.Array<number>,   requestSizeBuckets  :std.Array<number>,   responseSizeBuckets  :std.Array<number>,   apdexThreshold  :number, onResponseFinish (req : node.http.IncomingMessage, res : node.http.ServerResponse, rrr : swagger-stats.swagger-stats.RequestResponseRecord): void,   authentication  :boolean, onAuthenticate (req : node.http.IncomingMessage, username : string, password : string): boolean,   sessionMaxAge  :number,   elasticsearch  :string,   elasticsearchIndexPrefix  :string,   elasticsearchUsername  :string,   elasticsearchPassword  :string,   swaggerOnly  :boolean,   metricsPrefix  :string,   enableEgress  :boolean}> */
@js.native
trait SWStats extends js.Object {
  var apdexThreshold: js.UndefOr[Double] = js.native
  var authentication: js.UndefOr[Boolean] = js.native
  var durationBuckets: js.UndefOr[js.Array[Double]] = js.native
  var elasticsearch: js.UndefOr[String] = js.native
  var elasticsearchIndexPrefix: js.UndefOr[String] = js.native
  var elasticsearchPassword: js.UndefOr[String] = js.native
  var elasticsearchUsername: js.UndefOr[String] = js.native
  var enableEgress: js.UndefOr[Boolean] = js.native
  var hostname: js.UndefOr[String] = js.native
  var ip: js.UndefOr[String] = js.native
  var metricsPrefix: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onAuthenticate: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* username */ String, /* password */ String, Boolean]
  ] = js.native
  var onResponseFinish: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* rrr */ RequestResponseRecord, 
      Unit
    ]
  ] = js.native
  var requestSizeBuckets: js.UndefOr[js.Array[Double]] = js.native
  var responseSizeBuckets: js.UndefOr[js.Array[Double]] = js.native
  var sessionMaxAge: js.UndefOr[Double] = js.native
  var swaggerOnly: js.UndefOr[Boolean] = js.native
  var swaggerSpec: js.UndefOr[Record[_, _]] = js.native
  var timelineBucketDuration: js.UndefOr[Double] = js.native
  var uriPath: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object SWStats {
  @scala.inline
  def apply(): SWStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SWStats]
  }
  @scala.inline
  implicit class SWStatsOps[Self <: SWStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApdexThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apdexThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApdexThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apdexThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationBuckets(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearch")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchIndexPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchIndexPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchIndexPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchIndexPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableEgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEgress")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuthenticate(value: (/* req */ IncomingMessage, /* username */ String, /* password */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuthenticate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAuthenticate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuthenticate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponseFinish(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* rrr */ RequestResponseRecord) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponseFinish")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnResponseFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponseFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestSizeBuckets(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestSizeBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestSizeBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestSizeBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseSizeBuckets(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSizeBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseSizeBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSizeBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerSpec(value: Record[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineBucketDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineBucketDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimelineBucketDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineBucketDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withUriPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPath")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

