package typingsSlinky.winrt.Windows.ApplicationModel.Store

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICurrentAppSimulator extends js.Object {
  var appId: String = js.native
  var licenseInformation: LicenseInformation = js.native
  var linkUri: Uri = js.native
  def getAppReceiptAsync(): IAsyncOperation[String] = js.native
  def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
  def loadListingInformationAsync(): IAsyncOperation[ListingInformation] = js.native
  def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
  def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
  def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
}

object ICurrentAppSimulator {
  @scala.inline
  def apply(
    appId: String,
    getAppReceiptAsync: () => IAsyncOperation[String],
    getProductReceiptAsync: String => IAsyncOperation[String],
    licenseInformation: LicenseInformation,
    linkUri: Uri,
    loadListingInformationAsync: () => IAsyncOperation[ListingInformation],
    reloadSimulatorAsync: StorageFile => IAsyncAction,
    requestAppPurchaseAsync: Boolean => IAsyncOperation[String],
    requestProductPurchaseAsync: (String, Boolean) => IAsyncOperation[String]
  ): ICurrentAppSimulator = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], getAppReceiptAsync = js.Any.fromFunction0(getAppReceiptAsync), getProductReceiptAsync = js.Any.fromFunction1(getProductReceiptAsync), licenseInformation = licenseInformation.asInstanceOf[js.Any], linkUri = linkUri.asInstanceOf[js.Any], loadListingInformationAsync = js.Any.fromFunction0(loadListingInformationAsync), reloadSimulatorAsync = js.Any.fromFunction1(reloadSimulatorAsync), requestAppPurchaseAsync = js.Any.fromFunction1(requestAppPurchaseAsync), requestProductPurchaseAsync = js.Any.fromFunction2(requestProductPurchaseAsync))
    __obj.asInstanceOf[ICurrentAppSimulator]
  }
  @scala.inline
  implicit class ICurrentAppSimulatorOps[Self <: ICurrentAppSimulator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAppReceiptAsync(value: () => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppReceiptAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProductReceiptAsync(value: String => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProductReceiptAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLicenseInformation(value: LicenseInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadListingInformationAsync(value: () => IAsyncOperation[ListingInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadListingInformationAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReloadSimulatorAsync(value: StorageFile => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadSimulatorAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestAppPurchaseAsync(value: Boolean => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAppPurchaseAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestProductPurchaseAsync(value: (String, Boolean) => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProductPurchaseAsync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

