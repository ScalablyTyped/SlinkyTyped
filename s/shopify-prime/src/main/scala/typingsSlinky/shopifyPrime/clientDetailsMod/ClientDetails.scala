package typingsSlinky.shopifyPrime.clientDetailsMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDetails extends ShopifyObject {
  /**
    * Shopify does not offer documentation for this field.
    */
  var accept_language: js.UndefOr[String] = js.native
  /**
    *  The browser screen height in pixels, if available.
    */
  var browser_height: js.UndefOr[String] = js.native
  /**
    *  The browser IP address.
    */
  var browser_ip: js.UndefOr[String] = js.native
  /**
    *  The browser screen width in pixels, if available.
    */
  var browser_width: js.UndefOr[String] = js.native
  /**
    *  A hash of the session.
    */
  var session_height: js.UndefOr[String] = js.native
  /**
    *  The browser's user agent string.
    */
  var user_agent: js.UndefOr[String] = js.native
}

object ClientDetails {
  @scala.inline
  def apply(): ClientDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientDetails]
  }
  @scala.inline
  implicit class ClientDetailsOps[Self <: ClientDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept_language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept_language")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser_height(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_height")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_ip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser_width(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_width")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_height(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_height")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_agent")(js.undefined)
        ret
    }
  }
  
}

