package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ILookupTableInfo extends js.Object {
  var id: String = js.native
  var limitToList: js.UndefOr[Boolean] = js.native
  var lookup: js.Array[ILookupInfo] = js.native
  var showImage: js.UndefOr[Boolean] = js.native
  var showText: js.UndefOr[Boolean] = js.native
}

object ILookupTableInfo {
  @scala.inline
  def apply(id: String, lookup: js.Array[ILookupInfo]): ILookupTableInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookupTableInfo]
  }
  @scala.inline
  implicit class ILookupTableInfoOps[Self <: ILookupTableInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookup(value: js.Array[ILookupInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitToList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitToList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitToList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitToList")(js.undefined)
        ret
    }
    @scala.inline
    def withShowImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showImage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(js.undefined)
        ret
    }
  }
  
}

