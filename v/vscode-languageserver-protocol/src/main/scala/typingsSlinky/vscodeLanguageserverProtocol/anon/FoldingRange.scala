package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRange extends js.Object {
  /**
    * Capabilities specific to `textDocument/foldingRange` requests
    */
  var foldingRange: js.UndefOr[LineFoldingOnly] = js.undefined
}

object FoldingRange {
  @scala.inline
  def apply(foldingRange: LineFoldingOnly = null): FoldingRange = {
    val __obj = js.Dynamic.literal()
    if (foldingRange != null) __obj.updateDynamic("foldingRange")(foldingRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
}

