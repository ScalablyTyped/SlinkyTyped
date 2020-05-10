package typingsSlinky.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfig extends js.Object {
  var ftpProxy: js.UndefOr[String] = js.native
  var httpProxy: js.UndefOr[String] = js.native
  var noProxy: js.UndefOr[String] = js.native
  var proxyAutoconfigUrl: js.UndefOr[String] = js.native
  var proxyType: String = js.native
  var socksPassword: js.UndefOr[String] = js.native
  var socksProxy: js.UndefOr[String] = js.native
  var socksUsername: js.UndefOr[String] = js.native
  var sslProxy: js.UndefOr[String] = js.native
}

object ProxyConfig {
  @scala.inline
  def apply(proxyType: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(proxyType = proxyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
  @scala.inline
  implicit class ProxyConfigOps[Self <: ProxyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFtpProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftpProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFtpProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftpProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withNoProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyAutoconfigUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAutoconfigUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyAutoconfigUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyAutoconfigUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSocksPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocksPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSocksProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocksProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSocksUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocksUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withSslProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslProxy")(js.undefined)
        ret
    }
  }
  
}

