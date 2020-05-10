package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreProcessedFileInfo extends js.Object {
  var ambientExternalModules: js.UndefOr[js.Array[java.lang.String]] = js.native
  var importedFiles: js.Array[FileReference] = js.native
  var isLibFile: Boolean = js.native
  var libReferenceDirectives: js.Array[FileReference] = js.native
  var referencedFiles: js.Array[FileReference] = js.native
  var typeReferenceDirectives: js.Array[FileReference] = js.native
}

object PreProcessedFileInfo {
  @scala.inline
  def apply(
    importedFiles: js.Array[FileReference],
    isLibFile: Boolean,
    libReferenceDirectives: js.Array[FileReference],
    referencedFiles: js.Array[FileReference],
    typeReferenceDirectives: js.Array[FileReference]
  ): PreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], libReferenceDirectives = libReferenceDirectives.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], typeReferenceDirectives = typeReferenceDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessedFileInfo]
  }
  @scala.inline
  implicit class PreProcessedFileInfoOps[Self <: PreProcessedFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportedFiles(value: js.Array[FileReference]): Self = {
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
    def withLibReferenceDirectives(value: js.Array[FileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libReferenceDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencedFiles(value: js.Array[FileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeReferenceDirectives(value: js.Array[FileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeReferenceDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmbientExternalModules(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientExternalModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmbientExternalModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientExternalModules")(js.undefined)
        ret
    }
  }
  
}

