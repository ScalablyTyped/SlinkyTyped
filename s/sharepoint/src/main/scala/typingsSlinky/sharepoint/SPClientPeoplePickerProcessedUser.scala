package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPClientPeoplePickerProcessedUser extends js.Object {
   // '',
  var DeleteUserElementId: String = js.native
   // '',
  var DisplayElementId: String = js.native
   // '',
  var DisplayName: String = js.native
   // null,
  var ErrorDescription: String = js.native
   // '',
  var PresenceElementId: String = js.native
   // '',
  var ResolveText: String = js.native
   // null,
  var ResolvedUser: Boolean = js.native
   // '',
  var SID: String = js.native
   // '',
  var SIPAddress: String = js.native
   // true,
  var Suggestions: js.Array[ISPClientAutoFillData] = js.native
  var UserContainerElementId: String = js.native
   // '',
  var UserInfo: ISPClientPeoplePickerEntity = js.native
  def BuildUserHTML(): String = js.native
  def ResolvedAsUnverifiedEmail(): String = js.native
   // '',
  def UpdateResolvedUser(newUserInfo: ISPClientPeoplePickerEntity, strNewElementId: String): Unit = js.native
  def UpdateSuggestions(entity: ISPClientPeoplePickerEntity): Unit = js.native
  def UpdateUserMaxWidth(): Unit = js.native
}

object SPClientPeoplePickerProcessedUser {
  @scala.inline
  def apply(
    BuildUserHTML: () => String,
    DeleteUserElementId: String,
    DisplayElementId: String,
    DisplayName: String,
    ErrorDescription: String,
    PresenceElementId: String,
    ResolveText: String,
    ResolvedAsUnverifiedEmail: () => String,
    ResolvedUser: Boolean,
    SID: String,
    SIPAddress: String,
    Suggestions: js.Array[ISPClientAutoFillData],
    UpdateResolvedUser: (ISPClientPeoplePickerEntity, String) => Unit,
    UpdateSuggestions: ISPClientPeoplePickerEntity => Unit,
    UpdateUserMaxWidth: () => Unit,
    UserContainerElementId: String,
    UserInfo: ISPClientPeoplePickerEntity
  ): SPClientPeoplePickerProcessedUser = {
    val __obj = js.Dynamic.literal(BuildUserHTML = js.Any.fromFunction0(BuildUserHTML), DeleteUserElementId = DeleteUserElementId.asInstanceOf[js.Any], DisplayElementId = DisplayElementId.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ErrorDescription = ErrorDescription.asInstanceOf[js.Any], PresenceElementId = PresenceElementId.asInstanceOf[js.Any], ResolveText = ResolveText.asInstanceOf[js.Any], ResolvedAsUnverifiedEmail = js.Any.fromFunction0(ResolvedAsUnverifiedEmail), ResolvedUser = ResolvedUser.asInstanceOf[js.Any], SID = SID.asInstanceOf[js.Any], SIPAddress = SIPAddress.asInstanceOf[js.Any], Suggestions = Suggestions.asInstanceOf[js.Any], UpdateResolvedUser = js.Any.fromFunction2(UpdateResolvedUser), UpdateSuggestions = js.Any.fromFunction1(UpdateSuggestions), UpdateUserMaxWidth = js.Any.fromFunction0(UpdateUserMaxWidth), UserContainerElementId = UserContainerElementId.asInstanceOf[js.Any], UserInfo = UserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SPClientPeoplePickerProcessedUser]
  }
  @scala.inline
  implicit class SPClientPeoplePickerProcessedUserOps[Self <: SPClientPeoplePickerProcessedUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildUserHTML(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildUserHTML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteUserElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteUserElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresenceElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresenceElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolveText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedAsUnverifiedEmail(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedAsUnverifiedEmail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolvedUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[ISPClientAutoFillData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateResolvedUser(value: (ISPClientPeoplePickerEntity, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateResolvedUser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateSuggestions(value: ISPClientPeoplePickerEntity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateSuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateUserMaxWidth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateUserMaxWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserContainerElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserContainerElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfo(value: ISPClientPeoplePickerEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

