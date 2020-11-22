package typingsSlinky.tsJest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeResolve extends js.Object {
  
  var nodeResolve: js.UndefOr[Boolean] = js.native
  
  var throwIfMissing: js.UndefOr[Boolean] = js.native
}
object NodeResolve {
  
  @scala.inline
  def apply(): NodeResolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeResolve]
  }
  
  @scala.inline
  implicit class NodeResolveOps[Self <: NodeResolve] (val x: Self) extends AnyVal {
    
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
    def setNodeResolve(value: Boolean): Self = this.set("nodeResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeResolve: Self = this.set("nodeResolve", js.undefined)
    
    @scala.inline
    def setThrowIfMissing(value: Boolean): Self = this.set("throwIfMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowIfMissing: Self = this.set("throwIfMissing", js.undefined)
  }
}
