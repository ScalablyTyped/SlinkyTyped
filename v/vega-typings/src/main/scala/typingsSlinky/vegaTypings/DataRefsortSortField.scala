package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.ScaleField
import typingsSlinky.vegaTypings.scaleMod.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/scale.DataRef & {  sort ? :vega-typings.vega-typings/types/spec/scale.SortField} */
trait DataRefsortSortField extends js.Object {
  var data: String
  var field: ScaleField
  var sort: js.UndefOr[SortField] = js.undefined
}

object DataRefsortSortField {
  @scala.inline
  def apply(data: String, field: ScaleField, sort: SortField = null): DataRefsortSortField = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRefsortSortField]
  }
}

