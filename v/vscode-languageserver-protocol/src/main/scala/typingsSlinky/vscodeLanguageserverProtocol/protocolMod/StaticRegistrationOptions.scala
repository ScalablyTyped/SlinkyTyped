package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticRegistrationOptions extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again. See also Registration#id.
    */
  var id: js.UndefOr[String] = js.native
}

object StaticRegistrationOptions {
  @scala.inline
  def apply(): StaticRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRegistrationOptions]
  }
  @scala.inline
  implicit class StaticRegistrationOptionsOps[Self <: StaticRegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

