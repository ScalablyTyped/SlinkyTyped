package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.mod.map.action.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapAction extends IEventEmitter {
  def begin(mapActionManager: Manager): Unit = js.native
  def end(): Unit = js.native
}

object IMapAction {
  @scala.inline
  def apply(begin: Manager => Unit, end: () => Unit, events: IEventManager): IMapAction = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapAction]
  }
  @scala.inline
  implicit class IMapActionOps[Self <: IMapAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: Manager => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

