package typingsSlinky.senchaTouch.Ext.plugin

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBufferedList extends IBase {
  /** [Method] Returns the value of list
  		* @returns Object
  		*/
  var getList: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of list
  		* @param list Object The new value.
  		*/
  var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[js.Any], Unit]] = js.native
}

object IBufferedList {
  @scala.inline
  def apply(): IBufferedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBufferedList]
  }
  @scala.inline
  implicit class IBufferedListOps[Self <: IBufferedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetList(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getList")(js.undefined)
        ret
    }
    @scala.inline
    def withSetList(value: /* list */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setList")(js.undefined)
        ret
    }
  }
  
}

