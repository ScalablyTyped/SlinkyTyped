package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.tuyaPanelKit.commonActionsMod.ResetState
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.RESET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadSourceTarget
  extends typingsSlinky.tuyaPanelKit.commonActionsMod.Action {
  
  var payload: js.UndefOr[ResetState] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: RESET = js.native
}
object PayloadSourceTarget {
  
  @scala.inline
  def apply(`type`: RESET): PayloadSourceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadSourceTarget]
  }
  
  @scala.inline
  implicit class PayloadSourceTargetOps[Self <: PayloadSourceTarget] (val x: Self) extends AnyVal {
    
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
    def setType(value: RESET): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: ResetState): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
