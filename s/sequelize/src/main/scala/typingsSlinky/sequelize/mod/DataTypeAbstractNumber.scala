package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeAbstractNumber[T] extends DataTypeAbstract {
  var UNSIGNED: T = js.native
  var ZEROFILL: T = js.native
}

object DataTypeAbstractNumber {
  @scala.inline
  def apply[T](UNSIGNED: T, ZEROFILL: T, dialectTypes: String): DataTypeAbstractNumber[T] = {
    val __obj = js.Dynamic.literal(UNSIGNED = UNSIGNED.asInstanceOf[js.Any], ZEROFILL = ZEROFILL.asInstanceOf[js.Any], dialectTypes = dialectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeAbstractNumber[T]]
  }
  @scala.inline
  implicit class DataTypeAbstractNumberOps[Self[t] <: DataTypeAbstractNumber[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withUNSIGNED(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSIGNED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZEROFILL(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZEROFILL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

