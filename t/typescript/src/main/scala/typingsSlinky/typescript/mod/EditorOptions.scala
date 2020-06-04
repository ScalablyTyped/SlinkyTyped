package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var BaseIndentSize: js.UndefOr[Double] = js.undefined
  var ConvertTabsToSpaces: Boolean
  var IndentSize: Double
  var IndentStyle: typingsSlinky.typescript.mod.IndentStyle
  var NewLineCharacter: java.lang.String
  var TabSize: Double
}

object EditorOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    IndentStyle: IndentStyle,
    NewLineCharacter: java.lang.String,
    TabSize: Double
  ): EditorOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], IndentStyle = IndentStyle.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
  @scala.inline
  implicit class EditorOptionsOps[Self <: EditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConvertTabsToSpaces(value: Boolean): Self = this.set("ConvertTabsToSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndentSize(value: Double): Self = this.set("IndentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndentStyle(value: IndentStyle): Self = this.set("IndentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewLineCharacter(value: java.lang.String): Self = this.set("NewLineCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabSize(value: Double): Self = this.set("TabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseIndentSize(value: Double): Self = this.set("BaseIndentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseIndentSize: Self = this.set("BaseIndentSize", js.undefined)
  }
  
}

