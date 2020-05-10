package typingsSlinky.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRegister extends js.Object {
  def register(`type`: AnonDictkey): Unit = js.native
}

object AnonRegister {
  @scala.inline
  def apply(register: AnonDictkey => Unit): AnonRegister = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[AnonRegister]
  }
  @scala.inline
  implicit class AnonRegisterOps[Self <: AnonRegister] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegister(value: AnonDictkey => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

