package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents all material resources in the 3D model. */
@js.native
trait Printing3DMaterial extends StObject {
  
  /** Gets all base material groups used in the 3D model. */
  var baseGroups: IVector[Printing3DBaseMaterialGroup] = js.native
  
  /** Gets all color material groups used in the 3D model. */
  var colorGroups: IVector[Printing3DColorMaterialGroup] = js.native
  
  /** Gets all composite material groups used in the 3D model. */
  var compositeGroups: IVector[Printing3DCompositeMaterialGroup] = js.native
  
  /** Gets all multi-property groups used in the 3D model. */
  var multiplePropertyGroups: IVector[Printing3DMultiplePropertyMaterialGroup] = js.native
  
  /** Gets all 2D texture material groups used in the 3D model. */
  var texture2CoordGroups: IVector[Printing3DTexture2CoordMaterialGroup] = js.native
}
object Printing3DMaterial {
  
  @scala.inline
  def apply(
    baseGroups: IVector[Printing3DBaseMaterialGroup],
    colorGroups: IVector[Printing3DColorMaterialGroup],
    compositeGroups: IVector[Printing3DCompositeMaterialGroup],
    multiplePropertyGroups: IVector[Printing3DMultiplePropertyMaterialGroup],
    texture2CoordGroups: IVector[Printing3DTexture2CoordMaterialGroup]
  ): Printing3DMaterial = {
    val __obj = js.Dynamic.literal(baseGroups = baseGroups.asInstanceOf[js.Any], colorGroups = colorGroups.asInstanceOf[js.Any], compositeGroups = compositeGroups.asInstanceOf[js.Any], multiplePropertyGroups = multiplePropertyGroups.asInstanceOf[js.Any], texture2CoordGroups = texture2CoordGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMaterial]
  }
  
  @scala.inline
  implicit class Printing3DMaterialMutableBuilder[Self <: Printing3DMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseGroups(value: IVector[Printing3DBaseMaterialGroup]): Self = StObject.set(x, "baseGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGroups(value: IVector[Printing3DColorMaterialGroup]): Self = StObject.set(x, "colorGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeGroups(value: IVector[Printing3DCompositeMaterialGroup]): Self = StObject.set(x, "compositeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplePropertyGroups(value: IVector[Printing3DMultiplePropertyMaterialGroup]): Self = StObject.set(x, "multiplePropertyGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture2CoordGroups(value: IVector[Printing3DTexture2CoordMaterialGroup]): Self = StObject.set(x, "texture2CoordGroups", value.asInstanceOf[js.Any])
  }
}
