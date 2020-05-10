package typingsSlinky.senchaTouch.Ext.device.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTML5 extends IAbstract {
  /** [Method] Requests a Ext device filesystem FileSystem instance
  		* @param config Object The object which contains the following config options:
  		*/
  var requestFileSystem: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IHTML5 {
  @scala.inline
  def apply(): IHTML5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHTML5]
  }
  @scala.inline
  implicit class IHTML5Ops[Self <: IHTML5] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestFileSystem(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFileSystem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestFileSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFileSystem")(js.undefined)
        ret
    }
  }
  
}

