package typingsSlinky.vscodeLanguageserverProtocol.anon

import typingsSlinky.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationFormat extends js.Object {
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.native
  /**
    * Client capabilities specific to parameter information.
    */
  var parameterInformation: js.UndefOr[LabelOffsetSupport] = js.native
}

object DocumentationFormat {
  @scala.inline
  def apply(): DocumentationFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationFormat]
  }
  @scala.inline
  implicit class DocumentationFormatOps[Self <: DocumentationFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentationFormat(value: js.Array[MarkupKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentationFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterInformation(value: LabelOffsetSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterInformation")(js.undefined)
        ret
    }
  }
  
}

