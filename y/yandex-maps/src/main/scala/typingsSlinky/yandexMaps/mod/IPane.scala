package typingsSlinky.yandexMaps.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.yandexMaps.yandexMapsStrings.hidden
import typingsSlinky.yandexMaps.yandexMapsStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    events: IEventManager,
    getElement: () => HTMLElement,
    getMap: () => Map_,
    getOverflow: () => visible | hidden,
    getZIndex: () => Double
  ): IPane = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getMap = js.Any.fromFunction0(getMap), getOverflow = js.Any.fromFunction0(getOverflow), getZIndex = js.Any.fromFunction0(getZIndex))
    __obj.asInstanceOf[IPane]
  }
  @scala.inline
  implicit class IPaneOps[Self <: IPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMap(value: () => Map_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOverflow(value: () => visible | hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverflow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZIndex")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

