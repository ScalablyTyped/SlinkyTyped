package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUssdSession extends js.Object {
  def close(): Unit = js.native
  def sendMessageAndGetReplyAsync(message: UssdMessage): IAsyncOperation[UssdReply] = js.native
}

object IUssdSession {
  @scala.inline
  def apply(close: () => Unit, sendMessageAndGetReplyAsync: UssdMessage => IAsyncOperation[UssdReply]): IUssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
    __obj.asInstanceOf[IUssdSession]
  }
  @scala.inline
  implicit class IUssdSessionOps[Self <: IUssdSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSendMessageAndGetReplyAsync(value: UssdMessage => IAsyncOperation[UssdReply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageAndGetReplyAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

