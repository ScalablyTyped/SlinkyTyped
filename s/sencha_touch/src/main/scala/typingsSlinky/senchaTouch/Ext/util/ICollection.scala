package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ICollectionMutableBuilder[Self <: ICollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (/* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddAll(value: /* addItems */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
    
    @scala.inline
    def setAddFilter(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddFilterUndefined: Self = StObject.set(x, "addFilter", js.undefined)
    
    @scala.inline
    def setAddFilters(value: js.UndefOr[js.Any | Array] => _): Self = StObject.set(x, "addFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddFiltersUndefined: Self = StObject.set(x, "addFilters", js.undefined)
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAll(value: Array): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setClone_(value: () => IMixedCollection): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setContains(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKeyUndefined: Self = StObject.set(x, "containsKey", js.undefined)
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setDirtyFilterFn(value: Boolean): Self = StObject.set(x, "dirtyFilterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyFilterFnUndefined: Self = StObject.set(x, "dirtyFilterFn", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachKey(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachKeyUndefined: Self = StObject.set(x, "eachKey", js.undefined)
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
          /* property */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[js.Any], 
          /* anyMatch */ js.UndefOr[js.Any], 
          /* caseSensitive */ js.UndefOr[js.Any], 
          Array
        ])
    ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    @scala.inline
    def setFilterFunction1(value: /* data */ js.UndefOr[Array] => Array): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterFunction4(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[js.Any], /* caseSensitive */ js.UndefOr[js.Any]) => Array
    ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFilterRoot(value: String): Self = StObject.set(x, "filterRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRootUndefined: Self = StObject.set(x, "filterRoot", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    @scala.inline
    def setFilters(value: Array): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "findBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
    
    @scala.inline
    def setFindIndexBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findIndexBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindIndexByUndefined: Self = StObject.set(x, "findIndexBy", js.undefined)
    
    @scala.inline
    def setFirst(value: () => _): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setGet(value: /* key */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => _): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    @scala.inline
    def setGetAutoFilter(value: () => Boolean): Self = StObject.set(x, "getAutoFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoFilterUndefined: Self = StObject.set(x, "getAutoFilter", js.undefined)
    
    @scala.inline
    def setGetAutoSort(value: () => Boolean): Self = StObject.set(x, "getAutoSort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoSortUndefined: Self = StObject.set(x, "getAutoSort", js.undefined)
    
    @scala.inline
    def setGetByKey(value: /* key */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByKeyUndefined: Self = StObject.set(x, "getByKey", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetFilterFn(value: () => _): Self = StObject.set(x, "getFilterFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterFnUndefined: Self = StObject.set(x, "getFilterFn", js.undefined)
    
    @scala.inline
    def setGetFilterRoot(value: () => String): Self = StObject.set(x, "getFilterRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterRootUndefined: Self = StObject.set(x, "getFilterRoot", js.undefined)
    
    @scala.inline
    def setGetFilters(value: () => Array): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFiltersUndefined: Self = StObject.set(x, "getFilters", js.undefined)
    
    @scala.inline
    def setGetKey(value: /* item */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    @scala.inline
    def setGetRange(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* item */ js.UndefOr[js.Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfKeyUndefined: Self = StObject.set(x, "indexOfKey", js.undefined)
    
    @scala.inline
    def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    @scala.inline
    def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setInsert(
      value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertFilter(value: (js.UndefOr[Double], js.UndefOr[js.Any]) => _): Self = StObject.set(x, "insertFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertFilterUndefined: Self = StObject.set(x, "insertFilter", js.undefined)
    
    @scala.inline
    def setInsertFilters(value: (js.UndefOr[Double], js.UndefOr[Array]) => Array): Self = StObject.set(x, "insertFilters", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertFiltersUndefined: Self = StObject.set(x, "insertFilters", js.undefined)
    
    @scala.inline
    def setInsertSorters(value: () => ICollection): Self = StObject.set(x, "insertSorters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertSortersUndefined: Self = StObject.set(x, "insertSorters", js.undefined)
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setKeys(value: Array): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setLast(value: () => _): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setRemove(value: /* item */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    @scala.inline
    def setRemoveAt(value: /* index */ js.UndefOr[Double] => _): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAtKey(value: /* key */ js.UndefOr[String] => _): Self = StObject.set(x, "removeAtKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAtKeyUndefined: Self = StObject.set(x, "removeAtKey", js.undefined)
    
    @scala.inline
    def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
    
    @scala.inline
    def setRemoveFilters(value: js.UndefOr[js.Any | Array] => ICollection | Unit): Self = StObject.set(x, "removeFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFiltersUndefined: Self = StObject.set(x, "removeFilters", js.undefined)
    
    @scala.inline
    def setRemoveSorters(value: /* sorters */ js.UndefOr[js.Any] => ICollection): Self = StObject.set(x, "removeSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSortersUndefined: Self = StObject.set(x, "removeSorters", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReplace(value: (/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setSetAutoFilter(value: /* autoFilter */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoFilterUndefined: Self = StObject.set(x, "setAutoFilter", js.undefined)
    
    @scala.inline
    def setSetAutoSort(value: /* autoSort */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoSortUndefined: Self = StObject.set(x, "setAutoSort", js.undefined)
    
    @scala.inline
    def setSetFilterRoot(value: js.UndefOr[String] => Unit): Self = StObject.set(x, "setFilterRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterRootUndefined: Self = StObject.set(x, "setFilterRoot", js.undefined)
    
    @scala.inline
    def setSetFilters(value: js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFiltersUndefined: Self = StObject.set(x, "setFilters", js.undefined)
    
    @scala.inline
    def setSort(value: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
