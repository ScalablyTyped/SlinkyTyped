package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionReference extends StObject {
  
  /**
    * The date the definition was created.
    */
  var createdDate: js.Date = js.native
  
  /**
    * The ID of the referenced definition.
    */
  var id: Double = js.native
  
  /**
    * The name of the referenced definition.
    */
  var name: String = js.native
  
  /**
    * The folder path of the definition.
    */
  var path: String = js.native
  
  /**
    * A reference to the project.
    */
  var project: TeamProjectReference = js.native
  
  /**
    * A value that indicates whether builds can be queued against this definition.
    */
  var queueStatus: DefinitionQueueStatus = js.native
  
  /**
    * The definition revision number.
    */
  var revision: Double = js.native
  
  /**
    * The type of the definition.
    */
  var `type`: DefinitionType = js.native
  
  /**
    * The definition's URI.
    */
  var uri: String = js.native
  
  /**
    * The REST URL of the definition.
    */
  var url: String = js.native
}
object DefinitionReference {
  
  @scala.inline
  def apply(
    createdDate: js.Date,
    id: Double,
    name: String,
    path: String,
    project: TeamProjectReference,
    queueStatus: DefinitionQueueStatus,
    revision: Double,
    `type`: DefinitionType,
    uri: String,
    url: String
  ): DefinitionReference = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionReference]
  }
  
  @scala.inline
  implicit class DefinitionReferenceMutableBuilder[Self <: DefinitionReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueStatus(value: DefinitionQueueStatus): Self = StObject.set(x, "queueStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DefinitionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
