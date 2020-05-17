package typingsSlinky.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficImageZIndex extends js.Object {
  var trafficImageZIndex: js.UndefOr[Double] = js.native
  var trafficInfoZIndex: js.UndefOr[Double] = js.native
  var trafficJamZIndex: js.UndefOr[Double] = js.native
}

object TrafficImageZIndex {
  @scala.inline
  def apply(): TrafficImageZIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficImageZIndex]
  }
  @scala.inline
  implicit class TrafficImageZIndexOps[Self <: TrafficImageZIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficImageZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficImageZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficImageZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficImageZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficInfoZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficInfoZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficInfoZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficInfoZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficJamZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficJamZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficJamZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficJamZIndex")(js.undefined)
        ret
    }
  }
  
}

