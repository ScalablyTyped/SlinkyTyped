package typingsSlinky.yandexMaps.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.yandexMaps.yandexMapsStrings.hidden
import typingsSlinky.yandexMaps.yandexMapsStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPane extends IEventEmitter {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def getMap(): Map_ = js.native
  
  def getOverflow(): visible | hidden = js.native
  
  def getZIndex(): Double = js.native
}
object IPane {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: IEventManager[js.Object],
    getElement: () => HTMLElement,
    getMap: () => Map_,
    getOverflow: () => visible | hidden,
    getZIndex: () => Double
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
    __obj.asInstanceOf[IPane]
  }
  
  @scala.inline
  implicit class IPaneMutableBuilder[Self <: IPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMap(value: () => Map_): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOverflow(value: () => visible | hidden): Self = StObject.set(x, "getOverflow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetZIndex(value: () => Double): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
  }
}
