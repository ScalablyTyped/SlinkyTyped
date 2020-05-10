package typingsSlinky.senchaTouch.Ext.device.sqlite

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatabase extends IBase {
  /** [Method] Verifies and changes the version of the database at the same time as doing a schema update with a Ext device sqlite S
  		* @param config Object The object which contains the following config options:
  		*/
  var changeVersion: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the current version of the database
  		* @returns String The database current version.
  		*/
  var getVersion: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Works the same way as transaction but performs a Ext device sqlite SQLTransaction instance in a read only mode
  		* @param config Object
  		*/
  var readTransaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Performs a Ext device sqlite SQLTransaction instance in a read write mode
  		* @param config Object The object which contains the following config options:
  		*/
  var transaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IDatabase {
  @scala.inline
  def apply(): IDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatabase]
  }
  @scala.inline
  implicit class IDatabaseOps[Self <: IDatabase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeVersion(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChangeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTransaction(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

