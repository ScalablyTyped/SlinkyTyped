package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.SP.DateTimeUtil.SimpleDate
import typingsSlinky.sharepoint.SP.ListItemCollection
import typingsSlinky.sharepoint.SP.UserCollection
import typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat
import typingsSlinky.sharepoint.SP.Utilities.PrincipalSource
import typingsSlinky.sharepoint.SP.Utilities.PrincipalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utilities {
  
  @JSGlobal("SP.Utilities.DateTimeFormat")
  @js.native
  object DateTimeFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat with Double] = js.native
    
    /* 1 */ val dateOnly: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.dateOnly with Double = js.native
    
    /* 0 */ val dateTime: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.dateTime with Double = js.native
    
    /* 3 */ val iSO8601: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.iSO8601 with Double = js.native
    
    /* 6 */ val longDate: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.longDate with Double = js.native
    
    /* 4 */ val monthDayOnly: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.monthDayOnly with Double = js.native
    
    /* 5 */ val monthYearOnly: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.monthYearOnly with Double = js.native
    
    /* 2 */ val timeOnly: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.timeOnly with Double = js.native
    
    /* 7 */ val unknownFormat: typingsSlinky.sharepoint.SP.Utilities.DateTimeFormat.unknownFormat with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.DateUtility")
  @js.native
  class DateUtility ()
    extends typingsSlinky.sharepoint.SP.Utilities.DateUtility
  object DateUtility {
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.dateToJulianDay")
    @js.native
    def dateToJulianDay(year: Double, month: Double, day: Double): Double = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.daysInMonth")
    @js.native
    def daysInMonth(year: Double, month: Double): Double = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.isLeapYear")
    @js.native
    def isLeapYear(year: Double): Boolean = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.DateUtility.julianDayToDate")
    @js.native
    def julianDayToDate(julianDay: Double): SimpleDate = js.native
  }
  
  @JSGlobal("SP.Utilities.EmailProperties")
  @js.native
  class EmailProperties ()
    extends typingsSlinky.sharepoint.SP.Utilities.EmailProperties
  
  @JSGlobal("SP.Utilities.HttpUtility")
  @js.native
  class HttpUtility ()
    extends typingsSlinky.sharepoint.SP.Utilities.HttpUtility
  object HttpUtility {
    
    /** Appends correct "Source" parameter to the specified url, and then navigates to this url.
      "Source" parameter is recognized in many places in SharePoint, usually to determine "Cancel" behavior. */
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.appendSourceAndNavigateTo")
    @js.native
    def appendSourceAndNavigateTo(url: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.ecmaScriptStringLiteralEncode")
    @js.native
    def ecmaScriptStringLiteralEncode(scriptLiteralToEncode: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.escapeXmlText")
    @js.native
    def escapeXmlText(stringToEscape: String): String = js.native
    
    /** Official version of STSHtmlEncode. Calls it internally. */
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.htmlEncode")
    @js.native
    def htmlEncode(stringToEncode: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.navigateHttpFolder")
    @js.native
    def navigateHttpFolder(urlSrc: String, frameTarget: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.navigateTo")
    @js.native
    def navigateTo(url: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.urlKeyValueEncode")
    @js.native
    def urlKeyValueEncode(keyOrValueToEncode: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.HttpUtility.urlPathEncode")
    @js.native
    def urlPathEncode(stringToEncode: String): String = js.native
  }
  
  @JSGlobal("SP.Utilities.IconSize")
  @js.native
  object IconSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Utilities.IconSize with Double] = js.native
    
    /* 0 */ val size16: typingsSlinky.sharepoint.SP.Utilities.IconSize.size16 with Double = js.native
    
    /* 2 */ val size256: typingsSlinky.sharepoint.SP.Utilities.IconSize.size256 with Double = js.native
    
    /* 1 */ val size32: typingsSlinky.sharepoint.SP.Utilities.IconSize.size32 with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.LocUtility")
  @js.native
  class LocUtility ()
    extends typingsSlinky.sharepoint.SP.Utilities.LocUtility
  object LocUtility {
    
    /* static member */
    @JSGlobal("SP.Utilities.LocUtility.getLocalizedCountValue")
    @js.native
    def getLocalizedCountValue(locText: String, intervals: String, count: Double): String = js.native
  }
  
  @JSGlobal("SP.Utilities.LogAppErrorResult")
  @js.native
  object LogAppErrorResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Utilities.LogAppErrorResult with Double] = js.native
    
    /* 2 */ val accessDenied: typingsSlinky.sharepoint.SP.Utilities.LogAppErrorResult.accessDenied with Double = js.native
    
    /* 1 */ val errorsThrottled: typingsSlinky.sharepoint.SP.Utilities.LogAppErrorResult.errorsThrottled with Double = js.native
    
    /* 0 */ val success: typingsSlinky.sharepoint.SP.Utilities.LogAppErrorResult.success with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.PrincipalInfo")
  @js.native
  class PrincipalInfo ()
    extends typingsSlinky.sharepoint.SP.Utilities.PrincipalInfo
  
  @JSGlobal("SP.Utilities.PrincipalSource")
  @js.native
  object PrincipalSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Utilities.PrincipalSource with Double] = js.native
    
    /* 5 */ val all: typingsSlinky.sharepoint.SP.Utilities.PrincipalSource.all with Double = js.native
    
    /* 3 */ val membershipProvider: typingsSlinky.sharepoint.SP.Utilities.PrincipalSource.membershipProvider with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.Utilities.PrincipalSource.none with Double = js.native
    
    /* 4 */ val roleProvider: typingsSlinky.sharepoint.SP.Utilities.PrincipalSource.roleProvider with Double = js.native
    
    /* 1 */ val userInfoList: typingsSlinky.sharepoint.SP.Utilities.PrincipalSource.userInfoList with Double = js.native
    
    /* 2 */ val windows: typingsSlinky.sharepoint.SP.Utilities.PrincipalSource.windows with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.PrincipalType")
  @js.native
  object PrincipalType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Utilities.PrincipalType with Double] = js.native
    
    /* 5 */ val all: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.all with Double = js.native
    
    /* 2 */ val distributionList: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.distributionList with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.none with Double = js.native
    
    /* 3 */ val securityGroup: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.securityGroup with Double = js.native
    
    /* 4 */ val sharePointGroup: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.sharePointGroup with Double = js.native
    
    /* 1 */ val user: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.user with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.SPWOPIFrameAction")
  @js.native
  object SPWOPIFrameAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Utilities.SPWOPIFrameAction with Double] = js.native
    
    /* 1 */ val edit: typingsSlinky.sharepoint.SP.Utilities.SPWOPIFrameAction.edit with Double = js.native
    
    /* 3 */ val interactivePreview: typingsSlinky.sharepoint.SP.Utilities.SPWOPIFrameAction.interactivePreview with Double = js.native
    
    /* 2 */ val mobileView: typingsSlinky.sharepoint.SP.Utilities.SPWOPIFrameAction.mobileView with Double = js.native
    
    /* 0 */ val view: typingsSlinky.sharepoint.SP.Utilities.SPWOPIFrameAction.view with Double = js.native
  }
  
  @JSGlobal("SP.Utilities.Set")
  @js.native
  class Set ()
    extends typingsSlinky.sharepoint.SP.Utilities.Set {
    def this(items: NumberDictionary[Double]) = this()
    def this(items: StringDictionary[Double]) = this()
  }
  
  @JSGlobal("SP.Utilities.UrlBuilder")
  @js.native
  class UrlBuilder protected ()
    extends typingsSlinky.sharepoint.SP.Utilities.UrlBuilder {
    def this(path: String) = this()
  }
  object UrlBuilder {
    
    /* static member */
    @JSGlobal("SP.Utilities.UrlBuilder.removeQueryString")
    @js.native
    def removeQueryString(url: String, key: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.UrlBuilder.replaceOrAddQueryString")
    @js.native
    def replaceOrAddQueryString(url: String, key: String, value: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.UrlBuilder.urlCombine")
    @js.native
    def urlCombine(path1: String, path2: String): String = js.native
  }
  
  @JSGlobal("SP.Utilities.Utility")
  @js.native
  class Utility ()
    extends typingsSlinky.sharepoint.SP.Utilities.Utility
  object Utility {
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createEmailBodyForInvitation")
    @js.native
    def createEmailBodyForInvitation(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, pageAddress: String): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createNewDiscussion")
    @js.native
    def createNewDiscussion[T](
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      list: typingsSlinky.sharepoint.SP.List[_],
      title: String
    ): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createNewDiscussionReply")
    @js.native
    def createNewDiscussionReply[T](
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      parent: typingsSlinky.sharepoint.SP.ListItem[T]
    ): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.createWikiPageInContextWeb")
    @js.native
    def createWikiPageInContextWeb(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      parameters: typingsSlinky.sharepoint.SP.Utilities.WikiPageCreationInformation
    ): typingsSlinky.sharepoint.SP.File = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.formatDateTime")
    @js.native
    def formatDateTime(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      web: typingsSlinky.sharepoint.SP.Web,
      datetime: js.Date,
      format: DateTimeFormat
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getAppLicenseDeploymentId")
    @js.native
    def getAppLicenseDeploymentId(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.GuidResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getAppLicenseInformation")
    @js.native
    def getAppLicenseInformation(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      productId: typingsSlinky.sharepoint.SP.Guid
    ): typingsSlinky.sharepoint.SP.AppLicenseCollection = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getCurrentUserEmailAddresses")
    @js.native
    def getCurrentUserEmailAddresses(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getImageUrl")
    @js.native
    def getImageUrl(imageName: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.get_layoutsLatestVersionRelativeUrl")
    @js.native
    def getLayoutsLatestVersionRelativeUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.get_layoutsLatestVersionUrl")
    @js.native
    def getLayoutsLatestVersionUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getLayoutsPageUrl")
    @js.native
    def getLayoutsPageUrl(pageName: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getLocalizedString")
    @js.native
    def getLocalizedString(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      source: String,
      defaultResourceFile: String,
      language: Double
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getLowerCaseString")
    @js.native
    def getLowerCaseString(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, sourceValue: String, lcid: Double): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.getPeoplePickerURL")
    @js.native
    def getPeoplePickerURL(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      web: typingsSlinky.sharepoint.SP.Web,
      fieldUser: typingsSlinky.sharepoint.SP.FieldUser
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.importAppLicense")
    @js.native
    def importAppLicense(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      licenseTokenToImport: String,
      contentMarket: String,
      billingMarket: String,
      appName: String,
      iconUrl: String,
      providerName: String,
      appSubtype: Double
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.isUserLicensedForEntityInContext")
    @js.native
    def isUserLicensedForEntityInContext(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, licensableEntity: String): typingsSlinky.sharepoint.SP.BooleanResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.localizeWebPartGallery")
    @js.native
    def localizeWebPartGallery(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, items: ListItemCollection[_]): typingsSlinky.sharepoint.SP.ClientObjectList[typingsSlinky.sharepoint.SP.ListItem[_]] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.logCustomAppError")
    @js.native
    def logCustomAppError(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, error: String): typingsSlinky.sharepoint.SP.IntResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.logCustomRemoteAppError")
    @js.native
    def logCustomRemoteAppError(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      productId: typingsSlinky.sharepoint.SP.Guid,
      error: String
    ): typingsSlinky.sharepoint.SP.IntResult = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.markDiscussionAsFeatured")
    @js.native
    def markDiscussionAsFeatured(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.resolvePrincipal")
    @js.native
    def resolvePrincipal(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      web: typingsSlinky.sharepoint.SP.Web,
      input: String,
      scopes: PrincipalType,
      sources: PrincipalSource,
      usersContainer: UserCollection,
      inputIsEmailOnly: Boolean
    ): typingsSlinky.sharepoint.SP.Utilities.PrincipalInfo = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.searchPrincipals")
    @js.native
    def searchPrincipals(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      web: typingsSlinky.sharepoint.SP.Web,
      input: String,
      scopes: PrincipalType,
      sources: PrincipalSource,
      usersContainer: UserCollection,
      maxCount: Double
    ): js.Array[typingsSlinky.sharepoint.SP.Utilities.PrincipalInfo] = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.Utility.unmarkDiscussionAsFeatured")
    @js.native
    def unmarkDiscussionAsFeatured(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, listID: String, topicIDs: String): Unit = js.native
  }
  
  @JSGlobal("SP.Utilities.VersionUtility")
  @js.native
  class VersionUtility ()
    extends typingsSlinky.sharepoint.SP.Utilities.VersionUtility
  object VersionUtility {
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.getImageUrl")
    @js.native
    def getImageUrl(imageName: String): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.get_layoutsLatestVersionRelativeUrl")
    @js.native
    def getLayoutsLatestVersionRelativeUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.get_layoutsLatestVersionUrl")
    @js.native
    def getLayoutsLatestVersionUrl(): String = js.native
    
    /* static member */
    @JSGlobal("SP.Utilities.VersionUtility.getLayoutsPageUrl")
    @js.native
    def getLayoutsPageUrl(pageName: String): String = js.native
  }
  
  @JSGlobal("SP.Utilities.WikiPageCreationInformation")
  @js.native
  class WikiPageCreationInformation ()
    extends typingsSlinky.sharepoint.SP.Utilities.WikiPageCreationInformation
}
