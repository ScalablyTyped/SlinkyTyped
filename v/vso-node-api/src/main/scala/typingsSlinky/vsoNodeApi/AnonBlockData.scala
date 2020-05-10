package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlockData extends js.Object {
  var blockData: Double = js.native
  var functions: Double = js.native
  var modules: Double = js.native
}

object AnonBlockData {
  @scala.inline
  def apply(blockData: Double, functions: Double, modules: Double): AnonBlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockData]
  }
  @scala.inline
  implicit class AnonBlockDataOps[Self <: AnonBlockData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

