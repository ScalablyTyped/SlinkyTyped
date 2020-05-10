package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseGeometry extends IEventEmitter {
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getType(): String = js.native
}

object IBaseGeometry {
  @scala.inline
  def apply(events: IEventManager, getBounds: () => js.Array[js.Array[Double]] | Null, getType: () => String): IBaseGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[IBaseGeometry]
  }
  @scala.inline
  implicit class IBaseGeometryOps[Self <: IBaseGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBounds(value: () => js.Array[js.Array[Double]] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

