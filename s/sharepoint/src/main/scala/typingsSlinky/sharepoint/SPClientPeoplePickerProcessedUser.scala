package typingsSlinky.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SPClientPeoplePickerProcessedUser extends StObject {
  
  def BuildUserHTML(): String = js.native
  
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
  
  def ResolvedAsUnverifiedEmail(): String = js.native
  
  // null,
  var ResolvedUser: Boolean = js.native
  
  // '',
  var SID: String = js.native
  
  // '',
  var SIPAddress: String = js.native
  
  // true,
  var Suggestions: js.Array[ISPClientAutoFillData] = js.native
  
  // '',
  def UpdateResolvedUser(newUserInfo: ISPClientPeoplePickerEntity, strNewElementId: String): Unit = js.native
  
  def UpdateSuggestions(entity: ISPClientPeoplePickerEntity): Unit = js.native
  
  def UpdateUserMaxWidth(): Unit = js.native
  
  var UserContainerElementId: String = js.native
  
  // '',
  var UserInfo: ISPClientPeoplePickerEntity = js.native
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
  implicit class SPClientPeoplePickerProcessedUserMutableBuilder[Self <: SPClientPeoplePickerProcessedUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildUserHTML(value: () => String): Self = StObject.set(x, "BuildUserHTML", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteUserElementId(value: String): Self = StObject.set(x, "DeleteUserElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayElementId(value: String): Self = StObject.set(x, "DisplayElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDescription(value: String): Self = StObject.set(x, "ErrorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceElementId(value: String): Self = StObject.set(x, "PresenceElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveText(value: String): Self = StObject.set(x, "ResolveText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedAsUnverifiedEmail(value: () => String): Self = StObject.set(x, "ResolvedAsUnverifiedEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolvedUser(value: Boolean): Self = StObject.set(x, "ResolvedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSID(value: String): Self = StObject.set(x, "SID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIPAddress(value: String): Self = StObject.set(x, "SIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestions(value: js.Array[ISPClientAutoFillData]): Self = StObject.set(x, "Suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsVarargs(value: ISPClientAutoFillData*): Self = StObject.set(x, "Suggestions", js.Array(value :_*))
    
    @scala.inline
    def setUpdateResolvedUser(value: (ISPClientPeoplePickerEntity, String) => Unit): Self = StObject.set(x, "UpdateResolvedUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateSuggestions(value: ISPClientPeoplePickerEntity => Unit): Self = StObject.set(x, "UpdateSuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUserMaxWidth(value: () => Unit): Self = StObject.set(x, "UpdateUserMaxWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserContainerElementId(value: String): Self = StObject.set(x, "UserContainerElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: ISPClientPeoplePickerEntity): Self = StObject.set(x, "UserInfo", value.asInstanceOf[js.Any])
  }
}
