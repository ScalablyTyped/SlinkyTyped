package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for reading and accepting message change revisions. */
@js.native
trait ChatMessageChangeReader extends js.Object {
  /** Accepts all the changes up to and including the latest change to the message. */
  def acceptChanges(): Unit = js.native
  /**
    * Accepts all the changes up to a specified change.
    * @param lastChangeToAcknowledge The last change to acknowledge.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: ChatMessageChange): Unit = js.native
  /**
    * Returns a batch list of chat message change objects from the message store’s change tracker.
    * @return An asynchronous operation that returns a list of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

object ChatMessageChangeReader {
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: ChatMessageChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]
  ): ChatMessageChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[ChatMessageChangeReader]
  }
  @scala.inline
  implicit class ChatMessageChangeReaderOps[Self <: ChatMessageChangeReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAcceptChangesThrough(value: ChatMessageChange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptChangesThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBatchAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

