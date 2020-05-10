package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactPicker extends js.Object {
  var commitButtonText: String = js.native
  var desiredFields: IVector[String] = js.native
  var selectionMode: ContactSelectionMode = js.native
  def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[ContactInformation]] = js.native
  def pickSingleContactAsync(): IAsyncOperation[ContactInformation] = js.native
}

object IContactPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    pickMultipleContactsAsync: () => IAsyncOperation[IVectorView[ContactInformation]],
    pickSingleContactAsync: () => IAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): IContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPicker]
  }
  @scala.inline
  implicit class IContactPickerOps[Self <: IContactPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredFields(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickMultipleContactsAsync(value: () => IAsyncOperation[IVectorView[ContactInformation]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickMultipleContactsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickSingleContactAsync(value: () => IAsyncOperation[ContactInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSingleContactAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectionMode(value: ContactSelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

