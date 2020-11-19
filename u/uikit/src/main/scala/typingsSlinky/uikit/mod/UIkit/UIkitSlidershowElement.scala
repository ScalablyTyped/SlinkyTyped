package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitSlidershowElement extends js.Object {
  
  def show(index: Double): Unit = js.native
  
  def startAutoplay(): Unit = js.native
  
  def stopAutoplay(): Unit = js.native
}
object UIkitSlidershowElement {
  
  @scala.inline
  def apply(show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitSlidershowElement = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitSlidershowElement]
  }
  
  @scala.inline
  implicit class UIkitSlidershowElementOps[Self <: UIkitSlidershowElement] (val x: Self) extends AnyVal {
    
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
    def setShow(value: Double => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartAutoplay(value: () => Unit): Self = this.set("startAutoplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAutoplay(value: () => Unit): Self = this.set("stopAutoplay", js.Any.fromFunction0(value))
  }
}
