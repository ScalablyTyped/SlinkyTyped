package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSStream extends js.Object {
  val `type`: java.lang.String = js.native
  def msClose(): Unit = js.native
  def msDetachStream(): js.Any = js.native
}

object MSStream {
  @scala.inline
  def apply(msClose: () => Unit, msDetachStream: () => js.Any, `type`: java.lang.String): MSStream = {
    val __obj = js.Dynamic.literal(msClose = js.Any.fromFunction0(msClose), msDetachStream = js.Any.fromFunction0(msDetachStream))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSStream]
  }
  @scala.inline
  implicit class MSStreamOps[Self <: MSStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMsDetachStream(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msDetachStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

