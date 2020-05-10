package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary describing the items for <Titanium.UI.Clipboard.setItems>.
  */
@js.native
trait ClipboardItemsType extends js.Object {
  /**
  	 * An array of key-value items to add to the clipboard. The key must a valid mime-type
  	 * matching the mime-type of the value.
  	 */
  var items: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * The privacy options to apply to all the items on the clipboard. The available options are
  	 * described in `Ti.UI.CLIPBOARD_OPTION_*`. Depending on the key, the value can be a Date or
  	 * Boolean.
  	 */
  var options: js.UndefOr[js.Any] = js.native
}

object ClipboardItemsType {
  @scala.inline
  def apply(): ClipboardItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardItemsType]
  }
  @scala.inline
  implicit class ClipboardItemsTypeOps[Self <: ClipboardItemsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

