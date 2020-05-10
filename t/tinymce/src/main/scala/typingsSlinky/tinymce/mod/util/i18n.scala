package typingsSlinky.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18n extends js.Object {
  var rtl: Boolean = js.native
  def add(code: String, items: js.Array[js.Object]): Unit = js.native
  def getCode(): String = js.native
  def setCode(newCode: String): Unit = js.native
  def translate(text: String): String = js.native
}

object i18n {
  @scala.inline
  def apply(
    add: (String, js.Array[js.Object]) => Unit,
    getCode: () => String,
    rtl: Boolean,
    setCode: String => Unit,
    translate: String => String
  ): i18n = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getCode = js.Any.fromFunction0(getCode), rtl = rtl.asInstanceOf[js.Any], setCode = js.Any.fromFunction1(setCode), translate = js.Any.fromFunction1(translate))
    __obj.asInstanceOf[i18n]
  }
  @scala.inline
  implicit class i18nOps[Self <: i18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, js.Array[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslate(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

