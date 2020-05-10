package typingsSlinky.sharepoint

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.SPClientTemplates.ListSchema
import typingsSlinky.sharepoint.SPClientTemplates.RenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextInfo extends RenderContext {
  var AllowCreateFolder: Boolean = js.native
  var AllowGridMode: Boolean = js.native
  var BasePermissions: js.Any = js.native
  var CanShareLinkForNewDocument: Boolean = js.native
  var CascadeDeleteWarningMessage: String = js.native
  var ContentTypesEnabled: Boolean = js.native
  @JSName("CurrentSelectedItems")
  var CurrentSelectedItems_ContextInfo: Boolean = js.native
  var CurrentUserId: Double = js.native
  var CurrentUserIsSiteAdmin: Boolean = js.native
  var EnableMinorVersions: Boolean = js.native
  var ExcludeFromOfflineClient: Boolean = js.native
  var ExternalDataList: Boolean = js.native
  var HasRelatedCascadeLists: Boolean = js.native
  var HttpPath: String = js.native
  var HttpRoot: String = js.native
  var IsAppWeb: Boolean = js.native
  var IsClientRendering: Boolean = js.native
  var LastRowIndexSelected: Double = js.native
  var LastSelectableRowIdx: Double = js.native
  var LastSelectedItemIID: Double = js.native
  var ListData: js.Any = js.native
   // SPClientTemplates.ListData_InView | SPClientTemplates.ListData_InForm
  var ListSchema: typingsSlinky.sharepoint.SPClientTemplates.ListSchema = js.native
  var ListTitle: String = js.native
  var ModerationStatus: Double = js.native
  var NewWOPIDocumentEnabled: Boolean = js.native
  var NewWOPIDocumentUrl: String = js.native
  var PortalUrl: String = js.native
  var RecycleBinEnabled: Double = js.native
  var RowFocusTimerID: Double = js.native
  var SelectAllCbx: HTMLElement = js.native
  var SendToLocationName: String = js.native
  var SendToLocationUrl: String = js.native
  var SiteTemplateId: Double = js.native
  var SiteTitle: String = js.native
  var StateInitDone: Boolean = js.native
  var TotalListItems: Double = js.native
  var WorkflowsAssociated: Boolean = js.native
  var clvp: js.Any = js.native
  var ctxId: Double = js.native
  var ctxType: js.Any = js.native
  var dictSel: js.Any = js.native
  var displayFormUrl: String = js.native
  var editFormUrl: String = js.native
  var imagesPath: String = js.native
  var inGridFullRender: Boolean = js.native
  var inGridMode: Boolean = js.native
  var isForceCheckout: Boolean = js.native
  var isModerated: Boolean = js.native
  var isPortalTemplate: Boolean = js.native
  var isVersions: Boolean = js.native
  var isWebEditorPreview: Boolean = js.native
  var leavingGridMode: Boolean = js.native
  var listBaseType: Double = js.native
  var listName: String = js.native
  var listTemplate: String = js.native
  var listUrlDir: String = js.native
  var loadingAsyncData: Boolean = js.native
  var newFormUrl: String = js.native
  var noGroupCollapse: Boolean = js.native
  var overrideDeleteConfirmation: String = js.native
  var overrideFilterQstring: String = js.native
  var queryString: String = js.native
  var recursiveView: Boolean = js.native
  var rootFolder: String = js.native
  var rootFolderForDisplay: String = js.native
  var serverUrl: String = js.native
  var verEnabled: Boolean = js.native
  var view: String = js.native
  var wpq: String = js.native
  def TableCbxFocusHandler(instance: js.Any, eventArgs: js.Any): Unit = js.native
  def TableMouseoverHandler(instance: js.Any, eventArgs: js.Any): Unit = js.native
  @JSName("onRefreshFailed")
  def onRefreshFailed_MContextInfo(context: js.Any, requrest: js.Any, response: js.Any): Unit = js.native
}

