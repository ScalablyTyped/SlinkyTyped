package typingsSlinky.wordpressBlockEditor.fontSizesMod

import typingsSlinky.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typingsSlinky.wordpressBlockEditor.mod.EditorFontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components/font-sizes", "getFontSize")
@js.native
object getFontSize extends js.Object {
  def apply(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[String],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
}

