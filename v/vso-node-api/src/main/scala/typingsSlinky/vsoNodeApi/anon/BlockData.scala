package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockData extends js.Object {
  var blockData: scala.Double = js.native
  var functions: scala.Double = js.native
  var modules: scala.Double = js.native
}

object BlockData {
  @scala.inline
  def apply(blockData: scala.Double, functions: scala.Double, modules: scala.Double): BlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockData]
  }
  @scala.inline
  implicit class BlockDataOps[Self <: BlockData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockData(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

