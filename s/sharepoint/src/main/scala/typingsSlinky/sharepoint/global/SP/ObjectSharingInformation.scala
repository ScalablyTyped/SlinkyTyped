package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ObjectSharingInformation")
@js.native
class ObjectSharingInformation ()
  extends typingsSlinky.sharepoint.SP.ObjectSharingInformation

/* static members */
@JSGlobal("SP.ObjectSharingInformation")
@js.native
object ObjectSharingInformation extends js.Object {
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

