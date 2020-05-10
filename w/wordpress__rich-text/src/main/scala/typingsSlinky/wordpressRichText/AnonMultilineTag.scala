package typingsSlinky.wordpressRichText

import typingsSlinky.wordpressRichText.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMultilineTag extends js.Object {
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.native
  var value: Value = js.native
}

object AnonMultilineTag {
  @scala.inline
  def apply(value: Value): AnonMultilineTag = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultilineTag]
  }
  @scala.inline
  implicit class AnonMultilineTagOps[Self <: AnonMultilineTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultilineTag(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multilineTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultilineTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multilineTag")(js.undefined)
        ret
    }
  }
  
}

