package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingDetails extends StObject {
  
  /**
    * The local path.
    */
  var localPath: String = js.native
  
  /**
    * The mapping type.
    */
  var mappingType: String = js.native
  
  /**
    * The server path.
    */
  var serverPath: String = js.native
}
object MappingDetails {
  
  @scala.inline
  def apply(localPath: String, mappingType: String, serverPath: String): MappingDetails = {
    val __obj = js.Dynamic.literal(localPath = localPath.asInstanceOf[js.Any], mappingType = mappingType.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDetails]
  }
  
  @scala.inline
  implicit class MappingDetailsMutableBuilder[Self <: MappingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingType(value: String): Self = StObject.set(x, "mappingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPath(value: String): Self = StObject.set(x, "serverPath", value.asInstanceOf[js.Any])
  }
}
