package typingsSlinky.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends js.Object {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.native
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.native
}
object Children {
  
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](): Children[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[T]]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children[_], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] (val x: Self with Children[T]) extends AnyVal {
    
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
    def setAs(value: T): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
}
