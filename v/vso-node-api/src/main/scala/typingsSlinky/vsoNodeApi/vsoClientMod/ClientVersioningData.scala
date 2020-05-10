package typingsSlinky.vsoNodeApi.vsoClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVersioningData extends js.Object {
  /**
    * The api version string to send in the request (e.g. "1.0" or "2.0-preview.2")
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The request path string to send the request to.  Looked up via an options request with the location id.
    */
  var requestUrl: js.UndefOr[String] = js.native
}

object ClientVersioningData {
  @scala.inline
  def apply(): ClientVersioningData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVersioningData]
  }
  @scala.inline
  implicit class ClientVersioningDataOps[Self <: ClientVersioningData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUrl")(js.undefined)
        ret
    }
  }
  
}

