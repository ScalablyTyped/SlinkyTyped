package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.mixin.IFilterable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, currentSortFn, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined filterRoot, filters, dirtyFilterFn, filtered, addFilter, addFilters, filter, getFilterFn, getFilterRoot, getFilters, insertFilter, insertFilters, removeFilters, setFilterRoot, setFilters */ @js.native
trait ICollection
  extends typingsSlinky.senchaTouch.Ext.mixin.ISortable {
  /** [Method] Adds an item to the collection
  		* @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param item Object The item to add.
  		* @returns Object The item added.
  		*/
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Adds all elements of an Array or an Object to the collection
  		* @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
  		*/
  var addAll: js.UndefOr[js.Function1[/* addItems */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  var addFilter: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Object
  		* @returns Object
  		*/
  var addFilters: js.UndefOr[js.Function1[js.UndefOr[js.Any | Array], _]] = js.native
  /** [Property] (Array) */
  var all: js.UndefOr[Array] = js.native
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Creates a shallow copy of this collection
  		* @returns Ext.util.MixedCollection
  		*/
  @JSName("clone")
  var clone_FICollection: js.UndefOr[js.Function0[IMixedCollection]] = js.native
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param item Object The Object to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as an item.
  		*/
  var contains: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as a key.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.native
  /** [Method] Executes the specified function once for every item in the collection
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method will sort a collection based on the currently configured sorters
  		* @param property Object
  		* @param value Object
  		* @param anyMatch Object
  		* @param caseSensitive Object
  		* @returns Array
  		*/
  var filter: js.UndefOr[
    (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      Array
    ])
  ] = js.native
  /** [Method] Filter by a function
  		* @param fn Function The function to be called.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @returns Ext.util.MixedCollection The new filtered collection
  		*/
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		* @returns Object The first item in the collection which returned true from the selection function.
  		*/
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Find the index of the first matching object in this collection by a function
  		* @param fn Function The function to be called.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @param start Number The index to start searching at.
  		* @returns Number The matched index, or -1 if the item was not found.
  		*/
  var findIndexBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /** [Method] Returns the first item in the collection
  		* @returns Object the first item in the collection.
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the item associated with the passed key OR index
  		* @param key String/Number The key or index of the item.
  		* @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
  		*/
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the item at the specified index
  		* @param index Number The index of the item.
  		* @returns Object The item at the specified index.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns the value of autoFilter
  		* @returns Boolean
  		*/
  var getAutoFilter: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoSort
  		* @returns Boolean
  		*/
  var getAutoSort: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
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
  /** [Method] MixedCollection has a generic way to fetch keys if you implement getKey
  		* @param item Object The item for which to find the key.
  		* @returns Object The key for the passed item.
  		*/
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns a range of items in this collection
  		* @param start Number The starting index.
  		* @param end Number The ending index. Defaults to the last item.
  		* @returns Array An array of items.
  		*/
  var getRange: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Method] Returns index within the collection of the passed Object
  		* @param item Object The item to find the index of.
  		* @returns Number Index of the item. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number Index of the key.
  		*/
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.native
  /** [Property] (Object) */
  var indices: js.UndefOr[js.Any] = js.native
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Number The index to insert the item at.
  		* @param key String The key to associate with the new item, or the item itself.
  		* @param item Object If the second parameter was a key, the new item.
  		* @returns Object The item inserted.
  		*/
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* key */ js.UndefOr[String], 
      /* item */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var insertFilter: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[js.Any], _]] = js.native
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  var insertFilters: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[Array], Array]] = js.native
  /** [Method] This method inserts all the sorters in the passed array at the given index
  		* @returns Ext.util.Collection this
  		*/
  @JSName("insertSorters")
  var insertSorters_ICollection: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Property] (Array) */
  var items: js.UndefOr[Array] = js.native
  /** [Property] (Array) */
  var keys: js.UndefOr[Array] = js.native
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection.
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.native
  /** [Property] (Number) */
  var length: js.UndefOr[Double] = js.native
  /** [Property] (Object) */
  var map: js.UndefOr[js.Any] = js.native
  /** [Method] Remove an item from the collection
  		* @param item Object The item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Remove all items in the passed array from the collection
  		* @param items Array An array of items to be removed.
  		* @returns Ext.util.MixedCollection this object
  		*/
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.native
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Removed an item associated with the passed key from the collection
  		* @param key String The key of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Object
  		* @returns Ext.util.Collection this
  		*/
  var removeFilters: js.UndefOr[js.Function1[js.UndefOr[js.Any | Array], this.type | Unit]] = js.native
  /** [Method] This method removes all the sorters in a passed array
  		* @param sorters Object
  		* @returns Ext.util.Collection this
  		*/
  @JSName("removeSorters")
  var removeSorters_ICollection: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Replaces an item in the collection
  		* @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
  		* @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
  		* @returns Object The new item.
  		*/
  var replace: js.UndefOr[js.Function2[/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of autoFilter
  		* @param autoFilter Boolean The new value.
  		*/
  var setAutoFilter: js.UndefOr[js.Function1[/* autoFilter */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoSort
  		* @param autoSort Boolean The new value.
  		*/
  var setAutoSort: js.UndefOr[js.Function1[/* autoSort */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  var setFilterRoot: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[js.UndefOr[Array], Unit]] = js.native
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param sorters Object
  		* @param defaultDirection Object
  		* @returns Array The array you passed after it is sorted.
  		*/
  @JSName("sort")
  var sort_ICollection: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any], Array]
  ] = js.native
}

object ICollection {
  @scala.inline
  def apply(): ICollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollection]
  }
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (/* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddAll(value: /* addItems */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.undefined)
        ret
    }
    @scala.inline
    def withAddFilter(value: js.UndefOr[js.Any] => Unit): Self = {
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
    def withAddFilters(value: js.UndefOr[js.Any | Array] => _): Self = {
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
    def withAll(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: () => IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContainsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsKey")(js.undefined)
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
    def withEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withEachKey(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEachKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* data */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterFunction4(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[js.Any], /* caseSensitive */ js.UndefOr[js.Any]) => Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFilter(
      value: (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
          /* property */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[js.Any], 
          /* anyMatch */ js.UndefOr[js.Any], 
          /* caseSensitive */ js.UndefOr[js.Any], 
          Array
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.undefined)
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
    def withFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFindBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFindIndexBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndexBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindIndexBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndexBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* key */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAt(value: /* index */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoFilter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoSort(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetByKey(value: /* key */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.undefined)
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
    def withGetKey(value: /* item */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRange(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: /* item */ js.UndefOr[js.Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOfKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIndices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(
      value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertFilter(value: (js.UndefOr[Double], js.UndefOr[js.Any]) => _): Self = {
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
    def withInsertFilters(value: (js.UndefOr[Double], js.UndefOr[Array]) => Array): Self = {
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
    def withInsertSorters(value: () => ICollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSorters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInsertSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* item */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAt(value: /* index */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAtKey(value: /* key */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAtKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAtKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAtKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFilters(value: js.UndefOr[js.Any | Array] => ICollection | Unit): Self = {
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
    def withRemoveSorters(value: /* sorters */ js.UndefOr[js.Any] => ICollection): Self = {
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
    def withReplace(value: (/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoFilter(value: /* autoFilter */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoSort(value: /* autoSort */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSort")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilterRoot(value: js.UndefOr[String] => Unit): Self = {
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
    def withSetFilters(value: js.UndefOr[Array] => Unit): Self = {
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
    @scala.inline
    def withSort(value: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

