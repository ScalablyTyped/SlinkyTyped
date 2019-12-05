package typingsSlinky.winrt.Windows.ApplicationModel.Store

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILicenseInformation extends js.Object {
  var expirationDate: js.Date
  var isActive: Boolean
  var isTrial: Boolean
  var onlicensechanged: js.Any
  var productLicenses: IMapView[String, ProductLicense]
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
}

