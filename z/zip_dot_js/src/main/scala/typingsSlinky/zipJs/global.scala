package typingsSlinky.zipJs

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object zip extends js.Object {
    @js.native
    class BlobReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(blob: Blob) = this()
    }
    
    @js.native
    class BlobWriter protected ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(contentType: String) = this()
    }
    
    @js.native
    class Data64URIReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(dataURI: String) = this()
    }
    
    @js.native
    class Data64URIWriter ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(mimeString: String) = this()
    }
    
    @js.native
    class FileWriter protected ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(fileEntry: FileEntry) = this()
    }
    
    @js.native
    class HttpReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(url: String) = this()
    }
    
    @js.native
    class Reader ()
      extends typingsSlinky.zipJs.zip.Reader
    
    @js.native
    class TextReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(text: String) = this()
    }
    
    @js.native
    class TextWriter protected ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(encoding: String) = this()
    }
    
    @js.native
    class Writer ()
      extends typingsSlinky.zipJs.zip.Writer
    
    @js.native
    class ZipReader ()
      extends typingsSlinky.zipJs.zip.ZipReader
    
    @js.native
    class ZipWriter ()
      extends typingsSlinky.zipJs.zip.ZipWriter
    
    var useWebWorkers: Boolean = js.native
    var workerScriptsPath: String = js.native
    def createReader(
      reader: typingsSlinky.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typingsSlinky.zipJs.zip.ZipReader, Unit]
    ): Unit = js.native
    def createReader(
      reader: typingsSlinky.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typingsSlinky.zipJs.zip.ZipReader, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    def createWriter(
      writer: typingsSlinky.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsSlinky.zipJs.zip.ZipWriter, Unit]
    ): Unit = js.native
    def createWriter(
      writer: typingsSlinky.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsSlinky.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    def createWriter(
      writer: typingsSlinky.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsSlinky.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit],
      dontDeflate: Boolean
    ): Unit = js.native
    @js.native
    object workerScripts extends js.Object {
      var deflater: js.UndefOr[js.Array[String]] = js.native
      var inflater: js.UndefOr[js.Array[String]] = js.native
    }
    
  }
  
}

