package typingsSlinky.tweenJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait None extends js.Object {
  
  def None(k: Double): Double = js.native
}
object None {
  
  @scala.inline
  def apply(None: Double => Double): None = {
    val __obj = js.Dynamic.literal(None = js.Any.fromFunction1(None))
    __obj.asInstanceOf[None]
  }
  
  @scala.inline
  implicit class NoneOps[Self <: None] (val x: Self) extends AnyVal {
    
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
    def setNone(value: Double => Double): Self = this.set("None", js.Any.fromFunction1(value))
  }
}
