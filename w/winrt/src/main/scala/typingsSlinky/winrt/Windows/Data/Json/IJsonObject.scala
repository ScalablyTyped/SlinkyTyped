package typingsSlinky.winrt.Windows.Data.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonObject extends IJsonValue {
  def getNamedArray(name: String): JsonArray = js.native
  def getNamedBoolean(name: String): Boolean = js.native
  def getNamedNumber(name: String): Double = js.native
  def getNamedObject(name: String): JsonObject = js.native
  def getNamedString(name: String): String = js.native
  def getNamedValue(name: String): JsonValue = js.native
  def setNamedValue(name: String, value: IJsonValue): Unit = js.native
}

object IJsonObject {
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getBoolean: () => Boolean,
    getNamedArray: String => JsonArray,
    getNamedBoolean: String => Boolean,
    getNamedNumber: String => Double,
    getNamedObject: String => JsonObject,
    getNamedString: String => String,
    getNamedValue: String => JsonValue,
    getNumber: () => Double,
    getObject: () => JsonObject,
    getString: () => String,
    setNamedValue: (String, IJsonValue) => Unit,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonObject = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNamedArray = js.Any.fromFunction1(getNamedArray), getNamedBoolean = js.Any.fromFunction1(getNamedBoolean), getNamedNumber = js.Any.fromFunction1(getNamedNumber), getNamedObject = js.Any.fromFunction1(getNamedObject), getNamedString = js.Any.fromFunction1(getNamedString), getNamedValue = js.Any.fromFunction1(getNamedValue), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), setNamedValue = js.Any.fromFunction2(setNamedValue), stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonObject]
  }
  @scala.inline
  implicit class IJsonObjectOps[Self <: IJsonObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNamedArray(value: String => JsonArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamedArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedBoolean(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamedBoolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedNumber(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamedNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedObject(value: String => JsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamedObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedString(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamedString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedValue(value: String => JsonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamedValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNamedValue(value: (String, IJsonValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamedValue")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

