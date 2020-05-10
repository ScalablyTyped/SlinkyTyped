package typingsSlinky.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaInView extends ListSchema {
  /** Key-value object that represents all aggregations defined for the view.
    Key specifies the field internal name, and value specifies the type of the aggregation. */
  var Aggregate: StringDictionary[String] = js.native
  /** Either "TRUE" or false (for grouping) */
  var Collapse: String = js.native
  /** Specifies whether to open items in a client application ("1") or in browser ("0"). */
  var DefaultItemOpen: String = js.native
  var Direction: String = js.native
  /** Either "0" or "1" */
  var EffectivePresenceEnabled: String = js.native
  /** If in grid mode (context.inGridMode == true), cast to FieldSchema_InForm[], otherwise cast to FieldSchema_InView[] */
  var FieldSortParam: String = js.native
  var Filter: js.Any = js.native
  /** Either "0" or "1" */
  var ForceCheckout: String = js.native
  /** "1" if the view contains "Title" field, otherwise not defined. */
  var HasTitle: String = js.native
  var HttpVDir: String = js.native
  /** Either "0" or "1" */
  var InplaceSearchEnabled: String = js.native
  /** Either "0" or "1" */
  var IsDocLib: String = js.native
  /** e.g. "1033" */
  var LCID: String = js.native
  /** Either "0" or "1" */
  var ListRight_AddListItems: String = js.native
  var NoListItem: String = js.native
  var NoListItemHowTo: String = js.native
  /** Server-relative path to the current page */
  var PagePath: String = js.native
  /** Internal name of the field inside which the hierarchy buttons are displayed */
  var ParentHierarchyDisplayField: String = js.native
  var PresenceAlt: String = js.native
  /** Represents SPList.RootFolder.Properties. Exists only if SPList.FetchPropertyBagForListView property is set to true. */
  var PropertyBag: StringDictionary[String] = js.native
  /** Either "True" or "False" */
  var RenderSaveAsNewViewButton: String = js.native
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenu: String = js.native
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenuAsync: String = js.native
  /** Query string parameters that specify GUID of the current view and the current root folder */
  var RootFolderParam: String = js.native
  var SelectedID: String = js.native
   // number
  var ShowWebPart: String = js.native
  /** Either "1" or undefined. */
  var StrikeThroughOnCompletedEnabled: String = js.native
  /** Either "0" or "1" */
  var TabularView: String = js.native
  var Toolbar: String = js.native
  var UIVersion: String = js.native
  /** Either "1" or "" */
  var UseParentHierarchy: String = js.native
  /** Server relative path to "/_layouts/userdisp.aspx" in the current web */
  var UserDispUrl: String = js.native
   // number
  var UserVanilla: js.Any = js.native
   // number
  var Userid: String = js.native
  /** Guid of the view */
  var View: String = js.native
  /** JSON string */
  var ViewSelectorPivotMenuOptions: String = js.native
  /** Query string parameters that specify current root folder (RootFolder) and folder content type id (FolderCTID) */
  var ViewSelector_ViewParameters: String = js.native
  /** Internal name for the first group by field, if any */
  var group1: String = js.native
  /** Internal name for the second group by field, if any */
  var group2: String = js.native
}

