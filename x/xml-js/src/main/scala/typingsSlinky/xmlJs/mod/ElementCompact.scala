package typingsSlinky.xmlJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.xmlJs.AnonAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementCompact
  extends /* key */ StringDictionary[js.Any] {
  var _attributes: js.UndefOr[Attributes] = js.native
  var _cdata: js.UndefOr[String] = js.native
  var _comment: js.UndefOr[String] = js.native
  var _declaration: js.UndefOr[AnonAttributes] = js.native
  var _doctype: js.UndefOr[String] = js.native
  var _instruction: js.UndefOr[StringDictionary[String]] = js.native
  var _text: js.UndefOr[String | Double] = js.native
}

object ElementCompact {
  @scala.inline
  def apply(): ElementCompact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementCompact]
  }
  @scala.inline
  implicit class ElementCompactOps[Self <: ElementCompact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_attributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributes")(js.undefined)
        ret
    }
    @scala.inline
    def with_cdata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_cdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cdata")(js.undefined)
        ret
    }
    @scala.inline
    def with_comment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_comment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_comment")(js.undefined)
        ret
    }
    @scala.inline
    def with_declaration(value: AnonAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_declaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_declaration")(js.undefined)
        ret
    }
    @scala.inline
    def with_doctype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_doctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_doctype")(js.undefined)
        ret
    }
    @scala.inline
    def with_instruction(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_instruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instruction")(js.undefined)
        ret
    }
    @scala.inline
    def with_text(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
  }
  
}

