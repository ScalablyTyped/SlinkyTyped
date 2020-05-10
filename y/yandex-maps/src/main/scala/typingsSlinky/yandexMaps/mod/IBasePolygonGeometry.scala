package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typingsSlinky.yandexMaps.mod.IPolygonGeometryAccess because var conflicts: events. Inlined contains, get, getChildGeometry, getClosest, getCoordinates, getFillRule, getLength, insert, remove, set, setCoordinates, setFillRule, splice */ @js.native
trait IBasePolygonGeometry extends IBaseGeometry {
  def contains(position: js.Array[Double]): Boolean = js.native
  def freeze(): IFreezable = js.native
  def get(index: Double): js.Array[js.Array[Double]] = js.native
  def getChildGeometry(index: Double): ILinearRingGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[js.Array[Double]]] = js.native
  def getFillRule(): String = js.native
  def getLength(): Double = js.native
  def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
  def isFrozen(): Boolean = js.native
  def remove(index: Double): ILinearRingGeometryAccess = js.native
  def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Double]]]): IPolygonGeometryAccess = js.native
  def setFillRule(fillRule: String): IPolygonGeometryAccess = js.native
  def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess] = js.native
  def unfreeze(): IFreezable = js.native
}

object IBasePolygonGeometry {
  @scala.inline
  def apply(
    contains: js.Array[Double] => Boolean,
    events: IEventManager,
    freeze: () => IFreezable,
    get: Double => js.Array[js.Array[Double]],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getChildGeometry: Double => ILinearRingGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[js.Array[Double]]],
    getFillRule: () => String,
    getLength: () => Double,
    getType: () => String,
    insert: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    isFrozen: () => Boolean,
    remove: Double => ILinearRingGeometryAccess,
    set: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess,
    setCoordinates: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess,
    setFillRule: String => IPolygonGeometryAccess,
    splice: (Double, Double) => js.Array[ILinearRingGeometryAccess],
    unfreeze: () => IFreezable
  ): IBasePolygonGeometry = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getBounds = js.Any.fromFunction0(getBounds), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), setFillRule = js.Any.fromFunction1(setFillRule), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IBasePolygonGeometry]
  }
  @scala.inline
  implicit class IBasePolygonGeometryOps[Self <: IBasePolygonGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: js.Array[Double] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFreeze(value: () => IFreezable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildGeometry(value: Double => ILinearRingGeometryAccess): Self = {
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
    def withGetCoordinates(value: () => js.Array[js.Array[js.Array[Double]]]): Self = {
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
    def withInsert(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsFrozen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrozen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => ILinearRingGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, js.Array[js.Array[Double]]) => IPolygonGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetCoordinates(value: js.Array[js.Array[js.Array[Double]]] => IPolygonGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCoordinates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFillRule(value: String => IPolygonGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFillRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplice(value: (Double, Double) => js.Array[ILinearRingGeometryAccess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(js.Any.fromFunction2(value))
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

