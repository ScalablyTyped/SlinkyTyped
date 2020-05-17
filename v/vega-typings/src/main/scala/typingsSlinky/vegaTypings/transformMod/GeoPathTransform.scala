package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.vegaTypingsStrings.geopath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoPathTransform extends Transforms {
  var as: js.UndefOr[String | SignalRef] = js.native
  var field: js.UndefOr[FieldRef] = js.native
  var pointRadius: js.UndefOr[Double | SignalRef | ExprRef] = js.native
  var projection: js.UndefOr[ProjectionName] = js.native
  var `type`: geopath = js.native
}

object GeoPathTransform {
  @scala.inline
  def apply(`type`: geopath): GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPathTransform]
  }
  @scala.inline
  implicit class GeoPathTransformOps[Self <: GeoPathTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: geopath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: FieldRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRadius(value: Double | SignalRef | ExprRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionName): Self = {
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
  }
  
}

