package typingsSlinky.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightsManifestGroupConfig extends js.Object {
  /**
    * An ordered list of paths.
    *
    * Paths are intentionally abstract in order to be general. For example, they
    * can be relative URL paths or relative paths on the file system.
    */
  var paths: js.Array[String] = js.native
  /**
    * Specifications of the weights stored in the paths.
    */
  var weights: js.Array[WeightsManifestEntry] = js.native
}

object WeightsManifestGroupConfig {
  @scala.inline
  def apply(paths: js.Array[String], weights: js.Array[WeightsManifestEntry]): WeightsManifestGroupConfig = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightsManifestGroupConfig]
  }
  @scala.inline
  implicit class WeightsManifestGroupConfigOps[Self <: WeightsManifestGroupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeights(value: js.Array[WeightsManifestEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weights")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

