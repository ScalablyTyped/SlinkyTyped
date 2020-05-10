package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.yandexMapsStrings.auto
import typingsSlinky.yandexMaps.yandexMapsStrings.masstransit
import typingsSlinky.yandexMaps.yandexMapsStrings.pedestrian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiRouteParams extends js.Object {
  var avoidTrafficJams: js.UndefOr[Boolean] = js.native
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.native
  var requestSendInterval: js.UndefOr[String | Double] = js.native
  var results: js.UndefOr[Double] = js.native
  var reverseGeocoding: js.UndefOr[Boolean] = js.native
  var routingMode: js.UndefOr[auto | masstransit | pedestrian] = js.native
  var searchCoordOrder: js.UndefOr[String] = js.native
  var strictBounds: js.UndefOr[Boolean] = js.native
  var viaIndexes: js.UndefOr[js.Array[Double]] = js.native
}

object IMultiRouteParams {
  @scala.inline
  def apply(): IMultiRouteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiRouteParams]
  }
  @scala.inline
  implicit class IMultiRouteParamsOps[Self <: IMultiRouteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidTrafficJams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidTrafficJams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidTrafficJams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidTrafficJams")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundedBy(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundedByNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundedBy")(null)
        ret
    }
    @scala.inline
    def withRequestSendInterval(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestSendInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestSendInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestSendInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseGeocoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseGeocoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseGeocoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseGeocoding")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingMode(value: auto | masstransit | pedestrian): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchCoordOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchCoordOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchCoordOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchCoordOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withViaIndexes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViaIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viaIndexes")(js.undefined)
        ret
    }
  }
  
}

