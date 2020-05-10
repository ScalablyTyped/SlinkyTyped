package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorID extends js.Object {
  val appCodeName: java.lang.String = js.native
  val appName: java.lang.String = js.native
  val appVersion: java.lang.String = js.native
  val oscpu: java.lang.String = js.native
  val platform: java.lang.String = js.native
  val product: java.lang.String = js.native
  val productSub: java.lang.String = js.native
  val userAgent: java.lang.String = js.native
  val vendor: java.lang.String = js.native
  val vendorSub: java.lang.String = js.native
  def taintEnabled(): scala.Boolean = js.native
}

object NavigatorID {
  @scala.inline
  def apply(
    appCodeName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    oscpu: java.lang.String,
    platform: java.lang.String,
    product: java.lang.String,
    productSub: java.lang.String,
    taintEnabled: () => scala.Boolean,
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): NavigatorID = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], oscpu = oscpu.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productSub = productSub.asInstanceOf[js.Any], taintEnabled = js.Any.fromFunction0(taintEnabled), userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorID]
  }
  @scala.inline
  implicit class NavigatorIDOps[Self <: org.scalajs.dom.raw.NavigatorID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppCodeName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOscpu(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oscpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductSub(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaintEnabled(value: () => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taintEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserAgent(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendorSub(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorSub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

