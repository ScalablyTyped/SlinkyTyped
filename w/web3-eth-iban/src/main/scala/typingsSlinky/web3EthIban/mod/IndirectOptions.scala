package typingsSlinky.web3EthIban.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndirectOptions extends js.Object {
  var identifier: String = js.native
  var institution: String = js.native
}

object IndirectOptions {
  @scala.inline
  def apply(identifier: String, institution: String): IndirectOptions = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndirectOptions]
  }
  @scala.inline
  implicit class IndirectOptionsOps[Self <: IndirectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstitution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

