package typingsSlinky.winrt.global.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
class BitmapDecoder ()
  extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder {
  /* CompleteClass */
  override var bitmapContainerProperties: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPropertiesView = js.native
  /* CompleteClass */
  override var decoderInformation: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapCodecInformation = js.native
  /* CompleteClass */
  override var frameCount: Double = js.native
  /* CompleteClass */
  override def getFrameAsync(frameIndex: Double): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapFrame] = js.native
  /* CompleteClass */
  override def getPreviewAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.ImageStream] = js.native
}

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
  def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  def createAsync(stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  def getDecoderInformationEnumerator(): IVectorView[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
}

