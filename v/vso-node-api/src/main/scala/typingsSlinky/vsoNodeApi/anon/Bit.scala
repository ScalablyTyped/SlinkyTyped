package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bit extends js.Object {
  var bit: scala.Double = js.native
  var dateTime: scala.Double = js.native
  var float: scala.Double = js.native
  var guid: scala.Double = js.native
  var int: scala.Double = js.native
  var string: scala.Double = js.native
}

object Bit {
  @scala.inline
  def apply(
    bit: scala.Double,
    dateTime: scala.Double,
    float: scala.Double,
    guid: scala.Double,
    int: scala.Double,
    string: scala.Double
  ): Bit = {
    val __obj = js.Dynamic.literal(bit = bit.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bit]
  }
  @scala.inline
  implicit class BitOps[Self <: Bit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

