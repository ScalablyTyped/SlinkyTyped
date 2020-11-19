package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.Streams")
@js.native
object Streams extends js.Object {
  
  @js.native
  class Buffer protected ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.Buffer {
    def this(capacity: Double) = this()
  }
  
  @js.native
  object ByteOrder extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder with Double] = js.native
    
    /* 1 */ val bigEndian: typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder.bigEndian with Double = js.native
    
    /* 0 */ val littleEndian: typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder.littleEndian with Double = js.native
  }
  
  @js.native
  class DataReader protected ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataReader {
    def this(inputStream: IInputStream) = this()
  }
  /* static members */
  @js.native
  object DataReader extends js.Object {
    
    def fromBuffer(buffer: IBuffer): typingsSlinky.winrt.Windows.Storage.Streams.DataReader = js.native
  }
  
  @js.native
  class DataReaderLoadOperation ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataReaderLoadOperation
  
  @js.native
  class DataWriter ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataWriter {
    def this(outputStream: IOutputStream) = this()
  }
  
  @js.native
  class DataWriterStoreOperation ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataWriterStoreOperation
  
  @js.native
  class FileInputStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileInputStream
  
  @js.native
  class FileOutputStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileOutputStream
  
  @js.native
  class FileRandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileRandomAccessStream
  
  @js.native
  class InMemoryRandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.InMemoryRandomAccessStream
  
  @js.native
  object InputStreamOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions with Double] = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.none with Double = js.native
    
    /* 1 */ val partial: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.partial with Double = js.native
    
    /* 2 */ val readAhead: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.readAhead with Double = js.native
  }
  
  @js.native
  class InputStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOverStream
  
  @js.native
  class OutputStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.OutputStreamOverStream
  
  @js.native
  class RandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStream
  /* static members */
  @js.native
  object RandomAccessStream extends js.Object {
    
    def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    
    def copyAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class RandomAccessStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamOverStream
  
  @js.native
  class RandomAccessStreamReference ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference
  /* static members */
  @js.native
  object RandomAccessStreamReference extends js.Object {
    
    def createFromFile(file: IStorageFile): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    def createFromStream(stream: IRandomAccessStream): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    def createFromUri(uri: Uri): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  }
  
  @js.native
  object UnicodeEncoding extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding with Double] = js.native
    
    /* 2 */ val utf16BE: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16BE with Double = js.native
    
    /* 1 */ val utf16LE: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16LE with Double = js.native
    
    /* 0 */ val utf8: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf8 with Double = js.native
  }
}
