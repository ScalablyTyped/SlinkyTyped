package typingsSlinky.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TruncatedNormalConfig extends js.Object {
  
  var mean: js.UndefOr[Double] = js.native
  
  var seed: js.UndefOr[Double] = js.native
  
  var stddev: js.UndefOr[Double] = js.native
}
object TruncatedNormalConfig {
  
  @scala.inline
  def apply(): TruncatedNormalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncatedNormalConfig]
  }
  
  @scala.inline
  implicit class TruncatedNormalConfigOps[Self <: TruncatedNormalConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setStddev(value: Double): Self = this.set("stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStddev: Self = this.set("stddev", js.undefined)
  }
}
