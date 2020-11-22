package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedConv2DAttrs extends js.Object {
  
  var activation: Activation = js.native
  
  var dataFormat: NHWC | NCHW = js.native
  
  var dilations: (js.Tuple2[Double, Double]) | Double = js.native
  
  var dimRoundingMode: floor | round | ceil = js.native
  
  var pad: valid_ | same_ | Double | ExplicitPadding = js.native
  
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}
object FusedConv2DAttrs {
  
  @scala.inline
  def apply(
    activation: Activation,
    dataFormat: NHWC | NCHW,
    dilations: (js.Tuple2[Double, Double]) | Double,
    dimRoundingMode: floor | round | ceil,
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): FusedConv2DAttrs = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dilations = dilations.asInstanceOf[js.Any], dimRoundingMode = dimRoundingMode.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedConv2DAttrs]
  }
  
  @scala.inline
  implicit class FusedConv2DAttrsOps[Self <: FusedConv2DAttrs] (val x: Self) extends AnyVal {
    
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
    def setActivation(value: Activation): Self = this.set("activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormat(value: NHWC | NCHW): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = this.set("dimRoundingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
}
