package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.SP.Sharing.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Sharing")
@js.native
object Sharing extends js.Object {
  @js.native
  class DocumentSharingManager ()
    extends typingsSlinky.sharepoint.SP.Sharing.DocumentSharingManager
  
  @js.native
  class UserRoleAssignment ()
    extends typingsSlinky.sharepoint.SP.Sharing.UserRoleAssignment {
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsSlinky.sharepoint.SP.XmlWriter,
      serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    /* CompleteClass */
    override def get_role(): Role = js.native
    /* CompleteClass */
    override def get_typeId(): String = js.native
    /* CompleteClass */
    override def get_userId(): String = js.native
    /* CompleteClass */
    override def set_role(value: Role): Unit = js.native
    /* CompleteClass */
    override def set_userId(value: String): Unit = js.native
    /* CompleteClass */
    override def writeToXml(
      writer: typingsSlinky.sharepoint.SP.XmlWriter,
      serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @js.native
  class UserSharingResult ()
    extends typingsSlinky.sharepoint.SP.Sharing.UserSharingResult {
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsSlinky.sharepoint.SP.XmlWriter,
      serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    /* CompleteClass */
    override def get_allowedRoles(): js.Array[Role] = js.native
    /* CompleteClass */
    override def get_currentRole(): Role = js.native
    /* CompleteClass */
    override def get_isUserKnown(): Boolean = js.native
    /* CompleteClass */
    override def get_message(): String = js.native
    /* CompleteClass */
    override def get_status(): Boolean = js.native
    /* CompleteClass */
    override def get_typeId(): String = js.native
    /* CompleteClass */
    override def get_user(): String = js.native
    /* CompleteClass */
    override def writeToXml(
      writer: typingsSlinky.sharepoint.SP.XmlWriter,
      serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
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
    /* 2 */ val edit: typingsSlinky.sharepoint.SP.Sharing.Role.edit with Double = js.native
    /* 0 */ val none: typingsSlinky.sharepoint.SP.Sharing.Role.none with Double = js.native
    /* 3 */ val owner: typingsSlinky.sharepoint.SP.Sharing.Role.owner with Double = js.native
    /* 1 */ val view: typingsSlinky.sharepoint.SP.Sharing.Role.view with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Sharing.Role with Double] = js.native
  }
  
}

