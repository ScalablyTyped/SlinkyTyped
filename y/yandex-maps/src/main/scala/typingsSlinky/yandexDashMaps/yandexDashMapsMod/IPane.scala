package typingsSlinky.yandexDashMaps.yandexDashMapsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.yandexDashMaps.yandexDashMapsStrings.hidden
import typingsSlinky.yandexDashMaps.yandexDashMapsStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPane extends IEventEmitter {
  def destroy(): Unit
  def getElement(): HTMLElement
  def getMap(): Map
  def getOverflow(): visible | hidden
  def getZIndex(): Double
}

object IPane {
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: IEventManager,
    getElement: () => HTMLElement,
    getMap: () => Map,
    getOverflow: () => visible | hidden,
    getZIndex: () => Double
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
  
    __obj.asInstanceOf[IPane]
  }
}

