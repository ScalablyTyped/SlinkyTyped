package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMethods extends js.Object {
  def any(property: String, data: js.Any): Unit = js.native
  def count(property: String, data: js.Any): Unit = js.native
  def max(property: String, data: js.Any): Unit = js.native
  def min(property: String, data: js.Any): Unit = js.native
  def string(property: String, data: js.Any): Unit = js.native
  def sum(property: String, data: js.Any): Unit = js.native
}

object GroupMethods {
  @scala.inline
  def apply(
    any: (String, js.Any) => Unit,
    count: (String, js.Any) => Unit,
    max: (String, js.Any) => Unit,
    min: (String, js.Any) => Unit,
    string: (String, js.Any) => Unit,
    sum: (String, js.Any) => Unit
  ): GroupMethods = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), count = js.Any.fromFunction2(count), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), string = js.Any.fromFunction2(string), sum = js.Any.fromFunction2(sum))
    __obj.asInstanceOf[GroupMethods]
  }
  @scala.inline
  implicit class GroupMethodsOps[Self <: GroupMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAny(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCount(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMax(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMin(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withString(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSum(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

