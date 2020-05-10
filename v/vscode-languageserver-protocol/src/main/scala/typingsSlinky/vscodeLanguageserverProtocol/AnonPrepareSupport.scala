package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrepareSupport extends js.Object {
  /**
    * Whether rename supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * Client supports testing for validity of rename operations
    * before execution.
    */
  var prepareSupport: js.UndefOr[Boolean] = js.native
}

object AnonPrepareSupport {
  @scala.inline
  def apply(): AnonPrepareSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPrepareSupport]
  }
  @scala.inline
  implicit class AnonPrepareSupportOps[Self <: AnonPrepareSupport] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPrepareSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepareSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareSupport")(js.undefined)
        ret
    }
  }
  
}

