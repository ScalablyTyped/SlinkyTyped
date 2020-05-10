package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactInformation extends js.Object {
  var customFields: IVectorView[ContactField] = js.native
  var emails: IVectorView[ContactField] = js.native
  var instantMessages: IVectorView[ContactInstantMessageField] = js.native
  var locations: IVectorView[ContactLocationField] = js.native
  var name: String = js.native
  var phoneNumbers: IVectorView[ContactField] = js.native
  def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  def queryCustomFields(customName: String): IVectorView[ContactField] = js.native
}

object IContactInformation {
  @scala.inline
  def apply(
    customFields: IVectorView[ContactField],
    emails: IVectorView[ContactField],
    getThumbnailAsync: () => IAsyncOperation[IRandomAccessStreamWithContentType],
    instantMessages: IVectorView[ContactInstantMessageField],
    locations: IVectorView[ContactLocationField],
    name: String,
    phoneNumbers: IVectorView[ContactField],
    queryCustomFields: String => IVectorView[ContactField]
  ): IContactInformation = {
    val __obj = js.Dynamic.literal(customFields = customFields.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), instantMessages = instantMessages.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], queryCustomFields = js.Any.fromFunction1(queryCustomFields))
    __obj.asInstanceOf[IContactInformation]
  }
  @scala.inline
  implicit class IContactInformationOps[Self <: IContactInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomFields(value: IVectorView[ContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmails(value: IVectorView[ContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetThumbnailAsync(value: () => IAsyncOperation[IRandomAccessStreamWithContentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThumbnailAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstantMessages(value: IVectorView[ContactInstantMessageField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocations(value: IVectorView[ContactLocationField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumbers(value: IVectorView[ContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryCustomFields(value: String => IVectorView[ContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCustomFields")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

