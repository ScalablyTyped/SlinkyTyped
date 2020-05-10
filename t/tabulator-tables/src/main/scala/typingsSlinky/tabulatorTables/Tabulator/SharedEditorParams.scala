package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedEditorParams extends js.Object {
  var elementAttributes: js.UndefOr[JSONRecord] = js.native
  /**Built in editors based on input elements such as the input, number, textarea and autocomplete editors have the ability to mask the users input to restrict it to match a given pattern.
    This can be set by passing a string to the the mask option in the columns editorParams 
    Each character in the string passed to the mask option defines what type of character can be entered in that position in the editor.
    A - Only a letter is valid in this position
    9 - Only a number is valid in this position
    * - Any character is valid in this position
    Any other character - The character in this position must be the same as the mask
    For example, a mask string of "AAA-999" would require the user to enter three letters followed by a hyphen followed by three numbers
    
    f you want to use the characters A, 9 or * as fixed characters then it is possible to change the characters looked for in the mask by using the maskLetterChar, maskNumberChar and maskWildcardChar options in the editorParams*/
  var mask: js.UndefOr[String] = js.native
  /** you are using fixed characters in your mask (any character other that A, 9 or *), then you can get the mask to automatically fill in these characters for you as you type by setting the maskAutoFill option in the editorParams to true */
  var maskAutoFill: js.UndefOr[Boolean] = js.native
  var maskLetterChar: js.UndefOr[String] = js.native
  var maskNumberChar: js.UndefOr[String] = js.native
  var maskWildcardChar: js.UndefOr[String] = js.native
}

object SharedEditorParams {
  @scala.inline
  def apply(): SharedEditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedEditorParams]
  }
  @scala.inline
  implicit class SharedEditorParamsOps[Self <: SharedEditorParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementAttributes(value: JSONRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskAutoFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskAutoFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskAutoFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskAutoFill")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskLetterChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskLetterChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskLetterChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskLetterChar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskNumberChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskNumberChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskNumberChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskNumberChar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskWildcardChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskWildcardChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskWildcardChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskWildcardChar")(js.undefined)
        ret
    }
  }
  
}

