package typingsSlinky.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirResult extends js.Object {
  var name: String = js.native
  def removeCallback(): Unit = js.native
}

object DirResult {
  @scala.inline
  def apply(name: String, removeCallback: () => Unit): DirResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
    __obj.asInstanceOf[DirResult]
  }
  @scala.inline
  implicit class DirResultOps[Self <: DirResult] (val x: Self) extends AnyVal {
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
    def withRemoveCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCallback")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

