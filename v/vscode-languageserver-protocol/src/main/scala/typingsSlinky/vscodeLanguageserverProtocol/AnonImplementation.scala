package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImplementation extends js.Object {
  /**
    * Capabilities specific to the `textDocument/implementation`
    */
  var implementation: js.UndefOr[AnonLinkSupport] = js.undefined
}

object AnonImplementation {
  @scala.inline
  def apply(implementation: AnonLinkSupport = null): AnonImplementation = {
    val __obj = js.Dynamic.literal()
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImplementation]
  }
}

