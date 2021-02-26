package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.anon.Attr
import typingsSlinky.terminalKit.anon.AttrChar
import typingsSlinky.terminalKit.anon.Char
import typingsSlinky.terminalKit.anon.Dst
import typingsSlinky.terminalKit.anon.Shrink
import typingsSlinky.terminalKit.anon.X
import typingsSlinky.terminalKit.screenBufferHDMod.IsBlending
import typingsSlinky.terminalKit.terminalKitStrings.down
import typingsSlinky.terminalKit.terminalKitStrings.left
import typingsSlinky.terminalKit.terminalKitStrings.right
import typingsSlinky.terminalKit.terminalKitStrings.up
import typingsSlinky.terminalKit.terminalKitStrings.x
import typingsSlinky.terminalKit.terminalKitStrings.y
import typingsSlinky.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenBufferMod {
  
  @JSImport("terminal-kit/ScreenBuffer", JSImport.Namespace)
  @js.native
  class ^ protected () extends ScreenBuffer {
    def this(options: Options) = this()
  }
  
  /* static member */
  @JSImport("terminal-kit/ScreenBuffer", "attr2object")
  @js.native
  def attr2object(attrFlags: Double): Unit = js.native
  
  /* static member */
  @JSImport("terminal-kit/ScreenBuffer", "create")
  @js.native
  def create(options: Options): ScreenBuffer = js.native
  
  /* static member */
  @JSImport("terminal-kit/ScreenBuffer", "createFromString")
  @js.native
  def createFromString(options: Attr, str: String): ScreenBuffer = js.native
  
  /* static member */
  @JSImport("terminal-kit/ScreenBuffer", "loadImage")
  @js.native
  def loadImage(
    url: String,
    calback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* image */ js.UndefOr[typingsSlinky.terminalKit.screenBufferHDMod.^], 
      Unit
    ]
  ): Unit = js.native
  /* static member */
  @JSImport("terminal-kit/ScreenBuffer", "loadImage")
  @js.native
  def loadImage(
    url: String,
    options: Shrink,
    calback: js.Function2[/* error */ js.Any, /* image */ typingsSlinky.terminalKit.screenBufferHDMod.^, Unit]
  ): Unit = js.native
  
  /* static member */
  @JSImport("terminal-kit/ScreenBuffer", "loadSync")
  @js.native
  def loadSync(filepath: String): ScreenBuffer = js.native
  
  /* static member */
  @JSImport("terminal-kit/ScreenBuffer", "object2attr")
  @js.native
  def object2attr(attrObject: Attributes): Unit = js.native
  
  @js.native
  trait Attributes extends StObject {
    
    var bgColor: js.UndefOr[Double] = js.native
    
    var bgDefaultColor: js.UndefOr[Boolean] = js.native
    
    var bgTransparency: js.UndefOr[Boolean] = js.native
    
    var blink: js.UndefOr[Boolean] = js.native
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var charTransparency: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[Double] = js.native
    
    var defaultColor: js.UndefOr[Boolean] = js.native
    
    var dim: js.UndefOr[Boolean] = js.native
    
    var fgTransparency: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var italic: js.UndefOr[Boolean] = js.native
    
    var strike: js.UndefOr[Boolean] = js.native
    
    var styleTransparency: js.UndefOr[Boolean] = js.native
    
    var transparency: js.UndefOr[Boolean] = js.native
    
    var underline: js.UndefOr[Boolean] = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: Double): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setBgDefaultColor(value: Boolean): Self = StObject.set(x, "bgDefaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgDefaultColorUndefined: Self = StObject.set(x, "bgDefaultColor", js.undefined)
      
      @scala.inline
      def setBgTransparency(value: Boolean): Self = StObject.set(x, "bgTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgTransparencyUndefined: Self = StObject.set(x, "bgTransparency", js.undefined)
      
      @scala.inline
      def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharTransparency(value: Boolean): Self = StObject.set(x, "charTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharTransparencyUndefined: Self = StObject.set(x, "charTransparency", js.undefined)
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDefaultColor(value: Boolean): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      @scala.inline
      def setDim(value: Boolean): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimUndefined: Self = StObject.set(x, "dim", js.undefined)
      
      @scala.inline
      def setFgTransparency(value: Boolean): Self = StObject.set(x, "fgTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgTransparencyUndefined: Self = StObject.set(x, "fgTransparency", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
      
      @scala.inline
      def setStyleTransparency(value: Boolean): Self = StObject.set(x, "styleTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleTransparencyUndefined: Self = StObject.set(x, "styleTransparency", js.undefined)
      
      @scala.inline
      def setTransparency(value: Boolean): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  @js.native
  trait DrawOptions extends StObject {
    
    var blending: js.UndefOr[Boolean] = js.native
    
    var delta: js.UndefOr[Boolean] = js.native
    
    var dst: js.UndefOr[Terminal | ScreenBuffer] = js.native
    
    var dstClipRect: js.UndefOr[typingsSlinky.terminalKit.rectMod.^] = js.native
    
    var srcClipRect: js.UndefOr[typingsSlinky.terminalKit.rectMod.^] = js.native
    
    var tile: js.UndefOr[Boolean] = js.native
    
    var wrap: js.UndefOr[Boolean | x | y] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object DrawOptions {
    
    @scala.inline
    def apply(): DrawOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawOptions]
    }
    
    @scala.inline
    implicit class DrawOptionsMutableBuilder[Self <: DrawOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlending(value: Boolean): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlendingUndefined: Self = StObject.set(x, "blending", js.undefined)
      
      @scala.inline
      def setDelta(value: Boolean): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      @scala.inline
      def setDst(value: Terminal | ScreenBuffer): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDstClipRect(value: typingsSlinky.terminalKit.rectMod.^): Self = StObject.set(x, "dstClipRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDstClipRectUndefined: Self = StObject.set(x, "dstClipRect", js.undefined)
      
      @scala.inline
      def setDstUndefined: Self = StObject.set(x, "dst", js.undefined)
      
      @scala.inline
      def setSrcClipRect(value: typingsSlinky.terminalKit.rectMod.^): Self = StObject.set(x, "srcClipRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcClipRectUndefined: Self = StObject.set(x, "srcClipRect", js.undefined)
      
      @scala.inline
      def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean | typingsSlinky.terminalKit.terminalKitStrings.x | y): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
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
  
  @js.native
  trait Options extends StObject {
    
    var blending: js.UndefOr[Boolean] = js.native
    
    var dst: Terminal | ScreenBuffer = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var noFill: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(dst: Terminal | ScreenBuffer): Options = {
      val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlending(value: Boolean): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlendingUndefined: Self = StObject.set(x, "blending", js.undefined)
      
      @scala.inline
      def setDst(value: Terminal | ScreenBuffer): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setNoFill(value: Boolean): Self = StObject.set(x, "noFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoFillUndefined: Self = StObject.set(x, "noFill", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
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
  
  @js.native
  trait PutOptions extends StObject {
    
    var attr: Attributes | Double = js.native
    
    var direction: js.UndefOr[right | left | up | down | Null] = js.native
    
    var dx: Double = js.native
    
    var dy: Double = js.native
    
    var wrap: Boolean = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object PutOptions {
    
    @scala.inline
    def apply(attr: Attributes | Double, dx: Double, dy: Double, wrap: Boolean, x: Double, y: Double): PutOptions = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutOptions]
    }
    
    @scala.inline
    implicit class PutOptionsMutableBuilder[Self <: PutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: Attributes | Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: right | left | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNull: Self = StObject.set(x, "direction", null)
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScreenBuffer
    extends typingsSlinky.nextgenEvents.mod.^ {
    
    def attr2object(attrFlags: Double): Unit = js.native
    
    val blending: Boolean | IsBlending = js.native
    
    def clear(): Unit = js.native
    
    def draw(): Unit = js.native
    def draw(options: DrawOptions): Unit = js.native
    
    def drawCursor(): Unit = js.native
    def drawCursor(options: Dst): Unit = js.native
    
    val dst: Terminal | ScreenBuffer = js.native
    
    def dumpChars(): String = js.native
    
    def fill(): Unit = js.native
    def fill(options: Char): Unit = js.native
    
    def get(): AttrChar = js.native
    def get(options: X): AttrChar = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def object2attr(attrObject: Attributes): Unit = js.native
    
    def put(options: PutOptions, format: String, formatArgumets: js.Any*): Unit = js.native
    
    def resize(fromRect: typingsSlinky.terminalKit.rectMod.Options): Unit = js.native
    def resize(fromRect: typingsSlinky.terminalKit.rectMod.^): Unit = js.native
    
    def saveSync(filepath: String): Unit = js.native
    
    def vScroll(offset: Double, drawToTerminal: Boolean): Unit = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
}
