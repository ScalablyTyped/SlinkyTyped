package typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Address book information for a contact used by PhoneCallHistoryEntry objects. */
@js.native
trait PhoneCallHistoryEntryAddress extends js.Object {
  /** Gets or sets the unique identifier for this contact. */
  var contactId: String = js.native
  /** Get or sets the display name for this entry. */
  var displayName: String = js.native
  /** Gets or sets the address information for this contact. */
  var rawAddress: String = js.native
  /** Gets or sets the type of address indicated by RawAddress . */
  var rawAddressKind: PhoneCallHistoryEntryRawAddressKind = js.native
}

object PhoneCallHistoryEntryAddress {
  @scala.inline
  def apply(
    contactId: String,
    displayName: String,
    rawAddress: String,
    rawAddressKind: PhoneCallHistoryEntryRawAddressKind
  ): PhoneCallHistoryEntryAddress = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], rawAddress = rawAddress.asInstanceOf[js.Any], rawAddressKind = rawAddressKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallHistoryEntryAddress]
  }
  @scala.inline
  implicit class PhoneCallHistoryEntryAddressOps[Self <: PhoneCallHistoryEntryAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawAddressKind(value: PhoneCallHistoryEntryRawAddressKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawAddressKind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

