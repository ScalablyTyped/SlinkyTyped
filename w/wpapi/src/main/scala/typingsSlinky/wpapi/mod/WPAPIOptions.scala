package typingsSlinky.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WPAPIOptions extends Credentials {
  /** The URI for a WP-API endpoint */
  var endpoint: String = js.native
  /**
    * A dictionary of API routes with which to bootstrap the WPAPI instance:
    * the instance will be initialized with default routes only if this
    * property is omitted
    */
  var routes: js.UndefOr[Routes] = js.native
  /**
    * An optional dictionary of HTTP transport methods (.get, .post, .put,
    * .delete, .head) to use instead of the defaults, e.g. to use a
    * different HTTP library than superagent
    */
  var transport: js.UndefOr[Transport] = js.native
}

object WPAPIOptions {
  @scala.inline
  def apply(endpoint: String): WPAPIOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[WPAPIOptions]
  }
  @scala.inline
  implicit class WPAPIOptionsOps[Self <: WPAPIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: Routes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
  }
  
}

