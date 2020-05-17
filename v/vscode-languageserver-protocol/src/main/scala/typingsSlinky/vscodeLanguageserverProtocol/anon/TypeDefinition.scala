package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefinition extends js.Object {
  /**
    * Capabilities specific to the `textDocument/typeDefinition`
    */
  var typeDefinition: js.UndefOr[LinkSupport] = js.native
}

object TypeDefinition {
  @scala.inline
  def apply(): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinition]
  }
  @scala.inline
  implicit class TypeDefinitionOps[Self <: TypeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeDefinition(value: LinkSupport): Self = {
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

