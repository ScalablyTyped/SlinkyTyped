package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectCollectionReference
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitRepositoryRef extends StObject {
  
  /**
    * Team Project Collection where this Fork resides
    */
  var collection: TeamProjectCollectionReference = js.native
  
  var id: String = js.native
  
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean = js.native
  
  var name: String = js.native
  
  var project: TeamProjectReference = js.native
  
  var remoteUrl: String = js.native
  
  var sshUrl: String = js.native
  
  var url: String = js.native
}
object GitRepositoryRef {
  
  @scala.inline
  def apply(
    collection: TeamProjectCollectionReference,
    id: String,
    isFork: Boolean,
    name: String,
    project: TeamProjectReference,
    remoteUrl: String,
    sshUrl: String,
    url: String
  ): GitRepositoryRef = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFork = isFork.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], sshUrl = sshUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryRef]
  }
  
  @scala.inline
  implicit class GitRepositoryRefMutableBuilder[Self <: GitRepositoryRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: TeamProjectCollectionReference): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFork(value: Boolean): Self = StObject.set(x, "isFork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshUrl(value: String): Self = StObject.set(x, "sshUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
