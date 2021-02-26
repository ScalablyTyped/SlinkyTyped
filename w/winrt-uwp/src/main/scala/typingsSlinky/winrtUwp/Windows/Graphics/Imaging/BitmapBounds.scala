package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a bounding rectangle. */
@js.native
trait BitmapBounds extends StObject {
  
  /** The Height, in pixels, of the bounding box */
  var height: Double = js.native
  
  /** The Width, in pixels, of the bounding box. */
  var width: Double = js.native
  
  /** The X coordinate, in pixels, of the top left corner of the bounding box. */
  var x: Double = js.native
  
  /** The Y coordinate, in pixels, of the top left corner of the bounding box. */
  var y: Double = js.native
}
object BitmapBounds {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BitmapBounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapBounds]
  }
  
  @scala.inline
  implicit class BitmapBoundsMutableBuilder[Self <: BitmapBounds] (val x: Self) extends AnyVal {
    
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
