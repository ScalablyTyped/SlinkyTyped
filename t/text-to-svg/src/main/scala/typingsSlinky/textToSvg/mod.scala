package typingsSlinky.textToSvg

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-to-svg", JSImport.Namespace)
  @js.native
  class ^ protected () extends TextToSVG {
    /**
      * Create an instance of the SVG generator, using an already parsed font file.
      *
      * You can also use {@see TextToSVG.loadSync} to create an instance with a font
      * file path or from the default font.
      *
      * @param font parsed font file
      */
    def this(font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Font */ js.Any) = this()
  }
  
  /**
    * Asynchronously load a font from an URL and create a TextToSVG instance.
    * For supported file types see the "opentype.js" documentation.
    *
    * @param url of font to load
    * @param callback called, when instance has been created
    */
  /* static member */
  @JSImport("text-to-svg", "load")
  @js.native
  def load(url: String, callback: LoadCallback): Unit = js.native
  
  /**
    * Synchronously load a font from the filesystem and create a TextToSVG instance.
    * For supported file types see the "opentype.js" documentation.
    * If no path is provided, the default font will be used.
    *
    * @param file path to font file
    */
  /* static member */
  @JSImport("text-to-svg", "loadSync")
  @js.native
  def loadSync(): TextToSVG = js.native
  @JSImport("text-to-svg", "loadSync")
  @js.native
  def loadSync(file: String): TextToSVG = js.native
  
  /**
    * Text anchor.
    * If horizontal component is omitted, it defaults to left.
    * If vertical component is omitted, it defaults to baseline.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.textToSvg.textToSvgStrings.`left baseline`
    - typingsSlinky.textToSvg.textToSvgStrings.`left top`
    - typingsSlinky.textToSvg.textToSvgStrings.`left bottom`
    - typingsSlinky.textToSvg.textToSvgStrings.`left middle`
    - typingsSlinky.textToSvg.textToSvgStrings.`center baseline`
    - typingsSlinky.textToSvg.textToSvgStrings.`center top`
    - typingsSlinky.textToSvg.textToSvgStrings.`center bottom`
    - typingsSlinky.textToSvg.textToSvgStrings.`center middle`
    - typingsSlinky.textToSvg.textToSvgStrings.`right baseline`
    - typingsSlinky.textToSvg.textToSvgStrings.`right top`
    - typingsSlinky.textToSvg.textToSvgStrings.`right bottom`
    - typingsSlinky.textToSvg.textToSvgStrings.`right middle`
    - typingsSlinky.textToSvg.textToSvgStrings.baseline
    - typingsSlinky.textToSvg.textToSvgStrings.top
    - typingsSlinky.textToSvg.textToSvgStrings.bottom
    - typingsSlinky.textToSvg.textToSvgStrings.middle
    - typingsSlinky.textToSvg.textToSvgStrings.left
    - typingsSlinky.textToSvg.textToSvgStrings.center
    - typingsSlinky.textToSvg.textToSvgStrings.right
  */
  trait Anchor extends StObject
  object Anchor {
    
    @scala.inline
    def baseline: typingsSlinky.textToSvg.textToSvgStrings.baseline = "baseline".asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.baseline]
    
    @scala.inline
    def bottom: typingsSlinky.textToSvg.textToSvgStrings.bottom = "bottom".asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.bottom]
    
    @scala.inline
    def center: typingsSlinky.textToSvg.textToSvgStrings.center = "center".asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.center]
    
    @scala.inline
    def `center baseline`: typingsSlinky.textToSvg.textToSvgStrings.`center baseline` = ("center baseline").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`center baseline`]
    
    @scala.inline
    def `center bottom`: typingsSlinky.textToSvg.textToSvgStrings.`center bottom` = ("center bottom").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`center bottom`]
    
    @scala.inline
    def `center middle`: typingsSlinky.textToSvg.textToSvgStrings.`center middle` = ("center middle").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`center middle`]
    
    @scala.inline
    def `center top`: typingsSlinky.textToSvg.textToSvgStrings.`center top` = ("center top").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`center top`]
    
    @scala.inline
    def left: typingsSlinky.textToSvg.textToSvgStrings.left = "left".asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.left]
    
    @scala.inline
    def `left baseline`: typingsSlinky.textToSvg.textToSvgStrings.`left baseline` = ("left baseline").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`left baseline`]
    
    @scala.inline
    def `left bottom`: typingsSlinky.textToSvg.textToSvgStrings.`left bottom` = ("left bottom").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`left bottom`]
    
    @scala.inline
    def `left middle`: typingsSlinky.textToSvg.textToSvgStrings.`left middle` = ("left middle").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`left middle`]
    
    @scala.inline
    def `left top`: typingsSlinky.textToSvg.textToSvgStrings.`left top` = ("left top").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`left top`]
    
    @scala.inline
    def middle: typingsSlinky.textToSvg.textToSvgStrings.middle = "middle".asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.middle]
    
    @scala.inline
    def right: typingsSlinky.textToSvg.textToSvgStrings.right = "right".asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.right]
    
    @scala.inline
    def `right baseline`: typingsSlinky.textToSvg.textToSvgStrings.`right baseline` = ("right baseline").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`right baseline`]
    
    @scala.inline
    def `right bottom`: typingsSlinky.textToSvg.textToSvgStrings.`right bottom` = ("right bottom").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`right bottom`]
    
    @scala.inline
    def `right middle`: typingsSlinky.textToSvg.textToSvgStrings.`right middle` = ("right middle").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`right middle`]
    
    @scala.inline
    def `right top`: typingsSlinky.textToSvg.textToSvgStrings.`right top` = ("right top").asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.`right top`]
    
    @scala.inline
    def top: typingsSlinky.textToSvg.textToSvgStrings.top = "top".asInstanceOf[typingsSlinky.textToSvg.textToSvgStrings.top]
  }
  
  @js.native
  trait FontOptions extends StObject {
    
    /**
      * @default "left baseline"
      */
    var anchor: js.UndefOr[Anchor | Null] = js.native
    
    /**
      * Size of the text.
      * @default 72
      */
    var fontSize: js.UndefOr[Double | Null] = js.native
    
    /**
      * If true takes kerning information into account.
      * @default true
      */
    var kerning: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * Letter-spacing value in em.
      */
    var letterSpacing: js.UndefOr[Double | Null] = js.native
    
    /**
      * Tracking value in (em / 1000).
      */
    var tracking: js.UndefOr[Double | Null] = js.native
    
    /**
      * Horizontal position of the beginning of the text.
      * @default 0
      */
    var x: js.UndefOr[Double | Null] = js.native
    
    /**
      * Vertical position of the baseline of the text.
      * @default 0
      */
    var y: js.UndefOr[Double | Null] = js.native
  }
  object FontOptions {
    
    @scala.inline
    def apply(): FontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontOptions]
    }
    
    @scala.inline
    implicit class FontOptionsMutableBuilder[Self <: FontOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningNull: Self = StObject.set(x, "kerning", null)
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingNull: Self = StObject.set(x, "letterSpacing", null)
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setTracking(value: Double): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackingNull: Self = StObject.set(x, "tracking", null)
      
      @scala.inline
      def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNull: Self = StObject.set(x, "x", null)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNull: Self = StObject.set(x, "y", null)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait GenerationOptions extends FontOptions {
    
    /**
      * Key-value pairs of attributes for `<path>` element.
      */
    var attributes: js.UndefOr[StringDictionary[String] | Null] = js.native
  }
  object GenerationOptions {
    
    @scala.inline
    def apply(): GenerationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerationOptions]
    }
    
    @scala.inline
    implicit class GenerationOptionsMutableBuilder[Self <: GenerationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesNull: Self = StObject.set(x, "attributes", null)
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  type LoadCallback = js.Function2[/* error */ js.Error | Null, /* textToSVG */ TextToSVG | Null, Unit]
  
  @js.native
  trait Metrics extends StObject {
    
    var ascender: Double = js.native
    
    var baseline: Double = js.native
    
    var descender: Double = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Metrics {
    
    @scala.inline
    def apply(
      ascender: Double,
      baseline: Double,
      descender: Double,
      height: Double,
      width: Double,
      x: Double,
      y: Double
    ): Metrics = {
      val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscender(value: Double): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescender(value: Double): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextToSVG extends StObject {
    
    /**
      * Generate SVG `<path>` `d` value.
      *
      * @param text to measure
      * @param options font options and attributes
      * @returns SVG path d attribute value
      */
    def getD(text: String): String = js.native
    def getD(text: String, options: GenerationOptions): String = js.native
    
    /**
      * Measure the height of the font.
      *
      * @param fontSize to measure with
      * @returns height of the font
      */
    def getHeight(fontSize: Double): Double = js.native
    
    /**
      * Measure the text metrics.
      *
      * @param text to measure
      * @param options font options
      */
    def getMetrics(text: String): Metrics = js.native
    def getMetrics(text: String, options: FontOptions): Metrics = js.native
    
    /**
      * Generate SVG `<path>` from text.
      *
      * @param text to measure
      * @param options font options and attributes
      * @returns SVG path element string
      */
    def getPath(text: String): String = js.native
    def getPath(text: String, options: GenerationOptions): String = js.native
    
    /**
      * Generate SVG as a string with text converted to paths.
      *
      * @param text to measure
      * @param options font options and attributes
      * @returns SVG string
      */
    def getSVG(text: String): String = js.native
    def getSVG(text: String, options: GenerationOptions): String = js.native
    
    /**
      * Measure the width of the specified text.
      *
      * @param text to measure
      * @param options font options
      * @returns width of the text
      */
    def getWidth(text: String): Double = js.native
    def getWidth(text: String, options: FontOptions): Double = js.native
  }
}
