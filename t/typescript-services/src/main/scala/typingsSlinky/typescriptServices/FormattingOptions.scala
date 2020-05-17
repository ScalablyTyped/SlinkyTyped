package typingsSlinky.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattingOptions extends js.Object {
  var indentSpaces: Double = js.native
  var newLineCharacter: String = js.native
  var spacesPerTab: Double = js.native
  var useTabs: Boolean = js.native
}

object FormattingOptions {
  @scala.inline
  def apply(indentSpaces: Double, newLineCharacter: String, spacesPerTab: Double, useTabs: Boolean): FormattingOptions = {
    val __obj = js.Dynamic.literal(indentSpaces = indentSpaces.asInstanceOf[js.Any], newLineCharacter = newLineCharacter.asInstanceOf[js.Any], spacesPerTab = spacesPerTab.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  @scala.inline
  implicit class FormattingOptionsOps[Self <: FormattingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentSpaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacesPerTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacesPerTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