object ListSchemaInView {
  @scala.inline
  def apply(
    Aggregate: StringDictionary[String],
    Collapse: String,
    DefaultItemOpen: String,
    Direction: String,
    EffectivePresenceEnabled: String,
    Field: js.Array[FieldSchema],
    FieldSortParam: String,
    Filter: js.Any,
    ForceCheckout: String,
    HasTitle: String,
    HttpVDir: String,
    InplaceSearchEnabled: String,
    IsDocLib: String,
    LCID: String,
    ListRight_AddListItems: String,
    NoListItem: String,
    NoListItemHowTo: String,
    PagePath: String,
    ParentHierarchyDisplayField: String,
    PresenceAlt: String,
    PropertyBag: StringDictionary[String],
    RenderSaveAsNewViewButton: String,
    RenderViewSelectorPivotMenu: String,
    RenderViewSelectorPivotMenuAsync: String,
    RootFolderParam: String,
    SelectedID: String,
    ShowWebPart: String,
    StrikeThroughOnCompletedEnabled: String,
    TabularView: String,
    Toolbar: String,
    UIVersion: String,
    UseParentHierarchy: String,
    UserDispUrl: String,
    UserVanilla: js.Any,
    Userid: String,
    View: String,
    ViewSelectorPivotMenuOptions: String,
    ViewSelector_ViewParameters: String,
    group1: String,
    group2: String
  ): ListSchemaInView = {
    val __obj = js.Dynamic.literal(Aggregate = Aggregate.asInstanceOf[js.Any], Collapse = Collapse.asInstanceOf[js.Any], DefaultItemOpen = DefaultItemOpen.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], EffectivePresenceEnabled = EffectivePresenceEnabled.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], FieldSortParam = FieldSortParam.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], ForceCheckout = ForceCheckout.asInstanceOf[js.Any], HasTitle = HasTitle.asInstanceOf[js.Any], HttpVDir = HttpVDir.asInstanceOf[js.Any], InplaceSearchEnabled = InplaceSearchEnabled.asInstanceOf[js.Any], IsDocLib = IsDocLib.asInstanceOf[js.Any], LCID = LCID.asInstanceOf[js.Any], ListRight_AddListItems = ListRight_AddListItems.asInstanceOf[js.Any], NoListItem = NoListItem.asInstanceOf[js.Any], NoListItemHowTo = NoListItemHowTo.asInstanceOf[js.Any], PagePath = PagePath.asInstanceOf[js.Any], ParentHierarchyDisplayField = ParentHierarchyDisplayField.asInstanceOf[js.Any], PresenceAlt = PresenceAlt.asInstanceOf[js.Any], PropertyBag = PropertyBag.asInstanceOf[js.Any], RenderSaveAsNewViewButton = RenderSaveAsNewViewButton.asInstanceOf[js.Any], RenderViewSelectorPivotMenu = RenderViewSelectorPivotMenu.asInstanceOf[js.Any], RenderViewSelectorPivotMenuAsync = RenderViewSelectorPivotMenuAsync.asInstanceOf[js.Any], RootFolderParam = RootFolderParam.asInstanceOf[js.Any], SelectedID = SelectedID.asInstanceOf[js.Any], ShowWebPart = ShowWebPart.asInstanceOf[js.Any], StrikeThroughOnCompletedEnabled = StrikeThroughOnCompletedEnabled.asInstanceOf[js.Any], TabularView = TabularView.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any], UIVersion = UIVersion.asInstanceOf[js.Any], UseParentHierarchy = UseParentHierarchy.asInstanceOf[js.Any], UserDispUrl = UserDispUrl.asInstanceOf[js.Any], UserVanilla = UserVanilla.asInstanceOf[js.Any], Userid = Userid.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], ViewSelectorPivotMenuOptions = ViewSelectorPivotMenuOptions.asInstanceOf[js.Any], ViewSelector_ViewParameters = ViewSelector_ViewParameters.asInstanceOf[js.Any], group1 = group1.asInstanceOf[js.Any], group2 = group2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaInView]
  }
  @scala.inline
  implicit class ListSchemaInViewOps[Self <: ListSchemaInView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregate(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultItemOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultItemOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectivePresenceEnabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectivePresenceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldSortParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldSortParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceCheckout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceCheckout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpVDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpVDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInplaceSearchEnabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InplaceSearchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDocLib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDocLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLCID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LCID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRight_AddListItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListRight_AddListItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoListItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoListItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoListItemHowTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoListItemHowTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentHierarchyDisplayField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentHierarchyDisplayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresenceAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresenceAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyBag(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyBag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderSaveAsNewViewButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderSaveAsNewViewButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderViewSelectorPivotMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderViewSelectorPivotMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderViewSelectorPivotMenuAsync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderViewSelectorPivotMenuAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFolderParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootFolderParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowWebPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowWebPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeThroughOnCompletedEnabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrikeThroughOnCompletedEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabularView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabularView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUIVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseParentHierarchy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseParentHierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDispUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDispUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserVanilla(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserVanilla")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Userid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewSelectorPivotMenuOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewSelectorPivotMenuOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewSelector_ViewParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewSelector_ViewParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

