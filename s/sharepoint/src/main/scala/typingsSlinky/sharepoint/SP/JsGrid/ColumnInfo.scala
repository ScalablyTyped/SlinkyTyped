package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnInfo extends js.Object {
  var bOpenMenuOnContentClick: Boolean = js.native
  /** Column identifier */
  var columnKey: String = js.native
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[String] = js.native
  /** Custom image HTML.
    If you define this in addition to the imgSrc attribute, then instead of standard img tag
    the custom HTML defined by this field will be used. */
  var imgRawSrc: String = js.native
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: String = js.native
  /** true by default */
  var isAutoFilterable: Boolean = js.native
  /** false by default */
  var isFooter: Boolean = js.native
  /** true by default */
  var isHidable: Boolean = js.native
  /** true by default */
  var isResizable: Boolean = js.native
  /** true by default */
  var isSortable: Boolean = js.native
  /** true by default */
  var isVisible: Boolean = js.native
  /** Column title */
  var name: String = js.native
  /** Width of the column */
  var width: Double = js.native
  /** always returns 'column' */
  def ColumnType(): String = js.native
  /** this is used when you need to make some of the cells in the column readonly, but at the same time keep others editable */
  def fnGetCellEditMode(record: IRecord, fieldKey: String): EditMode = js.native
  /** this function should return id of the style for the given cell in the column
    styles and their ids are registered for a JsGridControl via jsGridParams.styleManager.RegisterCellStyle method */
  def fnGetCellStyleId(record: IRecord, fieldKey: String, dataValue: js.Any): String = js.native
  /** this function should return name of the display control for the given cell in the column
    the name should be previously associated with the display control via SP.JsGrid.PropertyType.Utils.RegisterDisplayControl method */
  def fnGetDisplayControlName(record: IRecord, fieldKey: String): String = js.native
  /** this function should return name of the edit control for the given cell in the column
    the name should be previously associated with the edit control via SP.JsGrid.PropertyType.Utils.RegisterEditControl method */
  def fnGetEditControlName(record: IRecord, fieldKey: String): String = js.native
  /** set custom tooltip for the given cell in the column. by default, localized value is displayed as the tooltip */
  def fnGetSingleValueTooltip(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): String = js.native
  /** set widget control names for a particular cell
    widgets are basically in-cell buttons with associated popup controls, e.g. date selector or address book button
    standard widget ids are defined in the SP.JsGrid.WidgetControl.Type enumeration
    it is also possible to create your own widgets
    usually this function is not used, and instead, widget control names are determined via PropertyType
    */
  def fnGetWidgetControlNames(record: IRecord, fieldKey: String): js.Array[String] = js.native
  /** determine whether the cells in this column should be clickable */
  def fnShouldLinkSingleValue(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): Boolean = js.native
  /** if a particular cell is determined as clickable by fnShouldLinkSingleValue, this function will be called when the cell is clicked */
  def fnSingleValueClicked(record: IRecord, fieldKey: String, dataValue: js.Any, localizedValue: js.Any): Unit = js.native
}

object ColumnInfo {
  @scala.inline
  def apply(
    ColumnType: () => String,
    bOpenMenuOnContentClick: Boolean,
    columnKey: String,
    fieldKeys: js.Array[String],
    fnGetCellEditMode: (IRecord, String) => EditMode,
    fnGetCellStyleId: (IRecord, String, js.Any) => String,
    fnGetDisplayControlName: (IRecord, String) => String,
    fnGetEditControlName: (IRecord, String) => String,
    fnGetSingleValueTooltip: (IRecord, String, js.Any, js.Any) => String,
    fnGetWidgetControlNames: (IRecord, String) => js.Array[String],
    fnShouldLinkSingleValue: (IRecord, String, js.Any, js.Any) => Boolean,
    fnSingleValueClicked: (IRecord, String, js.Any, js.Any) => Unit,
    imgRawSrc: String,
    imgSrc: String,
    isAutoFilterable: Boolean,
    isFooter: Boolean,
    isHidable: Boolean,
    isResizable: Boolean,
    isSortable: Boolean,
    isVisible: Boolean,
    name: String,
    width: Double
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(ColumnType = js.Any.fromFunction0(ColumnType), bOpenMenuOnContentClick = bOpenMenuOnContentClick.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], fieldKeys = fieldKeys.asInstanceOf[js.Any], fnGetCellEditMode = js.Any.fromFunction2(fnGetCellEditMode), fnGetCellStyleId = js.Any.fromFunction3(fnGetCellStyleId), fnGetDisplayControlName = js.Any.fromFunction2(fnGetDisplayControlName), fnGetEditControlName = js.Any.fromFunction2(fnGetEditControlName), fnGetSingleValueTooltip = js.Any.fromFunction4(fnGetSingleValueTooltip), fnGetWidgetControlNames = js.Any.fromFunction2(fnGetWidgetControlNames), fnShouldLinkSingleValue = js.Any.fromFunction4(fnShouldLinkSingleValue), fnSingleValueClicked = js.Any.fromFunction4(fnSingleValueClicked), imgRawSrc = imgRawSrc.asInstanceOf[js.Any], imgSrc = imgSrc.asInstanceOf[js.Any], isAutoFilterable = isAutoFilterable.asInstanceOf[js.Any], isFooter = isFooter.asInstanceOf[js.Any], isHidable = isHidable.asInstanceOf[js.Any], isResizable = isResizable.asInstanceOf[js.Any], isSortable = isSortable.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  @scala.inline
  implicit class ColumnInfoOps[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBOpenMenuOnContentClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bOpenMenuOnContentClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFnGetCellEditMode(value: (IRecord, String) => EditMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnGetCellEditMode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFnGetCellStyleId(value: (IRecord, String, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnGetCellStyleId")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFnGetDisplayControlName(value: (IRecord, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnGetDisplayControlName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFnGetEditControlName(value: (IRecord, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnGetEditControlName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFnGetSingleValueTooltip(value: (IRecord, String, js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnGetSingleValueTooltip")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFnGetWidgetControlNames(value: (IRecord, String) => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnGetWidgetControlNames")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFnShouldLinkSingleValue(value: (IRecord, String, js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnShouldLinkSingleValue")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFnSingleValueClicked(value: (IRecord, String, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnSingleValueClicked")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withImgRawSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgRawSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImgSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAutoFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoFilterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHidable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
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
  }
  
}

