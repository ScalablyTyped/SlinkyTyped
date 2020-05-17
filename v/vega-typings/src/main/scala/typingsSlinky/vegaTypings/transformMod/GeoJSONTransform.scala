package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.vegaTypingsStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONTransform extends Transforms {
  var fields: js.UndefOr[Vector2[FieldRef] | SignalRef] = js.native
  var geojson: js.UndefOr[FieldRef] = js.native
  var signal: js.UndefOr[SignalName] = js.native
  var `type`: geojson = js.native
}

object GeoJSONTransform {
  @scala.inline
  def apply(`type`: geojson): GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONTransform]
  }
  @scala.inline
  implicit class GeoJSONTransformOps[Self <: GeoJSONTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: geojson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: Vector2[FieldRef] | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withGeojson(value: FieldRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geojson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeojson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geojson")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: SignalName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
  }
  
}

