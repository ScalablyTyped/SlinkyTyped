package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolvedFile extends js.Object {
  var importedFiles: js.Array[String] = js.native
  var path: String = js.native
  var referencedFiles: js.Array[String] = js.native
}

object IResolvedFile {
  @scala.inline
  def apply(importedFiles: js.Array[String], path: String, referencedFiles: js.Array[String]): IResolvedFile = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolvedFile]
  }
  @scala.inline
  implicit class IResolvedFileOps[Self <: IResolvedFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencedFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencedFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

