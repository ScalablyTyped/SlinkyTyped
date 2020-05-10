package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents field schema in a list view. */
@js.native
trait FieldSchemaInView extends FieldSchema {
  /** Either "TRUE" or "FALSE" */
  var CalloutMenu: String = js.native
  var ClassInfo: String = js.native
  var DisplayName: String = js.native
  /** Either "TRUE" or "FALSE" */
  var Explicit: String = js.native
  var FieldTitle: String = js.native
  /** Indicates whether the field can be filtered. Either "TRUE" or "FALSE" */
  var Filterable: String = js.native
  /** Either "TRUE" or "FALSE" */
  var GridActiveAndReadOnly: String = js.native
  /** Set to "TRUE" for fields that comply to the following Xpath query:
    ViewFields/FieldRef[@Explicit='TRUE'] | Query/GroupBy/FieldRef[not(@Name=ViewFields/FieldRef/@Name)] */
  var GroupField: String = js.native
  /** Guid of the field */
  var ID: String = js.native
  /** Either "TRUE" or "FALSE" */
  var ReadOnly: String = js.native
  var RealFieldName: String = js.native
  var ResultType: String = js.native
  /** Indicates whether the field can be sorted. Either "TRUE" or "FALSE" */
  var Sortable: String = js.native
   // e.g. "Menu"
  var css: String = js.native
  var fieldRenderer: js.Any = js.native
  /** Specifies if the field contains list item menu.
    Corresponds to ViewFields/FieldRef/@ListItemMenu attribute. Either "TRUE" or "FALSE" and might be missing. */
  var listItemMenu: String = js.native
}

object FieldSchemaInView {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    CalloutMenu: String,
    ClassInfo: String,
    DisplayName: String,
    Explicit: String,
    FieldTitle: String,
    FieldType: String,
    Filterable: String,
    GridActiveAndReadOnly: String,
    GroupField: String,
    ID: String,
    Name: String,
    ReadOnly: String,
    RealFieldName: String,
    ResultType: String,
    Sortable: String,
    Type: String,
    css: String,
    fieldRenderer: js.Any,
    listItemMenu: String
  ): FieldSchemaInView = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], CalloutMenu = CalloutMenu.asInstanceOf[js.Any], ClassInfo = ClassInfo.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Explicit = Explicit.asInstanceOf[js.Any], FieldTitle = FieldTitle.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Filterable = Filterable.asInstanceOf[js.Any], GridActiveAndReadOnly = GridActiveAndReadOnly.asInstanceOf[js.Any], GroupField = GroupField.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealFieldName = RealFieldName.asInstanceOf[js.Any], ResultType = ResultType.asInstanceOf[js.Any], Sortable = Sortable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], fieldRenderer = fieldRenderer.asInstanceOf[js.Any], listItemMenu = listItemMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInView]
  }
  @scala.inline
  implicit class FieldSchemaInViewOps[Self <: FieldSchemaInView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalloutMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExplicit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Explicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridActiveAndReadOnly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridActiveAndReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RealFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItemMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemMenu")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

