package typingsSlinky.wordpressDom.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Focusable extends js.Object {
  
  def find(context: ParentNode): js.Array[Element] = js.native
}
object Focusable {
  
  @scala.inline
  def apply(find: ParentNode => js.Array[Element]): Focusable = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[Focusable]
  }
  
  @scala.inline
  implicit class FocusableOps[Self <: Focusable] (val x: Self) extends AnyVal {
    
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
    def setFind(value: ParentNode => js.Array[Element]): Self = this.set("find", js.Any.fromFunction1(value))
  }
}
