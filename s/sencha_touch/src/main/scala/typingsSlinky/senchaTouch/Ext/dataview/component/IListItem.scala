package typingsSlinky.senchaTouch.Ext.dataview.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListItem extends IDataItem {
  /** [Method] Returns the value of body
  		* @returns Object
  		*/
  var getBody: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of disclosure
  		* @returns Object
  		*/
  var getDisclosure: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of header
  		* @returns Object
  		*/
  var getHeader: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of body
  		* @param body Object The new value.
  		*/
  var setBody: js.UndefOr[js.Function1[/* body */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of disclosure
  		* @param disclosure Object The new value.
  		*/
  var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of header
  		* @param header Object The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
}

object IListItem {
  @scala.inline
  def apply(): IListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListItem]
  }
  @scala.inline
  implicit class IListItemOps[Self <: IListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBody(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBody")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBody")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisclosure(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisclosure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeader(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBody(value: /* body */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBody")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisclosure(value: /* disclosure */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisclosure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeader(value: /* header */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.undefined)
        ret
    }
  }
  
}

