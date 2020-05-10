package typingsSlinky.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingWebhooks[T] extends js.Object {
  var calls: js.Array[OutgoingWebhookCall[T]] = js.native
  def reset(): Unit = js.native
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[Unit] = js.native
}

object OutgoingWebhooks {
  @scala.inline
  def apply[T](
    calls: js.Array[OutgoingWebhookCall[T]],
    reset: () => Unit,
    send: (OutgoingWebhookUrl, T) => js.Promise[Unit]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
  @scala.inline
  implicit class OutgoingWebhooksOps[Self[t] <: OutgoingWebhooks[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCalls(value: js.Array[OutgoingWebhookCall[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSend(value: (OutgoingWebhookUrl, T) => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

