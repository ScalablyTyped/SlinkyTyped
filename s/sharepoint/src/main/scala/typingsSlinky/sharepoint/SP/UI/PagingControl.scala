package typingsSlinky.sharepoint.SP.UI

import org.scalajs.dom.raw.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagingControl extends StObject {
  
  def getButtonState(buttonId: Double): Double = js.native
  
  def get_innerContent(): HTMLSpanElement = js.native
  
  def get_innerContentClass(): String = js.native
  
  def onNext(): Unit = js.native
  
  /**Should override*/
  def onPrev(): Unit = js.native
  
  def onWindowResized(): Unit = js.native
  
  def postRender(): Unit = js.native
  
  def render(innerContent: String): String = js.native
  
  def setButtonState(buttonId: Double, state: Double): Unit = js.native
}
object PagingControl {
  
  @scala.inline
  def apply(
    getButtonState: Double => Double,
    get_innerContent: () => HTMLSpanElement,
    get_innerContentClass: () => String,
    onNext: () => Unit,
    onPrev: () => Unit,
    onWindowResized: () => Unit,
    postRender: () => Unit,
    render: String => String,
    setButtonState: (Double, Double) => Unit
  ): PagingControl = {
    val __obj = js.Dynamic.literal(getButtonState = js.Any.fromFunction1(getButtonState), get_innerContent = js.Any.fromFunction0(get_innerContent), get_innerContentClass = js.Any.fromFunction0(get_innerContentClass), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev), onWindowResized = js.Any.fromFunction0(onWindowResized), postRender = js.Any.fromFunction0(postRender), render = js.Any.fromFunction1(render), setButtonState = js.Any.fromFunction2(setButtonState))
    __obj.asInstanceOf[PagingControl]
  }
  
  @scala.inline
  implicit class PagingControlMutableBuilder[Self <: PagingControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetButtonState(value: Double => Double): Self = StObject.set(x, "getButtonState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_innerContent(value: () => HTMLSpanElement): Self = StObject.set(x, "get_innerContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_innerContentClass(value: () => String): Self = StObject.set(x, "get_innerContentClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnWindowResized(value: () => Unit): Self = StObject.set(x, "onWindowResized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostRender(value: () => Unit): Self = StObject.set(x, "postRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: String => String): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetButtonState(value: (Double, Double) => Unit): Self = StObject.set(x, "setButtonState", js.Any.fromFunction2(value))
  }
}
