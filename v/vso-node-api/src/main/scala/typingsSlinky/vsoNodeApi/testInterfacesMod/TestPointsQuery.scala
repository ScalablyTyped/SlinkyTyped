package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPointsQuery extends js.Object {
  var orderBy: String = js.native
  var points: js.Array[TestPoint] = js.native
  var pointsFilter: PointsFilter = js.native
  var witFields: js.Array[String] = js.native
}

object TestPointsQuery {
  @scala.inline
  def apply(
    orderBy: String,
    points: js.Array[TestPoint],
    pointsFilter: PointsFilter,
    witFields: js.Array[String]
  ): TestPointsQuery = {
    val __obj = js.Dynamic.literal(orderBy = orderBy.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsFilter = pointsFilter.asInstanceOf[js.Any], witFields = witFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPointsQuery]
  }
  @scala.inline
  implicit class TestPointsQueryOps[Self <: TestPointsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[TestPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointsFilter(value: PointsFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWitFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witFields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

