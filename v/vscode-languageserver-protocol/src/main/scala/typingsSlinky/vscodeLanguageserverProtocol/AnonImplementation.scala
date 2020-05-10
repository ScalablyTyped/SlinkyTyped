package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImplementation extends js.Object {
  /**
    * Capabilities specific to the `textDocument/implementation`
    */
  var implementation: js.UndefOr[AnonLinkSupport] = js.native
}

object AnonImplementation {
  @scala.inline
  def apply(): AnonImplementation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonImplementation]
  }
  @scala.inline
  implicit class AnonImplementationOps[Self <: AnonImplementation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplementation(value: AnonLinkSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(js.undefined)
        ret
    }
  }
  
}

