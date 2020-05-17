package typingsSlinky.winrt.global.Windows.ApplicationModel

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Store")
@js.native
object Store extends js.Object {
  @js.native
  class CurrentApp ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Store.CurrentApp
  
  @js.native
  class CurrentAppSimulator ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Store.CurrentAppSimulator
  
  @js.native
  class LicenseInformation ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Store.LicenseInformation
  
  @js.native
  class ListingInformation ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Store.ListingInformation
  
  @js.native
  class ProductLicense ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Store.ProductLicense
  
  @js.native
  class ProductListing ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Store.ProductListing
  
  /* static members */
  @js.native
  object CurrentApp extends js.Object {
    var appId: String = js.native
    var licenseInformation: typingsSlinky.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    var linkUri: Uri = js.native
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    def loadListingInformationAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
  /* static members */
  @js.native
  object CurrentAppSimulator extends js.Object {
    var appId: String = js.native
    var licenseInformation: typingsSlinky.winrt.Windows.ApplicationModel.Store.LicenseInformation = js.native
    var linkUri: Uri = js.native
    def getAppReceiptAsync(): IAsyncOperation[String] = js.native
    def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
    def loadListingInformationAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.ApplicationModel.Store.ListingInformation] = js.native
    def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
    def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
    def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
  }
  
}

