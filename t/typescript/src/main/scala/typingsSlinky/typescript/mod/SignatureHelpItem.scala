package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single signature to show in signature help.
  * The id is used for subsequent calls into the language service to ask questions about the
  * signature help item in the context of any documents that have been updated.  i.e. after
  * an edit has happened, while signature help is still active, the host can ask important
  * questions like 'what parameter is the user currently contained within?'.
  */
@js.native
trait SignatureHelpItem extends js.Object {
  var documentation: js.Array[SymbolDisplayPart] = js.native
  var isVariadic: Boolean = js.native
  var parameters: js.Array[SignatureHelpParameter] = js.native
  var prefixDisplayParts: js.Array[SymbolDisplayPart] = js.native
  var separatorDisplayParts: js.Array[SymbolDisplayPart] = js.native
  var suffixDisplayParts: js.Array[SymbolDisplayPart] = js.native
  var tags: js.Array[JSDocTagInfo] = js.native
}

object SignatureHelpItem {
  @scala.inline
  def apply(
    documentation: js.Array[SymbolDisplayPart],
    isVariadic: Boolean,
    parameters: js.Array[SignatureHelpParameter],
    prefixDisplayParts: js.Array[SymbolDisplayPart],
    separatorDisplayParts: js.Array[SymbolDisplayPart],
    suffixDisplayParts: js.Array[SymbolDisplayPart],
    tags: js.Array[JSDocTagInfo]
  ): SignatureHelpItem = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], isVariadic = isVariadic.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], prefixDisplayParts = prefixDisplayParts.asInstanceOf[js.Any], separatorDisplayParts = separatorDisplayParts.asInstanceOf[js.Any], suffixDisplayParts = suffixDisplayParts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItem]
  }
  @scala.inline
  implicit class SignatureHelpItemOps[Self <: SignatureHelpItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentation(value: js.Array[SymbolDisplayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVariadic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVariadic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[SignatureHelpParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixDisplayParts(value: js.Array[SymbolDisplayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixDisplayParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparatorDisplayParts(value: js.Array[SymbolDisplayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatorDisplayParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixDisplayParts(value: js.Array[SymbolDisplayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixDisplayParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[JSDocTagInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

