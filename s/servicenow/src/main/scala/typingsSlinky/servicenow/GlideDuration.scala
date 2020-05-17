package typingsSlinky.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideDuration extends js.Object {
  def add(value: GlideDuration): GlideDuration = js.native
  def getByFormat(format: String): String = js.native
  def getDayPart(): Double = js.native
  def getDisplayValue(): String = js.native
  def getDurationValue(): String = js.native
  def getNumericValue(): Double = js.native
  def getRoundedDayPart(): Double = js.native
  def getValue(): String = js.native
  def setDisplayValue(asDisplayed: String): Unit = js.native
  def setValue(o: js.Object): Unit = js.native
  def subtract(value: GlideDuration): GlideDuration = js.native
}

object GlideDuration {
  @scala.inline
  def apply(
    add: GlideDuration => GlideDuration,
    getByFormat: String => String,
    getDayPart: () => Double,
    getDisplayValue: () => String,
    getDurationValue: () => String,
    getNumericValue: () => Double,
    getRoundedDayPart: () => Double,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: js.Object => Unit,
    subtract: GlideDuration => GlideDuration
  ): GlideDuration = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getByFormat = js.Any.fromFunction1(getByFormat), getDayPart = js.Any.fromFunction0(getDayPart), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDurationValue = js.Any.fromFunction0(getDurationValue), getNumericValue = js.Any.fromFunction0(getNumericValue), getRoundedDayPart = js.Any.fromFunction0(getRoundedDayPart), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction1(subtract))
    __obj.asInstanceOf[GlideDuration]
  }
  @scala.inline
  implicit class GlideDurationOps[Self <: GlideDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: GlideDuration => GlideDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetByFormat(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDayPart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayPart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplayValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDurationValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDurationValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumericValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumericValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRoundedDayPart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoundedDayPart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDisplayValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubtract(value: GlideDuration => GlideDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtract")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

