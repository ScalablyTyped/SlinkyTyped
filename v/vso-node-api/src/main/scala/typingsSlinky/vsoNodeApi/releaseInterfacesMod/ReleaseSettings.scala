package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseSettings extends js.Object {
  
  var retentionSettings: RetentionSettings = js.native
}
object ReleaseSettings {
  
  @scala.inline
  def apply(retentionSettings: RetentionSettings): ReleaseSettings = {
    val __obj = js.Dynamic.literal(retentionSettings = retentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSettings]
  }
  
  @scala.inline
  implicit class ReleaseSettingsOps[Self <: ReleaseSettings] (val x: Self) extends AnyVal {
    
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
    def setRetentionSettings(value: RetentionSettings): Self = this.set("retentionSettings", value.asInstanceOf[js.Any])
  }
}
