package typingsSlinky.simperium.anon

import typingsSlinky.simperium.mod.DiffOp
import typingsSlinky.simperium.simperiumStrings.Plussign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait O[T] extends DiffOp[T] {
  
  var o: Plussign = js.native
  
  var v: T = js.native
}
object O {
  
  @scala.inline
  def apply[T](o: Plussign, v: T): O[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[O[T]]
  }
  
  @scala.inline
  implicit class OOps[Self <: O[_], T] (val x: Self with O[T]) extends AnyVal {
    
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
    def setO(value: Plussign): Self = this.set("o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: T): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
