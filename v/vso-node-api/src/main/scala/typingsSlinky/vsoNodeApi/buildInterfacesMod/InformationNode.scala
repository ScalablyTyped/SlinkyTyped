package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InformationNode extends StObject {
  
  /**
    * Fields of the information node
    */
  var fields: StringDictionary[String] = js.native
  
  /**
    * Process or person that last modified this node
    */
  var lastModifiedBy: String = js.native
  
  /**
    * Date this node was last modified
    */
  var lastModifiedDate: js.Date = js.native
  
  /**
    * Node Id of this information node
    */
  var nodeId: Double = js.native
  
  /**
    * Id of parent node (xml tree)
    */
  var parentId: Double = js.native
  
  /**
    * The type of the information node
    */
  var `type`: String = js.native
}
object InformationNode {
  
  @scala.inline
  def apply(
    fields: StringDictionary[String],
    lastModifiedBy: String,
    lastModifiedDate: js.Date,
    nodeId: Double,
    parentId: Double,
    `type`: String
  ): InformationNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InformationNode]
  }
  
  @scala.inline
  implicit class InformationNodeMutableBuilder[Self <: InformationNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
