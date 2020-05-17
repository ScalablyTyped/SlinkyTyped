package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAdd extends js.Object {
  var addAdd: scala.Double = js.native
  var addRename: scala.Double = js.native
  var deleteEdit: scala.Double = js.native
  var deleteRename: scala.Double = js.native
  var directoryChild: scala.Double = js.native
  var directoryFile: scala.Double = js.native
  var editDelete: scala.Double = js.native
  var editEdit: scala.Double = js.native
  var fileDirectory: scala.Double = js.native
  var none: scala.Double = js.native
  var rename1to2: scala.Double = js.native
  var rename2to1: scala.Double = js.native
  var renameAdd: scala.Double = js.native
  var renameDelete: scala.Double = js.native
  var renameRename: scala.Double = js.native
}

object AddAdd {
  @scala.inline
  def apply(
    addAdd: scala.Double,
    addRename: scala.Double,
    deleteEdit: scala.Double,
    deleteRename: scala.Double,
    directoryChild: scala.Double,
    directoryFile: scala.Double,
    editDelete: scala.Double,
    editEdit: scala.Double,
    fileDirectory: scala.Double,
    none: scala.Double,
    rename1to2: scala.Double,
    rename2to1: scala.Double,
    renameAdd: scala.Double,
    renameDelete: scala.Double,
    renameRename: scala.Double
  ): AddAdd = {
    val __obj = js.Dynamic.literal(addAdd = addAdd.asInstanceOf[js.Any], addRename = addRename.asInstanceOf[js.Any], deleteEdit = deleteEdit.asInstanceOf[js.Any], deleteRename = deleteRename.asInstanceOf[js.Any], directoryChild = directoryChild.asInstanceOf[js.Any], directoryFile = directoryFile.asInstanceOf[js.Any], editDelete = editDelete.asInstanceOf[js.Any], editEdit = editEdit.asInstanceOf[js.Any], fileDirectory = fileDirectory.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rename1to2 = rename1to2.asInstanceOf[js.Any], rename2to1 = rename2to1.asInstanceOf[js.Any], renameAdd = renameAdd.asInstanceOf[js.Any], renameDelete = renameDelete.asInstanceOf[js.Any], renameRename = renameRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAdd]
  }
  @scala.inline
  implicit class AddAddOps[Self <: AddAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAdd(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddRename(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteEdit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRename(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryChild(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryFile(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditDelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditEdit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDirectory(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename1to2(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename1to2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename2to1(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename2to1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameAdd(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameDelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameRename(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameRename")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

