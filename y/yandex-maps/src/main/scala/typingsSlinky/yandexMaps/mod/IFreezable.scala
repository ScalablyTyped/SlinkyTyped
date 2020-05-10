package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFreezable extends js.Object {
  var events: IEventManager = js.native
  def freeze(): IFreezable = js.native
  def isFrozen(): Boolean = js.native
  def unfreeze(): IFreezable = js.native
}

object IFreezable {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    isFrozen: () => Boolean,
    unfreeze: () => IFreezable
  ): IFreezable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), isFrozen = js.Any.fromFunction0(isFrozen), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IFreezable]
  }
  @scala.inline
  implicit class IFreezableOps[Self <: IFreezable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: IEventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreeze(value: () => IFreezable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFrozen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrozen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnfreeze(value: () => IFreezable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfreeze")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

