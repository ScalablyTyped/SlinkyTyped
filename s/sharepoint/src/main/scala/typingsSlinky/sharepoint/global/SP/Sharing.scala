package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.SP.Sharing.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Sharing")
@js.native
object Sharing extends js.Object {
  
  @js.native
  class DocumentSharingManager ()
    extends typingsSlinky.sharepoint.SP.Sharing.DocumentSharingManager
  /* static members */
  @js.native
  object DocumentSharingManager extends js.Object {
    
    def getRoleDefinition(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, role: Role): typingsSlinky.sharepoint.SP.RoleDefinition = js.native
    
    def isDocumentSharingEnabled(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      list: typingsSlinky.sharepoint.SP.List[_]
    ): typingsSlinky.sharepoint.SP.BooleanResult = js.native
    
    def updateDocumentSharingInfo(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      resourceAddress: String,
      userRoleAssignments: js.Array[typingsSlinky.sharepoint.SP.Sharing.UserRoleAssignment],
      validateExistingPermissions: Boolean,
      additiveMode: Boolean,
      sendServerManagedNotification: Boolean,
      customMessage: String,
      includeAnonymousLinksInNotification: Boolean
    ): js.Array[typingsSlinky.sharepoint.SP.Sharing.UserSharingResult] = js.native
  }
  
  @js.native
  object Role extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Sharing.Role with Double] = js.native
    
    /* 2 */ val edit: typingsSlinky.sharepoint.SP.Sharing.Role.edit with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.Sharing.Role.none with Double = js.native
    
    /* 3 */ val owner: typingsSlinky.sharepoint.SP.Sharing.Role.owner with Double = js.native
    
    /* 1 */ val view: typingsSlinky.sharepoint.SP.Sharing.Role.view with Double = js.native
  }
  
  @js.native
  class UserRoleAssignment ()
    extends typingsSlinky.sharepoint.SP.Sharing.UserRoleAssignment
  
  @js.native
  class UserSharingResult ()
    extends typingsSlinky.sharepoint.SP.Sharing.UserSharingResult
}
