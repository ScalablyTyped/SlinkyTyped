package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorSettings extends js.Object {
  var baseIndentSize: js.UndefOr[Double] = js.native
  var convertTabsToSpaces: js.UndefOr[Boolean] = js.native
  var indentSize: js.UndefOr[Double] = js.native
  var indentStyle: js.UndefOr[IndentStyle] = js.native
  var newLineCharacter: js.UndefOr[java.lang.String] = js.native
  var tabSize: js.UndefOr[Double] = js.native
}

object EditorSettings {
  @scala.inline
  def apply(): EditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSettings]
  }
  @scala.inline
  implicit class EditorSettingsOps[Self <: EditorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseIndentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseIndentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseIndentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseIndentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertTabsToSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTabsToSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertTabsToSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTabsToSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentStyle(value: IndentStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNewLineCharacter(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLineCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
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

