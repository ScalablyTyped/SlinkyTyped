package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Implementation extends js.Object {
  /**
    * Capabilities specific to the `textDocument/implementation`
    */
  var implementation: js.UndefOr[LinkSupport] = js.undefined
}

object Implementation {
  @scala.inline
  def apply(implementation: LinkSupport = null): Implementation = {
    val __obj = js.Dynamic.literal()
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Implementation]
  }
}

