package typingsSlinky.uiGrid.mod

import typingsSlinky.uiGrid.anon.AVG_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISharedTreeConstants extends js.Object {
  var COLLAPSED: String = js.native
  var EXPANDED: String = js.native
  var aggregation: AVG_ = js.native
  var rowHeaderColName: String = js.native
}

object ISharedTreeConstants {
  @scala.inline
  def apply(COLLAPSED: String, EXPANDED: String, aggregation: AVG_, rowHeaderColName: String): ISharedTreeConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedTreeConstants]
  }
  @scala.inline
  implicit class ISharedTreeConstantsOps[Self <: ISharedTreeConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOLLAPSED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COLLAPSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXPANDED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXPANDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregation(value: AVG_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeaderColName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderColName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

