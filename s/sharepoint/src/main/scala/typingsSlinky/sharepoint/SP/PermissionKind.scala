package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionKind extends js.Object

/** Specifies permissions that are used to define user roles. Represents SPBasePermissions class. */
@JSGlobal("SP.PermissionKind")
@js.native
object PermissionKind extends js.Object {
  /** Add, change, or delete HTML pages or Web Part Pages, and edit the Web site using a SharePoint Foundation?compatible editor. */
  @js.native
  sealed trait addAndCustomizePages extends PermissionKind
  
  /** Add or remove personal Web Parts on a Web Part Page. */
  @js.native
  sealed trait addDelPrivateWebParts extends PermissionKind
  
  /** Add items to lists, add documents to document libraries, and add Web discussion comments. */
  @js.native
  sealed trait addListItems extends PermissionKind
  
  /** Make content of a list or document library retrieveable for anonymous users through SharePoint search. The list permissions in the site do not change.  */
  @js.native
  sealed trait anonymousSearchAccessList extends PermissionKind
  
  /** Content of lists and document libraries in the Web site will be retrieveable for anonymous users through SharePoint search if the list or document library has AnonymousSearchAccessList set.  */
  @js.native
  sealed trait anonymousSearchAccessWebLists extends PermissionKind
  
  /** Apply a style sheet (.css file) to the Web site. */
  @js.native
  sealed trait applyStyleSheets extends PermissionKind
  
  /** Apply a theme or borders to the entire Web site. */
  @js.native
  sealed trait applyThemeAndBorder extends PermissionKind
  
  /** Approve a minor version of a list item or document. */
  @js.native
  sealed trait approveItems extends PermissionKind
  
  /** Enumerate files and folders in a Web site using Microsoft Office SharePoint Designer 2007 and WebDAV interfaces. */
  @js.native
  sealed trait browseDirectories extends PermissionKind
  
  /** View information about users of the Web site. */
  @js.native
  sealed trait browseUserInfo extends PermissionKind
  
  /** Discard or check in a document which is checked out to another user. */
  @js.native
  sealed trait cancelCheckout extends PermissionKind
  
  /** Create e-mail alerts. */
  @js.native
  sealed trait createAlerts extends PermissionKind
  
  /** Create a group of users that can be used anywhere within the site collection. */
  @js.native
  sealed trait createGroups extends PermissionKind
  
  /** Create a Web site using Self-Service Site Creation. */
  @js.native
  sealed trait createSSCSite extends PermissionKind
  
  /** Delete items from a list, documents from a document library, and Web discussion comments in documents. */
  @js.native
  sealed trait deleteListItems extends PermissionKind
  
  /** Delete past versions of a list item or document. */
  @js.native
  sealed trait deleteVersions extends PermissionKind
  
  /** Edit items in lists, edit documents in document libraries, edit Web discussion comments in documents, and customize Web Part Pages in document libraries. */
  @js.native
  sealed trait editListItems extends PermissionKind
  
  /** Allows a user to change their user information, such as adding a picture. */
  @js.native
  sealed trait editMyUserInfo extends PermissionKind
  
  /** Has no permissions on the Web site. Not available through the user interface. */
  @js.native
  sealed trait emptyMask extends PermissionKind
  
  /** Enumerate permissions on the Web site, list, folder, document, or list item. */
  @js.native
  sealed trait enumeratePermissions extends PermissionKind
  
  /** Has all permissions on the Web site. Not available through the user interface. */
  @js.native
  sealed trait fullMask extends PermissionKind
  
  /** Manage alerts for all users of the Web site. */
  @js.native
  sealed trait manageAlerts extends PermissionKind
  
  /** Create and delete lists, add or remove columns in a list, and add or remove public views of a list. */
  @js.native
  sealed trait manageLists extends PermissionKind
  
  /** Create and change permission levels on the Web site and assign permissions to users and groups. */
  @js.native
  sealed trait managePermissions extends PermissionKind
  
  /** Create, change, and delete personal views of lists. */
  @js.native
  sealed trait managePersonalViews extends PermissionKind
  
  /** Create subsites such as team sites, Meeting Workspace sites, and Document Workspace sites.  */
  @js.native
  sealed trait manageSubwebs extends PermissionKind
  
  /** Grant the ability to perform all administration tasks for the Web site as well as manage content. Activate, deactivate, or edit properties of Web site scoped Features through the object model or through the user interface (UI). When granted on the root Web site of a site collection, activate, deactivate, or edit properties of site collection scoped Features through the object model. To browse to the Site Collection Features page and activate or deactivate site collection scoped Features through the UI, you must be a site collection administrator. */
  @js.native
  sealed trait manageWeb extends PermissionKind
  
  /** Allow users to open a Web site, list, or folder to access items inside that container. */
  @js.native
  sealed trait open extends PermissionKind
  
  /** View the source of documents with server-side file handlers. */
  @js.native
  sealed trait openItems extends PermissionKind
  
  /** Update Web Parts to display personalized information. */
  @js.native
  sealed trait updatePersonalWebParts extends PermissionKind
  
  /** Use features that launch client applications; otherwise, users must work on documents locally and upload changes.  */
  @js.native
  sealed trait useClientIntegration extends PermissionKind
  
  /** Use SOAP, WebDAV, or Microsoft Office SharePoint Designer 2007 interfaces to access the Web site. */
  @js.native
  sealed trait useRemoteAPIs extends PermissionKind
  
  /** View forms, views, and application pages, and enumerate lists. */
  @js.native
  sealed trait viewFormPages extends PermissionKind
  
