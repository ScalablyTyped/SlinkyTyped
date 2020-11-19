package typingsSlinky.unistBuilder.anon

import typingsSlinky.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[T /* <: String */, C /* <: js.Array[Node] */] extends js.Object {
  
  var children: C = js.native
  
  var `type`: T = js.native
}
object Children {
  
  @scala.inline
  def apply[T /* <: String */, C /* <: js.Array[Node] */](children: C, `type`: T): Children[T, C] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children[T, C]]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children[_, _], T /* <: String */, C /* <: js.Array[Node] */] (val x: Self with (Children[T, C])) extends AnyVal {
    
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
    def setChildren(value: C): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
