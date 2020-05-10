package typingsSlinky.staticmaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMapsOptions extends js.Object {
  var height: Double = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var paddingX: js.UndefOr[Double] = js.native
  var paddingY: js.UndefOr[Double] = js.native
  var reverseY: js.UndefOr[Boolean] = js.native
  var tileRequestHeader: js.UndefOr[js.Object] = js.native
  var tileRequestTimeout: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var tileUrl: js.UndefOr[String] = js.native
  var width: Double = js.native
}

object StaticMapsOptions {
  @scala.inline
  def apply(height: Double, width: Double): StaticMapsOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapsOptions]
  }
  @scala.inline
  implicit class StaticMapsOptionsOps[Self <: StaticMapsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingX")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingY")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseY")(js.undefined)
        ret
    }
    @scala.inline
    def withTileRequestHeader(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRequestHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileRequestHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRequestHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTileRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRequestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRequestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrl")(js.undefined)
        ret
    }
  }
  
}

