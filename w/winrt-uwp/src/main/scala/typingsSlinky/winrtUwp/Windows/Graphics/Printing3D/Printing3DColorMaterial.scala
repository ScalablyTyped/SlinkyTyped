package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a color material used in the 3D model. */
@js.native
trait Printing3DColorMaterial extends StObject {
  
  /** Gets or sets the color of the material. */
  var color: Color = js.native
  
  /** Gets or sets the color value of the material. */
  var value: Double = js.native
}
object Printing3DColorMaterial {
  
  @scala.inline
  def apply(color: Color, value: Double): Printing3DColorMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterial]
  }
  
  @scala.inline
  implicit class Printing3DColorMaterialMutableBuilder[Self <: Printing3DColorMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
