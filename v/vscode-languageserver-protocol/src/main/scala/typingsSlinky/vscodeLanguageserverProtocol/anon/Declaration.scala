package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration extends js.Object {
  /**
    * Capabilities specific to the `textDocument/declaration`
    */
  var declaration: js.UndefOr[LinkSupport] = js.undefined
}

object Declaration {
  @scala.inline
  def apply(declaration: LinkSupport = null): Declaration = {
    val __obj = js.Dynamic.literal()
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
}

