package typingsSlinky.tablesorter.defaultValueOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultValueOptions[T] extends js.Object {
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[T] = js.native
}

object DefaultValueOptions {
  @scala.inline
  def apply[T](): DefaultValueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValueOptions[T]]
  }
  @scala.inline
  implicit class DefaultValueOptionsOps[Self[t] <: DefaultValueOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

