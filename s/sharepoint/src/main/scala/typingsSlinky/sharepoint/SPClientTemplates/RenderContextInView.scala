package typingsSlinky.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContextInView extends RenderContext {
  var AllowCreateFolder: Boolean = js.native
  var AllowGridMode: Boolean = js.native
  var BasePermissions: StringDictionary[Boolean] = js.native
  var CanShareLinkForNewDocument: Boolean = js.native
  var CascadeDeleteWarningMessage: String = js.native
   // not in View
  var ContentTypesEnabled: Boolean = js.native
   // not in View
  var CurrentUserId: Double = js.native
  var CurrentUserIsSiteAdmin: Boolean = js.native
  var EnableMinorVersions: Boolean = js.native
  var ExternalDataList: Boolean = js.native
  var HasRelatedCascadeLists: Double = js.native
   // e.g. "idHomePageNewItem"
  var HttpPath: String = js.native
  var HttpRoot: String = js.native
  var IsAppWeb: Boolean = js.native
  var IsClientRendering: Boolean = js.native
  var LastRowIndexSelected: js.Any = js.native
   // not in View
  var LastSelectableRowIdx: js.Any = js.native
  var LastSelectedItemIID: js.Any = js.native
  var LastSelectedItemId: js.Any = js.native
  var ListData: ListDataInView = js.native
  var ListDataJSONItemsKey: String = js.native
  var ListSchema: ListSchemaInView = js.native
  var ListTitle: String = js.native
  var ModerationStatus: Double = js.native
  var NavigateForFormsPages: Boolean = js.native
  var NewWOPIDocumentEnabled: js.Any = js.native
  var NewWOPIDocumentUrl: js.Any = js.native
  var OfficialFileName: String = js.native
  var OfficialFileNames: String = js.native
   // not in View
  var PortalUrl: String = js.native
  /** either 1 or 0 */
  var RecycleBinEnabled: Double = js.native
  var RegionalSettingsTimeZoneBias: String = js.native
  var RowFocusTimerID: js.Any = js.native
  var SelectAllCbx: js.Any = js.native
  var SendToLocationName: String = js.native
  var SendToLocationUrl: String = js.native
  var SiteTitle: String = js.native
  var StateInitDone: Boolean = js.native
  var TableCbxFocusHandler: js.Any = js.native
  var TableMouseOverHandler: js.Any = js.native
  var TotalListItems: Double = js.native
  var WorkflowAssociated: Boolean = js.native
  var WriteSecurity: String = js.native
   // SP.BasePermissions?
  var bInitialRender: Boolean = js.native
  var clvp: HTMLElement = js.native
  var ctxId: Double = js.native
  var ctxType: js.Any = js.native
  var dictSel: js.Any = js.native
  /** Absolute path for the list display form */
  var displayFormUrl: String = js.native
  /** Absolute path for the list edit form */
  var editFormUrl: String = js.native
  var enteringGridMode: Boolean = js.native
  var existingServerFilterHash: js.Any = js.native
  var heroId: String = js.native
  var imagesPath: String = js.native
  var inGridFullRender: js.Any = js.native
   // not in View
  var inGridMode: Boolean = js.native
  var isForceCheckout: Boolean = js.native
  var isModerated: Boolean = js.native
  var isPortalTemplate: js.Any = js.native
  var isVersions: Double = js.native
  var isWebEditorPreview: Double = js.native
  var isXslView: Boolean = js.native
   // not in View
  var leavingGridMode: Boolean = js.native
  var listBaseType: Double = js.native
   // ="Row"
  /** Guid of the list */
  var listName: String = js.native
  var listTemplate: String = js.native
  var listUrlDir: String = js.native
  var loadingAsyncData: Boolean = js.native
  /** Absolute path for the list new form */
  var newFormUrl: String = js.native
  var noGroupCollapse: Boolean = js.native
  var overrideDeleteConfirmation: String = js.native
   // not in View
  var overrideFilterQstring: String = js.native
  var queryString: js.Any = js.native
  var recursiveView: Boolean = js.native
  var rootFolder: String = js.native
  var rootFolderForDisplay: js.Any = js.native
  var serverUrl: js.Any = js.native
  var verEnabled: Double = js.native
  /** Guid of the view. */
  var view: String = js.native
  var viewTitle: String = js.native
  var wpq: String = js.native
}

