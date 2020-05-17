package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRange extends js.Object {
  /**
    * Capabilities specific to `textDocument/foldingRange` requests
    */
  var foldingRange: js.UndefOr[LineFoldingOnly] = js.native
}

object FoldingRange {
  @scala.inline
  def apply(): FoldingRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRange]
  }
  @scala.inline
  implicit class FoldingRangeOps[Self <: FoldingRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFoldingRange(value: LineFoldingOnly): Self = {
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

