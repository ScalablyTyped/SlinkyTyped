package typingsSlinky.ssh2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fd extends js.Object {
  var fd: Double = js.native
}

object Fd {
  @scala.inline
  def apply(fd: Double): Fd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fd]
  }
  @scala.inline
  implicit class FdOps[Self <: Fd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

