package typingsSlinky.testingLibraryJestDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNormalizeWhitespace extends js.Object {
  var normalizeWhitespace: Boolean = js.native
}

object AnonNormalizeWhitespace {
  @scala.inline
  def apply(normalizeWhitespace: Boolean): AnonNormalizeWhitespace = {
    val __obj = js.Dynamic.literal(normalizeWhitespace = normalizeWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNormalizeWhitespace]
  }
  @scala.inline
  implicit class AnonNormalizeWhitespaceOps[Self <: AnonNormalizeWhitespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalizeWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

