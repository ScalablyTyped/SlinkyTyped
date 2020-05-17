package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range
  extends ScaledValueRef[js.Any] {
  var range: Double | Boolean = js.native
  var scale: typingsSlinky.vegaTypings.encodeMod.Field = js.native
}

object Range {
  @scala.inline
  def apply(range: Double | Boolean, scale: typingsSlinky.vegaTypings.encodeMod.Field): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: typingsSlinky.vegaTypings.encodeMod.Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

