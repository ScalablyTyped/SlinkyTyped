package typingsSlinky.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user data account used to access email, contacts, calendars, and so on. */
@js.native
trait UserDataAccount extends js.Object {
  /** Gets the unique identifier for the type of the account. */
  var deviceAccountTypeId: String = js.native
  /** Gets the enterprise identity associated with the user account. */
  var enterpriseId: String = js.native
  /** Gets the icon associated with the UserDataAccount . */
  var icon: IRandomAccessStreamReference = js.native
  /** Gets a string that uniquely identifies the UserDataAccount on the local device. */
  var id: String = js.native
  /** Gets a Boolean value indicating if the user account data is encrypted when the device becomes locked. */
  var isProtectedUnderLock: Boolean = js.native
  /** Gets or sets a value indicating whether other apps on the device have read access to the UserDataAccount . */
  var otherAppReadAccess: UserDataAccountOtherAppReadAccess = js.native
  /** Gets the unique identifier for the app package that created the UserDataAccount . */
  var packageFamilyName: String = js.native
  /** Gets or sets a user name associated with the UserDataAccount that is suitable for displaying. */
  var userDisplayName: String = js.native
  /**
    * Asynchronously deletes all the contact, calendar and email data associated with the account.
    * @return An async action indicating success or failure.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Returns a collection of AppointmentCalendar instances associated with the UserDataAccount .
    * @return A collection of AppointmentCalendar instances associated with the UserDataAccount .
    */
  def findAppointmentCalendarsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a collection of ContactAnnotationList instances associated with the UserDataAccount .
    * @return A collection of ContactAnnotationList instances associated with the UserDataAccount .
    */
  def findContactAnnotationListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a collection of ContactList instances associated with the UserDataAccount .
    * @return A collection of ContactList instances associated with the UserDataAccount .
    */
  def findContactListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a collection of EmailMailbox instances associated with the UserDataAccount .
    * @return A collection of EmailMailbox instances associated with the UserDataAccount .
    */
  def findEmailMailboxesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously persists the UserDataAccount to the database.
    * @return Async action that indicates completion of the save operation.
    */
  def saveAsync(): IPromiseWithIAsyncAction = js.native
}

object UserDataAccount {
  @scala.inline
  def apply(
    deleteAsync: () => IPromiseWithIAsyncAction,
    deviceAccountTypeId: String,
    enterpriseId: String,
    findAppointmentCalendarsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findContactAnnotationListsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findContactListsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findEmailMailboxesAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    icon: IRandomAccessStreamReference,
    id: String,
    isProtectedUnderLock: Boolean,
    otherAppReadAccess: UserDataAccountOtherAppReadAccess,
    packageFamilyName: String,
    saveAsync: () => IPromiseWithIAsyncAction,
    userDisplayName: String
  ): UserDataAccount = {
    val __obj = js.Dynamic.literal(deleteAsync = js.Any.fromFunction0(deleteAsync), deviceAccountTypeId = deviceAccountTypeId.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], findAppointmentCalendarsAsync = js.Any.fromFunction0(findAppointmentCalendarsAsync), findContactAnnotationListsAsync = js.Any.fromFunction0(findContactAnnotationListsAsync), findContactListsAsync = js.Any.fromFunction0(findContactListsAsync), findEmailMailboxesAsync = js.Any.fromFunction0(findEmailMailboxesAsync), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isProtectedUnderLock = isProtectedUnderLock.asInstanceOf[js.Any], otherAppReadAccess = otherAppReadAccess.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any], saveAsync = js.Any.fromFunction0(saveAsync), userDisplayName = userDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDataAccount]
  }
  @scala.inline
  implicit class UserDataAccountOps[Self <: UserDataAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeviceAccountTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterpriseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindAppointmentCalendarsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAppointmentCalendarsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindContactAnnotationListsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findContactAnnotationListsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindContactListsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findContactListsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindEmailMailboxesAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findEmailMailboxesAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIcon(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsProtectedUnderLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProtectedUnderLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherAppReadAccess(value: UserDataAccountOtherAppReadAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherAppReadAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

