package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapEncoder extends js.Object {
  
  var bitmapContainerProperties: BitmapProperties = js.native
  
  var bitmapProperties: BitmapProperties = js.native
  
  var bitmapTransform: BitmapTransform = js.native
  
  var encoderInformation: BitmapCodecInformation = js.native
  
  def flushAsync(): IAsyncAction = js.native
  
  var generatedThumbnailHeight: Double = js.native
  
  var generatedThumbnailWidth: Double = js.native
  
  def goToNextFrameAsync(): IAsyncAction = js.native
  def goToNextFrameAsync(encodingOptions: IIterable[IKeyValuePair[String, BitmapTypedValue]]): IAsyncAction = js.native
  
  var isThumbnailGenerated: Boolean = js.native
  
  def setPixelData(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    width: Double,
    height: Double,
    dpiX: Double,
    dpiY: Double,
    pixels: js.typedarray.Uint8Array
  ): Unit = js.native
}
