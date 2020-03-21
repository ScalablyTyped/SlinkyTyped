package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeclaration extends js.Object {
  /**
    * Capabilities specific to the `textDocument/declaration`
    */
  var declaration: js.UndefOr[AnonLinkSupport] = js.undefined
}

object AnonDeclaration {
  @scala.inline
  def apply(declaration: AnonLinkSupport = null): AnonDeclaration = {
    val __obj = js.Dynamic.literal()
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeclaration]
  }
}

