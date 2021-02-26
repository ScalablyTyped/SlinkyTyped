package typingsSlinky.tesseractJs

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.node.Buffer
import typingsSlinky.tesseractJs.anon.CorePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tesseract.js", JSImport.Namespace)
  @js.native
  val ^ : TesseractStatic = js.native
  
  @js.native
  trait Baseline extends StObject {
    
    var has_baseline: Boolean = js.native
    
    var x0: Double = js.native
    
    var x1: Double = js.native
    
    var y0: Double = js.native
    
    var y1: Double = js.native
  }
  object Baseline {
    
    @scala.inline
    def apply(has_baseline: Boolean, x0: Double, x1: Double, y0: Double, y1: Double): Baseline = {
      val __obj = js.Dynamic.literal(has_baseline = has_baseline.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[Baseline]
    }
    
    @scala.inline
    implicit class BaselineMutableBuilder[Self <: Baseline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas_baseline(value: Boolean): Self = StObject.set(x, "has_baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bbox extends StObject {
    
    var x0: Double = js.native
    
    var x1: Double = js.native
    
    var y0: Double = js.native
    
    var y1: Double = js.native
  }
  object Bbox {
    
    @scala.inline
    def apply(x0: Double, x1: Double, y0: Double, y1: Double): Bbox = {
      val __obj = js.Dynamic.literal(x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bbox]
    }
    
    @scala.inline
    implicit class BboxMutableBuilder[Self <: Bbox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Block extends StObject {
    
    var baseline: Baseline = js.native
    
    var bbox: Bbox = js.native
    
    var blocktype: String = js.native
    
    var confidence: Double = js.native
    
    var lines: js.Array[Line] = js.native
    
    var page: Page = js.native
    
    var paragraphs: Paragraph = js.native
    
    var polygon: js.Any = js.native
    
    var symbols: js.Array[Symbol] = js.native
    
    var text: String = js.native
    
    var words: js.Array[Word] = js.native
  }
  object Block {
    
    @scala.inline
    def apply(
      baseline: Baseline,
      bbox: Bbox,
      blocktype: String,
      confidence: Double,
      lines: js.Array[Line],
      page: Page,
      paragraphs: Paragraph,
      polygon: js.Any,
      symbols: js.Array[Symbol],
      text: String,
      words: js.Array[Word]
    ): Block = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], blocktype = blocktype.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraphs = paragraphs.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocktype(value: String): Self = StObject.set(x, "blocktype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphs(value: Paragraph): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygon(value: js.Any): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Choice extends StObject {
    
    var confidence: Double = js.native
    
    var text: String = js.native
  }
  object Choice {
    
    @scala.inline
    def apply(confidence: Double, text: String): Choice = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    @scala.inline
    implicit class ChoiceMutableBuilder[Self <: Choice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageLike = String | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | CanvasRenderingContext2D | File | Blob | ImageData | Buffer
  
  @js.native
  trait Line extends StObject {
    
    var baseline: Baseline = js.native
    
    var bbox: Bbox = js.native
    
    var block: Block = js.native
    
    var confidence: Double = js.native
    
    var page: Page = js.native
    
    var paragraph: Paragraph = js.native
    
    var symbols: js.Array[Symbol] = js.native
    
    var text: String = js.native
    
    var words: js.Array[Word] = js.native
  }
  object Line {
    
    @scala.inline
    def apply(
      baseline: Baseline,
      bbox: Bbox,
      block: Block,
      confidence: Double,
      page: Page,
      paragraph: Paragraph,
      symbols: js.Array[Symbol],
      text: String,
      words: js.Array[Word]
    ): Line = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Page extends StObject {
    
    var blocks: js.Array[Block] = js.native
    
    var confidence: Double = js.native
    
    var html: String = js.native
    
    var lines: js.Array[Line] = js.native
    
    var oem: String = js.native
    
    var paragraphs: js.Array[Paragraph] = js.native
    
    var psm: String = js.native
    
    var symbols: js.Array[Symbol] = js.native
    
    var text: String = js.native
    
    var version: String = js.native
    
    var words: js.Array[Word] = js.native
  }
  object Page {
    
    @scala.inline
    def apply(
      blocks: js.Array[Block],
      confidence: Double,
      html: String,
      lines: js.Array[Line],
      oem: String,
      paragraphs: js.Array[Paragraph],
      psm: String,
      symbols: js.Array[Symbol],
      text: String,
      version: String,
      words: js.Array[Word]
    ): Page = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], oem = oem.asInstanceOf[js.Any], paragraphs = paragraphs.asInstanceOf[js.Any], psm = psm.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks(value: js.Array[Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksVarargs(value: Block*): Self = StObject.set(x, "blocks", js.Array(value :_*))
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setOem(value: String): Self = StObject.set(x, "oem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphs(value: js.Array[Paragraph]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphsVarargs(value: Paragraph*): Self = StObject.set(x, "paragraphs", js.Array(value :_*))
      
      @scala.inline
      def setPsm(value: String): Self = StObject.set(x, "psm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Paragraph extends StObject {
    
    var baseline: Baseline = js.native
    
    var bbox: Bbox = js.native
    
    var block: Block = js.native
    
    var confidence: Double = js.native
    
    var is_ltr: Boolean = js.native
    
    var lines: js.Array[Line] = js.native
    
    var page: Page = js.native
    
    var symbols: js.Array[Symbol] = js.native
    
    var text: String = js.native
    
    var words: js.Array[Word] = js.native
  }
  object Paragraph {
    
    @scala.inline
    def apply(
      baseline: Baseline,
      bbox: Bbox,
      block: Block,
      confidence: Double,
      is_ltr: Boolean,
      lines: js.Array[Line],
      page: Page,
      symbols: js.Array[Symbol],
      text: String,
      words: js.Array[Word]
    ): Paragraph = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], is_ltr = is_ltr.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paragraph]
    }
    
    @scala.inline
    implicit class ParagraphMutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_ltr(value: Boolean): Self = StObject.set(x, "is_ltr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Progress extends StObject {
    
    var loaded: js.UndefOr[Double] = js.native
    
    var progress: Double = js.native
    
    var status: String = js.native
  }
  object Progress {
    
    @scala.inline
    def apply(progress: Double, status: String): Progress = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Symbol extends StObject {
    
    var baseline: Baseline = js.native
    
    var bbox: Bbox = js.native
    
    var block: Block = js.native
    
    var choices: js.Array[Choice] = js.native
    
    var confidence: Double = js.native
    
    var image: js.Any = js.native
    
    var is_dropcap: Boolean = js.native
    
    var is_subscript: Boolean = js.native
    
    var is_superscript: Boolean = js.native
    
    var line: Line = js.native
    
    var page: Page = js.native
    
    var paragraph: Paragraph = js.native
    
    var text: String = js.native
    
    var word: Word = js.native
  }
  object Symbol {
    
    @scala.inline
    def apply(
      baseline: Baseline,
      bbox: Bbox,
      block: Block,
      choices: js.Array[Choice],
      confidence: Double,
      image: js.Any,
      is_dropcap: Boolean,
      is_subscript: Boolean,
      is_superscript: Boolean,
      line: Line,
      page: Page,
      paragraph: Paragraph,
      text: String,
      word: Word
    ): Symbol = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], is_dropcap = is_dropcap.asInstanceOf[js.Any], is_subscript = is_subscript.asInstanceOf[js.Any], is_superscript = is_superscript.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
      __obj.asInstanceOf[Symbol]
    }
    
    @scala.inline
    implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_dropcap(value: Boolean): Self = StObject.set(x, "is_dropcap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_subscript(value: Boolean): Self = StObject.set(x, "is_subscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_superscript(value: Boolean): Self = StObject.set(x, "is_superscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWord(value: Word): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TesseractJob extends StObject {
    
    def `catch`(callback: js.Function1[/* error */ js.Error, Unit]): TesseractJob = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ js.Error, this.type]] = js.native
    
    def `finally`(callback: js.Function1[/* resultOrError */ js.Error | Page, Unit]): TesseractJob = js.native
    
    def progress(callback: js.Function1[/* progress */ Progress, Unit]): TesseractJob = js.native
    
    def `then`(callback: js.Function1[/* result */ Page, Unit]): TesseractJob = js.native
  }
  object TesseractJob {
    
    @scala.inline
    def apply(
      `catch`: js.Function1[/* error */ js.Error, Unit] => TesseractJob,
      `finally`: js.Function1[/* resultOrError */ js.Error | Page, Unit] => TesseractJob,
      progress: js.Function1[/* progress */ Progress, Unit] => TesseractJob,
      `then`: js.Function1[/* result */ Page, Unit] => TesseractJob
    ): TesseractJob = {
      val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[TesseractJob]
    }
    
    @scala.inline
    implicit class TesseractJobMutableBuilder[Self <: TesseractJob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: js.Function1[/* error */ js.Error, Unit] => TesseractJob): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: /* error */ js.Error => TesseractJob): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFinally(value: js.Function1[/* resultOrError */ js.Error | Page, Unit] => TesseractJob): Self = StObject.set(x, "finally", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgress(value: js.Function1[/* progress */ Progress, Unit] => TesseractJob): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThen(value: js.Function1[/* result */ Page, Unit] => TesseractJob): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TesseractStatic extends StObject {
    
    def create(paths: CorePath): TesseractStatic = js.native
    
    def detect(image: ImageLike): TesseractJob = js.native
    
    def recognize(image: ImageLike): TesseractJob = js.native
    def recognize(image: ImageLike, options: js.Any): TesseractJob = js.native
  }
  
  @js.native
  trait Word extends StObject {
    
    var baseline: Baseline = js.native
    
    var bbox: Bbox = js.native
    
    var block: Block = js.native
    
    var choices: js.Array[Choice] = js.native
    
    var confidence: Double = js.native
    
    var direction: String = js.native
    
    var font_id: Double = js.native
    
    var font_name: String = js.native
    
    var font_size: Double = js.native
    
    var in_dictionary: Boolean = js.native
    
    var is_bold: Boolean = js.native
    
    var is_italic: Boolean = js.native
    
    var is_monospace: Boolean = js.native
    
    var is_numeric: Boolean = js.native
    
    var is_serif: Boolean = js.native
    
    var is_smallcaps: Boolean = js.native
    
    var is_underlined: Boolean = js.native
    
    var language: String = js.native
    
    var line: Line = js.native
    
    var page: Page = js.native
    
    var paragraph: Paragraph = js.native
    
    var symbols: js.Array[Symbol] = js.native
    
    var text: String = js.native
  }
  object Word {
    
    @scala.inline
    def apply(
      baseline: Baseline,
      bbox: Bbox,
      block: Block,
      choices: js.Array[Choice],
      confidence: Double,
      direction: String,
      font_id: Double,
      font_name: String,
      font_size: Double,
      in_dictionary: Boolean,
      is_bold: Boolean,
      is_italic: Boolean,
      is_monospace: Boolean,
      is_numeric: Boolean,
      is_serif: Boolean,
      is_smallcaps: Boolean,
      is_underlined: Boolean,
      language: String,
      line: Line,
      page: Page,
      paragraph: Paragraph,
      symbols: js.Array[Symbol],
      text: String
    ): Word = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], font_id = font_id.asInstanceOf[js.Any], font_name = font_name.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], in_dictionary = in_dictionary.asInstanceOf[js.Any], is_bold = is_bold.asInstanceOf[js.Any], is_italic = is_italic.asInstanceOf[js.Any], is_monospace = is_monospace.asInstanceOf[js.Any], is_numeric = is_numeric.asInstanceOf[js.Any], is_serif = is_serif.asInstanceOf[js.Any], is_smallcaps = is_smallcaps.asInstanceOf[js.Any], is_underlined = is_underlined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Word]
    }
    
    @scala.inline
    implicit class WordMutableBuilder[Self <: Word] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_id(value: Double): Self = StObject.set(x, "font_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_name(value: String): Self = StObject.set(x, "font_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn_dictionary(value: Boolean): Self = StObject.set(x, "in_dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bold(value: Boolean): Self = StObject.set(x, "is_bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_italic(value: Boolean): Self = StObject.set(x, "is_italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_monospace(value: Boolean): Self = StObject.set(x, "is_monospace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_numeric(value: Boolean): Self = StObject.set(x, "is_numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_serif(value: Boolean): Self = StObject.set(x, "is_serif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_smallcaps(value: Boolean): Self = StObject.set(x, "is_smallcaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_underlined(value: Boolean): Self = StObject.set(x, "is_underlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = TesseractStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TesseractStatic = ^
}
