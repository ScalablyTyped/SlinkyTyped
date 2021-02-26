package typingsSlinky.zipJs

import org.scalajs.dom.raw.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object zip {
    
    @JSGlobal("zip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("zip.BlobReader")
    @js.native
    class BlobReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(blob: Blob) = this()
    }
    
    @JSGlobal("zip.BlobWriter")
    @js.native
    class BlobWriter protected ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(contentType: String) = this()
    }
    
    @JSGlobal("zip.Data64URIReader")
    @js.native
    class Data64URIReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(dataURI: String) = this()
    }
    
    @JSGlobal("zip.Data64URIWriter")
    @js.native
    class Data64URIWriter ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(mimeString: String) = this()
    }
    
    @JSGlobal("zip.FileWriter")
    @js.native
    class FileWriter protected ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(fileEntry: FileEntry) = this()
    }
    
    @JSGlobal("zip.HttpReader")
    @js.native
    class HttpReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(url: String) = this()
    }
    
    @JSGlobal("zip.Reader")
    @js.native
    class Reader ()
      extends typingsSlinky.zipJs.zip.Reader
    
    @JSGlobal("zip.TextReader")
    @js.native
    class TextReader protected ()
      extends typingsSlinky.zipJs.zip.Reader {
      def this(text: String) = this()
    }
    
    @JSGlobal("zip.TextWriter")
    @js.native
    class TextWriter protected ()
      extends typingsSlinky.zipJs.zip.Writer {
      def this(encoding: String) = this()
    }
    
    @JSGlobal("zip.Writer")
    @js.native
    class Writer ()
      extends typingsSlinky.zipJs.zip.Writer
    
    @JSGlobal("zip.ZipReader")
    @js.native
    class ZipReader ()
      extends typingsSlinky.zipJs.zip.ZipReader
    
    @JSGlobal("zip.ZipWriter")
    @js.native
    class ZipWriter ()
      extends typingsSlinky.zipJs.zip.ZipWriter
    
    @JSGlobal("zip.createReader")
    @js.native
    def createReader(
      reader: typingsSlinky.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typingsSlinky.zipJs.zip.ZipReader, Unit]
    ): Unit = js.native
    @JSGlobal("zip.createReader")
    @js.native
    def createReader(
      reader: typingsSlinky.zipJs.zip.Reader,
      callback: js.Function1[/* zipReader */ typingsSlinky.zipJs.zip.ZipReader, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    
    @JSGlobal("zip.createWriter")
    @js.native
    def createWriter(
      writer: typingsSlinky.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsSlinky.zipJs.zip.ZipWriter, Unit]
    ): Unit = js.native
    @JSGlobal("zip.createWriter")
    @js.native
    def createWriter(
      writer: typingsSlinky.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsSlinky.zipJs.zip.ZipWriter, Unit],
      onerror: js.UndefOr[scala.Nothing],
      dontDeflate: Boolean
    ): Unit = js.native
    @JSGlobal("zip.createWriter")
    @js.native
    def createWriter(
      writer: typingsSlinky.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsSlinky.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    @JSGlobal("zip.createWriter")
    @js.native
    def createWriter(
      writer: typingsSlinky.zipJs.zip.Writer,
      callback: js.Function1[/* zipWriter */ typingsSlinky.zipJs.zip.ZipWriter, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit],
      dontDeflate: Boolean
    ): Unit = js.native
    
    @JSGlobal("zip.useWebWorkers")
    @js.native
    def useWebWorkers: Boolean = js.native
    @scala.inline
    def useWebWorkers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useWebWorkers")(x.asInstanceOf[js.Any])
    
    object workerScripts {
      
      @JSGlobal("zip.workerScripts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("zip.workerScripts.deflater")
      @js.native
      def deflater: js.UndefOr[js.Array[String]] = js.native
      @scala.inline
      def deflater_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deflater")(x.asInstanceOf[js.Any])
      
      @JSGlobal("zip.workerScripts.inflater")
      @js.native
      def inflater: js.UndefOr[js.Array[String]] = js.native
      @scala.inline
      def inflater_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inflater")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("zip.workerScriptsPath")
    @js.native
    def workerScriptsPath: String = js.native
    @scala.inline
    def workerScriptsPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerScriptsPath")(x.asInstanceOf[js.Any])
  }
}
