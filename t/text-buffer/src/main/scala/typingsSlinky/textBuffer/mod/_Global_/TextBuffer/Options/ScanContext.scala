package typingsSlinky.textBuffer.mod._Global_.TextBuffer.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanContext extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.native
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.native
}

object ScanContext {
  @scala.inline
  def apply(): ScanContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanContext]
  }
  @scala.inline
  implicit class ScanContextOps[Self <: ScanContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeadingContextLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingContextLineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingContextLineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingContextLineCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingContextLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingContextLineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingContextLineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingContextLineCount")(js.undefined)
        ret
    }
  }
  
}

