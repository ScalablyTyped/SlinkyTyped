package typingsSlinky.signalr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  var name: String = js.native
  def supportsKeepAlive(): Boolean = js.native
}

object AnonName {
  @scala.inline
  def apply(name: String, supportsKeepAlive: () => Boolean): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
    __obj.asInstanceOf[AnonName]
  }
  @scala.inline
  implicit class AnonNameOps[Self <: AnonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsKeepAlive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsKeepAlive")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

