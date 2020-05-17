package typingsSlinky.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeedLoadMoreData extends js.Object {
  /**
    * This event fires when scroll reaches bottom percentage of grid and needs to load data
    */
  var needLoadMoreData: js.Function = js.native
  /**
    * This event fires when scroll reaches top percentage of grid and needs to load data
    */
  var needLoadMoreDataTop: js.Function = js.native
}

object NeedLoadMoreData {
  @scala.inline
  def apply(needLoadMoreData: js.Function, needLoadMoreDataTop: js.Function): NeedLoadMoreData = {
    val __obj = js.Dynamic.literal(needLoadMoreData = needLoadMoreData.asInstanceOf[js.Any], needLoadMoreDataTop = needLoadMoreDataTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedLoadMoreData]
  }
  @scala.inline
  implicit class NeedLoadMoreDataOps[Self <: NeedLoadMoreData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeedLoadMoreData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needLoadMoreData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedLoadMoreDataTop(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needLoadMoreDataTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

