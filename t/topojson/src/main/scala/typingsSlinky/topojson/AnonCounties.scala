package typingsSlinky.topojson

import typingsSlinky.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCounties extends js.Object {
  var counties: AnonGeometries = js.native
  var nation: GeometryCollection[js.Object] = js.native
  var states: AnonGeometries = js.native
}

object AnonCounties {
  @scala.inline
  def apply(counties: AnonGeometries, nation: GeometryCollection[js.Object], states: AnonGeometries): AnonCounties = {
    val __obj = js.Dynamic.literal(counties = counties.asInstanceOf[js.Any], nation = nation.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounties]
  }
  @scala.inline
  implicit class AnonCountiesOps[Self <: AnonCounties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounties(value: AnonGeometries): Self = {
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
    def withStates(value: AnonGeometries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

