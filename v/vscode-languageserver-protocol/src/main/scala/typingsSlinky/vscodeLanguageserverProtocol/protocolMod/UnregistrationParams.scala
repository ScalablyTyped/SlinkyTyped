package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnregistrationParams extends js.Object {
  var unregisterations: js.Array[Unregistration] = js.native
}

object UnregistrationParams {
  @scala.inline
  def apply(unregisterations: js.Array[Unregistration]): UnregistrationParams = {
    val __obj = js.Dynamic.literal(unregisterations = unregisterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregistrationParams]
  }
  @scala.inline
  implicit class UnregistrationParamsOps[Self <: UnregistrationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnregisterations(value: js.Array[Unregistration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

