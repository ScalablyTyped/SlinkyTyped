package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSymbolProviderMetadata extends js.Object {
  /**
  		 * A human-readable string that is shown when multiple outlines trees show for one document.
  		 */
  var label: js.UndefOr[String] = js.native
}

object DocumentSymbolProviderMetadata {
  @scala.inline
  def apply(): DocumentSymbolProviderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSymbolProviderMetadata]
  }
  @scala.inline
  implicit class DocumentSymbolProviderMetadataOps[Self <: DocumentSymbolProviderMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

