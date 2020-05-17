package typingsSlinky.topojson.anon

import typingsSlinky.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Counties extends js.Object {
  var counties: Geometries = js.native
  var nation: GeometryCollection[js.Object] = js.native
  var states: Geometries = js.native
}

object Counties {
  @scala.inline
  def apply(counties: Geometries, nation: GeometryCollection[js.Object], states: Geometries): Counties = {
    val __obj = js.Dynamic.literal(counties = counties.asInstanceOf[js.Any], nation = nation.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counties]
  }
  @scala.inline
  implicit class CountiesOps[Self <: Counties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounties(value: Geometries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNation(value: GeometryCollection[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: Geometries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

