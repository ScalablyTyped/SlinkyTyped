package typingsSlinky.vastClient.mod

import typingsSlinky.vastClient.AnonTimeout
import typingsSlinky.vastClient.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VASTClientUrlHandler extends js.Object {
  def get(url: String, options: AnonTimeout, cb: FnCall): Unit = js.native
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (String, AnonTimeout, FnCall) => Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
  @scala.inline
  implicit class VASTClientUrlHandlerOps[Self <: VASTClientUrlHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, AnonTimeout, FnCall) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

