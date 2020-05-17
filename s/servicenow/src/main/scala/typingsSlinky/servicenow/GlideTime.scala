package typingsSlinky.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideTime extends js.Object {
  def getByFormat(format: String): String = js.native
  def getDisplayValue(): String = js.native
  def getDisplayValueinternal(): String = js.native
  def getValue(): String = js.native
  def setDisplayValue(asDisplayed: String): Unit = js.native
  def setValue(o: String): Unit = js.native
  def subtract(start: GlideTime, end: GlideTime): GlideDuration = js.native
}

object GlideTime {
  @scala.inline
  def apply(
    getByFormat: String => String,
    getDisplayValue: () => String,
    getDisplayValueinternal: () => String,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: String => Unit,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDisplayValueinternal = js.Any.fromFunction0(getDisplayValueinternal), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
  @scala.inline
  implicit class GlideTimeOps[Self <: GlideTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetByFormat(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisplayValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplayValueinternal(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayValueinternal")(js.Any.fromFunction0(value))
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
    def withSetValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubtract(value: (GlideTime, GlideTime) => GlideDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtract")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

