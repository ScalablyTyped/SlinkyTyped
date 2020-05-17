package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllBuildDir extends js.Object {
  var allBuildDir: scala.Double = js.native
  var source: scala.Double = js.native
  var sourceAndOutputDir: scala.Double = js.native
  var sourceDir: scala.Double = js.native
}

object AllBuildDir {
  @scala.inline
  def apply(
    allBuildDir: scala.Double,
    source: scala.Double,
    sourceAndOutputDir: scala.Double,
    sourceDir: scala.Double
  ): AllBuildDir = {
    val __obj = js.Dynamic.literal(allBuildDir = allBuildDir.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceAndOutputDir = sourceAndOutputDir.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuildDir]
  }
  @scala.inline
  implicit class AllBuildDirOps[Self <: AllBuildDir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllBuildDir(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allBuildDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceAndOutputDir(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndOutputDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDir(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

