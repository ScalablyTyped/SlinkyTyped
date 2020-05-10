package typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod

import typingsSlinky.vscodeLanguageserverTypes.mod.Color
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPresentationParams extends js.Object {
  /**
    * The color to request presentations for.
    */
  var color: Color = js.native
  /**
    * The range where the color would be inserted. Serves as a context.
    */
  var range: Range = js.native
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object ColorPresentationParams {
  @scala.inline
  def apply(color: Color, range: Range, textDocument: TextDocumentIdentifier): ColorPresentationParams = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPresentationParams]
  }
  @scala.inline
  implicit class ColorPresentationParamsOps[Self <: ColorPresentationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDocument(value: TextDocumentIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

