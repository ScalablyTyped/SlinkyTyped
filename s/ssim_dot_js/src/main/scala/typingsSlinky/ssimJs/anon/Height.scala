package typingsSlinky.ssimJs.anon

import typingsSlinky.ssimJs.typesMod.ImageMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Height extends ImageMatrix {
  
  var data: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object Height {
  
  @scala.inline
  def apply(
    data: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array,
    height: Double,
    width: Double
  ): Height = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
    
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
    def setDataUint8Array(value: js.typedarray.Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInt8Array(value: js.typedarray.Int8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInt32Array(value: js.typedarray.Int32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint16Array(value: js.typedarray.Uint16Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(
      value: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint32Array(value: js.typedarray.Uint32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
