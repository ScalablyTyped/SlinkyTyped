package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaEncodeEntry extends LineEncodeEntry {
  var orient: js.UndefOr[ProductionRule[ScaledValueRef[Orientation]]] = js.native
}

object AreaEncodeEntry {
  @scala.inline
  def apply(): AreaEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaEncodeEntry]
  }
  @scala.inline
  implicit class AreaEncodeEntryOps[Self <: AreaEncodeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrient(value: ProductionRule[ScaledValueRef[Orientation]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
  }
  
}

