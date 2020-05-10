package typingsSlinky.typedRestClient.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProxyConfiguration extends js.Object {
  var proxyBypassHosts: js.UndefOr[js.Array[String]] = js.native
  var proxyPassword: js.UndefOr[String] = js.native
  var proxyUrl: String = js.native
  var proxyUsername: js.UndefOr[String] = js.native
}

object IProxyConfiguration {
  @scala.inline
  def apply(proxyUrl: String): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxyConfiguration]
  }
  @scala.inline
  implicit class IProxyConfigurationOps[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyBypassHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyBypassHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyBypassHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyBypassHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUsername")(js.undefined)
        ret
    }
  }
  
}

