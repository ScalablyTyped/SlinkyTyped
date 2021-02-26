package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
@js.native
trait Printing3DComponent extends StObject {
  
  /** Gets the other components contained within the component. */
  var components: IVector[Printing3DComponentWithMatrix] = js.native
  
  /** Gets or sets the 3D mesh of the component. */
  var mesh: Printing3DMesh = js.native
  
  /** Gets or sets the name of the 3D Manufacturing Format (3MF) component. */
  var name: String = js.native
  
  /** Gets or sets the part number of the 3D Manufacturing Format (3MF) component. */
  var partNumber: String = js.native
  
  /** Gets or sets the thumbnail image of the 3D Manufacturing Format (3MF) component. */
  var thumbnail: Printing3DTextureResource = js.native
  
  /** Gets or sets the type of the 3D Manufacturing Format (3MF) component. */
  var `type`: Printing3DObjectType = js.native
}
object Printing3DComponent {
  
  @scala.inline
  def apply(
    components: IVector[Printing3DComponentWithMatrix],
    mesh: Printing3DMesh,
    name: String,
    partNumber: String,
    thumbnail: Printing3DTextureResource,
    `type`: Printing3DObjectType
  ): Printing3DComponent = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DComponent]
  }
  
  @scala.inline
  implicit class Printing3DComponentMutableBuilder[Self <: Printing3DComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: IVector[Printing3DComponentWithMatrix]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: Printing3DMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumber(value: String): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Printing3DTextureResource): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Printing3DObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
