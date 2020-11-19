package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBOpenDBRequestEventMap extends IDBRequestEventMap {
  
  var blocked: org.scalajs.dom.raw.Event = js.native
  
  var upgradeneeded: org.scalajs.dom.raw.IDBVersionChangeEvent = js.native
}
object IDBOpenDBRequestEventMap {
  
  @scala.inline
  def apply(
    blocked: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    success: org.scalajs.dom.raw.Event,
    upgradeneeded: org.scalajs.dom.raw.IDBVersionChangeEvent
  ): IDBOpenDBRequestEventMap = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], upgradeneeded = upgradeneeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBOpenDBRequestEventMap]
  }
  
  @scala.inline
  implicit class IDBOpenDBRequestEventMapOps[Self <: IDBOpenDBRequestEventMap] (val x: Self) extends AnyVal {
    
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
    def setBlocked(value: org.scalajs.dom.raw.Event): Self = this.set("blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeneeded(value: org.scalajs.dom.raw.IDBVersionChangeEvent): Self = this.set("upgradeneeded", value.asInstanceOf[js.Any])
  }
}
