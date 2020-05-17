package typingsSlinky.testingLibraryJestDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizeWhitespace extends js.Object {
  var normalizeWhitespace: Boolean = js.native
}

object NormalizeWhitespace {
  @scala.inline
  def apply(normalizeWhitespace: Boolean): NormalizeWhitespace = {
    val __obj = js.Dynamic.literal(normalizeWhitespace = normalizeWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeWhitespace]
  }
  @scala.inline
  implicit class NormalizeWhitespaceOps[Self <: NormalizeWhitespace] (val x: Self) extends AnyVal {
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

