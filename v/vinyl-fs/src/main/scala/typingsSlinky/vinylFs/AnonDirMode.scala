package typingsSlinky.vinylFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirMode extends js.Object {
  /**
    * Specify the working directory the folder is relative to
    * Default is process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Specify the mode the directory should be created with
    * Default is the process mode
    */
  var dirMode: js.UndefOr[Double] = js.native
}

object AnonDirMode {
  @scala.inline
  def apply(): AnonDirMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDirMode]
  }
  @scala.inline
  implicit class AnonDirModeOps[Self <: AnonDirMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDirMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirMode")(js.undefined)
        ret
    }
  }
  
}

