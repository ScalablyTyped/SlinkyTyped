package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinearRingGeometryAccess extends IFreezable {
  def contain(position: Double): Boolean = js.native
  def get(index: Double): js.Array[Double] = js.native
  def getChildGeometry(index: Double): IPointGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[Double]] = js.native
  def getFillRule(): String = js.native
  def getLength(): Double = js.native
  def insert(index: Double, coordinates: js.Array[Double]): ILinearRingGeometryAccess = js.native
  def remove(index: Double): js.Array[Double] = js.native
  def set(index: Double, coordinates: js.Array[Double]): ILinearRingGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): ILinearRingGeometryAccess = js.native
  def setFillRule(fillRule: String): ILinearRingGeometryAccess = js.native
  def splice(index: Double, number: Double): js.Array[js.Array[Double]] = js.native
}

object ILinearRingGeometryAccess {
  @scala.inline
  def apply(
    contain: Double => Boolean,
    events: IEventManager,
    freeze: () => IFreezable,
    get: Double => js.Array[Double],
    getChildGeometry: Double => IPointGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[Double]],
    getFillRule: () => String,
    getLength: () => Double,
    insert: (Double, js.Array[Double]) => ILinearRingGeometryAccess,
    isFrozen: () => Boolean,
    remove: Double => js.Array[Double],
    set: (Double, js.Array[Double]) => ILinearRingGeometryAccess,
    setCoordinates: js.Array[js.Array[Double]] => ILinearRingGeometryAccess,
    setFillRule: String => ILinearRingGeometryAccess,
    splice: (Double, Double) => js.Array[js.Array[Double]],
    unfreeze: () => IFreezable
  ): ILinearRingGeometryAccess = {
    val __obj = js.Dynamic.literal(contain = js.Any.fromFunction1(contain), events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[ILinearRingGeometryAccess]
  }
  @scala.inline
  implicit class ILinearRingGeometryAccessOps[Self <: ILinearRingGeometryAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContain(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildGeometry(value: Double => IPointGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildGeometry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetClosest(value: js.Array[Double] => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClosest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCoordinates(value: () => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordinates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFillRule(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFillRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, js.Array[Double]) => ILinearRingGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, js.Array[Double]) => ILinearRingGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetCoordinates(value: js.Array[js.Array[Double]] => ILinearRingGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCoordinates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFillRule(value: String => ILinearRingGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFillRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplice(value: (Double, Double) => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