object RenderContextInView {
  @scala.inline
  def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: StringDictionary[Boolean],
    CanShareLinkForNewDocument: Boolean,
    CascadeDeleteWarningMessage: String,
    ContentTypesEnabled: Boolean,
    CurrentUserId: Double,
    CurrentUserIsSiteAdmin: Boolean,
    EnableMinorVersions: Boolean,
    ExternalDataList: Boolean,
    HasRelatedCascadeLists: Double,
    HttpPath: String,
    HttpRoot: String,
    IsAppWeb: Boolean,
    IsClientRendering: Boolean,
    LastRowIndexSelected: js.Any,
    LastSelectableRowIdx: js.Any,
    LastSelectedItemIID: js.Any,
    LastSelectedItemId: js.Any,
    ListData: ListDataInView,
    ListDataJSONItemsKey: String,
    ListSchema: ListSchemaInView,
    ListTitle: String,
    ModerationStatus: Double,
    NavigateForFormsPages: Boolean,
    NewWOPIDocumentEnabled: js.Any,
    NewWOPIDocumentUrl: js.Any,
    OfficialFileName: String,
    OfficialFileNames: String,
    PortalUrl: String,
    RecycleBinEnabled: Double,
    RegionalSettingsTimeZoneBias: String,
    RowFocusTimerID: js.Any,
    SelectAllCbx: js.Any,
    SendToLocationName: String,
    SendToLocationUrl: String,
    SiteTitle: String,
    StateInitDone: Boolean,
    TableCbxFocusHandler: js.Any,
    TableMouseOverHandler: js.Any,
    TotalListItems: Double,
    WorkflowAssociated: Boolean,
    WriteSecurity: String,
    bInitialRender: Boolean,
    clvp: HTMLElement,
    ctxId: Double,
    ctxType: js.Any,
    dictSel: js.Any,
    displayFormUrl: String,
    editFormUrl: String,
    enteringGridMode: Boolean,
    existingServerFilterHash: js.Any,
    heroId: String,
    imagesPath: String,
    inGridFullRender: js.Any,
    inGridMode: Boolean,
    isForceCheckout: Boolean,
    isModerated: Boolean,
    isPortalTemplate: js.Any,
    isVersions: Double,
    isWebEditorPreview: Double,
    isXslView: Boolean,
    leavingGridMode: Boolean,
    listBaseType: Double,
    listName: String,
    listTemplate: String,
    listUrlDir: String,
    loadingAsyncData: Boolean,
    newFormUrl: String,
    noGroupCollapse: Boolean,
    overrideDeleteConfirmation: String,
    overrideFilterQstring: String,
    queryString: js.Any,
    recursiveView: Boolean,
    rootFolder: String,
    rootFolderForDisplay: js.Any,
    serverUrl: js.Any,
    verEnabled: Double,
    view: String,
    viewTitle: String,
    wpq: String
  ): RenderContextInView = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder.asInstanceOf[js.Any], AllowGridMode = AllowGridMode.asInstanceOf[js.Any], BasePermissions = BasePermissions.asInstanceOf[js.Any], CanShareLinkForNewDocument = CanShareLinkForNewDocument.asInstanceOf[js.Any], CascadeDeleteWarningMessage = CascadeDeleteWarningMessage.asInstanceOf[js.Any], ContentTypesEnabled = ContentTypesEnabled.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin.asInstanceOf[js.Any], EnableMinorVersions = EnableMinorVersions.asInstanceOf[js.Any], ExternalDataList = ExternalDataList.asInstanceOf[js.Any], HasRelatedCascadeLists = HasRelatedCascadeLists.asInstanceOf[js.Any], HttpPath = HttpPath.asInstanceOf[js.Any], HttpRoot = HttpRoot.asInstanceOf[js.Any], IsAppWeb = IsAppWeb.asInstanceOf[js.Any], IsClientRendering = IsClientRendering.asInstanceOf[js.Any], LastRowIndexSelected = LastRowIndexSelected.asInstanceOf[js.Any], LastSelectableRowIdx = LastSelectableRowIdx.asInstanceOf[js.Any], LastSelectedItemIID = LastSelectedItemIID.asInstanceOf[js.Any], LastSelectedItemId = LastSelectedItemId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListDataJSONItemsKey = ListDataJSONItemsKey.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any], ListTitle = ListTitle.asInstanceOf[js.Any], ModerationStatus = ModerationStatus.asInstanceOf[js.Any], NavigateForFormsPages = NavigateForFormsPages.asInstanceOf[js.Any], NewWOPIDocumentEnabled = NewWOPIDocumentEnabled.asInstanceOf[js.Any], NewWOPIDocumentUrl = NewWOPIDocumentUrl.asInstanceOf[js.Any], OfficialFileName = OfficialFileName.asInstanceOf[js.Any], OfficialFileNames = OfficialFileNames.asInstanceOf[js.Any], PortalUrl = PortalUrl.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], RegionalSettingsTimeZoneBias = RegionalSettingsTimeZoneBias.asInstanceOf[js.Any], RowFocusTimerID = RowFocusTimerID.asInstanceOf[js.Any], SelectAllCbx = SelectAllCbx.asInstanceOf[js.Any], SendToLocationName = SendToLocationName.asInstanceOf[js.Any], SendToLocationUrl = SendToLocationUrl.asInstanceOf[js.Any], SiteTitle = SiteTitle.asInstanceOf[js.Any], StateInitDone = StateInitDone.asInstanceOf[js.Any], TableCbxFocusHandler = TableCbxFocusHandler.asInstanceOf[js.Any], TableMouseOverHandler = TableMouseOverHandler.asInstanceOf[js.Any], TotalListItems = TotalListItems.asInstanceOf[js.Any], WorkflowAssociated = WorkflowAssociated.asInstanceOf[js.Any], WriteSecurity = WriteSecurity.asInstanceOf[js.Any], bInitialRender = bInitialRender.asInstanceOf[js.Any], clvp = clvp.asInstanceOf[js.Any], ctxId = ctxId.asInstanceOf[js.Any], ctxType = ctxType.asInstanceOf[js.Any], dictSel = dictSel.asInstanceOf[js.Any], displayFormUrl = displayFormUrl.asInstanceOf[js.Any], editFormUrl = editFormUrl.asInstanceOf[js.Any], enteringGridMode = enteringGridMode.asInstanceOf[js.Any], existingServerFilterHash = existingServerFilterHash.asInstanceOf[js.Any], heroId = heroId.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], inGridFullRender = inGridFullRender.asInstanceOf[js.Any], inGridMode = inGridMode.asInstanceOf[js.Any], isForceCheckout = isForceCheckout.asInstanceOf[js.Any], isModerated = isModerated.asInstanceOf[js.Any], isPortalTemplate = isPortalTemplate.asInstanceOf[js.Any], isVersions = isVersions.asInstanceOf[js.Any], isWebEditorPreview = isWebEditorPreview.asInstanceOf[js.Any], isXslView = isXslView.asInstanceOf[js.Any], leavingGridMode = leavingGridMode.asInstanceOf[js.Any], listBaseType = listBaseType.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], listTemplate = listTemplate.asInstanceOf[js.Any], listUrlDir = listUrlDir.asInstanceOf[js.Any], loadingAsyncData = loadingAsyncData.asInstanceOf[js.Any], newFormUrl = newFormUrl.asInstanceOf[js.Any], noGroupCollapse = noGroupCollapse.asInstanceOf[js.Any], overrideDeleteConfirmation = overrideDeleteConfirmation.asInstanceOf[js.Any], overrideFilterQstring = overrideFilterQstring.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], recursiveView = recursiveView.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], rootFolderForDisplay = rootFolderForDisplay.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], verEnabled = verEnabled.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], viewTitle = viewTitle.asInstanceOf[js.Any], wpq = wpq.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextInView]
  }
  @scala.inline
  implicit class RenderContextInViewOps[Self <: RenderContextInView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCreateFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowCreateFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowGridMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowGridMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePermissions(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BasePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanShareLinkForNewDocument(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanShareLinkForNewDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCascadeDeleteWarningMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CascadeDeleteWarningMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTypesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentTypesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentUserId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentUserIsSiteAdmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUserIsSiteAdmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableMinorVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableMinorVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalDataList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalDataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRelatedCascadeLists(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasRelatedCascadeLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAppWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAppWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClientRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsClientRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRowIndexSelected(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRowIndexSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelectableRowIdx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSelectableRowIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelectedItemIID(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSelectedItemIID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelectedItemId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSelectedItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListData(value: ListDataInView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDataJSONItemsKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListDataJSONItemsKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSchema(value: ListSchemaInView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModerationStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigateForFormsPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigateForFormsPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewWOPIDocumentEnabled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewWOPIDocumentEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewWOPIDocumentUrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewWOPIDocumentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficialFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfficialFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficialFileNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfficialFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecycleBinEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecycleBinEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionalSettingsTimeZoneBias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionalSettingsTimeZoneBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowFocusTimerID(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowFocusTimerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllCbx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectAllCbx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendToLocationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendToLocationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendToLocationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendToLocationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateInitDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateInitDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableCbxFocusHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableCbxFocusHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableMouseOverHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMouseOverHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalListItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalListItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowAssociated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowAssociated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteSecurity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBInitialRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bInitialRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClvp(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clvp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtxId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtxType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctxType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictSel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictSel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayFormUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFormUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditFormUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editFormUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnteringGridMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringGridMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistingServerFilterHash(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingServerFilterHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeroId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heroId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagesPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInGridFullRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGridFullRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInGridMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inGridMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsForceCheckout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForceCheckout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsModerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPortalTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPortalTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVersions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWebEditorPreview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebEditorPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsXslView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXslView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeavingGridMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingGridMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBaseType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListUrlDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUrlDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingAsyncData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingAsyncData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewFormUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFormUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoGroupCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGroupCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideDeleteConfirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideDeleteConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideFilterQstring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideFilterQstring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursiveView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFolderForDisplay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFolderForDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerUrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWpq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wpq")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

