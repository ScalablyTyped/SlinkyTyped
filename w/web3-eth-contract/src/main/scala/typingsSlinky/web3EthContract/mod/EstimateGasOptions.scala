package typingsSlinky.web3EthContract.mod

import typingsSlinky.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EstimateGasOptions extends js.Object {
  
  var from: js.UndefOr[String] = js.native
  
  var gas: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double | String | ^ ] = js.native
}
object EstimateGasOptions {
  
  @scala.inline
  def apply(): EstimateGasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimateGasOptions]
  }
  
  @scala.inline
  implicit class EstimateGasOptionsOps[Self <: EstimateGasOptions] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setGas(value: Double): Self = this.set("gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGas: Self = this.set("gas", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | ^ ): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
