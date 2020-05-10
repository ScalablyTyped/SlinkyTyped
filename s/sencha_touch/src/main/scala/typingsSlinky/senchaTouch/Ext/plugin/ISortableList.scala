package typingsSlinky.senchaTouch.Ext.plugin

import typingsSlinky.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortableList extends IComponent {
  /** [Method] Returns the value of handleSelector
  		* @returns String
  		*/
  var getHandleSelector: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of list
  		* @returns Object
  		*/
  var getList: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of handleSelector
  		* @param handleSelector String The new value.
  		*/
  var setHandleSelector: js.UndefOr[js.Function1[/* handleSelector */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of list
  		* @param list Object The new value.
  		*/
  var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[js.Any], Unit]] = js.native
}

object ISortableList {
  @scala.inline
  def apply(): ISortableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortableList]
  }
  @scala.inline
  implicit class ISortableListOps[Self <: ISortableList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHandleSelector(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandleSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHandleSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandleSelector")(js.undefined)
        ret
    }
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
    def withSetHandleSelector(value: /* handleSelector */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandleSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHandleSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandleSelector")(js.undefined)
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

