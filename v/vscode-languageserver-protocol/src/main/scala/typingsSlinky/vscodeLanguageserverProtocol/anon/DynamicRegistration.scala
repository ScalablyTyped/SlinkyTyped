package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicRegistration extends js.Object {
  /**
    * Whether document link supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}

object DynamicRegistration {
  @scala.inline
  def apply(): DynamicRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicRegistration]
  }
  @scala.inline
  implicit class DynamicRegistrationOps[Self <: DynamicRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(js.undefined)
        ret
    }
  }
  
}

