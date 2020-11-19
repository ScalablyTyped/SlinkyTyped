package typingsSlinky.wxJsSdkDt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalId extends js.Object {
  
  var localId: String = js.native
}
object LocalId {
  
  @scala.inline
  def apply(localId: String): LocalId = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalId]
  }
  
  @scala.inline
  implicit class LocalIdOps[Self <: LocalId] (val x: Self) extends AnyVal {
    
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
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
  }
}
