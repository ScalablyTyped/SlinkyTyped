package typingsSlinky.webLocksApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends js.Object {
  
  var locks: LockManager = js.native
}
object Navigator {
  
  @scala.inline
  def apply(locks: LockManager): Navigator = {
    val __obj = js.Dynamic.literal(locks = locks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    
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
    def setLocks(value: LockManager): Self = this.set("locks", value.asInstanceOf[js.Any])
  }
}
