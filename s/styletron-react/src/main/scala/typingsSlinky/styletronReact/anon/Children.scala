package typingsSlinky.styletronReact.anon

import slinky.core.facade.ReactElement
import typingsSlinky.styletronReact.mod.DebugEngine
import typingsSlinky.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): ReactElement = js.native
}
object Children {
  
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => ReactElement): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: (StandardEngine, DebugEngine, Boolean) => ReactElement): Self = this.set("children", js.Any.fromFunction3(value))
  }
}
