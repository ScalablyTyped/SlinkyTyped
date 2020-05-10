package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpOptions extends js.Object {
  /**
    * The characters that trigger signature help
    * automatically.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.native
}

object SignatureHelpOptions {
  @scala.inline
  def apply(): SignatureHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpOptions]
  }
  @scala.inline
  implicit class SignatureHelpOptionsOps[Self <: SignatureHelpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerCharacters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacters")(js.undefined)
        ret
    }
  }
  
}

