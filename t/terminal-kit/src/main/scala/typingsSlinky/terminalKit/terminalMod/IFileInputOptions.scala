package typingsSlinky.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.terminalKit.terminalKitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined terminal-kit.terminal-kit/Terminal.InputFieldOptions & {  baseDir  :string} */
@js.native
trait IFileInputOptions extends js.Object {
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.native
  var autoCompleteHint: js.UndefOr[Boolean] = js.native
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.native
  var baseDir: String = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  var cursorPosition: js.UndefOr[Double] = js.native
  var default: js.UndefOr[String] = js.native
  var echo: js.UndefOr[Boolean] = js.native
  var echoChar: js.UndefOr[String | `true`] = js.native
  var hintStyle: js.UndefOr[CTerminal] = js.native
  var history: js.UndefOr[js.Array[String]] = js.native
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CTerminal] = js.native
  var tokenHook: js.UndefOr[
    js.Function5[
      /* token */ String, 
      /* isEndOfInput */ Boolean, 
      /* previousTokens */ js.Array[String], 
      /* term */ Terminal, 
      /* config */ HookConfig, 
      String | CTerminal | Null | Unit
    ]
  ] = js.native
  var tokenRegExp: js.UndefOr[js.RegExp] = js.native
  var tokenResetHook: js.UndefOr[
    js.Function2[/* term */ Terminal, /* config */ js.UndefOr[HookConfig], String | CTerminal]
  ] = js.native
}

object IFileInputOptions {
  @scala.inline
  def apply(baseDir: String): IFileInputOptions = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInputOptions]
  }
  @scala.inline
  implicit class IFileInputOptionsOps[Self <: IFileInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withEcho(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echo")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoChar(value: String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoChar")(js.undefined)
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
    def withHistory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBindings(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
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
    def withTokenHook(
      value: (/* token */ String, /* isEndOfInput */ Boolean, /* previousTokens */ js.Array[String], /* term */ Terminal, /* config */ HookConfig) => String | CTerminal | Null | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenHook")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutTokenHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenHook")(js.undefined)
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
    @scala.inline
    def withTokenResetHook(value: (/* term */ Terminal, /* config */ js.UndefOr[HookConfig]) => String | CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenResetHook")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTokenResetHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenResetHook")(js.undefined)
        ret
    }
  }
  
}

