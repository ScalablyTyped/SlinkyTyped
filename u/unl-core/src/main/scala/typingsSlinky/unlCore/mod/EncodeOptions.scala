package typingsSlinky.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodeOptions extends js.Object {
  
  var elevation: Double = js.native
  
  var elevationType: ElevationType = js.native
}
object EncodeOptions {
  
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType): EncodeOptions = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeOptions]
  }
  
  @scala.inline
  implicit class EncodeOptionsOps[Self <: EncodeOptions] (val x: Self) extends AnyVal {
    
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
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationType(value: ElevationType): Self = this.set("elevationType", value.asInstanceOf[js.Any])
  }
}
