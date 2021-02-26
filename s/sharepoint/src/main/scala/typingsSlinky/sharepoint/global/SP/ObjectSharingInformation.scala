package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ObjectSharingInformation")
@js.native
class ObjectSharingInformation ()
  extends typingsSlinky.sharepoint.SP.ObjectSharingInformation
object ObjectSharingInformation {
  
  /* static member */
  @JSGlobal("SP.ObjectSharingInformation.getListItemSharingInformation")
  @js.native
  def getListItemSharingInformation(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    listID: typingsSlinky.sharepoint.SP.Guid,
    itemID: Double,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): typingsSlinky.sharepoint.SP.ObjectSharingInformation = js.native
  
  /* static member */
  @JSGlobal("SP.ObjectSharingInformation.getObjectSharingInformation")
  @js.native
  def getObjectSharingInformation(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    securableObject: typingsSlinky.sharepoint.SP.SecurableObject,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean,
    retrievePermissionLevels: Boolean
  ): typingsSlinky.sharepoint.SP.ObjectSharingInformation = js.native
  
  /* static member */
  @JSGlobal("SP.ObjectSharingInformation.getWebSharingInformation")
  @js.native
  def getWebSharingInformation(
    context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): typingsSlinky.sharepoint.SP.ObjectSharingInformation = js.native
}
