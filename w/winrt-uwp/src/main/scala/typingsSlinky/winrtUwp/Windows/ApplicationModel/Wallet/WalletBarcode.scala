package typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a bar code assigned to a wallet item. */
@js.native
trait WalletBarcode extends js.Object {
  /** Gets the symbology used by the bar code. */
  var symbology: WalletBarcodeSymbology = js.native
  /** Gets a string representation of the barcode (its message). */
  var value: String = js.native
  /**
    * Creates and returns a bitmap image stream for the barcode (or returns the custom image used during instantiation).
    * @return An asynchronous operation. If you use Asynchronous programming, the result type on successful completion is an IRandomAccessStreamReference instance. This can be assigned as the source for an image (with some additional code).
    */
  def getImageAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamReference] = js.native
}

object WalletBarcode {
  @scala.inline
  def apply(
    getImageAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStreamReference],
    symbology: WalletBarcodeSymbology,
    value: String
  ): WalletBarcode = {
    val __obj = js.Dynamic.literal(getImageAsync = js.Any.fromFunction0(getImageAsync), symbology = symbology.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletBarcode]
  }
  @scala.inline
  implicit class WalletBarcodeOps[Self <: WalletBarcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetImageAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStreamReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSymbology(value: WalletBarcodeSymbology): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

