package typingsSlinky.viewportMercatorProject.anon

import typingsSlinky.viewportMercatorProject.mod.Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LngLat extends js.Object {
  var lngLat: Coordinates = js.native
  var pos: Coordinates = js.native
}

object LngLat {
  @scala.inline
  def apply(lngLat: Coordinates, pos: Coordinates): LngLat = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LngLat]
  }
  @scala.inline
  implicit class LngLatOps[Self <: LngLat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLngLat(value: Coordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngLat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Coordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

