package typingsSlinky.tinycolor2

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.tinycolor2.anon.Aliceblue
import typingsSlinky.tinycolor2.anon.`000`
import typingsSlinky.tinycolor2.mod.ColorFormats.HSLA
import typingsSlinky.tinycolor2.mod.ColorFormats.HSVA
import typingsSlinky.tinycolor2.mod.ColorFormats.PRGBA
import typingsSlinky.tinycolor2.mod.ColorFormats.RGBA
import typingsSlinky.tinycolor2.tinycolor2Booleans.`false`
import typingsSlinky.tinycolor2.tinycolor2Strings.AA
import typingsSlinky.tinycolor2.tinycolor2Strings.AAA
import typingsSlinky.tinycolor2.tinycolor2Strings.hex
import typingsSlinky.tinycolor2.tinycolor2Strings.hex3
import typingsSlinky.tinycolor2.tinycolor2Strings.hex4
import typingsSlinky.tinycolor2.tinycolor2Strings.hex6
import typingsSlinky.tinycolor2.tinycolor2Strings.hex8
import typingsSlinky.tinycolor2.tinycolor2Strings.hsl
import typingsSlinky.tinycolor2.tinycolor2Strings.hsv
import typingsSlinky.tinycolor2.tinycolor2Strings.large
import typingsSlinky.tinycolor2.tinycolor2Strings.name
import typingsSlinky.tinycolor2.tinycolor2Strings.prgb
import typingsSlinky.tinycolor2.tinycolor2Strings.rgb
import typingsSlinky.tinycolor2.tinycolor2Strings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tinycolor2", JSImport.Namespace)
  @js.native
  /**
    * Create a tinycolor instance of the color named.
    *
    * @param color - the color as one of the valid color input format.
    */
  class ^ () extends Instance {
    def this(color: ColorInput) = this()
    def this(color: js.UndefOr[ColorInput], opts: ConstructorOptions) = this()
  }
  @JSImport("tinycolor2", JSImport.Namespace)
  @js.native
  val ^ : Constructor = js.native
  
  object ColorFormats {
    
    @js.native
    trait Alpha extends StObject {
      
      var a: Double = js.native
    }
    object Alpha {
      
      @scala.inline
      def apply(a: Double): Alpha = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
        __obj.asInstanceOf[Alpha]
      }
      
      @scala.inline
      implicit class AlphaMutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait HSL extends _ColorInputWithoutInstance {
      
      var h: Double = js.native
      
      var l: Double = js.native
      
      var s: Double = js.native
    }
    object HSL {
      
      @scala.inline
      def apply(h: Double, l: Double, s: Double): HSL = {
        val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSL]
      }
      
      @scala.inline
      implicit class HSLMutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.tinycolor2.mod._ColorInput because Already inherited
    - typingsSlinky.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ @js.native
    trait HSLA
      extends HSL
         with Alpha
    object HSLA {
      
      @scala.inline
      def apply(a: Double, h: Double, l: Double, s: Double): HSLA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSLA]
      }
    }
    
    @js.native
    trait HSV extends _ColorInputWithoutInstance {
      
      var h: Double = js.native
      
      var s: Double = js.native
      
      var v: Double = js.native
    }
    object HSV {
      
      @scala.inline
      def apply(h: Double, s: Double, v: Double): HSV = {
        val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSV]
      }
      
      @scala.inline
      implicit class HSVMutableBuilder[Self <: HSV] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.tinycolor2.mod._ColorInput because Already inherited
    - typingsSlinky.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ @js.native
    trait HSVA extends HSV {
      
      var a: Double = js.native
    }
    object HSVA {
      
      @scala.inline
      def apply(a: Double, h: Double, s: Double, v: Double): HSVA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSVA]
      }
      
      @scala.inline
      implicit class HSVAMutableBuilder[Self <: HSVA] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PRGB extends _ColorInputWithoutInstance {
      
      var b: String = js.native
      
      var g: String = js.native
      
      var r: String = js.native
    }
    object PRGB {
      
      @scala.inline
      def apply(b: String, g: String, r: String): PRGB = {
        val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[PRGB]
      }
      
      @scala.inline
      implicit class PRGBMutableBuilder[Self <: PRGB] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG(value: String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.tinycolor2.mod._ColorInput because Already inherited
    - typingsSlinky.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ @js.native
    trait PRGBA
      extends PRGB
         with Alpha
    object PRGBA {
      
      @scala.inline
      def apply(a: Double, b: String, g: String, r: String): PRGBA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[PRGBA]
      }
    }
    
    @js.native
    trait RGB extends _ColorInputWithoutInstance {
      
      var b: Double = js.native
      
      var g: Double = js.native
      
      var r: Double = js.native
    }
    object RGB {
      
      @scala.inline
      def apply(b: Double, g: Double, r: Double): RGB = {
        val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[RGB]
      }
      
      @scala.inline
      implicit class RGBMutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.tinycolor2.mod._ColorInput because Already inherited
    - typingsSlinky.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ @js.native
    trait RGBA
      extends RGB
         with Alpha
    object RGBA {
      
      @scala.inline
      def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[RGBA]
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tinycolor2.mod.ColorInputWithoutInstance
    - typingsSlinky.tinycolor2.mod.Instance
  */
  type ColorInput = _ColorInput | String
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.tinycolor2.mod.ColorFormats.PRGB
    - typingsSlinky.tinycolor2.mod.ColorFormats.PRGBA
    - typingsSlinky.tinycolor2.mod.ColorFormats.RGB
    - typingsSlinky.tinycolor2.mod.ColorFormats.RGBA
    - typingsSlinky.tinycolor2.mod.ColorFormats.HSL
    - typingsSlinky.tinycolor2.mod.ColorFormats.HSLA
    - typingsSlinky.tinycolor2.mod.ColorFormats.HSV
    - typingsSlinky.tinycolor2.mod.ColorFormats.HSVA
  */
  type ColorInputWithoutInstance = _ColorInputWithoutInstance | String
  
  @js.native
  trait Constructor
    extends /**
    * Create a tinycolor instance of the color named.
    *
    * @param color - the color as one of the valid color input format.
    */
  Instantiable0[Instance]
       with Instantiable1[/* color */ ColorInput, Instance]
       with Instantiable2[js.UndefOr[/* color */ ColorInput], /* opts */ ConstructorOptions, Instance] {
    
    def apply(): Instance = js.native
    def apply(color: js.UndefOr[ColorInput], opts: ConstructorOptions): Instance = js.native
    def apply(color: ColorInput): Instance = js.native
    
    /**
      * Compares two colors. Each colors can be any color inputs.
      */
    def equals(): Boolean = js.native
    def equals(color1: js.UndefOr[ColorInput], color2: ColorInput): Boolean = js.native
    def equals(color1: ColorInput): Boolean = js.native
    
    /**
      * Create a tinycolor instance based off the relative values.
      * Works with any color formats
      *
      * @param ratio - the relative color/hue values to apply to the new instance.
      */
    def fromRatio(): Instance = js.native
    def fromRatio(ratio: ColorInputWithoutInstance): Instance = js.native
    
    /**
      * key: hex value
      * value: string name ex. hexnames["f00"] --> "red"
      */
    var hexNames: `000` = js.native
    
    /**
      * Ensure that foreground and background color combinations meet WCAG2 guidelines.
      *
      * @param color1 - the fore color wanted.
      * @param color2 - the back color wanted.
      * @param wcag2 - WCAG option. If the entire object is absent, function use the default of {level:"AA",size:"small"}.
      * @param wcag2.level - The 'level' property states 'AA' or 'AAA'
      *     if missing or invalid, it defaults to 'AA'
      * @param wcag2.size - The 'size' property states 'large' or 'small'
      *     if missing or invalid, it defaults to 'small'.
      */
    def isReadable(color1: ColorInput, color2: ColorInput): Boolean = js.native
    def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Options): Boolean = js.native
    
    def mix(color1: ColorInput, color2: ColorInput): Instance = js.native
    def mix(color1: ColorInput, color2: ColorInput, amount: Double): Instance = js.native
    
    /**
      * Given a base color and a list of possible foreground or background colors for that base,
      *  returns the most readable color. Optionally returns Black or White if the most readable color is unreadable.
      *
      * @param color - the base color.
      * @param colorsToCompare - array of colors to pick the most readable one from.
      * @param args - and object with extra arguments
      */
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): Instance = js.native
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: MostReadableArgs): Instance = js.native
    
    /**
      * key: 'real' color name
      * value: hex value ex. names["red"] --> "f00"
      */
    var names: Aliceblue = js.native
    
    /**
      * Returns a random color
      */
    def random(): Instance = js.native
    
    /**
      * Compares the two colors and returns the constrast between two colors as a number.
      *
      * @param color1 - the first color to be used in the comparison.
      * @param color2 - the second color to be used in the comparison.
      */
    def readability(color1: ColorInput, color2: ColorInput): Double = js.native
  }
  
  @js.native
  trait ConstructorOptions extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var gradientType: js.UndefOr[Boolean] = js.native
  }
  object ConstructorOptions {
    
    @scala.inline
    def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit class ConstructorOptionsMutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGradientType(value: Boolean): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientTypeUndefined: Self = StObject.set(x, "gradientType", js.undefined)
    }
  }
  
  @js.native
  trait Instance extends _ColorInput {
    
    /**
      * Gets an analogous color scheme based off of the current color.
      *
      * @param results - The amount of results to return.
      *  Default value: 6.
      * @param slices - The amount to slice the input color by.
      *  Default value: 30.
      */
    def analogous(): js.Array[Instance] = js.native
    def analogous(results: js.UndefOr[scala.Nothing], slices: Double): js.Array[Instance] = js.native
    def analogous(results: Double): js.Array[Instance] = js.native
    def analogous(results: Double, slices: Double): js.Array[Instance] = js.native
    
    /**
      * Brighten the color a given amount.
      *
      * @param amount - The amount to brighten by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def brighten(): Instance = js.native
    def brighten(amount: Double): Instance = js.native
    
    /**
      * Gets the complement of the current color
      */
    def complement(): Instance = js.native
    
    /**
      * Darken the color a given amount.
      *  Providing 100 will always return black.
      *
      * @param amount - The amount to darken by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def darken(): Instance = js.native
    def darken(amount: Double): Instance = js.native
    
    /**
      * Desaturate the color a given amount.
      *  Providing 100 will is the same as calling greyscale.
      *
      * @param amount - The amount to desaturate by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def desaturate(): Instance = js.native
    def desaturate(amount: Double): Instance = js.native
    
    /**
      * Returns the alpha value of the color
      */
    def getAlpha(): Double = js.native
    
    /**
      * Returns the perceived brightness of the color, from 0-255.
      */
    def getBrightness(): Double = js.native
    
    /**
      * Returns the format used to create the tinycolor instance.
      */
    def getFormat(): String = js.native
    
    /**
      * Returns the perceived luminance of a color, from 0-1.
      */
    def getLuminance(): Double = js.native
    
    /**
      * Returns the input passed into the constructer used to create the tinycolor instance.
      */
    def getOriginalInput(): ColorInput = js.native
    
    /**
      * Completely desaturates a color into greyscale.
      * Same as calling desaturate(100).
      */
    def greyscale(): Instance = js.native
    
    /**
      * Return an indication whether the color's perceived brightness is dark.
      */
    def isDark(): Boolean = js.native
    
    /**
      * Return an indication whether the color's perceived brightness is light.
      */
    def isLight(): Boolean = js.native
    
    /**
      * Return an indication whether the color was successfully parsed.
      */
    def isValid(): Boolean = js.native
    
    /**
      * Lighten the color a given amount. Providing 100 will always return white.
      *
      * @param amount - The amount to lighten by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def lighten(): Instance = js.native
    def lighten(amount: Double): Instance = js.native
    
    /**
      * Gets a monochromatic color scheme based off of the current color.
      *
      * @param results - The amount of results to return.
      *  Default value: 6.
      */
    def monochromatic(): js.Array[Instance] = js.native
    def monochromatic(results: Double): js.Array[Instance] = js.native
    
    /**
      * Saturate the color a given amount.
      *
      * @param amount - The amount to saturate by. The valid range is 0  to 100.
      *  Default value: 10.
      */
    def saturate(): Instance = js.native
    def saturate(amount: Double): Instance = js.native
    
    /**
      * Sets the alpha value on the current color.
      *
      * @param alpha - The new alpha value. The accepted range is 0-1.
      */
    def setAlpha(alpha: Double): Instance = js.native
    
    /**
      * Spin the hue a given amount. Calling with 0, 360, or -360 will do nothing.
      *
      * @param amount - The amount to spin by. The valid range is -360 to 360.
      */
    def spin(amount: Double): Instance = js.native
    
    /**
      * Gets a split complement color scheme based off of the current color.
      */
    def splitcomplement(): js.Tuple3[Instance, Instance, Instance] = js.native
    
    /**
      * Gets a tetrad based off of the current color.
      */
    def tetrad(): js.Tuple4[Instance, Instance, Instance, Instance] = js.native
    
    /**
      * Returns the color represented as a Microsoft filter for use in old versions of IE.
      */
    def toFilter(): String = js.native
    
    /**
      * Returns the hex value of the color.
      */
    def toHex(): String = js.native
    
    /**
      * Returns the hex 8 value of the color.
      */
    def toHex8(): String = js.native
    
    /**
      * Returns the hex 8  value of the color -with a # appened.
      */
    def toHex8String(): String = js.native
    
    /**
      * Returns the hex value of the color -with a # appened.
      */
    def toHexString(): String = js.native
    
    /**
      * Returns the object as a HSLA object.
      */
    def toHsl(): HSLA = js.native
    
    /**
      * Returns the hsla values interpolated into a string with the following format:
      * "hsla(xxx, xxx, xxx, xx)".
      */
    def toHslString(): String = js.native
    
    /**
      * Returns the object as a HSVA object.
      */
    def toHsv(): HSVA = js.native
    
    /**
      * Returns the hsva values interpolated into a string with the following format:
      * "hsva(xxx, xxx, xxx, xx)".
      */
    def toHsvString(): String = js.native
    
    /**
      * The 'real' name of the color -if there is one.
      */
    def toName(): String | `false` = js.native
    
    /**
      * Returns the object as a RGBA object.
      */
    def toPercentageRgb(): PRGBA = js.native
    
    /**
      * Returns the RGBA relative values interpolated into a string with the following format:
      * "RGBA(xxx, xxx, xxx, xx)".
      */
    def toPercentageRgbString(): String = js.native
    
    /**
      * Returns the object as a RGBA object.
      */
    def toRgb(): RGBA = js.native
    
    /**
      * Returns the RGBA values interpolated into a string with the following format:
      * "RGBA(xxx, xxx, xxx, xx)".
      */
    def toRgbString(): String = js.native
    
    @JSName("toString")
    def toString_hex(format: hex): String = js.native
    @JSName("toString")
    def toString_hex3(format: hex3): String = js.native
    @JSName("toString")
    def toString_hex4(format: hex4): String = js.native
    @JSName("toString")
    def toString_hex6(format: hex6): String = js.native
    @JSName("toString")
    def toString_hex8(format: hex8): String = js.native
    @JSName("toString")
    def toString_hsl(format: hsl): String = js.native
    @JSName("toString")
    def toString_hsv(format: hsv): String = js.native
    @JSName("toString")
    def toString_name(format: name): String = js.native
    @JSName("toString")
    def toString_prgb(format: prgb): String = js.native
    @JSName("toString")
    def toString_rgb(format: rgb): String = js.native
    
    /**
      * Gets a triad based off of the current color.
      */
    def triad(): js.Tuple3[Instance, Instance, Instance] = js.native
  }
  
  @js.native
  trait MostReadableArgs extends WCAG2Options {
    
    var includeFallbackColors: js.UndefOr[Boolean] = js.native
  }
  object MostReadableArgs {
    
    @scala.inline
    def apply(): MostReadableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MostReadableArgs]
    }
    
    @scala.inline
    implicit class MostReadableArgsMutableBuilder[Self <: MostReadableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeFallbackColors(value: Boolean): Self = StObject.set(x, "includeFallbackColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFallbackColorsUndefined: Self = StObject.set(x, "includeFallbackColors", js.undefined)
    }
  }
  
  @js.native
  trait WCAG2Options extends StObject {
    
    var level: js.UndefOr[AA | AAA] = js.native
    
    var size: js.UndefOr[large | small] = js.native
  }
  object WCAG2Options {
    
    @scala.inline
    def apply(): WCAG2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WCAG2Options]
    }
    
    @scala.inline
    implicit class WCAG2OptionsMutableBuilder[Self <: WCAG2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: AA | AAA): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait _ColorInput extends StObject
  
  trait _ColorInputWithoutInstance extends _ColorInput
  object _ColorInputWithoutInstance {
    
    @scala.inline
    def HSL(h: Double, l: Double, s: Double): typingsSlinky.tinycolor2.mod.ColorFormats.HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.HSL]
    }
    
    @scala.inline
    def HSLA(a: Double, h: Double, l: Double, s: Double): typingsSlinky.tinycolor2.mod.ColorFormats.HSLA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.HSLA]
    }
    
    @scala.inline
    def HSV(h: Double, s: Double, v: Double): typingsSlinky.tinycolor2.mod.ColorFormats.HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.HSV]
    }
    
    @scala.inline
    def HSVA(a: Double, h: Double, s: Double, v: Double): typingsSlinky.tinycolor2.mod.ColorFormats.HSVA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.HSVA]
    }
    
    @scala.inline
    def PRGB(b: String, g: String, r: String): typingsSlinky.tinycolor2.mod.ColorFormats.PRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.PRGB]
    }
    
    @scala.inline
    def PRGBA(a: Double, b: String, g: String, r: String): typingsSlinky.tinycolor2.mod.ColorFormats.PRGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.PRGBA]
    }
    
    @scala.inline
    def RGB(b: Double, g: Double, r: Double): typingsSlinky.tinycolor2.mod.ColorFormats.RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.RGB]
    }
    
    @scala.inline
    def RGBA(a: Double, b: Double, g: Double, r: Double): typingsSlinky.tinycolor2.mod.ColorFormats.RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tinycolor2.mod.ColorFormats.RGBA]
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Constructor = ^
}
