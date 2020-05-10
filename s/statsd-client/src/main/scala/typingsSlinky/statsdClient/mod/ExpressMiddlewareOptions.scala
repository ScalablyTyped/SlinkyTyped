package typingsSlinky.statsdClient.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressMiddlewareOptions extends js.Object {
  /**
    * Metric name to use for reporting if a matching route is not
    * found (default "unknown_express_route").
    */
  var notFoundRouteName: js.UndefOr[String] = js.native
  /**
    * Optional callback called after reporting metrics for an
    * express route.
    */
  var onResponseEnd: js.UndefOr[
    js.Function4[
      /* client */ StatsdClient, 
      /* startTime */ js.Date, 
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      Unit
    ]
  ] = js.native
  /**
    * Enables inclusion of per-URL response code and timing
    * metrics (default false).
    */
  var timeByUrl: js.UndefOr[Boolean] = js.native
}

object ExpressMiddlewareOptions {
  @scala.inline
  def apply(): ExpressMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressMiddlewareOptions]
  }
  @scala.inline
  implicit class ExpressMiddlewareOptionsOps[Self <: ExpressMiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotFoundRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundRouteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundRouteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundRouteName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponseEnd(
      value: (/* client */ StatsdClient, /* startTime */ js.Date, /* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponseEnd")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnResponseEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponseEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeByUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeByUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeByUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeByUrl")(js.undefined)
        ret
    }
  }
  
}

