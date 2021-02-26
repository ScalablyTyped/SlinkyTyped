package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of color materials used in the 3D model. */
@js.native
trait Printing3DColorMaterialGroup extends StObject {
  
  /** Gets a group of color materials used in the 3D model. */
  var colors: IVector[Printing3DColorMaterial] = js.native
  
  /** Gets the identifier (ID) for the color material group. */
  var materialGroupId: Double = js.native
}
object Printing3DColorMaterialGroup {
  
  @scala.inline
  def apply(colors: IVector[Printing3DColorMaterial], materialGroupId: Double): Printing3DColorMaterialGroup = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterialGroup]
  }
  
  @scala.inline
  implicit class Printing3DColorMaterialGroupMutableBuilder[Self <: Printing3DColorMaterialGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: IVector[Printing3DColorMaterial]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialGroupId(value: Double): Self = StObject.set(x, "materialGroupId", value.asInstanceOf[js.Any])
  }
}
