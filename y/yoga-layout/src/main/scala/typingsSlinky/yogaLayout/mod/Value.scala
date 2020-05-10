package typingsSlinky.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  val unit: YogaUnit | Double = js.native
  val value: Double = js.native
  def fromJS(expose: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _]): Unit = js.native
}

object Value {
  @scala.inline
  def apply(
    fromJS: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _] => Unit,
    unit: YogaUnit | Double,
    value: Double
  ): Value = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromJS(value: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJS")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnit(value: YogaUnit | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

