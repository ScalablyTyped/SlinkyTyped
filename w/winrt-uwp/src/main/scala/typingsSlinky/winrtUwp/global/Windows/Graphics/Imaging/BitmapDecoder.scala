package typingsSlinky.winrtUwp.global.Windows.Graphics.Imaging

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides read access to bitmap container data as well as data from the first frame. */
@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
abstract class BitmapDecoder ()
  extends typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder
/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
object BitmapDecoder extends js.Object {
  
  /** The unique identifier of the BMP decoder. */
  var bmpDecoderId: String = js.native
  
  /**
    * Asynchronously creates a new BitmapDecoder using a specific bitmap codec and initializes it using a stream.
    * @param decoderId The unique identifier of the specified bitmap codec.
    * @param stream The stream containing the image file to be decoded.
    * @return An object that manages the asynchronous creation of a new BitmapDecoder .
    */
  def createAsync(decoderId: String, stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  /**
    * Asynchronously creates a new BitmapDecoder and initializes it using a stream.
    * @param stream The stream containing the image file to be decoded.
    * @return An object that manages the asynchronous creation of a new BitmapDecoder .
    */
  def createAsync(stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  
  /**
    * The bitmap decoders installed on the system and information about them.
    * @return A list of BitmapCodecInformation objects containing information about each decoder.
    */
  def getDecoderInformationEnumerator(): IVectorView[typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
  
  /** The unique identifier of the GIF decoder. */
  var gifDecoderId: String = js.native
  
  /** The unique identifier of the ICO decoder. */
  var icoDecoderId: String = js.native
  
  /** The unique identifier of the JPEG decoder. */
  var jpegDecoderId: String = js.native
  
  /** The unique identifier of the JPEG-XR decoder. */
  var jpegXRDecoderId: String = js.native
  
  /** The unique identifier of the PNG decoder. */
  var pngDecoderId: String = js.native
  
  /** The unique identifier of the TIFF decoder. */
  var tiffDecoderId: String = js.native
}
