package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads a batch of email conversations. */
@js.native
trait EmailConversationReader extends js.Object {
  /**
    * Asynchronously reads a batch of email conversations.
    * @return Returns a batch of email conversations.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailConversationBatch] = js.native
}

object EmailConversationReader {
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[EmailConversationBatch]): EmailConversationReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailConversationReader]
  }
  @scala.inline
  implicit class EmailConversationReaderOps[Self <: EmailConversationReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadBatchAsync(value: () => IPromiseWithIAsyncOperation[EmailConversationBatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBatchAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

