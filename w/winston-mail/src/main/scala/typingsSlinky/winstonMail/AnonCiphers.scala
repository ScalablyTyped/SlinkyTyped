package typingsSlinky.winstonMail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCiphers extends js.Object {
  var ciphers: String = js.native
}

object AnonCiphers {
  @scala.inline
  def apply(ciphers: String): AnonCiphers = {
    val __obj = js.Dynamic.literal(ciphers = ciphers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCiphers]
  }
  @scala.inline
  implicit class AnonCiphersOps[Self <: AnonCiphers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCiphers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

