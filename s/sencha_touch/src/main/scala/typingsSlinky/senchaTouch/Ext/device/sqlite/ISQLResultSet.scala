package typingsSlinky.senchaTouch.Ext.device.sqlite

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISQLResultSet extends IBase {
  /** [Method] Returns the row ID of the last row that the SQL statement inserted into the database if the statement inserted any r
  		* @returns Number The inserted row ID.
  		*/
  var getInsertId: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns a Ext device sqlite SQLResultSetRowList instance representing rows returned by the SQL statement
  		* @returns Ext.device.sqlite.SQLResultSetRowList The rows.
  		*/
  var getRows: js.UndefOr[js.Function0[ISQLResultSetRowList]] = js.native
  /** [Method] Returns the number of rows that were changed by the SQL statement
  		* @returns Number The number of rows affected.
  		*/
  var getRowsAffected: js.UndefOr[js.Function0[Double]] = js.native
}

object ISQLResultSet {
  @scala.inline
  def apply(): ISQLResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISQLResultSet]
  }
  @scala.inline
  implicit class ISQLResultSetOps[Self <: ISQLResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInsertId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsertId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInsertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsertId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRows(value: () => ISQLResultSetRowList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowsAffected(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowsAffected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRowsAffected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowsAffected")(js.undefined)
        ret
    }
  }
  
}

