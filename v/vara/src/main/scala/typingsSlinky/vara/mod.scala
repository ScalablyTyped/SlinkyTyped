package typingsSlinky.vara

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.vara.anon.BreakPoints
import typingsSlinky.vara.anon.X
import typingsSlinky.vara.anon.XY
import typingsSlinky.vara.anon.Y
import typingsSlinky.vara.varaBooleans.`false`
import typingsSlinky.vara.varaStrings.center
import typingsSlinky.vara.varaStrings.left
import typingsSlinky.vara.varaStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof VaraType` */
  @JSImport("vara", JSImport.Namespace)
  @js.native
  class ^ protected () extends VaraType {
    def this(queryDom: String, fontJSONSource: String, textStep: js.Array[TextStep]) = this()
    def this(
      queryDom: String,
      fontJSONSource: String,
      textStep: js.Array[TextStep],
      textGlobals: TextProperties
    ) = this()
  }
  
  @js.native
  trait TextElements extends StObject {
    
    /**
      * Array of svg g elements, each representing a letter
      */
    var characters: js.Array[SVGGElement] = js.native
    
    /**
      * Svg g wrapping the text block
      */
    var container: SVGGElement = js.native
  }
  object TextElements {
    
    @scala.inline
    def apply(characters: js.Array[SVGGElement], container: SVGGElement): TextElements = {
      val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextElements]
    }
    
    @scala.inline
    implicit class TextElementsMutableBuilder[Self <: TextElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacters(value: js.Array[SVGGElement]): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharactersVarargs(value: SVGGElement*): Self = StObject.set(x, "characters", js.Array(value :_*))
      
      @scala.inline
      def setContainer(value: SVGGElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextProperties extends StObject {
    
    /**
      * Whether to animate the text automatically
      */
    var autoAnimation: js.UndefOr[Boolean] = js.native
    
    /**
      * Color of the text
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Duration of the animation in milliseconds
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Size of the text
      */
    var fontSize: js.UndefOr[Double] = js.native
    
    /**
      * Space between each character
      */
    var letterSpacing: js.UndefOr[Double] = js.native
    
    /**
      * Whether the animation should be in a queue
      */
    var queued: js.UndefOr[Boolean] = js.native
    
    /**
      * Width / Thickness of the stroke
      */
    var strokeWidth: js.UndefOr[Double] = js.native
    
    /**
      * Text align, accepted values are left,center,right
      */
    var textAlign: js.UndefOr[left | center | right] = js.native
  }
  object TextProperties {
    
    @scala.inline
    def apply(): TextProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProperties]
    }
    
    @scala.inline
    implicit class TextPropertiesMutableBuilder[Self <: TextProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAnimation(value: Boolean): Self = StObject.set(x, "autoAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAnimationUndefined: Self = StObject.set(x, "autoAnimation", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setQueued(value: Boolean): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  @js.native
  trait TextStep extends TextProperties {
    
    /**
      * Delay before the animation starts in milliseconds
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Whether the x or y coordinate should be from its calculated position,
      * ie the position if x or y coordinates were not applied
      */
    var fromCurrentPosition: js.UndefOr[X] = js.native
    
    /**
      * String or integer, for if animations are called manually or when using the get() method.
      * Default is the index of the object.
      */
    var id: js.UndefOr[String | Double] = js.native
    
    /**
      * Text to be shown
      */
    var text: String = js.native
    
    /**
      * x coordinate of the text
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * y coordinate of the text
      */
    var y: js.UndefOr[Double] = js.native
  }
  object TextStep {
    
    @scala.inline
    def apply(text: String): TextStep = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextStep]
    }
    
    @scala.inline
    implicit class TextStepMutableBuilder[Self <: TextStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setFromCurrentPosition(value: X): Self = StObject.set(x, "fromCurrentPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromCurrentPositionUndefined: Self = StObject.set(x, "fromCurrentPosition", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* was `typeof VaraType` */
  type Vara = VaraType
  
  @js.native
  trait VaraType extends StObject {
    
    def analyseWidth(): BreakPoints = js.native
    
    def animate(element: SVGElement, duration: Double, delay: Double, `final`: Double): Unit = js.native
    
    /**
      * Used to execute a function once animation ends, triggers every time a block of text is drawn.
      *
      * @param onEnd callback with the id of the drawn text, and an object containing the group DOM object,
      * this is the same object that is returned when calling the get() method.
      */
    def animationEnd(onEnd: js.Function2[/* id */ String | Double, /* group */ TextElements, Unit]): Unit = js.native
    
    def createNode(noneName: String, properties: StringDictionary[String]): SVGElement = js.native
    
    def createText(): Unit = js.native
    
    /**
      * Used to animate texts with autoAnimation:false
      * If an id was given to the text during creation, it should be given as the argument.
      * Otherwise use the index of the text block.
      *
      * @param id text ID or index
      * @param duration
      */
    def draw(id: String): Unit = js.native
    def draw(id: String, duration: Double): Unit = js.native
    def draw(id: Double): Unit = js.native
    def draw(id: Double, duration: Double): Unit = js.native
    
    /**
      * If an id was given to the text during creation, it should be given as the argument.
      * Otherwise use the index of the text block.
      *
      * @param id text ID or index
      */
    def get(id: String): TextElements | `false` = js.native
    def get(id: Double): TextElements | `false` = js.native
    
    def getSVGData(): Unit = js.native
    
    def getSectionPathLength(id: String): Double = js.native
    def getSectionPathLength(id: Double): Double = js.native
    
    /**
      * Is used to play the animation of every text block, obeying delay and queue.
      */
    def playAll(): Unit = js.native
    
    def preCreate(): Unit = js.native
    
    /**
      * Is used to execute a function when the font is loaded and the elements are created.
      * ! Any other method should be called inside the function !
      *
      * @param onReady callback
      */
    def ready(onReady: js.Function0[Unit]): Unit = js.native
    
    def setPosition(element: SVGGElement, obj: Y): Unit = js.native
    def setPosition(element: SVGGElement, obj: Y, relative: XY): Unit = js.native
  }
}
