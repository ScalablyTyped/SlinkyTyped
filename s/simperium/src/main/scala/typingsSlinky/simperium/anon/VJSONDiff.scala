package typingsSlinky.simperium.anon

import typingsSlinky.simperium.mod.DiffOp
import typingsSlinky.simperium.mod.JSONDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VJSONDiff[T] extends DiffOp[T] {
  
  var o: typingsSlinky.simperium.simperiumStrings.O = js.native
  
  var v: JSONDiff[T] = js.native
}
object VJSONDiff {
  
  @scala.inline
  def apply[T](o: typingsSlinky.simperium.simperiumStrings.O, v: JSONDiff[T]): VJSONDiff[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[VJSONDiff[T]]
  }
  
  @scala.inline
  implicit class VJSONDiffOps[Self <: VJSONDiff[_], T] (val x: Self with VJSONDiff[T]) extends AnyVal {
    
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
    def setO(value: typingsSlinky.simperium.simperiumStrings.O): Self = this.set("o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: JSONDiff[T]): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
