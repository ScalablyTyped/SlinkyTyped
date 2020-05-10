package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeometryEditorModel extends IEventEmitter {
  def destroy(): Unit = js.native
  def getPixels(): js.Array[Double] = js.native
}

object IGeometryEditorModel {
  @scala.inline
  def apply(destroy: () => Unit, events: IEventManager, getPixels: () => js.Array[Double]): IGeometryEditorModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getPixels = js.Any.fromFunction0(getPixels))
    __obj.asInstanceOf[IGeometryEditorModel]
  }
  @scala.inline
  implicit class IGeometryEditorModelOps[Self <: IGeometryEditorModel] (val x: Self) extends AnyVal {
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
    def withGetPixels(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPixels")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

