package typingsSlinky.textract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLang extends js.Object {
  /**
    *  A pass-through to tesseract allowing for setting of language for extraction.
    */
  var lang: String = js.native
}

object AnonLang {
  @scala.inline
  def apply(lang: String): AnonLang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLang]
  }
  @scala.inline
  implicit class AnonLangOps[Self <: AnonLang] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

