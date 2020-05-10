package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddAdd extends js.Object {
  var addAdd: Double = js.native
  var addRename: Double = js.native
  var deleteEdit: Double = js.native
  var deleteRename: Double = js.native
  var directoryChild: Double = js.native
  var directoryFile: Double = js.native
  var editDelete: Double = js.native
  var editEdit: Double = js.native
  var fileDirectory: Double = js.native
  var none: Double = js.native
  var rename1to2: Double = js.native
  var rename2to1: Double = js.native
  var renameAdd: Double = js.native
  var renameDelete: Double = js.native
  var renameRename: Double = js.native
}

object AnonAddAdd {
  @scala.inline
  def apply(
    addAdd: Double,
    addRename: Double,
    deleteEdit: Double,
    deleteRename: Double,
    directoryChild: Double,
    directoryFile: Double,
    editDelete: Double,
    editEdit: Double,
    fileDirectory: Double,
    none: Double,
    rename1to2: Double,
    rename2to1: Double,
    renameAdd: Double,
    renameDelete: Double,
    renameRename: Double
  ): AnonAddAdd = {
    val __obj = js.Dynamic.literal(addAdd = addAdd.asInstanceOf[js.Any], addRename = addRename.asInstanceOf[js.Any], deleteEdit = deleteEdit.asInstanceOf[js.Any], deleteRename = deleteRename.asInstanceOf[js.Any], directoryChild = directoryChild.asInstanceOf[js.Any], directoryFile = directoryFile.asInstanceOf[js.Any], editDelete = editDelete.asInstanceOf[js.Any], editEdit = editEdit.asInstanceOf[js.Any], fileDirectory = fileDirectory.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rename1to2 = rename1to2.asInstanceOf[js.Any], rename2to1 = rename2to1.asInstanceOf[js.Any], renameAdd = renameAdd.asInstanceOf[js.Any], renameDelete = renameDelete.asInstanceOf[js.Any], renameRename = renameRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddAdd]
  }
  @scala.inline
  implicit class AnonAddAddOps[Self <: AnonAddAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAdd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddRename(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteEdit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRename(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryChild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryFile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditDelete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditEdit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDirectory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename1to2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename1to2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename2to1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename2to1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameAdd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameDelete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameRename(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameRename")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

