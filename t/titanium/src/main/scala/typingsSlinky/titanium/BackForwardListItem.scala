package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object represents a webpage in the back-forward of a web view.
  */
@js.native
trait BackForwardListItem extends js.Object {
  /**
  	 * The URL of the initial request that created this item.
  	 */
  var initialUrl: js.UndefOr[java.lang.String] = js.native
  /**
  	 * The title of the webpage represented by this item.
  	 */
  var title: js.UndefOr[java.lang.String] = js.native
  /**
  	 * The URL of the webpage represented by this item.
  	 */
  var url: js.UndefOr[java.lang.String] = js.native
}

object BackForwardListItem {
  @scala.inline
  def apply(): BackForwardListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackForwardListItem]
  }
  @scala.inline
  implicit class BackForwardListItemOps[Self <: BackForwardListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

