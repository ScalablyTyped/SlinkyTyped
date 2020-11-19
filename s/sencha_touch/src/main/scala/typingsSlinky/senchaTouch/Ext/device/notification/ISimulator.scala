package typingsSlinky.senchaTouch.Ext.device.notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimulator extends IAbstract {
  
  /** [Method] A simple way to show a notification  */
  @JSName("show")
  var show_ISimulator: js.UndefOr[js.Function0[Unit]] = js.native
}
object ISimulator {
  
  @scala.inline
  def apply(): ISimulator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimulator]
  }
  
  @scala.inline
  implicit class ISimulatorOps[Self <: ISimulator] (val x: Self) extends AnyVal {
    
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
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
