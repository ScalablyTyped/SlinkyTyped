package typingsSlinky.wordpressRichText.anon

import org.scalajs.dom.raw.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var element: org.scalajs.dom.raw.Element = js.native
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.native
  var multilineWrapperTags: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ] = js.native
  var range: js.UndefOr[Range] = js.native
}

object Element {
  @scala.inline
  def apply(element: org.scalajs.dom.raw.Element): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withMultilineWrapperTags(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multilineWrapperTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultilineWrapperTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multilineWrapperTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

