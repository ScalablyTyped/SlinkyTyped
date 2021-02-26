package typingsSlinky.winrt.Windows.Devices.Enumeration

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceThumbnail extends IRandomAccessStreamWithContentType {
  
  def dispose(): Unit = js.native
}
object DeviceThumbnail {
  
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    contentType: String,
    dispose: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Unit,
    size: Double,
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): DeviceThumbnail = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[DeviceThumbnail]
  }
  
  @scala.inline
  implicit class DeviceThumbnailMutableBuilder[Self <: DeviceThumbnail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
