package typingsSlinky.yandexMaps.anon

import typingsSlinky.yandexMaps.mod.IProjection
import typingsSlinky.yandexMaps.yandexMapsStrings.jumpy
import typingsSlinky.yandexMaps.yandexMapsStrings.shortestPath
import typingsSlinky.yandexMaps.yandexMapsStrings.static
import typingsSlinky.yandexMaps.yandexMapsStrings.straightPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordRendering extends js.Object {
  var coordRendering: js.UndefOr[shortestPath | straightPath] = js.native
  var geodesic: js.UndefOr[Boolean] = js.native
  var pixelRendering: js.UndefOr[jumpy | static] = js.native
  var projection: js.UndefOr[IProjection] = js.native
  var simplification: js.UndefOr[Boolean] = js.native
}

object CoordRendering {
  @scala.inline
  def apply(): CoordRendering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordRendering]
  }
  @scala.inline
  implicit class CoordRenderingOps[Self <: CoordRendering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordRendering(value: shortestPath | straightPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withGeodesic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeodesic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRendering(value: jumpy | static): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: IProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplification")(js.undefined)
        ret
    }
  }
  
}

