package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentObject extends js.Object {
  var returns: js.UndefOr[String] = js.native
  var shortText: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[CommentTagObject]] = js.native
  var text: js.UndefOr[String] = js.native
}

object CommentObject {
  @scala.inline
  def apply(): CommentObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentObject]
  }
  @scala.inline
  implicit class CommentObjectOps[Self <: CommentObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(js.undefined)
        ret
    }
    @scala.inline
    def withShortText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortText")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[CommentTagObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

