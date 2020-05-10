package typingsSlinky.uniApp.Page

import typingsSlinky.uniApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInstanceBaseProps[D /* <: AnyObject */] extends js.Object {
  /**
    * 到当前页面的路径，类型为 `String`
    */
  var route: js.UndefOr[String] = js.native
}

object PageInstanceBaseProps {
  @scala.inline
  def apply[D](): PageInstanceBaseProps[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInstanceBaseProps[D]]
  }
  @scala.inline
  implicit class PageInstanceBasePropsOps[Self[d] <: PageInstanceBaseProps[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withRoute(value: String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
  }
  
}

