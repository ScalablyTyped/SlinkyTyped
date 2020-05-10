package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeclaration extends js.Object {
  /**
    * Capabilities specific to the `textDocument/declaration`
    */
  var declaration: js.UndefOr[AnonLinkSupport] = js.native
}

object AnonDeclaration {
  @scala.inline
  def apply(): AnonDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDeclaration]
  }
  @scala.inline
  implicit class AnonDeclarationOps[Self <: AnonDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclaration(value: AnonLinkSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.undefined)
        ret
    }
  }
  
}

