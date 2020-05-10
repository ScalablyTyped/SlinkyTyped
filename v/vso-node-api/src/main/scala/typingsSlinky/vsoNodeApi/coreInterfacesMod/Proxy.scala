package typingsSlinky.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  var authorization: ProxyAuthorization = js.native
  /**
    * This is a description string
    */
  var description: String = js.native
  /**
    * The friendly name of the server
    */
  var friendlyName: String = js.native
  var globalDefault: Boolean = js.native
  /**
    * This is a string representation of the site that the proxy server is located in (e.g. "NA-WA-RED")
    */
  var site: String = js.native
  var siteDefault: Boolean = js.native
  /**
    * The URL of the proxy server
    */
  var url: String = js.native
}

object Proxy {
  @scala.inline
  def apply(
    authorization: ProxyAuthorization,
    description: String,
    friendlyName: String,
    globalDefault: Boolean,
    site: String,
    siteDefault: Boolean,
    url: String
  ): Proxy = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], globalDefault = globalDefault.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], siteDefault = siteDefault.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
  @scala.inline
  implicit class ProxyOps[Self <: Proxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: ProxyAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

