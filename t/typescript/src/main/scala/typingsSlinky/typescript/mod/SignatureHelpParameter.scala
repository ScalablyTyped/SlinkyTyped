package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpParameter extends js.Object {
  var displayParts: js.Array[SymbolDisplayPart] = js.native
  var documentation: js.Array[SymbolDisplayPart] = js.native
  var isOptional: Boolean = js.native
  var name: java.lang.String = js.native
}

object SignatureHelpParameter {
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    documentation: js.Array[SymbolDisplayPart],
    isOptional: Boolean,
    name: java.lang.String
  ): SignatureHelpParameter = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParameter]
  }
  @scala.inline
  implicit class SignatureHelpParameterOps[Self <: SignatureHelpParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayParts(value: js.Array[SymbolDisplayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentation(value: js.Array[SymbolDisplayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

