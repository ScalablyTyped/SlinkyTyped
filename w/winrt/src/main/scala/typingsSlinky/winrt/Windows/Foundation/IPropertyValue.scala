package typingsSlinky.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValue extends js.Object {
  var isNumericScalar: Boolean = js.native
  var `type`: PropertyType = js.native
  def getBoolean(): Boolean = js.native
  def getBooleanArray(): js.Array[Boolean] = js.native
  def getChar16(): String = js.native
  def getChar16Array(): js.Array[String] = js.native
  def getDateTime(): js.Date = js.native
  def getDateTimeArray(): js.Array[js.Date] = js.native
  def getDouble(): Double = js.native
  def getDoubleArray(): js.typedarray.Float64Array = js.native
  def getGuid(): String = js.native
  def getGuidArray(): js.Array[String] = js.native
  def getInspectableArray(): js.Array[_] = js.native
  def getInt16(): Double = js.native
  def getInt16Array(): js.typedarray.Int16Array = js.native
  def getInt32(): Double = js.native
  def getInt32Array(): js.typedarray.Int32Array = js.native
  def getInt64(): Double = js.native
  def getInt64Array(): js.Array[Double] = js.native
  def getPoint(): Point = js.native
  def getPointArray(): js.Array[Point] = js.native
  def getRect(): Rect = js.native
  def getRectArray(): js.Array[Rect] = js.native
  def getSingle(): Double = js.native
  def getSingleArray(): js.typedarray.Float32Array = js.native
  def getSize(): Size = js.native
  def getSizeArray(): js.Array[Size] = js.native
  def getString(): String = js.native
  def getStringArray(): js.Array[String] = js.native
  def getTimeSpan(): Double = js.native
  def getTimeSpanArray(): js.Array[Double] = js.native
  def getUInt16(): Double = js.native
  def getUInt16Array(): js.typedarray.Uint16Array = js.native
  def getUInt32(): Double = js.native
  def getUInt32Array(): js.typedarray.Uint32Array = js.native
  def getUInt64(): Double = js.native
  def getUInt64Array(): js.Array[Double] = js.native
  def getUInt8(): Double = js.native
  def getUInt8Array(): js.typedarray.Uint8Array = js.native
}

object IPropertyValue {
  @scala.inline
  def apply(
    getBoolean: () => Boolean,
    getBooleanArray: () => js.Array[Boolean],
    getChar16: () => String,
    getChar16Array: () => js.Array[String],
    getDateTime: () => js.Date,
    getDateTimeArray: () => js.Array[js.Date],
    getDouble: () => Double,
    getDoubleArray: () => js.typedarray.Float64Array,
    getGuid: () => String,
    getGuidArray: () => js.Array[String],
    getInspectableArray: () => js.Array[_],
    getInt16: () => Double,
    getInt16Array: () => js.typedarray.Int16Array,
    getInt32: () => Double,
    getInt32Array: () => js.typedarray.Int32Array,
    getInt64: () => Double,
    getInt64Array: () => js.Array[Double],
    getPoint: () => Point,
    getPointArray: () => js.Array[Point],
    getRect: () => Rect,
    getRectArray: () => js.Array[Rect],
    getSingle: () => Double,
    getSingleArray: () => js.typedarray.Float32Array,
    getSize: () => Size,
    getSizeArray: () => js.Array[Size],
    getString: () => String,
    getStringArray: () => js.Array[String],
    getTimeSpan: () => Double,
    getTimeSpanArray: () => js.Array[Double],
    getUInt16: () => Double,
    getUInt16Array: () => js.typedarray.Uint16Array,
    getUInt32: () => Double,
    getUInt32Array: () => js.typedarray.Uint32Array,
    getUInt64: () => Double,
    getUInt64Array: () => js.Array[Double],
    getUInt8: () => Double,
    getUInt8Array: () => js.typedarray.Uint8Array,
    isNumericScalar: Boolean,
    `type`: PropertyType
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(getBoolean = js.Any.fromFunction0(getBoolean), getBooleanArray = js.Any.fromFunction0(getBooleanArray), getChar16 = js.Any.fromFunction0(getChar16), getChar16Array = js.Any.fromFunction0(getChar16Array), getDateTime = js.Any.fromFunction0(getDateTime), getDateTimeArray = js.Any.fromFunction0(getDateTimeArray), getDouble = js.Any.fromFunction0(getDouble), getDoubleArray = js.Any.fromFunction0(getDoubleArray), getGuid = js.Any.fromFunction0(getGuid), getGuidArray = js.Any.fromFunction0(getGuidArray), getInspectableArray = js.Any.fromFunction0(getInspectableArray), getInt16 = js.Any.fromFunction0(getInt16), getInt16Array = js.Any.fromFunction0(getInt16Array), getInt32 = js.Any.fromFunction0(getInt32), getInt32Array = js.Any.fromFunction0(getInt32Array), getInt64 = js.Any.fromFunction0(getInt64), getInt64Array = js.Any.fromFunction0(getInt64Array), getPoint = js.Any.fromFunction0(getPoint), getPointArray = js.Any.fromFunction0(getPointArray), getRect = js.Any.fromFunction0(getRect), getRectArray = js.Any.fromFunction0(getRectArray), getSingle = js.Any.fromFunction0(getSingle), getSingleArray = js.Any.fromFunction0(getSingleArray), getSize = js.Any.fromFunction0(getSize), getSizeArray = js.Any.fromFunction0(getSizeArray), getString = js.Any.fromFunction0(getString), getStringArray = js.Any.fromFunction0(getStringArray), getTimeSpan = js.Any.fromFunction0(getTimeSpan), getTimeSpanArray = js.Any.fromFunction0(getTimeSpanArray), getUInt16 = js.Any.fromFunction0(getUInt16), getUInt16Array = js.Any.fromFunction0(getUInt16Array), getUInt32 = js.Any.fromFunction0(getUInt32), getUInt32Array = js.Any.fromFunction0(getUInt32Array), getUInt64 = js.Any.fromFunction0(getUInt64), getUInt64Array = js.Any.fromFunction0(getUInt64Array), getUInt8 = js.Any.fromFunction0(getUInt8), getUInt8Array = js.Any.fromFunction0(getUInt8Array), isNumericScalar = isNumericScalar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
  @scala.inline
  implicit class IPropertyValueOps[Self <: IPropertyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBoolean(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBooleanArray(value: () => js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBooleanArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChar16(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChar16")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChar16Array(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChar16Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDateTime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDateTimeArray(value: () => js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateTimeArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDouble(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDouble")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDoubleArray(value: () => js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDoubleArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGuid(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGuidArray(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGuidArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInspectableArray(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInspectableArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInt16(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt16")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInt16Array(value: () => js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt16Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInt32(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt32")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInt32Array(value: () => js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt32Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInt64(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt64")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInt64Array(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt64Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPoint(value: () => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPointArray(value: () => js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPointArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRect(value: () => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRectArray(value: () => js.Array[Rect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRectArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSingle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSingle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSingleArray(value: () => js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSingleArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSizeArray(value: () => js.Array[Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStringArray(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeSpan(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeSpanArray(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeSpanArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt16(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt16")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt16Array(value: () => js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt16Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt32(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt32")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt32Array(value: () => js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt32Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt64(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt64")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt64Array(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt64Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt8(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt8")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUInt8Array(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUInt8Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNumericScalar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumericScalar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

