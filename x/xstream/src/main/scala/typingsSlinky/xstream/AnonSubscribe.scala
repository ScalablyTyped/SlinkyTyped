package typingsSlinky.xstream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubscribe extends js.Object {
  var subscribe: js.Any = js.native
}

object AnonSubscribe {
  @scala.inline
  def apply(subscribe: js.Any): AnonSubscribe = {
    val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubscribe]
  }
  @scala.inline
  implicit class AnonSubscribeOps[Self <: AnonSubscribe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribe(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

