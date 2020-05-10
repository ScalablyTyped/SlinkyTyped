package typingsSlinky.winrt.Windows.Data.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonValue extends js.Object {
  var valueType: JsonValueType = js.native
  def getArray(): JsonArray = js.native
  def getBoolean(): Boolean = js.native
  def getNumber(): Double = js.native
  def getObject(): JsonObject = js.native
  def getString(): String = js.native
  def stringify(): String = js.native
}

object IJsonValue {
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getBoolean: () => Boolean,
    getNumber: () => Double,
    getObject: () => JsonObject,
    getString: () => String,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonValue = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonValue]
  }
  @scala.inline
  implicit class IJsonValueOps[Self <: IJsonValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetArray(value: () => JsonArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBoolean(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetObject(value: () => JsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStringify(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValueType(value: JsonValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

