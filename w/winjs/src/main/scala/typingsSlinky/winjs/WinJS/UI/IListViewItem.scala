package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by ListView's currentItem API
  **/
@js.native
trait IListViewItem extends js.Object {
  /**
    * Gets or sets whether the ListView item is focused.
    **/
  var hasFocus: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets index of the ListView item.
    **/
  var index: js.UndefOr[Double] = js.native
  /**
    * Gets or sets key of the ListView item.
    **/
  var key: js.UndefOr[String] = js.native
  /**
    * Gets or sets whether the ListView item is focused and is showing its focus visual.
    **/
  var showFocus: js.UndefOr[Boolean] = js.native
  /**
    * Gets the type, if any.
    **/
  var `type`: js.UndefOr[ObjectType] = js.native
}

object IListViewItem {
  @scala.inline
  def apply(): IListViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListViewItem]
  }
  @scala.inline
  implicit class IListViewItemOps[Self <: IListViewItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

