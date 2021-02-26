package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScopeInfo extends StObject {
  
  var adminGroupDescription: String = js.native
  
  var adminGroupName: String = js.native
  
  var creatorId: String = js.native
  
  var parentScopeId: String = js.native
  
  var scopeName: String = js.native
  
  var scopeType: GroupScopeType = js.native
}
object CreateScopeInfo {
  
  @scala.inline
  def apply(
    adminGroupDescription: String,
    adminGroupName: String,
    creatorId: String,
    parentScopeId: String,
    scopeName: String,
    scopeType: GroupScopeType
  ): CreateScopeInfo = {
    val __obj = js.Dynamic.literal(adminGroupDescription = adminGroupDescription.asInstanceOf[js.Any], adminGroupName = adminGroupName.asInstanceOf[js.Any], creatorId = creatorId.asInstanceOf[js.Any], parentScopeId = parentScopeId.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScopeInfo]
  }
  
  @scala.inline
  implicit class CreateScopeInfoMutableBuilder[Self <: CreateScopeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminGroupDescription(value: String): Self = StObject.set(x, "adminGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminGroupName(value: String): Self = StObject.set(x, "adminGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorId(value: String): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentScopeId(value: String): Self = StObject.set(x, "parentScopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeType(value: GroupScopeType): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
  }
}
