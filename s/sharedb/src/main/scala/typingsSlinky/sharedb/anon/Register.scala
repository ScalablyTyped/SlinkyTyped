package typingsSlinky.sharedb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Register extends js.Object {
  def register(`type`: Dictkey): Unit = js.native
}

object Register {
  @scala.inline
  def apply(register: Dictkey => Unit): Register = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[Register]
  }
  @scala.inline
  implicit class RegisterOps[Self <: Register] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegister(value: Dictkey => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

