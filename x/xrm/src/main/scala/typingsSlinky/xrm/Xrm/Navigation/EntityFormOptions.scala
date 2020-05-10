package typingsSlinky.xrm.Xrm.Navigation

import typingsSlinky.xrm.Xrm.LookupValue
import typingsSlinky.xrm.Xrm.Url.NavBarDisplay
import typingsSlinky.xrm.XrmEnum.WindowPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity form options for opening the form
  */
@js.native
trait EntityFormOptions extends js.Object {
  /**
    * Indicates whether to display the command bar.If you do not specify this parameter, the command bar is displayed by default.
    */
  var cmdbar: js.UndefOr[Boolean] = js.native
  /**
    * Designates a record that will provide default values based on mapped attribute values.The lookup object has the following String properties: entityType, id, and name (optional).
    */
  var createFromEntity: js.UndefOr[LookupValue] = js.native
  /**
    * ID of the entity record to display the form for.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Logical name of the entity to display the form for.
    */
  var entityName: js.UndefOr[String] = js.native
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[String] = js.native
  /**
    * Height of the form window to be displayed in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Undocumented at this time
    */
  var isCrossEntityNavigate: js.UndefOr[Boolean] = js.native
  /**
    * Undocumented at this time
    */
  var isOfflineSyncError: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether the navigation bar is displayed and whether application navigation is available using the areas and subareas defined in the sitemap.Valid vlaues are: "on", "off", or "entity".
    * * on: The navigation bar is displayed.This is the default behavior if the navBar parameter is not used.
    * * off: The navigation bar is not displayed.People can navigate using other user interface elements or the back and forward buttons.
    * * entity: On an entity form, only the navigation options for related entities are available.After navigating to a related entity, a back button is displayed in the navigation bar to allow returning to the original record.
    */
  var navBar: js.UndefOr[NavBarDisplay] = js.native
  /**
    * Indicates whether to display form in a new window.
    */
  var openInNewWindow: js.UndefOr[Boolean] = js.native
  /**
    * ID of the business process to be displayed on the form.
    */
  var processId: js.UndefOr[String] = js.native
  /**
    * ID of the business process instance to be displayed on the form.
    */
  var processInstanceId: js.UndefOr[String] = js.native
  /**
    * Define a relationship object to display the related records on the form.
    */
  var relationship: js.UndefOr[Relationship] = js.native
  /**
    * ID of the selected stage in business process instance.
    */
  var selectedStageId: js.UndefOr[String] = js.native
  /**
    * Indicates whether to open a quick create form.
    */
  var useQuickCreateForm: js.UndefOr[Boolean] = js.native
  /**
    * Width of the form window to be displayed in pixels.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Specify one of the following values for the window position of the form on the screen:
    * * 1:center
    * * 2:side
    */
  var windowPosition: js.UndefOr[WindowPositions] = js.native
}

object EntityFormOptions {
  @scala.inline
  def apply(): EntityFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityFormOptions]
  }
  @scala.inline
  implicit class EntityFormOptionsOps[Self <: EntityFormOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmdbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmdbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdbar")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFromEntity(value: LookupValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFromEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCrossEntityNavigate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCrossEntityNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCrossEntityNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCrossEntityNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOfflineSyncError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOfflineSyncError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOfflineSyncError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOfflineSyncError")(js.undefined)
        ret
    }
    @scala.inline
    def withNavBar(value: NavBarDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBar")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenInNewWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenInNewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processInstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationship(value: Relationship): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStageId")(js.undefined)
        ret
    }
    @scala.inline
    def withUseQuickCreateForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuickCreateForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseQuickCreateForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuickCreateForm")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowPosition(value: WindowPositions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(js.undefined)
        ret
    }
  }
  
}

