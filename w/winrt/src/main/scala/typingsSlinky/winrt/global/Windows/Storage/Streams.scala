package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Streams {
  
  @JSGlobal("Windows.Storage.Streams.Buffer")
  @js.native
  class Buffer protected ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.Buffer {
    def this(capacity: Double) = this()
  }
  
  @JSGlobal("Windows.Storage.Streams.ByteOrder")
  @js.native
  object ByteOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder with Double] = js.native
    
    /* 1 */ val bigEndian: typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder.bigEndian with Double = js.native
    
    /* 0 */ val littleEndian: typingsSlinky.winrt.Windows.Storage.Streams.ByteOrder.littleEndian with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.DataReader")
  @js.native
  class DataReader protected ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataReader {
    def this(inputStream: IInputStream) = this()
  }
  /* static members */
  object DataReader {
    
    @JSGlobal("Windows.Storage.Streams.DataReader.fromBuffer")
    @js.native
    def fromBuffer(buffer: IBuffer): typingsSlinky.winrt.Windows.Storage.Streams.DataReader = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.DataReaderLoadOperation")
  @js.native
  class DataReaderLoadOperation ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataReaderLoadOperation
  
  @JSGlobal("Windows.Storage.Streams.DataWriter")
  @js.native
  class DataWriter ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataWriter {
    def this(outputStream: IOutputStream) = this()
  }
  
  @JSGlobal("Windows.Storage.Streams.DataWriterStoreOperation")
  @js.native
  class DataWriterStoreOperation ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.DataWriterStoreOperation
  
  @JSGlobal("Windows.Storage.Streams.FileInputStream")
  @js.native
  class FileInputStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileInputStream
  
  @JSGlobal("Windows.Storage.Streams.FileOutputStream")
  @js.native
  class FileOutputStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileOutputStream
  
  @JSGlobal("Windows.Storage.Streams.FileRandomAccessStream")
  @js.native
  class FileRandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.FileRandomAccessStream
  
  @JSGlobal("Windows.Storage.Streams.InMemoryRandomAccessStream")
  @js.native
  class InMemoryRandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.InMemoryRandomAccessStream
  
  @JSGlobal("Windows.Storage.Streams.InputStreamOptions")
  @js.native
  object InputStreamOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions with Double] = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.none with Double = js.native
    
    /* 1 */ val partial: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.partial with Double = js.native
    
    /* 2 */ val readAhead: typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions.readAhead with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
  @js.native
  class InputStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOverStream
  
  @JSGlobal("Windows.Storage.Streams.OutputStreamOverStream")
  @js.native
  class OutputStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.OutputStreamOverStream
  
  @JSGlobal("Windows.Storage.Streams.RandomAccessStream")
  @js.native
  class RandomAccessStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStream
  /* static members */
  object RandomAccessStream {
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream.copyAndCloseAsync")
    @js.native
    def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream.copyAsync")
    @js.native
    def copyAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream.copyAsync")
    @js.native
    def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamOverStream")
  @js.native
  class RandomAccessStreamOverStream ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamOverStream
  
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
  @js.native
  class RandomAccessStreamReference ()
    extends typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference
  /* static members */
  object RandomAccessStreamReference {
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference.createFromFile")
    @js.native
    def createFromFile(file: IStorageFile): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference.createFromStream")
    @js.native
    def createFromStream(stream: IRandomAccessStream): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference.createFromUri")
    @js.native
    def createFromUri(uri: Uri): typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
  @js.native
  object UnicodeEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding with Double] = js.native
    
    /* 2 */ val utf16BE: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16BE with Double = js.native
    
    /* 1 */ val utf16LE: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16LE with Double = js.native
    
    /* 0 */ val utf8: typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding.utf8 with Double = js.native
  }
}
