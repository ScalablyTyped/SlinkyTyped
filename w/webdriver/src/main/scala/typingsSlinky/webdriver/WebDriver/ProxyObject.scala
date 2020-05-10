package typingsSlinky.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyObject extends js.Object {
  var ftpProxy: js.UndefOr[String] = js.native
  var ftpProxyPort: js.UndefOr[Double] = js.native
  var httpProxy: js.UndefOr[String] = js.native
  var httpProxyPort: js.UndefOr[Double] = js.native
  var proxyAutoconfigUrl: js.UndefOr[String] = js.native
  var proxyType: js.UndefOr[ProxyTypes] = js.native
  var socksPassword: js.UndefOr[String] = js.native
  var socksProxy: js.UndefOr[String] = js.native
  var socksProxyPort: js.UndefOr[Double] = js.native
  var socksUsername: js.UndefOr[String] = js.native
  var socksVersion: js.UndefOr[String] = js.native
  var sslProxy: js.UndefOr[String] = js.native
  var sslProxyPort: js.UndefOr[Double] = js.native
}

object ProxyObject {
  @scala.inline
  def apply(): ProxyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyObject]
  }
  @scala.inline
  implicit class ProxyObjectOps[Self <: ProxyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFtpProxyPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftpProxyPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFtpProxyPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftpProxyPort")(js.undefined)
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
    def withHttpProxyPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpProxyPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpProxyPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpProxyPort")(js.undefined)
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
    def withProxyType(value: ProxyTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyType")(js.undefined)
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
    def withSocksProxyPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksProxyPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocksProxyPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksProxyPort")(js.undefined)
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
    def withSocksVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocksVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socksVersion")(js.undefined)
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
    @scala.inline
    def withSslProxyPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslProxyPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslProxyPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslProxyPort")(js.undefined)
        ret
    }
  }
  
}

