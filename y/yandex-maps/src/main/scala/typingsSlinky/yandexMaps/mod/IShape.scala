package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShape extends js.Object {
  def contains(position: js.Array[Double]): Boolean = js.native
  def equals(shape: IShape): Boolean = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getGeometry(): IPixelGeometry = js.native
  def getType(): String = js.native
  def scale(factor: Double): IShape = js.native
  def shift(offset: js.Array[Double]): IShape = js.native
}

object IShape {
  @scala.inline
  def apply(
    contains: js.Array[Double] => Boolean,
    equals: IShape => Boolean,
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getGeometry: () => IPixelGeometry,
    getType: () => String,
    scale: Double => IShape,
    shift: js.Array[Double] => IShape
  ): IShape = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), equals = js.Any.fromFunction1(equals), getBounds = js.Any.fromFunction0(getBounds), getGeometry = js.Any.fromFunction0(getGeometry), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.asInstanceOf[IShape]
  }
  @scala.inline
  implicit class IShapeOps[Self <: IShape] (val x: Self) extends AnyVal {
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
    def withEquals(value: IShape => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBounds(value: () => js.Array[js.Array[Double]] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGeometry(value: () => IPixelGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGeometry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScale(value: Double => IShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShift(value: js.Array[Double] => IShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

