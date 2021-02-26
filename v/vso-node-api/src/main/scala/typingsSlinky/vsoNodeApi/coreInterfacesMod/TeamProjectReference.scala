package typingsSlinky.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamProjectReference extends StObject {
  
  /**
    * Project abbreviation.
    */
  var abbreviation: String = js.native
  
  /**
    * The project's description (if any).
    */
  var description: String = js.native
  
  /**
    * Project identifier.
    */
  var id: String = js.native
  
  /**
    * Project name.
    */
  var name: String = js.native
  
  /**
    * Project revision.
    */
  var revision: Double = js.native
  
  /**
    * Project state.
    */
  var state: js.Any = js.native
  
  /**
    * Url to the full version of the object.
    */
  var url: String = js.native
  
  /**
    * Project visibility.
    */
  var visibility: ProjectVisibility = js.native
}
object TeamProjectReference {
  
  @scala.inline
  def apply(
    abbreviation: String,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: js.Any,
    url: String,
    visibility: ProjectVisibility
  ): TeamProjectReference = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectReference]
  }
  
  @scala.inline
  implicit class TeamProjectReferenceMutableBuilder[Self <: TeamProjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: ProjectVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
