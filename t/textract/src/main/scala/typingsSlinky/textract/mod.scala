package typingsSlinky.textract

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ExecException
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.textract.anon.Cmd
import typingsSlinky.textract.anon.Crop
import typingsSlinky.textract.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("textract", "fromBufferWithMime")
  @js.native
  def fromBufferWithMime(
    mimeType: String,
    buffer: Buffer,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  @JSImport("textract", "fromBufferWithMime")
  @js.native
  def fromBufferWithMime(
    mimeType: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  
  @JSImport("textract", "fromBufferWithName")
  @js.native
  def fromBufferWithName(
    name: String,
    buffer: Buffer,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  @JSImport("textract", "fromBufferWithName")
  @js.native
  def fromBufferWithName(
    name: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  
  @JSImport("textract", "fromFileWithMimeAndPath")
  @js.native
  def fromFileWithMimeAndPath(
    mimeType: String,
    filePath: String,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  @JSImport("textract", "fromFileWithMimeAndPath")
  @js.native
  def fromFileWithMimeAndPath(
    mimeType: String,
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  
  @JSImport("textract", "fromFileWithPath")
  @js.native
  def fromFileWithPath(filePath: String, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = js.native
  @JSImport("textract", "fromFileWithPath")
  @js.native
  def fromFileWithPath(
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  
  @JSImport("textract", "fromUrl")
  @js.native
  def fromUrl(url: String, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = js.native
  @JSImport("textract", "fromUrl")
  @js.native
  def fromUrl(
    url: String,
    config: URLConfig,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  @JSImport("textract", "fromUrl")
  @js.native
  def fromUrl(url: URL_, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = js.native
  @JSImport("textract", "fromUrl")
  @js.native
  def fromUrl(
    url: URL_,
    config: URLConfig,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = js.native
  
  @js.native
  trait Config extends StObject {
    
    /**
      * Doc extractor options for non OS X.
      * See `drawingtotext` manual for available options
      */
    var doc: js.UndefOr[extractorExecOpts] = js.native
    
    /**
      * DXF extractor options.
      * See `antiword` manual for available options
      */
    var dxf: js.UndefOr[extractorExecOpts] = js.native
    
    /**
      * Some extractors (dxf) use node's exec functionality.
      * This setting allows for providing config to exec execution.
      * One reason you might want to provide this config is if you are dealing with very large files.
      * You might want to increase the exec maxBuffer setting.
      */
    var exec: js.UndefOr[ExecException] = js.native
    
    /**
      * Images (png, jpg, gif) extractor options.
      * See `tesseract` manual for available options
      */
    var images: js.UndefOr[extractorExecOpts] = js.native
    
    /**
      * When extracting HTML, whether or not to include `alt` text with the extracted text.
      * @default false
      */
    var includeAltText: js.UndefOr[Boolean] = js.native
    
    /**
      * This is a proxy options object to the library textract uses for pdf extraction: pdf-text-extract.
      * Options include ownerPassword, userPassword if you are extracting text from password protected PDFs.
      * IMPORTANT: textract modifies the pdf-text-extract layout default so that, instead of layout: layout, it uses layout:raw.
      * It is not suggested you modify this without understanding what trouble that might get you in.
      * See [this GH issue](https://github.com/dbashford/textract/issues/75) for why textract overrides that library's default.
      */
    var pdftotextOptions: js.UndefOr[Crop] = js.native
    
    /**
      * Pass this in as true and textract will not strip any line breaks.
      * @default false
      */
    var preserveLineBreaks: js.UndefOr[Boolean] = js.native
    
    /**
      * Some extractors, like PDF, insert line breaks at the end of every line, even if the middle of a sentence.
      * If this option is set to true, then any instances of a single line break are removed but multiple line breaks are preserved.
      * Check your output with this option, though, this doesn't preserve paragraphs unless there are multiple breaks.
      * @default false
      */
    var preserveOnlyMultipleLineBreaks: js.UndefOr[Boolean] = js.native
    
    /**
      * RTF extractor options.
      * See `unrtf` manual for available options
      */
    var rtf: js.UndefOr[extractorExecOpts] = js.native
    
    var tesseract: js.UndefOr[Lang | Cmd] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoc(value: extractorExecOpts): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      @scala.inline
      def setDxf(value: extractorExecOpts): Self = StObject.set(x, "dxf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxfUndefined: Self = StObject.set(x, "dxf", js.undefined)
      
      @scala.inline
      def setExec(value: ExecException): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setImages(value: extractorExecOpts): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setIncludeAltText(value: Boolean): Self = StObject.set(x, "includeAltText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAltTextUndefined: Self = StObject.set(x, "includeAltText", js.undefined)
      
      @scala.inline
      def setPdftotextOptions(value: Crop): Self = StObject.set(x, "pdftotextOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdftotextOptionsUndefined: Self = StObject.set(x, "pdftotextOptions", js.undefined)
      
      @scala.inline
      def setPreserveLineBreaks(value: Boolean): Self = StObject.set(x, "preserveLineBreaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLineBreaksUndefined: Self = StObject.set(x, "preserveLineBreaks", js.undefined)
      
      @scala.inline
      def setPreserveOnlyMultipleLineBreaks(value: Boolean): Self = StObject.set(x, "preserveOnlyMultipleLineBreaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveOnlyMultipleLineBreaksUndefined: Self = StObject.set(x, "preserveOnlyMultipleLineBreaks", js.undefined)
      
      @scala.inline
      def setRtf(value: extractorExecOpts): Self = StObject.set(x, "rtf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtfUndefined: Self = StObject.set(x, "rtf", js.undefined)
      
      @scala.inline
      def setTesseract(value: Lang | Cmd): Self = StObject.set(x, "tesseract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTesseractUndefined: Self = StObject.set(x, "tesseract", js.undefined)
    }
  }
  
  @js.native
  trait URLConfig extends Config {
    
    /**
      * Used with fromUrl, if set, rather than using the content-type from the URL request, will use the provided typeOverride.
      */
    var typeOverride: js.UndefOr[String] = js.native
  }
  object URLConfig {
    
    @scala.inline
    def apply(): URLConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLConfig]
    }
    
    @scala.inline
    implicit class URLConfigMutableBuilder[Self <: URLConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypeOverride(value: String): Self = StObject.set(x, "typeOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeOverrideUndefined: Self = StObject.set(x, "typeOverride", js.undefined)
    }
  }
  
  @js.native
  trait extractorExecOpts extends StObject {
    
    var exec: StringDictionary[String] = js.native
  }
  object extractorExecOpts {
    
    @scala.inline
    def apply(exec: StringDictionary[String]): extractorExecOpts = {
      val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
      __obj.asInstanceOf[extractorExecOpts]
    }
    
    @scala.inline
    implicit class extractorExecOptsMutableBuilder[Self <: extractorExecOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExec(value: StringDictionary[String]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    }
  }
}
