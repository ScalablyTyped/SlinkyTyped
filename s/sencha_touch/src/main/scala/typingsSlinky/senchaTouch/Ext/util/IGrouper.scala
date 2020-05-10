package typingsSlinky.senchaTouch.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGrouper extends ISorter {
  /** [Method] Returns the value of groupFn
  		* @returns Function
  		*/
  var getGroupFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sortProperty
  		* @returns String
  		*/
  var getSortProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of groupFn
  		* @param groupFn Function The new value.
  		*/
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of sortProperty
  		* @param sortProperty String The new value.
  		*/
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[String] = js.native
}

object IGrouper {
  @scala.inline
  def apply(): IGrouper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouper]
  }
  @scala.inline
  implicit class IGrouperOps[Self <: IGrouper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGroupFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroupFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSortProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupFn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGroupFn(value: /* groupFn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGroupFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSortProperty(value: /* sortProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSortProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSortProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperty")(js.undefined)
        ret
    }
  }
  
}

