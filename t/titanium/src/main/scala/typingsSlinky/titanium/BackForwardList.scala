package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object returned to the <Titanium.UI.WebView.backForwardList> method.
  */
@js.native
trait BackForwardList extends js.Object {
  /**
  	 * The item immediately preceding the current item.
  	 */
  var backItem: js.UndefOr[BackForwardListItem] = js.native
  /**
  	 * The portion of the list preceding the current item.
  	 */
  var backList: js.UndefOr[js.Array[BackForwardListItem]] = js.native
  /**
  	 * The current item.
  	 */
  var currentItem: js.UndefOr[BackForwardListItem] = js.native
  /**
  	 * The item immediately following the current item.
  	 */
  var forwardItem: js.UndefOr[BackForwardListItem] = js.native
  /**
  	 * The portion of the list following the current item.
  	 */
  var forwardList: js.UndefOr[js.Array[BackForwardListItem]] = js.native
}

object BackForwardList {
  @scala.inline
  def apply(): BackForwardList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackForwardList]
  }
  @scala.inline
  implicit class BackForwardListOps[Self <: BackForwardList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackItem(value: BackForwardListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backItem")(js.undefined)
        ret
    }
    @scala.inline
    def withBackList(value: js.Array[BackForwardListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backList")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentItem(value: BackForwardListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItem")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardItem(value: BackForwardListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardItem")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardList(value: js.Array[BackForwardListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardList")(js.undefined)
        ret
    }
  }
  
}

