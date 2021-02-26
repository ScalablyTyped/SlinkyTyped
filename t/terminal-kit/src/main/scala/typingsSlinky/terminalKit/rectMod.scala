package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.anon.DstRect
import typingsSlinky.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("terminal-kit/Rect", JSImport.Namespace)
  @js.native
  class ^ protected () extends Rect {
    def this(options: AbsoluteOptions) = this()
    def this(options: Rect) = this()
    def this(options: Region) = this()
    def this(options: typingsSlinky.terminalKit.screenBufferMod.^) = this()
    def this(options: Terminal) = this()
    def this(options: typingsSlinky.terminalKit.textBufferMod.^) = this()
    def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
  }
  
  /* static member */
  @JSImport("terminal-kit/Rect", "wrappingRect")
  @js.native
  def wrappingRect(params: DstRect): Unit = js.native
  
  @js.native
  trait AbsoluteOptions extends Options {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object AbsoluteOptions {
    
    @scala.inline
    def apply(height: Double, width: Double): AbsoluteOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsoluteOptions]
    }
    
    @scala.inline
    implicit class AbsoluteOptionsMutableBuilder[Self <: AbsoluteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.terminalKit.rectMod.AbsoluteOptions
    - typingsSlinky.terminalKit.rectMod.Region
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def AbsoluteOptions(height: Double, width: Double): typingsSlinky.terminalKit.rectMod.AbsoluteOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.terminalKit.rectMod.AbsoluteOptions]
    }
    
    @scala.inline
    def Region(xmax: Double, xmin: Double, ymax: Double, ymin: Double): typingsSlinky.terminalKit.rectMod.Region = {
      val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.terminalKit.rectMod.Region]
    }
  }
  
  @js.native
  trait Rect extends StObject {
    
    def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit = js.native
    
    val height: Double = js.native
    
    val isNull: Boolean = js.native
    
    def set(obj: Region): Unit = js.native
    
    val width: Double = js.native
    
    val xmax: Double = js.native
    
    val xmin: Double = js.native
    
    val ymax: Double = js.native
    
    val ymin: Double = js.native
  }
  object Rect {
    
    @scala.inline
    def apply(
      clip: (Rect, Double, Double, Boolean) => Unit,
      height: Double,
      isNull: Boolean,
      set: Region => Unit,
      width: Double,
      xmax: Double,
      xmin: Double,
      ymax: Double,
      ymin: Double
    ): Rect = {
      val __obj = js.Dynamic.literal(clip = js.Any.fromFunction4(clip), height = height.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), width = width.asInstanceOf[js.Any], xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClip(value: (Rect, Double, Double, Boolean) => Unit): Self = StObject.set(x, "clip", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNull(value: Boolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: Region => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Region extends Options {
    
    var xmax: Double = js.native
    
    var xmin: Double = js.native
    
    var ymax: Double = js.native
    
    var ymin: Double = js.native
  }
  object Region {
    
    @scala.inline
    def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Region = {
      val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    @scala.inline
    implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    }
  }
}
