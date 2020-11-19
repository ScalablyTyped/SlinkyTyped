package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LSTMLayerArgs extends SimpleRNNLayerArgs {
  
  /**
    * Implementation mode, either 1 or 2.
    *   Mode 1 will structure its operations as a larger number of
    *   smaller dot products and additions, whereas mode 2 will
    *   batch them into fewer, larger operations. These modes will
    *   have different performance profiles on different hardware and
    *   for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this config field.
    */
  var implementation: js.UndefOr[Double] = js.native
  
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.native
  
  /**
    * If `true`, add 1 to the bias of the forget gate at initialization.
    * Setting it to `true` will also force `biasInitializer = 'zeros'`.
    * This is recommended in
    * [Jozefowicz et
    * al.](http://www.jmlr.org/proceedings/papers/v37/jozefowicz15.pdf).
    */
  var unitForgetBias: js.UndefOr[Boolean] = js.native
}
object LSTMLayerArgs {
  
  @scala.inline
  def apply(units: Double): LSTMLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSTMLayerArgs]
  }
  
  @scala.inline
  implicit class LSTMLayerArgsOps[Self <: LSTMLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setImplementation(value: Double): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setRecurrentActivation(value: ActivationIdentifier): Self = this.set("recurrentActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrentActivation: Self = this.set("recurrentActivation", js.undefined)
    
    @scala.inline
    def setUnitForgetBias(value: Boolean): Self = this.set("unitForgetBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitForgetBias: Self = this.set("unitForgetBias", js.undefined)
  }
}
