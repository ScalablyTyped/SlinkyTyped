package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the value of any column's row is changed.
		 */
@js.native
trait PickerChangeEvent extends PickerBaseEvent {
  /**
  			 * The column object. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
  			 * picker types.
  			 */
  var column: PickerColumn = js.native
  /**
  			 * Selected column index. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
  			 * picker types.
  			 */
  var columnIndex: Double = js.native
  /**
  			 * The selected duration in milliseconds. Applicable to <Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER> picker types.
  			 */
  var countDownDuration: Double = js.native
  /**
  			 * The row object. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN> picker types.
  			 */
  var row: PickerRow = js.native
  /**
  			 * Selected row index. On iOS, only applicable to <Titanium.UI.PICKER_TYPE_PLAIN>
  			 * picker types.
  			 */
  var rowIndex: Double = js.native
  /**
  			 * Array of selected values, one element per column in the picker. Applicable to
  			 * <Titanium.UI.PICKER_TYPE_PLAIN> picker types.
  			 */
  var selectedValue: js.Array[String] = js.native
  /**
  			 * The selected value. Applicable to date/time pickers only. This property is read-only
  			 * on Android.
  			 */
  var value: String = js.native
}

object PickerChangeEvent {
  @scala.inline
  def apply(
    column: PickerColumn,
    columnIndex: Double,
    countDownDuration: Double,
    row: PickerRow,
    rowIndex: Double,
    selectedValue: js.Array[String],
    source: Picker,
    value: String
  ): PickerChangeEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], countDownDuration = countDownDuration.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selectedValue = selectedValue.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerChangeEvent]
  }
  @scala.inline
  implicit class PickerChangeEventOps[Self <: PickerChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: PickerColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountDownDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countDownDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: PickerRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

