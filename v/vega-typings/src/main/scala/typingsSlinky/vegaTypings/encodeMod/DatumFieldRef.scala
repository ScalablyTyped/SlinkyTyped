package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatumFieldRef extends Field {
  var datum: Field = js.native
}

object DatumFieldRef {
  @scala.inline
  def apply(datum: Field): DatumFieldRef = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumFieldRef]
  }
  @scala.inline
  implicit class DatumFieldRefOps[Self <: DatumFieldRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatum(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

