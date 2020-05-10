package typingsSlinky.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileResult extends js.Object {
  var fd: Double = js.native
  var name: String = js.native
  def removeCallback(): Unit = js.native
}

object FileResult {
  @scala.inline
  def apply(fd: Double, name: String, removeCallback: () => Unit): FileResult = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
    __obj.asInstanceOf[FileResult]
  }
  @scala.inline
  implicit class FileResultOps[Self <: FileResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallback")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

