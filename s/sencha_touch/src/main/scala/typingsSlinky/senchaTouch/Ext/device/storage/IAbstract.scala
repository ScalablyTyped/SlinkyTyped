package typingsSlinky.senchaTouch.Ext.device.storage

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of databaseDisplayName
  		* @returns String
  		*/
  var getDatabaseDisplayName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of databaseName
  		* @returns String
  		*/
  var getDatabaseName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of databaseSize
  		* @returns Object
  		*/
  var getDatabaseSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of databaseVersion
  		* @returns String
  		*/
  var getDatabaseVersion: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of databaseDisplayName
  		* @param databaseDisplayName String The new value.
  		*/
  var setDatabaseDisplayName: js.UndefOr[js.Function1[/* databaseDisplayName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of databaseName
  		* @param databaseName String The new value.
  		*/
  var setDatabaseName: js.UndefOr[js.Function1[/* databaseName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of databaseSize
  		* @param databaseSize Object The new value.
  		*/
  var setDatabaseSize: js.UndefOr[js.Function1[/* databaseSize */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of databaseVersion
  		* @param databaseVersion String The new value.
  		*/
  var setDatabaseVersion: js.UndefOr[js.Function1[/* databaseVersion */ js.UndefOr[String], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDatabaseDisplayName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseDisplayName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDatabaseDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDatabaseName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDatabaseSize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDatabaseSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDatabaseVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDatabaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatabaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDatabaseDisplayName(value: /* databaseDisplayName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseDisplayName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDatabaseDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDatabaseName(value: /* databaseName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDatabaseSize(value: /* databaseSize */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDatabaseSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDatabaseVersion(value: /* databaseVersion */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDatabaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseVersion")(js.undefined)
        ret
    }
  }
  
}

