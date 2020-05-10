package typingsSlinky.twitterStreamChannels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemoveAllListeners extends js.Object {
  var removeAllListeners: Boolean = js.native
}

object AnonRemoveAllListeners {
  @scala.inline
  def apply(removeAllListeners: Boolean): AnonRemoveAllListeners = {
    val __obj = js.Dynamic.literal(removeAllListeners = removeAllListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoveAllListeners]
  }
  @scala.inline
  implicit class AnonRemoveAllListenersOps[Self <: AnonRemoveAllListeners] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveAllListeners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllListeners")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

