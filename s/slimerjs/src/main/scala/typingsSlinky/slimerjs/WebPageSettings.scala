package typingsSlinky.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPageSettings extends js.Object {
  var XSSAuditingEnabled: Boolean = js.native
  var javascriptEnabled: Boolean = js.native
  var loadImages: Boolean = js.native
  var localToRemoteUrlAccessEnabled: Boolean = js.native
  var password: String = js.native
  var resourceTimeout: Double = js.native
  var userAgent: String = js.native
  var userName: String = js.native
  var webSecurityEnabled: Boolean = js.native
}

object WebPageSettings {
  @scala.inline
  def apply(
    XSSAuditingEnabled: Boolean,
    javascriptEnabled: Boolean,
    loadImages: Boolean,
    localToRemoteUrlAccessEnabled: Boolean,
    password: String,
    resourceTimeout: Double,
    userAgent: String,
    userName: String,
    webSecurityEnabled: Boolean
  ): WebPageSettings = {
    val __obj = js.Dynamic.literal(XSSAuditingEnabled = XSSAuditingEnabled.asInstanceOf[js.Any], javascriptEnabled = javascriptEnabled.asInstanceOf[js.Any], loadImages = loadImages.asInstanceOf[js.Any], localToRemoteUrlAccessEnabled = localToRemoteUrlAccessEnabled.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], resourceTimeout = resourceTimeout.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], webSecurityEnabled = webSecurityEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageSettings]
  }
  @scala.inline
  implicit class WebPageSettingsOps[Self <: WebPageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXSSAuditingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XSSAuditingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJavascriptEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalToRemoteUrlAccessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localToRemoteUrlAccessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebSecurityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSecurityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

