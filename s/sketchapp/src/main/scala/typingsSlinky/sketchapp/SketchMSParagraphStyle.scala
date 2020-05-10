package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.paragraphStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSParagraphStyle extends js.Object {
  var _class: paragraphStyle = js.native
  var alignment: Double = js.native
  var allowsDefaultTighteningForTruncation: Double = js.native
}

object SketchMSParagraphStyle {
  @scala.inline
  def apply(_class: paragraphStyle, alignment: Double, allowsDefaultTighteningForTruncation: Double): SketchMSParagraphStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], allowsDefaultTighteningForTruncation = allowsDefaultTighteningForTruncation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSParagraphStyle]
  }
  @scala.inline
  implicit class SketchMSParagraphStyleOps[Self <: SketchMSParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: paragraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowsDefaultTighteningForTruncation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsDefaultTighteningForTruncation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

