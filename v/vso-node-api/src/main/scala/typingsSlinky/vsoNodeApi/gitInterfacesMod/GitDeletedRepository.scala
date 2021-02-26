package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitDeletedRepository extends StObject {
  
  var createdDate: js.Date = js.native
  
  var deletedBy: IdentityRef = js.native
  
  var deletedDate: js.Date = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var project: TeamProjectReference = js.native
}
object GitDeletedRepository {
  
  @scala.inline
  def apply(
    createdDate: js.Date,
    deletedBy: IdentityRef,
    deletedDate: js.Date,
    id: String,
    name: String,
    project: TeamProjectReference
  ): GitDeletedRepository = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitDeletedRepository]
  }
  
  @scala.inline
  implicit class GitDeletedRepositoryMutableBuilder[Self <: GitDeletedRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedBy(value: IdentityRef): Self = StObject.set(x, "deletedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDate(value: js.Date): Self = StObject.set(x, "deletedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