object ContextInfo {
  @scala.inline
  def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: js.Any,
    CanShareLinkForNewDocument: Boolean,
    CascadeDeleteWarningMessage: String,
    ContentTypesEnabled: Boolean,
    CurrentSelectedItems: Boolean,
    CurrentUserId: Double,
    CurrentUserIsSiteAdmin: Boolean,
    EnableMinorVersions: Boolean,
    ExcludeFromOfflineClient: Boolean,
    ExternalDataList: Boolean,
    HasRelatedCascadeLists: Boolean,
    HttpPath: String,
    HttpRoot: String,
    IsAppWeb: Boolean,
    IsClientRendering: Boolean,
    LastRowIndexSelected: Double,
    LastSelectableRowIdx: Double,
    LastSelectedItemIID: Double,
    ListData: js.Any,
    ListSchema: ListSchema,
    ListTitle: String,
    ModerationStatus: Double,
    NewWOPIDocumentEnabled: Boolean,
    NewWOPIDocumentUrl: String,
    PortalUrl: String,
    RecycleBinEnabled: Double,
    RowFocusTimerID: Double,
    SelectAllCbx: HTMLElement,
    SendToLocationName: String,
    SendToLocationUrl: String,
    SiteTemplateId: Double,
    SiteTitle: String,
    StateInitDone: Boolean,
    TableCbxFocusHandler: (js.Any, js.Any) => Unit,
    TableMouseoverHandler: (js.Any, js.Any) => Unit,
    TotalListItems: Double,
    WorkflowsAssociated: Boolean,
    clvp: js.Any,
    ctxId: Double,
    ctxType: js.Any,
    dictSel: js.Any,
    displayFormUrl: String,
    editFormUrl: String,
    imagesPath: String,
    inGridFullRender: Boolean,
    inGridMode: Boolean,
    isForceCheckout: Boolean,
    isModerated: Boolean,
    isPortalTemplate: Boolean,
    isVersions: Boolean,
    isWebEditorPreview: Boolean,
    leavingGridMode: Boolean,
    listBaseType: Double,
    listName: String,
    listTemplate: String,
    listUrlDir: String,
    loadingAsyncData: Boolean,
    newFormUrl: String,
    noGroupCollapse: Boolean,
    onRefreshFailed: (js.Any, js.Any, js.Any) => Unit,
    overrideDeleteConfirmation: String,
    overrideFilterQstring: String,
    queryString: String,
    recursiveView: Boolean,
    rootFolder: String,
    rootFolderForDisplay: String,
    serverUrl: String,
    verEnabled: Boolean,
    view: String,
    wpq: String
  ): ContextInfo = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder.asInstanceOf[js.Any], AllowGridMode = AllowGridMode.asInstanceOf[js.Any], BasePermissions = BasePermissions.asInstanceOf[js.Any], CanShareLinkForNewDocument = CanShareLinkForNewDocument.asInstanceOf[js.Any], CascadeDeleteWarningMessage = CascadeDeleteWarningMessage.asInstanceOf[js.Any], ContentTypesEnabled = ContentTypesEnabled.asInstanceOf[js.Any], CurrentSelectedItems = CurrentSelectedItems.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin.asInstanceOf[js.Any], EnableMinorVersions = EnableMinorVersions.asInstanceOf[js.Any], ExcludeFromOfflineClient = ExcludeFromOfflineClient.asInstanceOf[js.Any], ExternalDataList = ExternalDataList.asInstanceOf[js.Any], HasRelatedCascadeLists = HasRelatedCascadeLists.asInstanceOf[js.Any], HttpPath = HttpPath.asInstanceOf[js.Any], HttpRoot = HttpRoot.asInstanceOf[js.Any], IsAppWeb = IsAppWeb.asInstanceOf[js.Any], IsClientRendering = IsClientRendering.asInstanceOf[js.Any], LastRowIndexSelected = LastRowIndexSelected.asInstanceOf[js.Any], LastSelectableRowIdx = LastSelectableRowIdx.asInstanceOf[js.Any], LastSelectedItemIID = LastSelectedItemIID.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any], ListTitle = ListTitle.asInstanceOf[js.Any], ModerationStatus = ModerationStatus.asInstanceOf[js.Any], NewWOPIDocumentEnabled = NewWOPIDocumentEnabled.asInstanceOf[js.Any], NewWOPIDocumentUrl = NewWOPIDocumentUrl.asInstanceOf[js.Any], PortalUrl = PortalUrl.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], RowFocusTimerID = RowFocusTimerID.asInstanceOf[js.Any], SelectAllCbx = SelectAllCbx.asInstanceOf[js.Any], SendToLocationName = SendToLocationName.asInstanceOf[js.Any], SendToLocationUrl = SendToLocationUrl.asInstanceOf[js.Any], SiteTemplateId = SiteTemplateId.asInstanceOf[js.Any], SiteTitle = SiteTitle.asInstanceOf[js.Any], StateInitDone = StateInitDone.asInstanceOf[js.Any], TableCbxFocusHandler = js.Any.fromFunction2(TableCbxFocusHandler), TableMouseoverHandler = js.Any.fromFunction2(TableMouseoverHandler), TotalListItems = TotalListItems.asInstanceOf[js.Any], WorkflowsAssociated = WorkflowsAssociated.asInstanceOf[js.Any], clvp = clvp.asInstanceOf[js.Any], ctxId = ctxId.asInstanceOf[js.Any], ctxType = ctxType.asInstanceOf[js.Any], dictSel = dictSel.asInstanceOf[js.Any], displayFormUrl = displayFormUrl.asInstanceOf[js.Any], editFormUrl = editFormUrl.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], inGridFullRender = inGridFullRender.asInstanceOf[js.Any], inGridMode = inGridMode.asInstanceOf[js.Any], isForceCheckout = isForceCheckout.asInstanceOf[js.Any], isModerated = isModerated.asInstanceOf[js.Any], isPortalTemplate = isPortalTemplate.asInstanceOf[js.Any], isVersions = isVersions.asInstanceOf[js.Any], isWebEditorPreview = isWebEditorPreview.asInstanceOf[js.Any], leavingGridMode = leavingGridMode.asInstanceOf[js.Any], listBaseType = listBaseType.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], listTemplate = listTemplate.asInstanceOf[js.Any], listUrlDir = listUrlDir.asInstanceOf[js.Any], loadingAsyncData = loadingAsyncData.asInstanceOf[js.Any], newFormUrl = newFormUrl.asInstanceOf[js.Any], noGroupCollapse = noGroupCollapse.asInstanceOf[js.Any], onRefreshFailed = js.Any.fromFunction3(onRefreshFailed), overrideDeleteConfirmation = overrideDeleteConfirmation.asInstanceOf[js.Any], overrideFilterQstring = overrideFilterQstring.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], recursiveView = recursiveView.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], rootFolderForDisplay = rootFolderForDisplay.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], verEnabled = verEnabled.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wpq = wpq.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInfo]
  }
  @scala.inline
  implicit class ContextInfoOps[Self <: ContextInfo] (val x: Self) extends AnyVal {
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
    def withBasePermissions(value: js.Any): Self = {
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
    def withCurrentSelectedItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSelectedItems")(value.asInstanceOf[js.Any])
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
    def withExcludeFromOfflineClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeFromOfflineClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalDataList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalDataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRelatedCascadeLists(value: Boolean): Self = {
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
    def withLastRowIndexSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRowIndexSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelectableRowIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSelectableRowIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelectedItemIID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSelectedItemIID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSchema(value: ListSchema): Self = {
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
    def withNewWOPIDocumentEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewWOPIDocumentEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewWOPIDocumentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewWOPIDocumentUrl")(value.asInstanceOf[js.Any])
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
    def withRowFocusTimerID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowFocusTimerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllCbx(value: HTMLElement): Self = {
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
    def withSiteTemplateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteTemplateId")(value.asInstanceOf[js.Any])
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
    def withTableCbxFocusHandler(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableCbxFocusHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTableMouseoverHandler(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMouseoverHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTotalListItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalListItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowsAssociated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowsAssociated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClvp(value: js.Any): Self = {
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
    def withImagesPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInGridFullRender(value: Boolean): Self = {
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
    def withIsPortalTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPortalTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWebEditorPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebEditorPreview")(value.asInstanceOf[js.Any])
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
    def withOnRefreshFailed(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefreshFailed")(js.Any.fromFunction3(value))
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
    def withQueryString(value: String): Self = {
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
    def withRootFolderForDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFolderForDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerEnabled(value: Boolean): Self = {
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
    def withWpq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wpq")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

