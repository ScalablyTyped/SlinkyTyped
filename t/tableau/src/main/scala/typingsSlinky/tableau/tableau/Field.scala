package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  def getAggregation(): FieldAggregationType = js.native
  /** Gets the data source to which this field belongs. */
  def getDataSource(): DataSource = js.native
  /** Gets the field name (i.e. caption). */
  def getName(): String = js.native
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  def getRole(): FieldRoleType = js.native
}

object Field {
  @scala.inline
  def apply(
    getAggregation: () => FieldAggregationType,
    getDataSource: () => DataSource,
    getName: () => String,
    getRole: () => FieldRoleType
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = js.Any.fromFunction0(getAggregation), getDataSource = js.Any.fromFunction0(getDataSource), getName = js.Any.fromFunction0(getName), getRole = js.Any.fromFunction0(getRole))
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAggregation(value: () => FieldAggregationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAggregation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataSource(value: () => DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRole(value: () => FieldRoleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRole")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

