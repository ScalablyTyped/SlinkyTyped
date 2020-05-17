package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.UnicodeEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.FileIO")
@js.native
class FileIO ()
  extends typingsSlinky.winrt.Windows.Storage.FileIO

/* static members */
@JSGlobal("Windows.Storage.FileIO")
@js.native
object FileIO extends js.Object {
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def appendTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  def appendTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
  def readBufferAsync(file: IStorageFile): IAsyncOperation[IBuffer] = js.native
  def readLinesAsync(file: IStorageFile): IAsyncOperation[IVector[String]] = js.native
  def readLinesAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = js.native
  def readTextAsync(file: IStorageFile): IAsyncOperation[String] = js.native
  def readTextAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[String] = js.native
  def writeBufferAsync(file: IStorageFile, buffer: IBuffer): IAsyncAction = js.native
  def writeBytesAsync(file: IStorageFile, buffer: js.typedarray.Uint8Array): IAsyncAction = js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def writeTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  def writeTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
}

