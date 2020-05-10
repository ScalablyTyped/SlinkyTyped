package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardFieldSettings extends js.Object {
  /**
    * A collection of field information of additional fields on cards. The index in the collection signifies the order of the field among the additional fields. Currently unused. Should be used with User Story 691539: Card setting: additional fields
    */
  var additionalFields: js.Array[FieldInfo] = js.native
  /**
    * Display format for the assigned to field
    */
  var assignedToDisplayFormat: IdentityDisplayFormat = js.native
  /**
    * A collection of field information of rendered core fields on cards.
    */
  var coreFields: js.Array[FieldInfo] = js.native
  /**
    * Flag indicating whether to show assigned to field on cards. When true, AssignedToDisplayFormat will determine how the field will be displayed
    */
  var showAssignedTo: Boolean = js.native
  /**
    * Flag indicating whether to show empty fields on cards
    */
  var showEmptyFields: Boolean = js.native
  /**
    * Flag indicating whether to show ID on cards
    */
  var showId: Boolean = js.native
  /**
    * Flag indicating whether to show state field on cards
    */
  var showState: Boolean = js.native
  /**
    * Flag indicating whether to show tags on cards
    */
  var showTags: Boolean = js.native
}

object CardFieldSettings {
  @scala.inline
  def apply(
    additionalFields: js.Array[FieldInfo],
    assignedToDisplayFormat: IdentityDisplayFormat,
    coreFields: js.Array[FieldInfo],
    showAssignedTo: Boolean,
    showEmptyFields: Boolean,
    showId: Boolean,
    showState: Boolean,
    showTags: Boolean
  ): CardFieldSettings = {
    val __obj = js.Dynamic.literal(additionalFields = additionalFields.asInstanceOf[js.Any], assignedToDisplayFormat = assignedToDisplayFormat.asInstanceOf[js.Any], coreFields = coreFields.asInstanceOf[js.Any], showAssignedTo = showAssignedTo.asInstanceOf[js.Any], showEmptyFields = showEmptyFields.asInstanceOf[js.Any], showId = showId.asInstanceOf[js.Any], showState = showState.asInstanceOf[js.Any], showTags = showTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFieldSettings]
  }
  @scala.inline
  implicit class CardFieldSettingsOps[Self <: CardFieldSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalFields(value: js.Array[FieldInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignedToDisplayFormat(value: IdentityDisplayFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedToDisplayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoreFields(value: js.Array[FieldInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAssignedTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAssignedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowEmptyFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

