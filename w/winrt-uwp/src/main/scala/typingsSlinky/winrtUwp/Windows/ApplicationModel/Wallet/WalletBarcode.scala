package typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a bar code assigned to a wallet item. */
@js.native
trait WalletBarcode extends StObject {
  
  /**
    * Creates and returns a bitmap image stream for the barcode (or returns the custom image used during instantiation).
    * @return An asynchronous operation. If you use Asynchronous programming, the result type on successful completion is an IRandomAccessStreamReference instance. This can be assigned as the source for an image (with some additional code).
    */
  def getImageAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamReference] = js.native
  
  /** Gets the symbology used by the bar code. */
  var symbology: WalletBarcodeSymbology = js.native
  
  /** Gets a string representation of the barcode (its message). */
  var value: String = js.native
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
  implicit class WalletBarcodeMutableBuilder[Self <: WalletBarcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetImageAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStreamReference]): Self = StObject.set(x, "getImageAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSymbology(value: WalletBarcodeSymbology): Self = StObject.set(x, "symbology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
