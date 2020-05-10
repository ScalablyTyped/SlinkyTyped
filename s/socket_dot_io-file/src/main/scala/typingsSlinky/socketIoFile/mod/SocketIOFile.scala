package typingsSlinky.socketIoFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketIOFile extends js.Object {
  def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit = js.native
}

object SocketIOFile {
  @scala.inline
  def apply(on: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Unit): SocketIOFile = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[SocketIOFile]
  }
  @scala.inline
  implicit class SocketIOFileOps[Self <: SocketIOFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

