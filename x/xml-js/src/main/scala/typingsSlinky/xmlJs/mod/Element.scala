package typingsSlinky.xmlJs.mod

import typingsSlinky.xmlJs.anon.AttributesDeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var attributes: js.UndefOr[Attributes] = js.native
  var cdata: js.UndefOr[String] = js.native
  var comment: js.UndefOr[String] = js.native
  var declaration: js.UndefOr[AttributesDeclarationAttributes] = js.native
  var doctype: js.UndefOr[String] = js.native
  var elements: js.UndefOr[js.Array[Element]] = js.native
  var instruction: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var text: js.UndefOr[String | Double | Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Element {
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCdata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaration(value: AttributesDeclarationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String | Double | Boolean): Self = {
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

