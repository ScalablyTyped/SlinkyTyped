package typingsSlinky.winrt.global.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
class BitmapEncoder ()
  extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder

/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
object BitmapEncoder extends js.Object {
  var bmpEncoderId: String = js.native
  var gifEncoderId: String = js.native
  var jpegEncoderId: String = js.native
  var jpegXREncoderId: String = js.native
  var pngEncoderId: String = js.native
  var tiffEncoderId: String = js.native
  def createAsync(encoderId: String, stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def createAsync(
    encoderId: String,
    stream: IRandomAccessStream,
    encodingOptions: IIterable[
      IKeyValuePair[String, typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapTypedValue]
    ]
  ): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def createForInPlacePropertyEncodingAsync(bitmapDecoder: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def createForTranscodingAsync(
    stream: IRandomAccessStream,
    bitmapDecoder: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder
  ): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def getEncoderInformationEnumerator(): IVectorView[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
}

