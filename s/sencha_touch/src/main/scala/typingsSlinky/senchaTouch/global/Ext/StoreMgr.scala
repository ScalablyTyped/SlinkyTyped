package typingsSlinky.senchaTouch.global.Ext

import typingsSlinky.senchaTouch.Ext.IClass
import typingsSlinky.senchaTouch.Ext.data.IStore
import typingsSlinky.senchaTouch.Ext.util.ICollection
import typingsSlinky.senchaTouch.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.StoreMgr")
@js.native
class StoreMgr ()
  extends typingsSlinky.senchaTouch.Ext.StoreMgr
/* static members */
object StoreMgr {
  
  @JSGlobal("Ext.StoreMgr")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds an item to the collection
    * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param item Object The item to add.
    * @returns Object The item added.
    */
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(key: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.add")
  @js.native
  def add(key: java.lang.String, item: js.Any): js.Any = js.native
  
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
    */
  @JSGlobal("Ext.StoreMgr.addAll")
  @js.native
  def addAll(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addAll")
  @js.native
  def addAll(addItems: js.Any): Unit = js.native
  
  /** [Method] This method adds a filter
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    */
  @JSGlobal("Ext.StoreMgr.addFilter")
  @js.native
  def addFilter(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addFilter")
  @js.native
  def addFilter(filter: js.Any): Unit = js.native
  
  /** [Method] This method adds all the filters in a passed array
    * @param filters Object
    * @returns Object
    */
  @JSGlobal("Ext.StoreMgr.addFilters")
  @js.native
  def addFilters(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.addFilters")
  @js.native
  def addFilters(filters: js.Any): js.Any = js.native
  
  /** [Method] This method adds a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  @JSGlobal("Ext.StoreMgr.addSorter")
  @js.native
  def addSorter(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addSorter")
  @js.native
  def addSorter(sorter: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addSorter")
  @js.native
  def addSorter(sorter: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addSorter")
  @js.native
  def addSorter(sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
  
  /** [Method] This method adds all the sorters in a passed array
    * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  @JSGlobal("Ext.StoreMgr.addSorters")
  @js.native
  def addSorters(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addSorters")
  @js.native
  def addSorters(sorters: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addSorters")
  @js.native
  def addSorters(sorters: typingsSlinky.senchaTouch.Ext.Array): Unit = js.native
  @JSGlobal("Ext.StoreMgr.addSorters")
  @js.native
  def addSorters(sorters: typingsSlinky.senchaTouch.Ext.Array, defaultDirection: java.lang.String): Unit = js.native
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreMgr.all")
  @js.native
  def all: typingsSlinky.senchaTouch.Ext.Array = js.native
  @scala.inline
  def all_=(x: typingsSlinky.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @JSGlobal("Ext.StoreMgr.callOverridden")
  @js.native
  def callOverridden(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.callOverridden")
  @js.native
  def callOverridden(args: js.Any): js.Any = js.native
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @JSGlobal("Ext.StoreMgr.callParent")
  @js.native
  def callParent(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.callParent")
  @js.native
  def callParent(args: js.Any): js.Any = js.native
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @JSGlobal("Ext.StoreMgr.callSuper")
  @js.native
  def callSuper(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.callSuper")
  @js.native
  def callSuper(args: js.Any): js.Any = js.native
  
  /** [Method] Removes all items from the collection  */
  @JSGlobal("Ext.StoreMgr.clear")
  @js.native
  def clear(): Unit = js.native
  
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param item Object The Object to look for in the collection.
    * @returns Boolean true if the collection contains the Object as an item.
    */
  @JSGlobal("Ext.StoreMgr.contains")
  @js.native
  def contains(): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.contains")
  @js.native
  def contains(item: js.Any): Boolean = js.native
  
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean true if the collection contains the Object as a key.
    */
  @JSGlobal("Ext.StoreMgr.containsKey")
  @js.native
  def containsKey(): Boolean = js.native
  @JSGlobal("Ext.StoreMgr.containsKey")
  @js.native
  def containsKey(key: java.lang.String): Boolean = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreMgr.currentSortFn")
  @js.native
  def currentSortFn: js.Any = js.native
  @scala.inline
  def currentSortFn_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(x.asInstanceOf[js.Any])
  
  /** [Method]  */
  @JSGlobal("Ext.StoreMgr.destroy")
  @js.native
  def destroy(): Unit = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.dirtyFilterFn")
  @js.native
  def dirtyFilterFn: Boolean = js.native
  @scala.inline
  def dirtyFilterFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.dirtySortFn")
  @js.native
  def dirtySortFn: Boolean = js.native
  @scala.inline
  def dirtySortFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(x.asInstanceOf[js.Any])
  
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.each")
  @js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.eachKey")
  @js.native
  def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] This method will sort a collection based on the currently configured sorters
    * @param property Object
    * @param value Object
    * @param anyMatch Object
    * @param caseSensitive Object
    * @returns Array
    */
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: js.Any
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], anyMatch: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    anyMatch: js.Any,
    caseSensitive: js.Any
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.UndefOr[scala.Nothing],
    value: js.Any,
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: js.Any
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.UndefOr[scala.Nothing], value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(
    property: js.Any,
    value: js.UndefOr[scala.Nothing],
    anyMatch: js.UndefOr[scala.Nothing],
    caseSensitive: js.Any
  ): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.UndefOr[scala.Nothing], anyMatch: js.Any, caseSensitive: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.UndefOr[scala.Nothing], caseSensitive: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.filter")
  @js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(fn: js.Any): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.filterBy")
  @js.native
  def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.filtered")
  @js.native
  def filtered: Boolean = js.native
  @scala.inline
  def filtered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filtered")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function.
    */
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.findBy")
  @js.native
  def findBy(fn: js.Any, scope: js.Any): js.Any = js.native
  
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index, or -1 if the item was not found.
    */
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.UndefOr[scala.Nothing], scope: js.Any, start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any, scope: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findIndexBy")
  @js.native
  def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
  
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
    * @param items Array The array that you want to insert the item into.
    * @param item Mixed The item that you want to insert into the items array.
    * @returns Number The index for the given item in the given array based on the current sorters.
    */
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(): Double = js.native
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(items: js.UndefOr[scala.Nothing], item: js.Any): Double = js.native
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(items: typingsSlinky.senchaTouch.Ext.Array): Double = js.native
  @JSGlobal("Ext.StoreMgr.findInsertionIndex")
  @js.native
  def findInsertionIndex(items: typingsSlinky.senchaTouch.Ext.Array, item: js.Any): Double = js.native
  
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection.
    */
  @JSGlobal("Ext.StoreMgr.first")
  @js.native
  def first(): js.Any = js.native
  
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  @JSGlobal("Ext.StoreMgr.get")
  @js.native
  def get(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.get")
  @js.native
  def get(key: js.Any): js.Any = js.native
  
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  @JSGlobal("Ext.StoreMgr.getAt")
  @js.native
  def getAt(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getAt")
  @js.native
  def getAt(index: Double): js.Any = js.native
  
  /** [Method] Returns the value of autoFilter
    * @returns Boolean
    */
  @JSGlobal("Ext.StoreMgr.getAutoFilter")
  @js.native
  def getAutoFilter(): Boolean = js.native
  
  /** [Method] Returns the value of autoSort
    * @returns Boolean
    */
  @JSGlobal("Ext.StoreMgr.getAutoSort")
  @js.native
  def getAutoSort(): Boolean = js.native
  
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  @JSGlobal("Ext.StoreMgr.getByKey")
  @js.native
  def getByKey(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getByKey")
  @js.native
  def getByKey(key: js.Any): js.Any = js.native
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  @JSGlobal("Ext.StoreMgr.getCount")
  @js.native
  def getCount(): Double = js.native
  
  /** [Method] Returns the value of defaultSortDirection
    * @returns String
    */
  @JSGlobal("Ext.StoreMgr.getDefaultSortDirection")
  @js.native
  def getDefaultSortDirection(): java.lang.String = js.native
  
  /** [Method] Returns an up to date sort function
    * @returns Function sortFn The sort function.
    */
  @JSGlobal("Ext.StoreMgr.getFilterFn")
  @js.native
  def getFilterFn(): js.Any = js.native
  
  /** [Method] Returns the value of filterRoot
    * @returns String
    */
  @JSGlobal("Ext.StoreMgr.getFilterRoot")
  @js.native
  def getFilterRoot(): java.lang.String = js.native
  
  /** [Method] Returns the value of filters
    * @returns Array
    */
  @JSGlobal("Ext.StoreMgr.getFilters")
  @js.native
  def getFilters(): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @JSGlobal("Ext.StoreMgr.getInitialConfig")
  @js.native
  def getInitialConfig(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getInitialConfig")
  @js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] getKey implementation for MixedCollection
    * @param o Object
    * @returns Object The key for the passed item.
    */
  @JSGlobal("Ext.StoreMgr.getKey")
  @js.native
  def getKey(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.getKey")
  @js.native
  def getKey(o: js.Any): js.Any = js.native
  
  /** [Method] Returns a range of items in this collection
    * @param start Number The starting index.
    * @param end Number The ending index. Defaults to the last item.
    * @returns Array An array of items.
    */
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(start: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.getRange")
  @js.native
  def getRange(start: Double, end: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Returns an up to date sort function
    * @returns Function The sort function.
    */
  @JSGlobal("Ext.StoreMgr.getSortFn")
  @js.native
  def getSortFn(): js.Any = js.native
  
  /** [Method] Returns the value of sortRoot
    * @returns String
    */
  @JSGlobal("Ext.StoreMgr.getSortRoot")
  @js.native
  def getSortRoot(): java.lang.String = js.native
  
  /** [Method] Returns the value of sorters
    * @returns Array
    */
  @JSGlobal("Ext.StoreMgr.getSorters")
  @js.native
  def getSorters(): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] Returns index within the collection of the passed Object
    * @param item Object The item to find the index of.
    * @returns Number Index of the item. Returns -1 if not found.
    */
  @JSGlobal("Ext.StoreMgr.indexOf")
  @js.native
  def indexOf(): Double = js.native
  @JSGlobal("Ext.StoreMgr.indexOf")
  @js.native
  def indexOf(item: js.Any): Double = js.native
  
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number Index of the key.
    */
  @JSGlobal("Ext.StoreMgr.indexOfKey")
  @js.native
  def indexOfKey(): Double = js.native
  @JSGlobal("Ext.StoreMgr.indexOfKey")
  @js.native
  def indexOfKey(key: java.lang.String): Double = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreMgr.indices")
  @js.native
  def indices: js.Any = js.native
  @scala.inline
  def indices_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indices")(x.asInstanceOf[js.Any])
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @JSGlobal("Ext.StoreMgr.initConfig")
  @js.native
  def initConfig(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.initConfig")
  @js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String The key to associate with the new item, or the item itself.
    * @param item Object If the second parameter was a key, the new item.
    * @returns Object The item inserted.
    */
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: js.UndefOr[scala.Nothing], key: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: js.UndefOr[scala.Nothing], key: java.lang.String, item: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double, key: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double, key: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insert")
  @js.native
  def insert(index: Double, key: java.lang.String, item: js.Any): js.Any = js.native
  
  /** [Method] This method adds a filter at a given index
    * @param index Number The index at which to insert the filter.
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Object
    */
  @JSGlobal("Ext.StoreMgr.insertFilter")
  @js.native
  def insertFilter(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insertFilter")
  @js.native
  def insertFilter(index: js.UndefOr[scala.Nothing], filter: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insertFilter")
  @js.native
  def insertFilter(index: Double): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.insertFilter")
  @js.native
  def insertFilter(index: Double, filter: js.Any): js.Any = js.native
  
  /** [Method] This method inserts all the filters in the passed array at the given index
    * @param index Number The index at which to insert the filters.
    * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Array
    */
  @JSGlobal("Ext.StoreMgr.insertFilters")
  @js.native
  def insertFilters(): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.insertFilters")
  @js.native
  def insertFilters(index: js.UndefOr[scala.Nothing], filters: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.insertFilters")
  @js.native
  def insertFilters(index: Double): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.insertFilters")
  @js.native
  def insertFilters(index: Double, filters: typingsSlinky.senchaTouch.Ext.Array): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Method] This method adds a sorter at a given index
    * @param index Number The index at which to insert the sorter.
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(
    index: js.UndefOr[scala.Nothing],
    sorter: js.UndefOr[scala.Nothing],
    defaultDirection: java.lang.String
  ): Unit = js.native
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(index: js.UndefOr[scala.Nothing], sorter: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(index: js.UndefOr[scala.Nothing], sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(index: Double): Unit = js.native
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(index: Double, sorter: js.UndefOr[scala.Nothing], defaultDirection: java.lang.String): Unit = js.native
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(index: Double, sorter: js.Any): Unit = js.native
  @JSGlobal("Ext.StoreMgr.insertSorter")
  @js.native
  def insertSorter(index: Double, sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
  
  /** [Method] This method inserts all the sorters in the passed array at the given index
    * @returns Ext.util.Collection this
    */
  @JSGlobal("Ext.StoreMgr.insertSorters")
  @js.native
  def insertSorters(): ICollection = js.native
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreMgr.items")
  @js.native
  def items: typingsSlinky.senchaTouch.Ext.Array = js.native
  @scala.inline
  def items_=(x: typingsSlinky.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreMgr.keys")
  @js.native
  def keys: typingsSlinky.senchaTouch.Ext.Array = js.native
  @scala.inline
  def keys_=(x: typingsSlinky.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection.
    */
  @JSGlobal("Ext.StoreMgr.last")
  @js.native
  def last(): js.Any = js.native
  
  /** [Property] (Number) */
  @JSGlobal("Ext.StoreMgr.length")
  @js.native
  def length: Double = js.native
  @scala.inline
  def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
  
  /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
    * @param store String/Object The id of the Store, or a Store instance, or a store configuration.
    * @returns Ext.data.Store
    */
  @JSGlobal("Ext.StoreMgr.lookup")
  @js.native
  def lookup(): IStore = js.native
  @JSGlobal("Ext.StoreMgr.lookup")
  @js.native
  def lookup(store: js.Any): IStore = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreMgr.map")
  @js.native
  def map: js.Any = js.native
  @scala.inline
  def map_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
  
  /** [Method] Registers one or more Stores with the StoreManager
    * @param stores Ext.data.Store... Any number of Store instances.
    */
  @JSGlobal("Ext.StoreMgr.register")
  @js.native
  def register(stores: IStore): Unit = js.native
  
  /** [Method] Remove an item from the collection
    * @param item Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  @JSGlobal("Ext.StoreMgr.remove")
  @js.native
  def remove(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.remove")
  @js.native
  def remove(item: js.Any): js.Any = js.native
  
  /** [Method] Remove all items in the passed array from the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  @JSGlobal("Ext.StoreMgr.removeAll")
  @js.native
  def removeAll(): IMixedCollection = js.native
  @JSGlobal("Ext.StoreMgr.removeAll")
  @js.native
  def removeAll(items: typingsSlinky.senchaTouch.Ext.Array): IMixedCollection = js.native
  
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  @JSGlobal("Ext.StoreMgr.removeAt")
  @js.native
  def removeAt(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.removeAt")
  @js.native
  def removeAt(index: Double): js.Any = js.native
  
  /** [Method] Removed an item associated with the passed key from the collection
    * @param key String The key of the item to remove.
    * @returns Object/Boolean The item removed or false if no item was removed.
    */
  @JSGlobal("Ext.StoreMgr.removeAtKey")
  @js.native
  def removeAtKey(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.removeAtKey")
  @js.native
  def removeAtKey(key: java.lang.String): js.Any = js.native
  
  /** [Method] This method removes all the filters in a passed array
    * @param filters Object
    * @returns Ext.util.Collection this
    */
  @JSGlobal("Ext.StoreMgr.removeFilters")
  @js.native
  def removeFilters(): ICollection = js.native
  @JSGlobal("Ext.StoreMgr.removeFilters")
  @js.native
  def removeFilters(filters: js.Any): ICollection = js.native
  
  /** [Method] This method removes a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    */
  @JSGlobal("Ext.StoreMgr.removeSorter")
  @js.native
  def removeSorter(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.removeSorter")
  @js.native
  def removeSorter(sorter: js.Any): Unit = js.native
  
  /** [Method] This method removes all the sorters in a passed array
    * @param sorters Object
    * @returns Ext.util.Collection this
    */
  @JSGlobal("Ext.StoreMgr.removeSorters")
  @js.native
  def removeSorters(): ICollection = js.native
  @JSGlobal("Ext.StoreMgr.removeSorters")
  @js.native
  def removeSorters(sorters: js.Any): ICollection = js.native
  
  /** [Method] Replaces an item in the collection
    * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(oldKey: js.UndefOr[scala.Nothing], item: js.Any): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(oldKey: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.StoreMgr.replace")
  @js.native
  def replace(oldKey: java.lang.String, item: js.Any): js.Any = js.native
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.StoreMgr.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sets the value of autoFilter
    * @param autoFilter Boolean The new value.
    */
  @JSGlobal("Ext.StoreMgr.setAutoFilter")
  @js.native
  def setAutoFilter(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.setAutoFilter")
  @js.native
  def setAutoFilter(autoFilter: Boolean): Unit = js.native
  
  /** [Method] Sets the value of autoSort
    * @param autoSort Boolean The new value.
    */
  @JSGlobal("Ext.StoreMgr.setAutoSort")
  @js.native
  def setAutoSort(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.setAutoSort")
  @js.native
  def setAutoSort(autoSort: Boolean): Unit = js.native
  
  /** [Method] Sets the value of defaultSortDirection
    * @param defaultSortDirection String The new value.
    */
  @JSGlobal("Ext.StoreMgr.setDefaultSortDirection")
  @js.native
  def setDefaultSortDirection(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.setDefaultSortDirection")
  @js.native
  def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = js.native
  
  /** [Method] Sets the value of filterRoot
    * @param filterRoot String The new value.
    */
  @JSGlobal("Ext.StoreMgr.setFilterRoot")
  @js.native
  def setFilterRoot(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.setFilterRoot")
  @js.native
  def setFilterRoot(filterRoot: java.lang.String): Unit = js.native
  
  /** [Method] Sets the value of filters
    * @param filters Array The new value.
    */
  @JSGlobal("Ext.StoreMgr.setFilters")
  @js.native
  def setFilters(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.setFilters")
  @js.native
  def setFilters(filters: typingsSlinky.senchaTouch.Ext.Array): Unit = js.native
  
  /** [Method] Sets the value of sortRoot
    * @param sortRoot String The new value.
    */
  @JSGlobal("Ext.StoreMgr.setSortRoot")
  @js.native
  def setSortRoot(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.setSortRoot")
  @js.native
  def setSortRoot(sortRoot: java.lang.String): Unit = js.native
  
  /** [Method] Sets the value of sorters
    * @param sorters Array The new value.
    */
  @JSGlobal("Ext.StoreMgr.setSorters")
  @js.native
  def setSorters(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.setSorters")
  @js.native
  def setSorters(sorters: typingsSlinky.senchaTouch.Ext.Array): Unit = js.native
  
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param sorters Object
    * @param defaultDirection Object
    * @returns Array The array you passed after it is sorted.
    */
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(sorters: js.UndefOr[scala.Nothing], defaultDirection: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(sorters: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  @JSGlobal("Ext.StoreMgr.sort")
  @js.native
  def sort(sorters: js.Any, defaultDirection: js.Any): typingsSlinky.senchaTouch.Ext.Array = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.sorted")
  @js.native
  def sorted: Boolean = js.native
  @scala.inline
  def sorted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorted")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @JSGlobal("Ext.StoreMgr.statics")
  @js.native
  def statics(): IClass = js.native
  
  /** [Method] Unregisters one or more Stores with the StoreManager
    * @param stores String/Object... Any number of Store instances or ID-s.
    */
  @JSGlobal("Ext.StoreMgr.unregister")
  @js.native
  def unregister(): Unit = js.native
  @JSGlobal("Ext.StoreMgr.unregister")
  @js.native
  def unregister(stores: js.Any): Unit = js.native
}
