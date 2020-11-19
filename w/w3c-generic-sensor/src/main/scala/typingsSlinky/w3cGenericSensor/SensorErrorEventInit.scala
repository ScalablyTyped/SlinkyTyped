package typingsSlinky.w3cGenericSensor

import typingsSlinky.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensorErrorEventInit extends EventInit {
  
  var error: js.Error = js.native
}
object SensorErrorEventInit {
  
  @scala.inline
  def apply(error: js.Error): SensorErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorErrorEventInit]
  }
  
  @scala.inline
  implicit class SensorErrorEventInitOps[Self <: SensorErrorEventInit] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
