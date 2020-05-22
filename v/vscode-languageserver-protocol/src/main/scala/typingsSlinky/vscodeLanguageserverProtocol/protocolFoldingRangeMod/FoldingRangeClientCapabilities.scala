package typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[typingsSlinky.vscodeLanguageserverProtocol.anon.FoldingRange] = js.undefined
}

object FoldingRangeClientCapabilities {
  @scala.inline
  def apply(textDocument: typingsSlinky.vscodeLanguageserverProtocol.anon.FoldingRange = null): FoldingRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeClientCapabilities]
  }
}

