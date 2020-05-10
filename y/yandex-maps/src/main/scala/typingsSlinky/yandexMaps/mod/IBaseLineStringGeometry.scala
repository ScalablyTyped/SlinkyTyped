package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typingsSlinky.yandexMaps.mod.ILineStringGeometryAccess because var conflicts: events. Inlined get, getChildGeometry, getClosest, getCoordinates, getLength, insert, remove, set, setCoordinates, splice */ @js.native
trait IBaseLineStringGeometry extends IBaseGeometry {
  def freeze(): IFreezable = js.native
  def get(index: Double): js.Array[Double] = js.native
  def getChildGeometry(index: Double): IPointGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[Double]] = js.native
  def getLength(): Double = js.native
  def insert(index: Double, coordinates: js.Array[js.Array[Double]]): ILineStringGeometryAccess = js.native
  def isFrozen(): Boolean = js.native
  def remove(index: Double): js.Array[Double] = js.native
  def set(index: Double, coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[Double]): ILineStringGeometryAccess = js.native
  def splice(index: Double, length: Double): js.Array[js.Array[Double]] = js.native
  def unfreeze(): IFreezable = js.native
}

object IBaseLineStringGeometry {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: () => IFreezable,
    get: Double => js.Array[Double],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getChildGeometry: Double => IPointGeometryAccess,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[Double]],
    getLength: () => Double,
    getType: () => String,
    insert: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess,
    isFrozen: () => Boolean,
    remove: Double => js.Array[Double],
    set: (Double, js.Array[Double]) => ILineStringGeometryAccess,
    setCoordinates: js.Array[Double] => ILineStringGeometryAccess,
    splice: (Double, Double) => js.Array[js.Array[Double]],
    unfreeze: () => IFreezable
  ): IBaseLineStringGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = js.Any.fromFunction0(freeze), get = js.Any.fromFunction1(get), getBounds = js.Any.fromFunction0(getBounds), getChildGeometry = js.Any.fromFunction1(getChildGeometry), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType), insert = js.Any.fromFunction2(insert), isFrozen = js.Any.fromFunction0(isFrozen), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setCoordinates = js.Any.fromFunction1(setCoordinates), splice = js.Any.fromFunction2(splice), unfreeze = js.Any.fromFunction0(unfreeze))
    __obj.asInstanceOf[IBaseLineStringGeometry]
  }
  @scala.inline
  implicit class IBaseLineStringGeometryOps[Self <: IBaseLineStringGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreeze(value: () => IFreezable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(js.Any.fromFunction0(value))
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
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, js.Array[js.Array[Double]]) => ILineStringGeometryAccess): Self = {
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
    def withRemove(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, js.Array[Double]) => ILineStringGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetCoordinates(value: js.Array[Double] => ILineStringGeometryAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCoordinates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplice(value: (Double, Double) => js.Array[js.Array[Double]]): Self = {
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

