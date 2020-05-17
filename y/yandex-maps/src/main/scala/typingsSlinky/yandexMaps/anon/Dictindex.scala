package typingsSlinky.yandexMaps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictindex
  extends /* index */ StringDictionary[js.Any] {
  var activeRouteAutoSelection: js.UndefOr[Boolean] = js.native
  var boundsAutoApply: js.UndefOr[Boolean] = js.native
  var dragUpdateInterval: js.UndefOr[String | Double] = js.native
  var preventDragUpdate: js.UndefOr[Boolean] = js.native
  var useMapMargin: js.UndefOr[Boolean] = js.native
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
}

object Dictindex {
  @scala.inline
  def apply(): Dictindex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictindex]
  }
  @scala.inline
  implicit class DictindexOps[Self <: Dictindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveRouteAutoSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRouteAutoSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveRouteAutoSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRouteAutoSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsAutoApply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsAutoApply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsAutoApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsAutoApply")(js.undefined)
        ret
    }
    @scala.inline
    def withDragUpdateInterval(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragUpdateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragUpdateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDragUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDragUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDragUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDragUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMapMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMapMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMargin")(js.undefined)
        ret
    }
  }
  
}

