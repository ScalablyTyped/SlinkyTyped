package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.anon.Archive
import typingsSlinky.sketchapp.sketchappStrings.attributedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSAttributedString extends js.Object {
  var _class: attributedString = js.native
  var archivedAttributedString: js.UndefOr[Archive] = js.native
  var attributes: js.Array[SketchMSStringAttribute] = js.native
  var string: String = js.native
}

object SketchMSAttributedString {
  @scala.inline
  def apply(_class: attributedString, attributes: js.Array[SketchMSStringAttribute], string: String): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributedString]
  }
  @scala.inline
  implicit class SketchMSAttributedStringOps[Self <: SketchMSAttributedString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: attributedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[SketchMSStringAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArchivedAttributedString(value: Archive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archivedAttributedString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchivedAttributedString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archivedAttributedString")(js.undefined)
        ret
    }
  }
  
}

