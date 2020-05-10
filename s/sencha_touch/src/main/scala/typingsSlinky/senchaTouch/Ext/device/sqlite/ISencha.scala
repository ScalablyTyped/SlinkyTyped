package typingsSlinky.senchaTouch.Ext.device.sqlite

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISencha extends IBase {
  /** [Method] Returns a Ext device sqlite Database instance
  		* @param config Object The object which contains the following config options:
  		* @returns Ext.device.sqlite.Database The opened database, null if an error occured.
  		*/
  var openDatabase: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], IDatabase]] = js.native
}

object ISencha {
  @scala.inline
  def apply(): ISencha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISencha]
  }
  @scala.inline
  implicit class ISenchaOps[Self <: ISencha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenDatabase(value: /* config */ js.UndefOr[js.Any] => IDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDatabase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpenDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDatabase")(js.undefined)
        ret
    }
  }
  
}

