package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollection extends IEventEmitter {
  def add(`object`: js.Object): this.type = js.native
  def getIterator(): IIterator = js.native
  def remove(`object`: js.Object): this.type = js.native
}

object ICollection {
  @scala.inline
  def apply(
    add: js.Object => ICollection,
    events: IEventManager,
    getIterator: () => IIterator,
    remove: js.Object => ICollection
  ): ICollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events.asInstanceOf[js.Any], getIterator = js.Any.fromFunction0(getIterator), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ICollection]
  }
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: js.Object => ICollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIterator(value: () => IIterator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIterator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: js.Object => ICollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

