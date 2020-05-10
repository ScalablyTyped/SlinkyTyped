package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowSessionStorage extends js.Object {
  val sessionStorage: org.scalajs.dom.raw.Storage = js.native
}

object WindowSessionStorage {
  @scala.inline
  def apply(sessionStorage: org.scalajs.dom.raw.Storage): WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSessionStorage]
  }
  @scala.inline
  implicit class WindowSessionStorageOps[Self <: org.scalajs.dom.raw.WindowSessionStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionStorage(value: org.scalajs.dom.raw.Storage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionStorage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

