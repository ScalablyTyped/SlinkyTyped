package typingsSlinky.trufflePrivatekeyProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKeyProvider extends js.Object {
  def send(args: js.Any*): js.Any = js.native
  def sendAsync(args: js.Any*): Unit = js.native
}

object PrivateKeyProvider {
  @scala.inline
  def apply(send: /* repeated */ js.Any => js.Any, sendAsync: /* repeated */ js.Any => Unit): PrivateKeyProvider = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1(sendAsync))
    __obj.asInstanceOf[PrivateKeyProvider]
  }
  @scala.inline
  implicit class PrivateKeyProviderOps[Self <: PrivateKeyProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSend(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendAsync(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

