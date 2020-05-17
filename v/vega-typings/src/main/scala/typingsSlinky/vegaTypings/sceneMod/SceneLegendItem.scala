package typingsSlinky.vegaTypings.sceneMod

import typingsSlinky.vegaTypings.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLegendItem extends js.Object {
  var datum: Index = js.native
}

object SceneLegendItem {
  @scala.inline
  def apply(datum: Index): SceneLegendItem = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLegendItem]
  }
  @scala.inline
  implicit class SceneLegendItemOps[Self <: SceneLegendItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatum(value: Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

