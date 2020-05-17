package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepBothFiles extends js.Object {
  var keepBothFiles: scala.Double = js.native
  var keepSourcePath: scala.Double = js.native
  var keepTargetPath: scala.Double = js.native
  var undecided: scala.Double = js.native
}

object KeepBothFiles {
  @scala.inline
  def apply(
    keepBothFiles: scala.Double,
    keepSourcePath: scala.Double,
    keepTargetPath: scala.Double,
    undecided: scala.Double
  ): KeepBothFiles = {
    val __obj = js.Dynamic.literal(keepBothFiles = keepBothFiles.asInstanceOf[js.Any], keepSourcePath = keepSourcePath.asInstanceOf[js.Any], keepTargetPath = keepTargetPath.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepBothFiles]
  }
  @scala.inline
  implicit class KeepBothFilesOps[Self <: KeepBothFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepBothFiles(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBothFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepSourcePath(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepTargetPath(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTargetPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

