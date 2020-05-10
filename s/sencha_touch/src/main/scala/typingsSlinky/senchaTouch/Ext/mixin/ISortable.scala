package typingsSlinky.senchaTouch.Ext.mixin

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortable extends IBase {
  /** [Method] This method adds a sorter
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var addSorter: js.UndefOr[
    js.Function2[/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] This method adds all the sorters in a passed array
  		* @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var addSorters: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var dirtySortFn: js.UndefOr[Boolean] = js.native
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
  		* @param items Array The array that you want to insert the item into.
  		* @param item Mixed The item that you want to insert into the items array.
  		* @returns Number The index for the given item in the given array based on the current sorters.
  		*/
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any], Double]
  ] = js.native
  /** [Method] Returns the value of defaultSortDirection
  		* @returns String
  		*/
  var getDefaultSortDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns an up to date sort function
  		* @returns Function The sort function.
  		*/
  var getSortFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sortRoot
  		* @returns String
  		*/
  var getSortRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of sorters
  		* @returns Array
  		*/
  var getSorters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] This method adds a sorter at a given index
  		* @param index Number The index at which to insert the sorter.
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var insertSorter: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] This method inserts all the sorters in the passed array at the given index
  		* @param index Number The index at which to insert the sorters.
  		* @param sorters Array Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var insertSorters: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* sorters */ js.UndefOr[Array], 
      /* defaultDirection */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] This method removes a sorter
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		*/
  var removeSorter: js.UndefOr[js.Function1[/* sorter */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method removes all the sorters in a passed array
  		* @param sorters Array Each value in the array can be a string (property name), function (sorterFn) or Sorter instance.
  		*/
  var removeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of defaultSortDirection
  		* @param defaultSortDirection String The new value.
  		*/
  var setDefaultSortDirection: js.UndefOr[js.Function1[/* defaultSortDirection */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of sortRoot
  		* @param sortRoot String The new value.
  		*/
  var setSortRoot: js.UndefOr[js.Function1[/* sortRoot */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of sorters
  		* @param sorters Array The new value.
  		*/
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param data Array The array you want to have sorted.
  		* @returns Array The array you passed after it is sorted.
  		*/
  var sort: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.native
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var sorted: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Array) */
  var sorters: js.UndefOr[Array] = js.native
}

object ISortable {
  @scala.inline
  def apply(): ISortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortable]
  }
  @scala.inline
  implicit class ISortableOps[Self <: ISortable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSorter(value: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSorter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSorters(value: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSorters")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSorters")(js.undefined)
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
    def withDefaultSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withDirtySortFn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirtySortFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFindInsertionIndex(value: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findInsertionIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFindInsertionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findInsertionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultSortDirection(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultSortDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSortFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSortRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSorters(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSorter(
      value: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSorter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSorters(
      value: (/* index */ js.UndefOr[Double], /* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSorters")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsertSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSorter(value: /* sorter */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSorter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSorters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultSortDirection(value: /* defaultSortDirection */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultSortDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSortRoot(value: /* sortRoot */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSortRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: /* data */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
    @scala.inline
    def withSorters(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(js.undefined)
        ret
    }
  }
  
}

