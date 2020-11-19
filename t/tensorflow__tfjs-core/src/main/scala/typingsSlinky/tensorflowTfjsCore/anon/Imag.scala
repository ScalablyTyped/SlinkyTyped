package typingsSlinky.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imag extends js.Object {
  
  var imag: js.typedarray.Float32Array = js.native
  
  var real: js.typedarray.Float32Array = js.native
}
object Imag {
  
  @scala.inline
  def apply(imag: js.typedarray.Float32Array, real: js.typedarray.Float32Array): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
  
  @scala.inline
  implicit class ImagOps[Self <: Imag] (val x: Self) extends AnyVal {
    
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
    def setImag(value: js.typedarray.Float32Array): Self = this.set("imag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReal(value: js.typedarray.Float32Array): Self = this.set("real", value.asInstanceOf[js.Any])
  }
}
