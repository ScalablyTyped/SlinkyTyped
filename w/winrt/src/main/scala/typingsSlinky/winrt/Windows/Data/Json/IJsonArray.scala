package typingsSlinky.winrt.Windows.Data.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonArray extends IJsonValue {
  def getArrayAt(index: Double): JsonArray = js.native
  def getBooleanAt(index: Double): Boolean = js.native
  def getNumberAt(index: Double): Double = js.native
  def getObjectAt(index: Double): JsonObject = js.native
  def getStringAt(index: Double): String = js.native
}

object IJsonArray {
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getArrayAt: Double => JsonArray,
    getBoolean: () => Boolean,
    getBooleanAt: Double => Boolean,
    getNumber: () => Double,
    getNumberAt: Double => Double,
    getObject: () => JsonObject,
    getObjectAt: Double => JsonObject,
    getString: () => String,
    getStringAt: Double => String,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonArray = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getArrayAt = js.Any.fromFunction1(getArrayAt), getBoolean = js.Any.fromFunction0(getBoolean), getBooleanAt = js.Any.fromFunction1(getBooleanAt), getNumber = js.Any.fromFunction0(getNumber), getNumberAt = js.Any.fromFunction1(getNumberAt), getObject = js.Any.fromFunction0(getObject), getObjectAt = js.Any.fromFunction1(getObjectAt), getString = js.Any.fromFunction0(getString), getStringAt = js.Any.fromFunction1(getStringAt), stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonArray]
  }
  @scala.inline
  implicit class IJsonArrayOps[Self <: IJsonArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetArrayAt(value: Double => JsonArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArrayAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBooleanAt(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBooleanAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumberAt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetObjectAt(value: Double => JsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObjectAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStringAt(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringAt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

