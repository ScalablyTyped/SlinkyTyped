package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conv3DBackpropFilterAttrs extends js.Object {
  
  var pad: valid_ | same_ = js.native
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double = js.native
}
object Conv3DBackpropFilterAttrs {
  
  @scala.inline
  def apply(pad: valid_ | same_, strides: (js.Tuple3[Double, Double, Double]) | Double): Conv3DBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class Conv3DBackpropFilterAttrsOps[Self <: Conv3DBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
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
    def setPad(value: valid_ | same_): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
}
