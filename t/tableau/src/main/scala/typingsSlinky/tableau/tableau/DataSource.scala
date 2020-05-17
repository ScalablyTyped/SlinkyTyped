package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /** Gets an array of Fields associated with the DataSource. */
  def getFields(): js.Array[Field] = js.native
  /** Indicates whether this DataSource is a primary or a secondary data source. */
  def getIsPrimary(): Boolean = js.native
  /** The name of the DataSource as seen in the UI. */
  def getName(): String = js.native
}

object DataSource {
  @scala.inline
  def apply(getFields: () => js.Array[Field], getIsPrimary: () => Boolean, getName: () => String): DataSource = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), getIsPrimary = js.Any.fromFunction0(getIsPrimary), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFields(value: () => js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsPrimary(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsPrimary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

