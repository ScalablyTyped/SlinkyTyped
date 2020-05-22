package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinition extends js.Object {
  /**
    * Capabilities specific to the `textDocument/typeDefinition`
    */
  var typeDefinition: js.UndefOr[LinkSupport] = js.undefined
}

object TypeDefinition {
  @scala.inline
  def apply(typeDefinition: LinkSupport = null): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (typeDefinition != null) __obj.updateDynamic("typeDefinition")(typeDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
}

