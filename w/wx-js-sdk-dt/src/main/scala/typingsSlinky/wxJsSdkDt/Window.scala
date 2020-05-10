package typingsSlinky.wxJsSdkDt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /**
    * iOS微信6.5.3及其之后的版本 window.__wxjs_is_wkwebview 为true时是使用WKWebview，为 false或者 “undefine”时是 UIWebview
    */
  var __wxjs_is_wkwebview: js.UndefOr[Boolean] = js.native
}

object Window {
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__wxjs_is_wkwebview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__wxjs_is_wkwebview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__wxjs_is_wkwebview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__wxjs_is_wkwebview")(js.undefined)
        ret
    }
  }
  
}

