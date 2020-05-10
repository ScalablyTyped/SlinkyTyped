package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFoldingRange extends js.Object {
  /**
    * Capabilities specific to `textDocument/foldingRange` requests
    */
  var foldingRange: js.UndefOr[AnonLineFoldingOnly] = js.native
}

object AnonFoldingRange {
  @scala.inline
  def apply(): AnonFoldingRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFoldingRange]
  }
  @scala.inline
  implicit class AnonFoldingRangeOps[Self <: AnonFoldingRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFoldingRange(value: AnonLineFoldingOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldingRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingRange")(js.undefined)
        ret
    }
  }
  
}

