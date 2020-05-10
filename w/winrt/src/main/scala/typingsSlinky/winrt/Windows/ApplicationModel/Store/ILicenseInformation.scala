package typingsSlinky.winrt.Windows.ApplicationModel.Store

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILicenseInformation extends js.Object {
  var expirationDate: js.Date = js.native
  var isActive: Boolean = js.native
  var isTrial: Boolean = js.native
  var onlicensechanged: js.Any = js.native
  var productLicenses: IMapView[String, ProductLicense] = js.native
}

object ILicenseInformation {
  @scala.inline
  def apply(
    expirationDate: js.Date,
    isActive: Boolean,
    isTrial: Boolean,
    onlicensechanged: js.Any,
    productLicenses: IMapView[String, ProductLicense]
  ): ILicenseInformation = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isTrial = isTrial.asInstanceOf[js.Any], onlicensechanged = onlicensechanged.asInstanceOf[js.Any], productLicenses = productLicenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILicenseInformation]
  }
  @scala.inline
  implicit class ILicenseInformationOps[Self <: ILicenseInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTrial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlicensechanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlicensechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductLicenses(value: IMapView[String, ProductLicense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLicenses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

