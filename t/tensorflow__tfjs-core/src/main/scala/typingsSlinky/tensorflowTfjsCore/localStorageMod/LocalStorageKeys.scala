package typingsSlinky.tensorflowTfjsCore.localStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStorageKeys extends js.Object {
  var info: String = js.native
  var modelMetadata: String = js.native
  var topology: String = js.native
  var weightData: String = js.native
  var weightSpecs: String = js.native
}

object LocalStorageKeys {
  @scala.inline
  def apply(info: String, modelMetadata: String, topology: String, weightData: String, weightSpecs: String): LocalStorageKeys = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], modelMetadata = modelMetadata.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any], weightData = weightData.asInstanceOf[js.Any], weightSpecs = weightSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStorageKeys]
  }
  @scala.inline
  implicit class LocalStorageKeysOps[Self <: LocalStorageKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopology(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeightData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeightSpecs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightSpecs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

