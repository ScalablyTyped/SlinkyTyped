package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.UnionSortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSort extends js.Object {
  var sort: js.UndefOr[UnionSortField] = js.undefined
}

object AnonSort {
  @scala.inline
  def apply(sort: UnionSortField = null): AnonSort = {
    val __obj = js.Dynamic.literal()
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSort]
  }
}

