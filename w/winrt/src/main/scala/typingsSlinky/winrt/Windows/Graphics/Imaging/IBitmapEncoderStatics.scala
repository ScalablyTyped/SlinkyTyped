package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapEncoderStatics extends js.Object {
  
  var bmpEncoderId: String = js.native
  
  def createAsync(encoderId: String, stream: IRandomAccessStream): IAsyncOperation[BitmapEncoder] = js.native
  def createAsync(
    encoderId: String,
    stream: IRandomAccessStream,
    encodingOptions: IIterable[IKeyValuePair[String, BitmapTypedValue]]
  ): IAsyncOperation[BitmapEncoder] = js.native
  
  def createForInPlacePropertyEncodingAsync(bitmapDecoder: BitmapDecoder): IAsyncOperation[BitmapEncoder] = js.native
  
  def createForTranscodingAsync(stream: IRandomAccessStream, bitmapDecoder: BitmapDecoder): IAsyncOperation[BitmapEncoder] = js.native
  
  def getEncoderInformationEnumerator(): IVectorView[BitmapCodecInformation] = js.native
  
  var gifEncoderId: String = js.native
  
  var jpegEncoderId: String = js.native
  
  var jpegXREncoderId: String = js.native
  
  var pngEncoderId: String = js.native
  
  var tiffEncoderId: String = js.native
}
