package typingsSlinky.zfont

import typingsSlinky.zdog.mod.Group
import typingsSlinky.zdog.mod.GroupOptions
import typingsSlinky.zdog.mod.Shape
import typingsSlinky.zdog.mod.ShapeOptions
import typingsSlinky.zfont.anon.Typeofzdog
import typingsSlinky.zfont.zfontBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zfont", "init")
  @js.native
  def init(x: Typeofzdog): Typeofzdog = js.native
  
  /* augmented module */
  object zdogAugmentingMod {
    
    /**
      * Represents a font that can be used by an instance of either {@link Text} or {@link TextGroup}.
      * @see {@link https://github.com/jaames/zfont#zdogfont Zfont API}
      */
    @JSImport("zdog", "Font")
    @js.native
    class Font protected () extends StObject {
      def this(options: FontOptions) = this()
      
      /**
        * Returns a Promise which resolves once this font has finished loading.
        * @see {@link https://github.com/jaames/zfont#waitforload Zfont API}
        */
      def waitForLoad(): js.Promise[Unit] = js.native
    }
    
    /**
      * An object used for rendering text.
      * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
      */
    @JSImport("zdog", "Text")
    @js.native
    class Text[T /* <: MultilineText */] protected () extends Shape {
      def this(options: TextOptions[T]) = this()
      
      /** @see {@link TextOptions#font} */
      var font: Font = js.native
      
      /** @see {@link TextOptions#fontSize} */
      var fontSize: Double = js.native
      
      /** @see {@link TextOptions#textAlign} */
      var textAlign: TextAlign = js.native
      
      /** @see {@link TextOptions#textBaseline} */
      var textBaseline: TextBaseline = js.native
      
      /** @see {@link TextOptions#value} */
      var value: MultilineText = js.native
    }
    
    /**
      * This class is very similar to {@link Text}, except it acts as a {@link Group} instead, and each text glyph is rendered as its own shape.
      * This is helpful for more advanced use-cases where you need control over each character.
      * @see {@link https://github.com/jaames/zfont#zdogtextgroup Zfont API}
      * @see {@link  Zfont API}
      */
    @JSImport("zdog", "TextGroup")
    @js.native
    class TextGroup[T /* <: MultilineText */] protected () extends Group {
      def this(options: TextGroupOptions[T]) = this()
      
      /**
        * @see {@link TextGroupOptions#color}
        * @see {@link https://github.com/jaames/zfont#color Zfont API}
        */
      var color: String = js.native
      
      /**
        * @see {@link TextGroupOptions#fill}
        * @see {@link https://github.com/jaames/zfont#fill Zfont API}
        */
      var fill: Boolean = js.native
      
      /**
        * @see {@link TextGroupOptions#font}
        * @see {@link https://github.com/jaames/zfont#font-1 Zfont API}
        */
      var font: Font = js.native
      
      /**
        * @see {@link TextGroupOptions#fontSize}
        * @see {@link https://github.com/jaames/zfont#fontsize-1 Zfont API}
        */
      var fontSize: Double = js.native
      
      /**
        * @see {@link TextGroupOptions#stroke}
        * @see {@link https://github.com/jaames/zfont#stroke Zfont API}
        */
      var stroke: Double | `false` = js.native
      
      /**
        * @see {@link TextGroupOptions#textAlign}
        * @see {@link https://github.com/jaames/zfont#textalign-1 Zfont API}
        */
      var textAlign: TextAlign = js.native
      
      /**
        * @see {@link TextGroupOptions#textBaseline}
        * @see {@link https://github.com/jaames/zfont#textbaseline-1 Zfont API}
        */
      var textBaseline: TextBaseline = js.native
      
      /**
        * @see {@link TextGroupOptions#value}
        * @see {@link https://github.com/jaames/zfont#value-1 Zfont API}
        */
      var value: T = js.native
    }
    
    /**
      * Returns a {@link Promise} which resolves as soon as all the fonts currently added to the scene are loaded and ready for use.
      * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
      */
    @JSImport("zdog", "waitForFonts")
    @js.native
    def waitForFonts(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
    
    /**
      * @see {@link Font}
      * @see {@link https://github.com/jaames/zfont#options Zfont API}
      */
    @js.native
    trait FontOptions extends StObject {
      
      /** Font URL path. This can be a `.ttf` or `.otf` font, check out the {@link https://github.com/photopea/Typr.js Typr.js repo} for more details about font support. */
      val src: String = js.native
    }
    object FontOptions {
      
      @scala.inline
      def apply(src: String): FontOptions = {
        val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
        __obj.asInstanceOf[FontOptions]
      }
      
      @scala.inline
      implicit class FontOptionsMutableBuilder[Self <: FontOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      }
    }
    
    /** @see {@link https://github.com/jaames/zfont#multiline-text Zfont API} */
    type MultilineText = String | js.Array[String]
    
    /**
      * Horizontal text alignment (equivalent to the CSS `text-align` property).
      * @see {@link https://github.com/jaames/zfont#textalign Zfont API} (Text)
      * @see {@link https://github.com/jaames/zfont#textalign-1 Zfont API} (TextGroup)
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.zfont.zfontStrings.left
      - typingsSlinky.zfont.zfontStrings.center
      - typingsSlinky.zfont.zfontStrings.right
    */
    trait TextAlign extends StObject
    object TextAlign {
      
      @scala.inline
      def center: typingsSlinky.zfont.zfontStrings.center = "center".asInstanceOf[typingsSlinky.zfont.zfontStrings.center]
      
      @scala.inline
      def left: typingsSlinky.zfont.zfontStrings.left = "left".asInstanceOf[typingsSlinky.zfont.zfontStrings.left]
      
      @scala.inline
      def right: typingsSlinky.zfont.zfontStrings.right = "right".asInstanceOf[typingsSlinky.zfont.zfontStrings.right]
    }
    
    /**
      * Vertical text alignment, equivalent to the HTML5 canvas' {@link CanvasRenderingContext2D.textBaseline textBaseline} property.
      * @see {@link https://github.com/jaames/zfont#textbaseline Zfont API} (Text)
      * @see {@link https://github.com/jaames/zfont#textbaseline-1 Zfont API} (TextGroup)
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.zfont.zfontStrings.top
      - typingsSlinky.zfont.zfontStrings.middle
      - typingsSlinky.zfont.zfontStrings.bottom
    */
    trait TextBaseline extends StObject
    object TextBaseline {
      
      @scala.inline
      def bottom: typingsSlinky.zfont.zfontStrings.bottom = "bottom".asInstanceOf[typingsSlinky.zfont.zfontStrings.bottom]
      
      @scala.inline
      def middle: typingsSlinky.zfont.zfontStrings.middle = "middle".asInstanceOf[typingsSlinky.zfont.zfontStrings.middle]
      
      @scala.inline
      def top: typingsSlinky.zfont.zfontStrings.top = "top".asInstanceOf[typingsSlinky.zfont.zfontStrings.top]
    }
    
    /**
      * @see {@link TextGroup}
      * @see {@link https://github.com/jaames/zfont#options-2 Zfont API}
      */
    @js.native
    trait TextGroupOptions[T /* <: MultilineText */] extends GroupOptions {
      
      /**
        * @default '#333'
        * @see {@link TextGroup#color}
        */
      val color: js.UndefOr[String] = js.native
      
      /**
        * @default false
        * @see {@link TextGroup#fill}
        */
      val fill: js.UndefOr[Boolean] = js.native
      
      /** @see {@link TextGroup#font} */
      val font: Font = js.native
      
      /**
        * Measured in pixels.
        * @default 64
        * @see {@link TextGroup#fontSize}
        */
      val fontSize: js.UndefOr[Double] = js.native
      
      /**
        * @default 1
        * @see {@link TextGroup#stroke}
        */
      val stroke: js.UndefOr[Double | `false`] = js.native
      
      /**
        * @default 'left'
        * @see {@link TextGroup#textAlign}
        */
      val textAlign: js.UndefOr[TextAlign] = js.native
      
      /**
        * @default 'bottom'
        * @see {@link TextGroup#textBaseline}
        */
      val textBaseline: js.UndefOr[TextBaseline] = js.native
      
      /**
        * @default ''
        * @see {@link TextGroup#value}
        */
      val value: js.UndefOr[T] = js.native
    }
    object TextGroupOptions {
      
      @scala.inline
      def apply[T /* <: MultilineText */](font: Font): TextGroupOptions[T] = {
        val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
        __obj.asInstanceOf[TextGroupOptions[T]]
      }
      
      @scala.inline
      implicit class TextGroupOptionsMutableBuilder[Self <: TextGroupOptions[_], T /* <: MultilineText */] (val x: Self with TextGroupOptions[T]) extends AnyVal {
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
        
        @scala.inline
        def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        @scala.inline
        def setStroke(value: Double | `false`): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
        
        @scala.inline
        def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
        
        @scala.inline
        def setTextBaseline(value: TextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /**
      * @see {@link Text}
      * @see {@link https://github.com/jaames/zfont#options-1 Zfont API}
      */
    @js.native
    trait TextOptions[T /* <: MultilineText */] extends ShapeOptions {
      
      /** @see {@link Text#font} */
      val font: Font = js.native
      
      /**
        * Measured in pixels.
        * @default 64
        * @see {@link Text#fontSize}
        */
      val fontSize: js.UndefOr[Double] = js.native
      
      /**
        * @default 'left'
        * @see {@link Text#textAlign}
        */
      val textAlign: js.UndefOr[TextAlign] = js.native
      
      /**
        * @default 'bottom'
        * @see {@link Text#textBaseline}
        */
      val textBaseline: js.UndefOr[TextBaseline] = js.native
      
      /**
        * @default ''
        * @see {@link Text#value}
        */
      val value: js.UndefOr[T] = js.native
    }
    object TextOptions {
      
      @scala.inline
      def apply[T /* <: MultilineText */](font: Font): TextOptions[T] = {
        val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
        __obj.asInstanceOf[TextOptions[T]]
      }
      
      @scala.inline
      implicit class TextOptionsMutableBuilder[Self <: TextOptions[_], T /* <: MultilineText */] (val x: Self with TextOptions[T]) extends AnyVal {
        
        @scala.inline
        def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        @scala.inline
        def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
        
        @scala.inline
        def setTextBaseline(value: TextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
