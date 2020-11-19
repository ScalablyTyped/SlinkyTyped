package typingsSlinky.storybookApi.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: ReactComponentClass[js.Object] | (js.Function1[/* props */ Combo, ReactComponentClass[js.Object]]) = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: ReactComponentClass[js.Object] | (js.Function1[/* props */ Combo, ReactComponentClass[js.Object]])
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
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
    def setChildrenFunction1(value: /* props */ Combo => ReactComponentClass[js.Object]): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenComponent(value: ReactComponentClass[js.Object]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(
      value: ReactComponentClass[js.Object] | (js.Function1[/* props */ Combo, ReactComponentClass[js.Object]])
    ): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}
