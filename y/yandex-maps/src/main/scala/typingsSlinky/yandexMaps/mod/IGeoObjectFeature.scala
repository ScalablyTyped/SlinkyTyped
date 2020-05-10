package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoObjectFeature extends js.Object {
  var geometry: js.UndefOr[IGeometry | IGeometryJson] = js.native
  var properties: js.UndefOr[IDataManager | js.Object] = js.native
}

object IGeoObjectFeature {
  @scala.inline
  def apply(): IGeoObjectFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoObjectFeature]
  }
  @scala.inline
  implicit class IGeoObjectFeatureOps[Self <: IGeoObjectFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: IGeometry | IGeometryJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: IDataManager | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

