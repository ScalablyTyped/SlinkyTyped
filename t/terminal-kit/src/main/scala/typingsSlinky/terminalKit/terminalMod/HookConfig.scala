package typingsSlinky.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookConfig extends js.Object {
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.native
  var autoCompleteHint: js.UndefOr[Boolean] = js.native
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.native
  var hintStyle: js.UndefOr[CTerminal] = js.native
  var style: js.UndefOr[CTerminal] = js.native
  var tokenRegExp: js.UndefOr[js.RegExp] = js.native
}

object HookConfig {
  @scala.inline
  def apply(): HookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookConfig]
  }
  @scala.inline
  implicit class HookConfigOps[Self <: HookConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCompleteFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAutoCompleteFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAutoComplete(value: js.Array[String] | Autocompletion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCompleteHint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCompleteHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteHint")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCompleteMenuFunction2(
      value: (/* inputString */ String, /* callback */ Callback[String | AutocompletionArray[String]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAutoCompleteMenuFunction1(value: /* inputString */ String => js.Promise[String | AutocompletionArray[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAutoCompleteMenu(value: Boolean | Autocompletion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCompleteMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withHintStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenRegExp")(js.undefined)
        ret
    }
  }
  
}

