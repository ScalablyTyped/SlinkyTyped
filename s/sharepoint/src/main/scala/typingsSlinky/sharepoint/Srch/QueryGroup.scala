package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryGroup extends js.Object {
  var dataProvider: DataProvider = js.native
  var displays: js.Array[DisplayControl] = js.native
  var name: String = js.native
  var searchBoxes: js.Array[Refinement] = js.native
}

object QueryGroup {
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    displays: js.Array[DisplayControl],
    name: String,
    searchBoxes: js.Array[Refinement]
  ): QueryGroup = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchBoxes = searchBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGroup]
  }
  @scala.inline
  implicit class QueryGroupOps[Self <: QueryGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataProvider(value: DataProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplays(value: js.Array[DisplayControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchBoxes(value: js.Array[Refinement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBoxes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

