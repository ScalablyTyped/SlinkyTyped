package typingsSlinky.winrt.global.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
class BitmapDecoder ()
  extends typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder
/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
object BitmapDecoder extends js.Object {
  
  var bmpDecoderId: String = js.native
  
  def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  def createAsync(stream: IRandomAccessStream): IAsyncOperation[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  
  def getDecoderInformationEnumerator(): IVectorView[typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
  
  var gifDecoderId: String = js.native
  
  var icoDecoderId: String = js.native
  
  var jpegDecoderId: String = js.native
  
  var jpegXRDecoderId: String = js.native
  
  var pngDecoderId: String = js.native
  
  var tiffDecoderId: String = js.native
}
