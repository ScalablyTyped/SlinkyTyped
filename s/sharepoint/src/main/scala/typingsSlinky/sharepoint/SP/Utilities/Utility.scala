package typingsSlinky.sharepoint.SP.Utilities

import typingsSlinky.sharepoint.SP.AppLicenseCollection
import typingsSlinky.sharepoint.SP.BooleanResult
import typingsSlinky.sharepoint.SP.ClientObjectList
import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.FieldUser
import typingsSlinky.sharepoint.SP.File
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.GuidResult
import typingsSlinky.sharepoint.SP.IntResult
import typingsSlinky.sharepoint.SP.List
import typingsSlinky.sharepoint.SP.ListItem
import typingsSlinky.sharepoint.SP.ListItemCollection
import typingsSlinky.sharepoint.SP.StringResult
import typingsSlinky.sharepoint.SP.UserCollection
import typingsSlinky.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.Utility")
@js.native
class Utility () extends js.Object {
  var lAYOUTS_LATESTVERSION_RELATIVE_URL: String = js.native
  var lAYOUTS_LATESTVERSION_URL: String = js.native
}

/* static members */
@JSGlobal("SP.Utilities.Utility")
@js.native
object Utility extends js.Object {
  def createEmailBodyForInvitation(context: ClientRuntimeContext, pageAddress: String): StringResult = js.native
  def createNewDiscussion[T](context: ClientRuntimeContext, list: List[_], title: String): ListItem[T] = js.native
  def createNewDiscussionReply[T](context: ClientRuntimeContext, parent: ListItem[T]): ListItem[T] = js.native
  def createWikiPageInContextWeb(context: ClientRuntimeContext, parameters: WikiPageCreationInformation): File = js.native
  def formatDateTime(context: ClientRuntimeContext, web: Web, datetime: js.Date, format: DateTimeFormat): StringResult = js.native
  def getAppLicenseDeploymentId(context: ClientRuntimeContext): GuidResult = js.native
  def getAppLicenseInformation(context: ClientRuntimeContext, productId: Guid): AppLicenseCollection = js.native
  def getCurrentUserEmailAddresses(context: ClientRuntimeContext): StringResult = js.native
  def getImageUrl(imageName: String): String = js.native
  def getLayoutsPageUrl(pageName: String): String = js.native
  def getLocalizedString(context: ClientRuntimeContext, source: String, defaultResourceFile: String, language: Double): StringResult = js.native
  def getLowerCaseString(context: ClientRuntimeContext, sourceValue: String, lcid: Double): StringResult = js.native
  def getPeoplePickerURL(context: ClientRuntimeContext, web: Web, fieldUser: FieldUser): StringResult = js.native
  def get_layoutsLatestVersionRelativeUrl(): String = js.native
  def get_layoutsLatestVersionUrl(): String = js.native
  def importAppLicense(
    context: ClientRuntimeContext,
    licenseTokenToImport: String,
    contentMarket: String,
    billingMarket: String,
    appName: String,
    iconUrl: String,
    providerName: String,
    appSubtype: Double
  ): Unit = js.native
  def isUserLicensedForEntityInContext(context: ClientRuntimeContext, licensableEntity: String): BooleanResult = js.native
  def localizeWebPartGallery(context: ClientRuntimeContext, items: ListItemCollection[_]): ClientObjectList[ListItem[_]] = js.native
  def logCustomAppError(context: ClientRuntimeContext, error: String): IntResult = js.native
  def logCustomRemoteAppError(context: ClientRuntimeContext, productId: Guid, error: String): IntResult = js.native
  def markDiscussionAsFeatured(context: ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
  def resolvePrincipal(
    context: ClientRuntimeContext,
    web: Web,
    input: String,
    scopes: PrincipalType,
    sources: PrincipalSource,
    usersContainer: UserCollection,
    inputIsEmailOnly: Boolean
  ): PrincipalInfo = js.native
  def searchPrincipals(
    context: ClientRuntimeContext,
    web: Web,
    input: String,
    scopes: PrincipalType,
    sources: PrincipalSource,
    usersContainer: UserCollection,
    maxCount: Double
  ): js.Array[PrincipalInfo] = js.native
  def unmarkDiscussionAsFeatured(context: ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
}

