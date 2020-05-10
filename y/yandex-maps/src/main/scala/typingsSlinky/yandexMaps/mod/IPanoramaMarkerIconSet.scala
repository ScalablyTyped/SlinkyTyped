package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanoramaMarkerIconSet extends js.Object {
  var default: IPanoramaMarkerIcon | Null = js.native
  var expanded: IPanoramaMarkerIcon | Null = js.native
  var expandedHovered: IPanoramaMarkerIcon | Null = js.native
  var hovered: IPanoramaMarkerIcon | Null = js.native
}

object IPanoramaMarkerIconSet {
  @scala.inline
  def apply(): IPanoramaMarkerIconSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanoramaMarkerIconSet]
  }
  @scala.inline
  implicit class IPanoramaMarkerIconSetOps[Self <: IPanoramaMarkerIconSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: IPanoramaMarkerIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(null)
        ret
    }
    @scala.inline
    def withExpanded(value: IPanoramaMarkerIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(null)
        ret
    }
    @scala.inline
    def withExpandedHovered(value: IPanoramaMarkerIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedHoveredNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedHovered")(null)
        ret
    }
    @scala.inline
    def withHovered(value: IPanoramaMarkerIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoveredNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovered")(null)
        ret
    }
  }
  
}

