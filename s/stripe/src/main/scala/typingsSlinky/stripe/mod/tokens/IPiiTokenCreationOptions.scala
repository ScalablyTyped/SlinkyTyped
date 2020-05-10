package typingsSlinky.stripe.mod.tokens

import typingsSlinky.stripe.AnonPersonalidnumber
import typingsSlinky.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPiiTokenCreationOptions extends IDataOptions {
  var pii: AnonPersonalidnumber = js.native
}

object IPiiTokenCreationOptions {
  @scala.inline
  def apply(pii: AnonPersonalidnumber): IPiiTokenCreationOptions = {
    val __obj = js.Dynamic.literal(pii = pii.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPiiTokenCreationOptions]
  }
  @scala.inline
  implicit class IPiiTokenCreationOptionsOps[Self <: IPiiTokenCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPii(value: AnonPersonalidnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pii")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

