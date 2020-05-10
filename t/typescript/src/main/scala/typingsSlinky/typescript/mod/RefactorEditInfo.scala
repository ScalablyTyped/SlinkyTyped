package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of edits to make in response to a refactor action, plus an optional
  * location where renaming should be invoked from
  */
@js.native
trait RefactorEditInfo extends js.Object {
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.native
  var edits: js.Array[FileTextChanges] = js.native
  var renameFilename: js.UndefOr[java.lang.String] = js.native
  var renameLocation: js.UndefOr[Double] = js.native
}

object RefactorEditInfo {
  @scala.inline
  def apply(edits: js.Array[FileTextChanges]): RefactorEditInfo = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorEditInfo]
  }
  @scala.inline
  implicit class RefactorEditInfoOps[Self <: RefactorEditInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdits(value: js.Array[FileTextChanges]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: js.Array[CodeActionCommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameFilename(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameLocation")(js.undefined)
        ret
    }
  }
  
}

