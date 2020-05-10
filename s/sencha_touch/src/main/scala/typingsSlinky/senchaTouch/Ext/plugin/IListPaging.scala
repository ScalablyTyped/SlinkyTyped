package typingsSlinky.senchaTouch.Ext.plugin

import typingsSlinky.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListPaging extends IComponent {
  /** [Config Option] (Boolean) */
  var autoPaging: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoPaging
  		* @returns Boolean
  		*/
  var getAutoPaging: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of loadMoreText
  		* @returns String
  		*/
  var getLoadMoreText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of noMoreRecordsText
  		* @returns String
  		*/
  var getNoMoreRecordsText: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var loadMoreText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var noMoreRecordsText: js.UndefOr[String] = js.native
  /** [Method] Sets the value of autoPaging
  		* @param autoPaging Boolean The new value.
  		*/
  var setAutoPaging: js.UndefOr[js.Function1[/* autoPaging */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of loadMoreText
  		* @param loadMoreText String The new value.
  		*/
  var setLoadMoreText: js.UndefOr[js.Function1[/* loadMoreText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of noMoreRecordsText
  		* @param noMoreRecordsText String The new value.
  		*/
  var setNoMoreRecordsText: js.UndefOr[js.Function1[/* noMoreRecordsText */ js.UndefOr[String], Unit]] = js.native
}

object IListPaging {
  @scala.inline
  def apply(): IListPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListPaging]
  }
  @scala.inline
  implicit class IListPagingOps[Self <: IListPaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoPaging(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoPaging")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoadMoreText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadMoreText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoadMoreText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadMoreText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNoMoreRecordsText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNoMoreRecordsText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNoMoreRecordsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNoMoreRecordsText")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMoreText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMoreText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMoreText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMoreText")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMoreRecordsText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMoreRecordsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMoreRecordsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMoreRecordsText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoPaging(value: /* autoPaging */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoPaging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoadMoreText(value: /* loadMoreText */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadMoreText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoadMoreText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadMoreText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNoMoreRecordsText(value: /* noMoreRecordsText */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNoMoreRecordsText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNoMoreRecordsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNoMoreRecordsText")(js.undefined)
        ret
    }
  }
  
}