  /** View items in lists, documents in document libraries, and view Web discussion comments. */
  @js.native
  sealed trait viewListItems extends PermissionKind
  
  /** View pages in a Web site. */
  @js.native
  sealed trait viewPages extends PermissionKind
  
  /** View reports on Web site usage. */
  @js.native
  sealed trait viewUsageData extends PermissionKind
  
  /** View past versions of a list item or document. */
  @js.native
  sealed trait viewVersions extends PermissionKind
  
  /* 16 */ val addAndCustomizePages: typingsSlinky.sharepoint.SP.PermissionKind.addAndCustomizePages with Double = js.native
  /* 26 */ val addDelPrivateWebParts: typingsSlinky.sharepoint.SP.PermissionKind.addDelPrivateWebParts with Double = js.native
  /* 2 */ val addListItems: typingsSlinky.sharepoint.SP.PermissionKind.addListItems with Double = js.native
  /* 13 */ val anonymousSearchAccessList: typingsSlinky.sharepoint.SP.PermissionKind.anonymousSearchAccessList with Double = js.native
  /* 29 */ val anonymousSearchAccessWebLists: typingsSlinky.sharepoint.SP.PermissionKind.anonymousSearchAccessWebLists with Double = js.native
  /* 18 */ val applyStyleSheets: typingsSlinky.sharepoint.SP.PermissionKind.applyStyleSheets with Double = js.native
  /* 17 */ val applyThemeAndBorder: typingsSlinky.sharepoint.SP.PermissionKind.applyThemeAndBorder with Double = js.native
  /* 5 */ val approveItems: typingsSlinky.sharepoint.SP.PermissionKind.approveItems with Double = js.native
  /* 24 */ val browseDirectories: typingsSlinky.sharepoint.SP.PermissionKind.browseDirectories with Double = js.native
  /* 25 */ val browseUserInfo: typingsSlinky.sharepoint.SP.PermissionKind.browseUserInfo with Double = js.native
  /* 9 */ val cancelCheckout: typingsSlinky.sharepoint.SP.PermissionKind.cancelCheckout with Double = js.native
  /* 33 */ val createAlerts: typingsSlinky.sharepoint.SP.PermissionKind.createAlerts with Double = js.native
  /* 22 */ val createGroups: typingsSlinky.sharepoint.SP.PermissionKind.createGroups with Double = js.native
  /* 20 */ val createSSCSite: typingsSlinky.sharepoint.SP.PermissionKind.createSSCSite with Double = js.native
  /* 4 */ val deleteListItems: typingsSlinky.sharepoint.SP.PermissionKind.deleteListItems with Double = js.native
  /* 8 */ val deleteVersions: typingsSlinky.sharepoint.SP.PermissionKind.deleteVersions with Double = js.native
  /* 3 */ val editListItems: typingsSlinky.sharepoint.SP.PermissionKind.editListItems with Double = js.native
  /* 34 */ val editMyUserInfo: typingsSlinky.sharepoint.SP.PermissionKind.editMyUserInfo with Double = js.native
  /* 0 */ val emptyMask: typingsSlinky.sharepoint.SP.PermissionKind.emptyMask with Double = js.native
  /* 35 */ val enumeratePermissions: typingsSlinky.sharepoint.SP.PermissionKind.enumeratePermissions with Double = js.native
  /* 36 */ val fullMask: typingsSlinky.sharepoint.SP.PermissionKind.fullMask with Double = js.native
  /* 32 */ val manageAlerts: typingsSlinky.sharepoint.SP.PermissionKind.manageAlerts with Double = js.native
  /* 11 */ val manageLists: typingsSlinky.sharepoint.SP.PermissionKind.manageLists with Double = js.native
  /* 23 */ val managePermissions: typingsSlinky.sharepoint.SP.PermissionKind.managePermissions with Double = js.native
  /* 10 */ val managePersonalViews: typingsSlinky.sharepoint.SP.PermissionKind.managePersonalViews with Double = js.native
  /* 21 */ val manageSubwebs: typingsSlinky.sharepoint.SP.PermissionKind.manageSubwebs with Double = js.native
  /* 28 */ val manageWeb: typingsSlinky.sharepoint.SP.PermissionKind.manageWeb with Double = js.native
  /* 14 */ val open: typingsSlinky.sharepoint.SP.PermissionKind.open with Double = js.native
  /* 6 */ val openItems: typingsSlinky.sharepoint.SP.PermissionKind.openItems with Double = js.native
  /* 27 */ val updatePersonalWebParts: typingsSlinky.sharepoint.SP.PermissionKind.updatePersonalWebParts with Double = js.native
  /* 30 */ val useClientIntegration: typingsSlinky.sharepoint.SP.PermissionKind.useClientIntegration with Double = js.native
  /* 31 */ val useRemoteAPIs: typingsSlinky.sharepoint.SP.PermissionKind.useRemoteAPIs with Double = js.native
  /* 12 */ val viewFormPages: typingsSlinky.sharepoint.SP.PermissionKind.viewFormPages with Double = js.native
  /* 1 */ val viewListItems: typingsSlinky.sharepoint.SP.PermissionKind.viewListItems with Double = js.native
  /* 15 */ val viewPages: typingsSlinky.sharepoint.SP.PermissionKind.viewPages with Double = js.native
  /* 19 */ val viewUsageData: typingsSlinky.sharepoint.SP.PermissionKind.viewUsageData with Double = js.native
  /* 7 */ val viewVersions: typingsSlinky.sharepoint.SP.PermissionKind.viewVersions with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionKind with Double] = js.native
}

