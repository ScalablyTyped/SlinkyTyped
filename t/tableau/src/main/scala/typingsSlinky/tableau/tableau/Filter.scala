package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /** Gets the field that is currently being filtered. */
  def getFieldAsync(): js.Promise[Field] = js.native
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  def getFieldName(): String = js.native
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  def getFilterType(): FilterType = js.native
  /** Gets the parent worksheet */
  def getWorksheet(): Worksheet = js.native
}

object Filter {
  @scala.inline
  def apply(
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getWorksheet: () => Worksheet
  ): Filter = {
    val __obj = js.Dynamic.literal(getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFieldAsync(value: () => js.Promise[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFieldName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilterType(value: () => FilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorksheet(value: () => Worksheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorksheet")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

