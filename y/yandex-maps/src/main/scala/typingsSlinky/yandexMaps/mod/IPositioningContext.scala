package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositioningContext extends js.Object {
  def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double] = js.native
  def getZoom(): Double = js.native
  def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
}

object IPositioningContext {
  @scala.inline
  def apply(
    fromClientPixels: js.Array[Double] => js.Array[Double],
    getZoom: () => Double,
    toClientPixels: js.Array[Double] => js.Array[Double]
  ): IPositioningContext = {
    val __obj = js.Dynamic.literal(fromClientPixels = js.Any.fromFunction1(fromClientPixels), getZoom = js.Any.fromFunction0(getZoom), toClientPixels = js.Any.fromFunction1(toClientPixels))
    __obj.asInstanceOf[IPositioningContext]
  }
  @scala.inline
  implicit class IPositioningContextOps[Self <: IPositioningContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromClientPixels(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromClientPixels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetZoom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToClientPixels(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toClientPixels")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

