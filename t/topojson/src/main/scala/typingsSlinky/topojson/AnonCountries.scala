package typingsSlinky.topojson

import typingsSlinky.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCountries extends js.Object {
  var countries: AnonGeometries = js.native
  var land: GeometryCollection[js.Object] = js.native
}

object AnonCountries {
  @scala.inline
  def apply(countries: AnonGeometries, land: GeometryCollection[js.Object]): AnonCountries = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountries]
  }
  @scala.inline
  implicit class AnonCountriesOps[Self <: AnonCountries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountries(value: AnonGeometries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLand(value: GeometryCollection[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("land")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

