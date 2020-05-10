package typingsSlinky.senchaTouch.Ext.mixin

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterable extends IBase {
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Array An array with filters. A filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var addFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], _]] = js.native
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.native
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param data Array The array you want to have sorted.
  		* @returns Array The array you passed after it is sorted.
  		*/
  var filter: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.native
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Array) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Returns an up to date sort function
  		* @returns Function sortFn The sort function.
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of filterRoot
  		* @returns String
  		*/
  var getFilterRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of filters
  		* @returns Array
  		*/
  var getFilters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var insertFilter: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  var insertFilters: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array], Array]
  ] = js.native
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Array Each value in the array can be a string (property name), function (sorterFn), an object containing a property and value keys or Sorter instance.
  		*/
  var removeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
}

object IFilterable {
  @scala.inline
  def apply(): IFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterable]
  }
  @scala.inline
  implicit class IFilterableOps[Self <: IFilterable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFilter(value: /* filter */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withAddFilters(value: /* filters */ js.UndefOr[Array] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentSortFn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSortFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(js.undefined)
        ret
    }
    @scala.inline
    def withDirtyFilterFn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirtyFilterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* data */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilterFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilterRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilterRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilters(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFilter(value: (/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFilters(value: (/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFilters")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilterRoot(value: /* filterRoot */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilterRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.undefined)
        ret
    }
  }
  
}

