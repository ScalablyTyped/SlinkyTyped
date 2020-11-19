package typingsSlinky.yauzlPromise

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.yauzl.mod.Options
import typingsSlinky.yauzl.mod.ZipFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yauzl-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def dosDateTimeToDate(date: Double, time: Double): js.Date = js.native
  
  def fromBuffer(buffer: Buffer): js.Promise[ZipFile] = js.native
  def fromBuffer(buffer: Buffer, options: Options): js.Promise[ZipFile] = js.native
  
  def fromFd(fd: Double): js.Promise[ZipFile] = js.native
  def fromFd(fd: Double, options: Options): js.Promise[ZipFile] = js.native
  
  def fromRandomAccessReader(reader: typingsSlinky.yauzl.mod.RandomAccessReader, totalSize: Double): js.Promise[ZipFile] = js.native
  def fromRandomAccessReader(reader: typingsSlinky.yauzl.mod.RandomAccessReader, totalSize: Double, options: Options): js.Promise[ZipFile] = js.native
  
  def open(path: String): js.Promise[ZipFile] = js.native
  def open(path: String, options: Options): js.Promise[ZipFile] = js.native
  
  def validateFileName(fileName: String): String | Null = js.native
  
  @js.native
  class Entry ()
    extends typingsSlinky.yauzl.mod.Entry {
    
    def openReadStream(): js.Promise[Readable] = js.native
    def openReadStream(options: ZipFileOptions): js.Promise[Readable] = js.native
  }
  
  @js.native
  abstract class RandomAccessReader ()
    extends typingsSlinky.yauzl.mod.RandomAccessReader
  
  @js.native
  class ZipFile protected () extends EventEmitter {
    def this(
      reader: typingsSlinky.yauzl.mod.RandomAccessReader,
      centralDirectoryOffset: Double,
      fileSize: Double,
      entryCount: Double,
      comment: String,
      autoClose: Boolean,
      lazyEntries: Boolean,
      decodeStrings: Boolean,
      validateEntrySizes: Boolean
    ) = this()
    
    // This chunk taken directly from @types/yauzl
    var autoClose: Boolean = js.native
    
    // These funcitons are custom to yauzl-promise
    def close(): js.Promise[Unit] = js.native
    
    var comment: String = js.native
    
    var decodeStrings: Boolean = js.native
    
    var emittedError: Boolean = js.native
    
    var entriesRead: Double = js.native
    
    var entryCount: Double = js.native
    
    var fileSize: Double = js.native
    
    var isOpen: Boolean = js.native
    
    var lazyEntries: Boolean = js.native
    
    def openReadStream(entry: Entry): js.Promise[Readable] = js.native
    def openReadStream(entry: Entry, options: ZipFileOptions): js.Promise[Readable] = js.native
    
    def readEntries(): js.Promise[js.Array[Entry]] = js.native
    def readEntries(numEntries: Double): js.Promise[js.Array[Entry]] = js.native
    
    def readEntry(): js.Promise[Entry] = js.native
    
    var readEntryCursor: Boolean = js.native
    
    var validateEntrySizes: Boolean = js.native
    
    def walkEntries(callback: js.Function1[/* entry */ Entry, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
    def walkEntries(callback: js.Function1[/* entry */ Entry, js.Promise[Unit] | Unit], numEntries: Double): js.Promise[Unit] = js.native
  }
}
