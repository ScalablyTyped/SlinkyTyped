package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFirstIMapView extends js.Object {
  /** One half of the original map. */ var first: IMapView[String, ResourceMap] = js.native
  /** The second half of the original map. */ var second: IMapView[String, ResourceMap] = js.native
}

object AnonFirstIMapView {
  @scala.inline
  def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): AnonFirstIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstIMapView]
  }
  @scala.inline
  implicit class AnonFirstIMapViewOps[Self <: AnonFirstIMapView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: IMapView[String, ResourceMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: IMapView[String, ResourceMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

