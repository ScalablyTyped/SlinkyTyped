package typingsSlinky.useSidecar.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfig extends js.Object {
  
  def onError(e: js.Error): Unit = js.native
}
object IConfig {
  
  @scala.inline
  def apply(onError: js.Error => Unit): IConfig = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    
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
    def setOnError(value: js.Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
  }
}
