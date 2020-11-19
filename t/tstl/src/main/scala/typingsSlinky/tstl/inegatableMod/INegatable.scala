package typingsSlinky.tstl.inegatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INegatable[Ret] extends js.Object {
  
  def negate(): Ret = js.native
}
object INegatable {
  
  @scala.inline
  def apply[Ret](negate: () => Ret): INegatable[Ret] = {
    val __obj = js.Dynamic.literal(negate = js.Any.fromFunction0(negate))
    __obj.asInstanceOf[INegatable[Ret]]
  }
  
  @scala.inline
  implicit class INegatableOps[Self <: INegatable[_], Ret] (val x: Self with INegatable[Ret]) extends AnyVal {
    
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
    def setNegate(value: () => Ret): Self = this.set("negate", js.Any.fromFunction0(value))
  }
}
