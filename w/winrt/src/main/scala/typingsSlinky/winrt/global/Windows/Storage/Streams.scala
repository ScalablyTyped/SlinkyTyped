package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.AsyncStatus
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams")
@js.native
object Streams extends js.Object {
  @js.native
  class Buffer protected ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.Buffer {
    def this(capacity: Double) = this()
    /* CompleteClass */
    override var capacity: Double = js.native
    /* CompleteClass */
    override var length: Double = js.native
  }
  
  @js.native
  class DataReader protected ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataReader {
    def this(inputStream: IInputStream) = this()
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @js.native
  class DataReaderLoadOperation ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataReaderLoadOperation {
    /* CompleteClass */
    override var errorCode: Double = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var status: AsyncStatus = js.native
    /* CompleteClass */
    override def cancel(): Unit = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @js.native
  class DataWriter ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataWriter {
    def this(outputStream: IOutputStream) = this()
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @js.native
  class DataWriterStoreOperation ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataWriterStoreOperation {
    /* CompleteClass */
    override var errorCode: Double = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var status: AsyncStatus = js.native
    /* CompleteClass */
    override def cancel(): Unit = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @js.native
  class FileInputStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileInputStream {
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  @js.native
  class FileOutputStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileOutputStream {
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class FileRandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileRandomAccessStream {
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canWrite: Boolean = js.native
    /* CompleteClass */
    override var position: Double = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class InMemoryRandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.InMemoryRandomAccessStream {
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canWrite: Boolean = js.native
    /* CompleteClass */
    override var position: Double = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class InputStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOverStream {
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  @js.native
  class OutputStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.OutputStreamOverStream {
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class RandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStream
  
  @js.native
  class RandomAccessStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamOverStream {
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canWrite: Boolean = js.native
    /* CompleteClass */
    override var position: Double = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class RandomAccessStreamReference ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference {
    /* CompleteClass */
    override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  }
  
  @js.native
  object ByteOrder extends js.Object {
    /* 1 */ val bigEndian: typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder.bigEndian with Double = js.native
    /* 0 */ val littleEndian: typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder.littleEndian with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder with Double] = js.native
  }
  
  /* static members */
  @js.native
  object DataReader extends js.Object {
    def fromBuffer(buffer: IBuffer): typingsSlinky.winrt.Windows.Storage.Streams.DataReader = js.native
  }
  
  @js.native
  object InputStreamOptions extends js.Object {
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.none with Double = js.native
    /* 1 */ val partial: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.partial with Double = js.native
    /* 2 */ val readAhead: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.readAhead with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions with Double] = js.native
  }
  
  /* static members */
  @js.native
  object RandomAccessStream extends js.Object {
    def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    def copyAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /* static members */
  @js.native
  object RandomAccessStreamReference extends js.Object {
    def createFromFile(file: IStorageFile): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    def createFromStream(stream: IRandomAccessStream): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    def createFromUri(uri: Uri): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  }
  
  @js.native
  object UnicodeEncoding extends js.Object {
    /* 2 */ val utf16BE: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16BE with Double = js.native
    /* 1 */ val utf16LE: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16LE with Double = js.native
    /* 0 */ val utf8: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf8 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding with Double] = js.native
  }
  
}

