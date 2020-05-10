package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjection extends js.Object {
  def fromGlobalPixels(globalPixelPoint: js.Array[Double], zoom: Double): js.Array[Double] = js.native
  def getCoordSystem(): ICoordSystem = js.native
  def isCycled(): js.Array[Boolean] = js.native
  def toGlobalPixels(coordPoint: js.Array[Double], zoom: Double): js.Array[Double] = js.native
}

object IProjection {
  @scala.inline
  def apply(
    fromGlobalPixels: (js.Array[Double], Double) => js.Array[Double],
    getCoordSystem: () => ICoordSystem,
    isCycled: () => js.Array[Boolean],
    toGlobalPixels: (js.Array[Double], Double) => js.Array[Double]
  ): IProjection = {
    val __obj = js.Dynamic.literal(fromGlobalPixels = js.Any.fromFunction2(fromGlobalPixels), getCoordSystem = js.Any.fromFunction0(getCoordSystem), isCycled = js.Any.fromFunction0(isCycled), toGlobalPixels = js.Any.fromFunction2(toGlobalPixels))
    __obj.asInstanceOf[IProjection]
  }
  @scala.inline
  implicit class IProjectionOps[Self <: IProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromGlobalPixels")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCoordSystem(value: () => ICoordSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordSystem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCycled(value: () => js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCycled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toGlobalPixels")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

