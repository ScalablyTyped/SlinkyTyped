package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorOptions extends js.Object {
  var ConvertTabsToSpaces: Boolean = js.native
  var IndentSize: Double = js.native
  var NewLineCharacter: String = js.native
  var TabSize: Double = js.native
}

object EditorOptions {
  @scala.inline
  def apply(ConvertTabsToSpaces: Boolean, IndentSize: Double, NewLineCharacter: String, TabSize: Double): EditorOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
  @scala.inline
  implicit class EditorOptionsOps[Self <: EditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertTabsToSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertTabsToSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewLineCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

