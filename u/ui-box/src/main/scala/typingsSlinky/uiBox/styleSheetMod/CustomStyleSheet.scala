package typingsSlinky.uiBox.styleSheetMod

import org.scalajs.dom.raw.CSSRule
import org.scalajs.dom.raw.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomStyleSheet extends js.Object {
  var ctr: js.Any = js.native
  var injected: js.Any = js.native
  var isSpeedy: js.Any = js.native
  var maxLength: js.Any = js.native
  var sheet: js.UndefOr[js.Any] = js.native
  var tags: js.Any = js.native
  def _insert(sheet: CSSStyleSheet, rule: String): Unit = js.native
  def flush(): Unit = js.native
  def getSheet(): js.UndefOr[CSSStyleSheet] = js.native
  def inject(): Unit = js.native
  def insert(rule: String): Double = js.native
  def rules(): js.Array[CSSRule] = js.native
  def speedy(bool: Boolean): Unit = js.native
}

object CustomStyleSheet {
  @scala.inline
  def apply(
    _insert: (CSSStyleSheet, String) => Unit,
    ctr: js.Any,
    flush: () => Unit,
    getSheet: () => js.UndefOr[CSSStyleSheet],
    inject: () => Unit,
    injected: js.Any,
    insert: String => Double,
    isSpeedy: js.Any,
    maxLength: js.Any,
    rules: () => js.Array[CSSRule],
    speedy: Boolean => Unit,
    tags: js.Any
  ): CustomStyleSheet = {
    val __obj = js.Dynamic.literal(_insert = js.Any.fromFunction2(_insert), ctr = ctr.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), getSheet = js.Any.fromFunction0(getSheet), inject = js.Any.fromFunction0(inject), injected = injected.asInstanceOf[js.Any], insert = js.Any.fromFunction1(insert), isSpeedy = isSpeedy.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], rules = js.Any.fromFunction0(rules), speedy = js.Any.fromFunction1(speedy), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStyleSheet]
  }
  @scala.inline
  implicit class CustomStyleSheetOps[Self <: CustomStyleSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_insert(value: (CSSStyleSheet, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCtr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSheet(value: () => js.UndefOr[CSSStyleSheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInject(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInjected(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsert(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSpeedy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSpeedy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: () => js.Array[CSSRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpeedy(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(js.undefined)
        ret
    }
  }
  
}

