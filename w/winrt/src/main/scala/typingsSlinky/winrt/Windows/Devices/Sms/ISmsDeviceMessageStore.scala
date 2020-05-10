package typingsSlinky.winrt.Windows.Devices.Sms

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsDeviceMessageStore extends js.Object {
  var maxMessages: Double = js.native
  def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction = js.native
  def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
  def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
}

object ISmsDeviceMessageStore {
  @scala.inline
  def apply(
    deleteMessageAsync: Double => IAsyncAction,
    deleteMessagesAsync: SmsMessageFilter => IAsyncAction,
    getMessageAsync: Double => IAsyncOperation[ISmsMessage],
    getMessagesAsync: SmsMessageFilter => IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double],
    maxMessages: Double
  ): ISmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteMessagesAsync = js.Any.fromFunction1(deleteMessagesAsync), getMessageAsync = js.Any.fromFunction1(getMessageAsync), getMessagesAsync = js.Any.fromFunction1(getMessagesAsync), maxMessages = maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsDeviceMessageStore]
  }
  @scala.inline
  implicit class ISmsDeviceMessageStoreOps[Self <: ISmsDeviceMessageStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteMessageAsync(value: Double => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMessageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteMessagesAsync(value: SmsMessageFilter => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMessagesAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMessageAsync(value: Double => IAsyncOperation[ISmsMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMessagesAsync(value: SmsMessageFilter => IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessagesAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaxMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

