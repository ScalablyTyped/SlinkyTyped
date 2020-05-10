package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeDefinition extends js.Object {
  /**
    * Capabilities specific to the `textDocument/typeDefinition`
    */
  var typeDefinition: js.UndefOr[AnonLinkSupport] = js.native
}

object AnonTypeDefinition {
  @scala.inline
  def apply(): AnonTypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTypeDefinition]
  }
  @scala.inline
  implicit class AnonTypeDefinitionOps[Self <: AnonTypeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeDefinition(value: AnonLinkSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefinition")(js.undefined)
        ret
    }
  }
  
}

