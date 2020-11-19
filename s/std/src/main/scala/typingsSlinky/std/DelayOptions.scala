package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelayOptions extends AudioNodeOptions {
  
  var delayTime: js.UndefOr[Double] = js.native
  
  var maxDelayTime: js.UndefOr[Double] = js.native
}
object DelayOptions {
  
  @scala.inline
  def apply(): DelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayOptions]
  }
  
  @scala.inline
  implicit class DelayOptionsOps[Self <: DelayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelayTime(value: Double): Self = this.set("delayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayTime: Self = this.set("delayTime", js.undefined)
    
    @scala.inline
    def setMaxDelayTime(value: Double): Self = this.set("maxDelayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDelayTime: Self = this.set("maxDelayTime", js.undefined)
  }
}
