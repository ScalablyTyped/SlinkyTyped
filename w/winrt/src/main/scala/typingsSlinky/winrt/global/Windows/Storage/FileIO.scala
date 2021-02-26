package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.FileIO")
@js.native
class FileIO ()
  extends typingsSlinky.winrt.Windows.Storage.FileIO
/* static members */
object FileIO {
  
  @JSGlobal("Windows.Storage.FileIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.appendTextAsync")
  @js.native
  def appendTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.appendTextAsync")
  @js.native
  def appendTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.readBufferAsync")
  @js.native
  def readBufferAsync(file: IStorageFile): IAsyncOperation[IBuffer] = js.native
  
  @JSGlobal("Windows.Storage.FileIO.readLinesAsync")
  @js.native
  def readLinesAsync(file: IStorageFile): IAsyncOperation[IVector[String]] = js.native
  @JSGlobal("Windows.Storage.FileIO.readLinesAsync")
  @js.native
  def readLinesAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = js.native
  
  @JSGlobal("Windows.Storage.FileIO.readTextAsync")
  @js.native
  def readTextAsync(file: IStorageFile): IAsyncOperation[String] = js.native
  @JSGlobal("Windows.Storage.FileIO.readTextAsync")
  @js.native
  def readTextAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[String] = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeBufferAsync")
  @js.native
  def writeBufferAsync(file: IStorageFile, buffer: IBuffer): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeBytesAsync")
  @js.native
  def writeBytesAsync(file: IStorageFile, buffer: js.typedarray.Uint8Array): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeTextAsync")
  @js.native
  def writeTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.writeTextAsync")
  @js.native
  def writeTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
}
