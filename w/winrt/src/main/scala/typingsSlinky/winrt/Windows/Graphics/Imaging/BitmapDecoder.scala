package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
class BitmapDecoder ()
  extends IBitmapDecoder
     with IBitmapFrame

/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
object BitmapDecoder extends js.Object {
  var bmpDecoderId: String = js.native
  var gifDecoderId: String = js.native
  var icoDecoderId: String = js.native
  var jpegDecoderId: String = js.native
  var jpegXRDecoderId: String = js.native
  var pngDecoderId: String = js.native
  var tiffDecoderId: String = js.native
  def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[BitmapDecoder] = js.native
  def createAsync(stream: IRandomAccessStream): IAsyncOperation[BitmapDecoder] = js.native
  def getDecoderInformationEnumerator(): IVectorView[BitmapCodecInformation] = js.native
}

