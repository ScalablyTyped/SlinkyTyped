package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPreProcessedFileInfo extends js.Object {
  var diagnostics: js.Array[Diagnostic] = js.native
  var importedFiles: js.Array[IFileReference] = js.native
  var isLibFile: Boolean = js.native
  var referencedFiles: js.Array[IFileReference] = js.native
}

object IPreProcessedFileInfo {
  @scala.inline
  def apply(
    diagnostics: js.Array[Diagnostic],
    importedFiles: js.Array[IFileReference],
    isLibFile: Boolean,
    referencedFiles: js.Array[IFileReference]
  ): IPreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreProcessedFileInfo]
  }
  @scala.inline
  implicit class IPreProcessedFileInfoOps[Self <: IPreProcessedFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagnostics(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedFiles(value: js.Array[IFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLibFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLibFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencedFiles(value: js.Array[IFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencedFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

