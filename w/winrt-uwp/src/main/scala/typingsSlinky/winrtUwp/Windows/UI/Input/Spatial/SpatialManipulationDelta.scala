package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialManipulationDelta extends js.Object {
  var translation: js.Any = js.native
}

object SpatialManipulationDelta {
  @scala.inline
  def apply(translation: js.Any): SpatialManipulationDelta = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationDelta]
  }
  @scala.inline
  implicit class SpatialManipulationDeltaOps[Self <: SpatialManipulationDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

