package typingsSlinky.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDescriptor extends js.Object {
  var name: String = js.native
  def callback(args: js.Any*): Unit = js.native
  def un(): Unit = js.native
}

object ListenerDescriptor {
  @scala.inline
  def apply(callback: /* repeated */ js.Any => Unit, name: String, un: () => Unit): ListenerDescriptor = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name.asInstanceOf[js.Any], un = js.Any.fromFunction0(un))
    __obj.asInstanceOf[ListenerDescriptor]
  }
  @scala.inline
  implicit class ListenerDescriptorOps[Self <: ListenerDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("un")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

