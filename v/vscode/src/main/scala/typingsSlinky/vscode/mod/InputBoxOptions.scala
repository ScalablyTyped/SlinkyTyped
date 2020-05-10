package typingsSlinky.vscode.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputBoxOptions extends js.Object {
  /**
  		 * Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  /**
  		 * Controls if a password input is shown. Password input hides the typed text.
  		 */
  var password: js.UndefOr[Boolean] = js.native
  /**
  		 * An optional string to show as placeholder in the input box to guide the user what to type.
  		 */
  var placeHolder: js.UndefOr[String] = js.native
  /**
  		 * The text to display underneath the input box.
  		 */
  var prompt: js.UndefOr[String] = js.native
  /**
  		 * An optional function that will be called to validate input and to give a hint
  		 * to the user.
  		 *
  		 * @param value The current value of the input box.
  		 * @return A human-readable string which is presented as diagnostic message.
  		 * Return `undefined`, `null`, or the empty string when 'value' is valid.
  		 */
  var validateInput: js.UndefOr[
    js.Function1[
      /* value */ String, 
      js.UndefOr[String | Null | (Thenable[js.UndefOr[String | Null]])]
    ]
  ] = js.native
  /**
  		 * The value to prefill in the input box.
  		 */
  var value: js.UndefOr[String] = js.native
  /**
  		 * Selection of the prefilled [`value`](#InputBoxOptions.value). Defined as tuple of two number where the
  		 * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
  		 * word will be selected, when empty (start equals end) only the cursor will be set,
  		 * otherwise the defined range will be selected.
  		 */
  var valueSelection: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object InputBoxOptions {
  @scala.inline
  def apply(): InputBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBoxOptions]
  }
  @scala.inline
  implicit class InputBoxOptionsOps[Self <: InputBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreFocusOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFocusOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFocusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateInput(value: /* value */ String => js.UndefOr[String | Null | (Thenable[js.UndefOr[String | Null]])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateInput")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSelection(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSelection")(js.undefined)
        ret
    }
  }
  
}

