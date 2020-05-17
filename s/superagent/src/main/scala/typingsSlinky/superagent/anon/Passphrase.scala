package typingsSlinky.superagent.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Passphrase extends js.Object {
  var passphrase: String = js.native
  var pfx: String | Buffer = js.native
}

object Passphrase {
  @scala.inline
  def apply(passphrase: String, pfx: String | Buffer): Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passphrase]
  }
  @scala.inline
  implicit class PassphraseOps[Self <: Passphrase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPfx(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

