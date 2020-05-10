package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllBuildDir extends js.Object {
  var allBuildDir: Double = js.native
  var source: Double = js.native
  var sourceAndOutputDir: Double = js.native
  var sourceDir: Double = js.native
}

object AnonAllBuildDir {
  @scala.inline
  def apply(allBuildDir: Double, source: Double, sourceAndOutputDir: Double, sourceDir: Double): AnonAllBuildDir = {
    val __obj = js.Dynamic.literal(allBuildDir = allBuildDir.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceAndOutputDir = sourceAndOutputDir.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllBuildDir]
  }
  @scala.inline
  implicit class AnonAllBuildDirOps[Self <: AnonAllBuildDir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllBuildDir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allBuildDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceAndOutputDir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndOutputDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

