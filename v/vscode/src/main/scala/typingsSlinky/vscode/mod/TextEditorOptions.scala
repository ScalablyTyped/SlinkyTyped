package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorOptions extends js.Object {
  /**
  		 * The rendering style of the cursor in this editor.
  		 * When getting a text editor's options, this property will always be present.
  		 * When setting a text editor's options, this property is optional.
  		 */
  var cursorStyle: js.UndefOr[TextEditorCursorStyle] = js.native
  /**
  		 * When pressing Tab insert [n](#TextEditorOptions.tabSize) spaces.
  		 * When getting a text editor's options, this property will always be a boolean (resolved).
  		 * When setting a text editor's options, this property is optional and it can be a boolean or `"auto"`.
  		 */
  var insertSpaces: js.UndefOr[Boolean | String] = js.native
  /**
  		 * Render relative line numbers w.r.t. the current line number.
  		 * When getting a text editor's options, this property will always be present.
  		 * When setting a text editor's options, this property is optional.
  		 */
  var lineNumbers: js.UndefOr[TextEditorLineNumbersStyle] = js.native
  /**
  		 * The size in spaces a tab takes. This is used for two purposes:
  		 *  - the rendering width of a tab character;
  		 *  - the number of spaces to insert when [insertSpaces](#TextEditorOptions.insertSpaces) is true.
  		 *
  		 * When getting a text editor's options, this property will always be a number (resolved).
  		 * When setting a text editor's options, this property is optional and it can be a number or `"auto"`.
  		 */
  var tabSize: js.UndefOr[Double | String] = js.native
}

object TextEditorOptions {
  @scala.inline
  def apply(): TextEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditorOptions]
  }
  @scala.inline
  implicit class TextEditorOptionsOps[Self <: TextEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursorStyle(value: TextEditorCursorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaces(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumbers(value: TextEditorLineNumbersStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
        ret
    }
  }
  
}

