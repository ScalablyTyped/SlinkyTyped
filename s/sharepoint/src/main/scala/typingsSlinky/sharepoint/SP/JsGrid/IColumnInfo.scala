package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IColumnInfo extends js.Object {
  /** Column identifier */
  var columnKey: String = js.native
  /** Column identifier */
  var fieldKey: String = js.native
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[String] = js.native
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: js.UndefOr[String] = js.native
  /** true by default */
  var isAutoFilterable: js.UndefOr[Boolean] = js.native
  /** false by default */
  var isFooter: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isHidable: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isResizable: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isSortable: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isVisible: js.UndefOr[Boolean] = js.native
  /** Column title */
  var name: String = js.native
  /** Width of the column */
  var width: Double = js.native
}

object IColumnInfo {
  @scala.inline
  def apply(columnKey: String, fieldKey: String, fieldKeys: js.Array[String], name: String, width: Double): IColumnInfo = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], fieldKeys = fieldKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnInfo]
  }
  @scala.inline
  implicit class IColumnInfoOps[Self <: IColumnInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImgSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAutoFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoFilterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAutoFilterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoFilterable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHidable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHidable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
  }
  
}

