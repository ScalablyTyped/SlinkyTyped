package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeepBothFiles extends js.Object {
  var keepBothFiles: Double = js.native
  var keepSourcePath: Double = js.native
  var keepTargetPath: Double = js.native
  var undecided: Double = js.native
}

object AnonKeepBothFiles {
  @scala.inline
  def apply(keepBothFiles: Double, keepSourcePath: Double, keepTargetPath: Double, undecided: Double): AnonKeepBothFiles = {
    val __obj = js.Dynamic.literal(keepBothFiles = keepBothFiles.asInstanceOf[js.Any], keepSourcePath = keepSourcePath.asInstanceOf[js.Any], keepTargetPath = keepTargetPath.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepBothFiles]
  }
  @scala.inline
  implicit class AnonKeepBothFilesOps[Self <: AnonKeepBothFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepBothFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBothFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepSourcePath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepTargetPath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTargetPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

