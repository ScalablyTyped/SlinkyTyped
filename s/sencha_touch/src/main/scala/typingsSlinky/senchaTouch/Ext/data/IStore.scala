package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IEvented
import typingsSlinky.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStore extends IEvented {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Uses the configured reader to convert the data into records and adds it to the Store
  		* @param data Object[] Array of data to load
  		*/
  var addData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] We are using applyData so that we can return nothing and prevent the this data property to be overridden
  		* @param data Array/Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.native
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record you want to get the average for.
  		* @returns Number The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.native
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.native
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean true to clear silently without firing the refresh event.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.native
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.native
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var destroyRemovedRecords: js.UndefOr[Boolean] = js.native
  /** [Method] Calls the specified function for each of the Records in the cache
  		* @param fn Function The function to call. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Record in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object[]/Ext.util.Collection) */
  var fields: js.UndefOr[js.Any] = js.native
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string.
  		* @param value String value to filter by (only if using a property string as the first argument).
  		* @param anyMatch Boolean true to allow any match, false to anchor regex beginning with ^.
  		* @param caseSensitive Boolean true to make the filtering regex case sensitive.
  		*/
  var filter: js.UndefOr[
    js.Function4[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[String], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Filter by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Number The matched index or -1
  		*/
  var find: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  /** [Method] Find the index of the first matching Record in this Store by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value Object The value to match the field against.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /** [Method] Finds the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Ext.data.Model The matched record or null.
  		*/
  var findRecord: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IModel
    ]
  ] = js.native
  /** [Method] Convenience function for getting the first model instance in the store
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined.
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the number of all cached records including the ones currently filtered
  		* @returns Number The number of all Records in the Store's cache.
  		*/
  var getAllCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model/undefined The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns the value of autoLoad
  		* @returns Boolean/Object
  		*/
  var getAutoLoad: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of autoSync
  		* @returns Boolean
  		*/
  var getAutoSync: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of buffered
  		* @returns Boolean
  		*/
  var getBuffered: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Get the Record with the specified id
  		* @param id String The id of the Record to find.
  		* @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the value of clearOnPageLoad
  		* @returns Boolean
  		*/
  var getClearOnPageLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Gets the number of cached records
  		* @returns Number The number of Records in the Store's cache.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of data
  		* @returns Object[]/Ext.data.Model[]
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of destroyRemovedRecords
  		* @returns Boolean
  		*/
  var getDestroyRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of fields
  		* @returns Object[]/Ext.util.Collection
  		*/
  var getFields: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of getGroupString
  		* @returns Function
  		*/
  var getGetGroupString: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of groupDir
  		* @returns String
  		*/
  var getGroupDir: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of groupField
  		* @returns String
  		*/
  var getGroupField: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Function) */
  var getGroupString: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of grouper
  		* @returns Object
  		*/
  var getGrouper: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an array containing the result of applying the grouper to the records in this store
  		* @param groupName String Pass in an optional groupName argument to access a specific group as defined by grouper.
  		* @returns Object/Object[] The grouped data.
  		*/
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the value of model
  		* @returns String
  		*/
  var getModel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of modelDefaults
  		* @returns Object
  		*/
  var getModelDefaults: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns all Model instances that are either currently a phantom e g
  		* @returns Ext.data.Model[] The Model instances.
  		*/
  var getNewRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of pageSize
  		* @returns Number
  		*/
  var getPageSize: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  var getPlugins: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of proxy
  		* @returns String/Ext.data.proxy.Proxy/Object
  		*/
  var getProxy: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns a range of Records between specified indices
  		* @param startIndex Number The starting index.
  		* @param endIndex Number The ending index (defaults to the last Record in the Store).
  		* @returns Ext.data.Model[] An array of Records.
  		*/
  var getRange: js.UndefOr[
    js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Method] Returns the value of remoteFilter
  		* @returns Boolean
  		*/
  var getRemoteFilter: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of remoteGroup
  		* @returns Boolean
  		*/
  var getRemoteGroup: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of remoteSort
  		* @returns Boolean
  		*/
  var getRemoteSort: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
  		* @returns Ext.data.Model[] The removed Model instances.
  		*/
  var getRemovedRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of storeId
  		* @returns String
  		*/
  var getStoreId: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of syncRemovedRecords
  		* @returns Boolean
  		*/
  var getSyncRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
  		* @returns Ext.data.Model[] The updated Model instances.
  		*/
  var getUpdatedRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var grouper: js.UndefOr[js.Any] = js.native
  /** [Method] Get the index within the cache of the passed Record
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
  /** [Method] Get the index within the cache of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.native
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the cache.
  		* @returns Object
  		*/
  var insert: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], _]] = js.native
  /** [Method] Returns true if the Store is set to autoLoad or is a type which loads upon instantiation
  		* @returns Boolean
  		*/
  var isAutoLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] This method tells you if this store has a grouper defined on it
  		* @returns Boolean true if this store has a grouper defined.
  		*/
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Store has been loaded
  		* @returns Boolean true if the Store has been loaded.
  		*/
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Store is currently performing a load operation
  		* @returns Boolean true if the Store is currently loading.
  		*/
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this store is currently sorted
  		* @returns Boolean
  		*/
  var isSorted: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Convenience function for getting the last model instance in the store
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined.
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Loads data into the Store via the configured proxy
  		* @param options Object/Function config object, passed into the Ext.data.Operation object before loading.
  		* @param scope Object Scope for the function.
  		* @returns Object
  		*/
  var load: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Loads an array of data straight into the Store
  		* @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
  		* @param page Number The number of the page to load.
  		* @param options Object See options for load.
  		* @param scope Object
  		*/
  var loadPage: js.UndefOr[
    js.Function3[
      /* page */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var loadRecords: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], _]] = js.native
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], _]] = js.native
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.native
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load.
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.native
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load.
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.native
  /** [Method] Query the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records.
  		*/
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[Boolean] = js.native
  /** [Method] Removes the given record from the Store firing the removerecords event passing all the instances that are removed
  		* @param records Ext.data.Model/Ext.data.Model[] Model instance or array of instances to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Remove all items from the store
  		* @param silent Boolean Prevent the clear event from being fired.
  		*/
  var removeAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Removes the model instance at the given index
  		* @param index Number The record index.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of autoLoad
  		* @param autoLoad Boolean/Object The new value.
  		*/
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of autoSync
  		* @param autoSync Boolean The new value.
  		*/
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of buffered
  		* @param buffered Boolean The new value.
  		*/
  var setBuffered: js.UndefOr[js.Function1[/* buffered */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of clearOnPageLoad
  		* @param clearOnPageLoad Boolean The new value.
  		*/
  var setClearOnPageLoad: js.UndefOr[js.Function1[/* clearOnPageLoad */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of data
  		* @param data Object[]/Ext.data.Model[] The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of destroyRemovedRecords
  		* @param destroyRemovedRecords Boolean The new value.
  		*/
  var setDestroyRemovedRecords: js.UndefOr[js.Function1[/* destroyRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of fields
  		* @param fields Object[]/Ext.util.Collection The new value.
  		* @returns Object Ext.util.Collection
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of filters
  		* @param filters Object[] The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of getGroupString
  		* @param getGroupString Function The new value.
  		*/
  var setGetGroupString: js.UndefOr[js.Function1[/* getGroupString */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of groupDir
  		* @param groupDir String The new value.
  		*/
  var setGroupDir: js.UndefOr[js.Function1[/* groupDir */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of groupField
  		* @param groupField String The new value.
  		*/
  var setGroupField: js.UndefOr[js.Function1[/* groupField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of grouper
  		* @param grouper Object The new value.
  		*/
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of model
  		* @param model String The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of modelDefaults
  		* @param modelDefaults Object The new value.
  		*/
  var setModelDefaults: js.UndefOr[js.Function1[/* modelDefaults */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of proxy
  		* @param proxy String/Ext.data.proxy.Proxy/Object The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of remoteFilter
  		* @param remoteFilter Boolean The new value.
  		*/
  var setRemoteFilter: js.UndefOr[js.Function1[/* remoteFilter */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of remoteGroup
  		* @param remoteGroup Boolean The new value.
  		*/
  var setRemoteGroup: js.UndefOr[js.Function1[/* remoteGroup */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of remoteSort
  		* @param remoteSort Boolean The new value.
  		*/
  var setRemoteSort: js.UndefOr[js.Function1[/* remoteSort */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of sorters
  		* @param sorters Object[] The new value.
  		*/
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of storeId
  		* @param storeId String The new value.
  		*/
  var setStoreId: js.UndefOr[js.Function1[/* storeId */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of syncRemovedRecords
  		* @param syncRemovedRecords Boolean The new value.
  		*/
  var setSyncRemovedRecords: js.UndefOr[js.Function1[/* syncRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param defaultDirection String The default overall direction to sort the data by.
  		* @param where String This can be either 'prepend' or 'append'. If you leave this undefined it will clear the current sorters.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[String], 
      /* where */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object[]) */
  var sorters: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var storeId: js.UndefOr[String] = js.native
  /** [Method] Sums the value of property for each record between start and end and returns the result
  		* @param field String The field in each record.
  		* @returns Number The sum.
  		*/
  var sum: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.native
  /** [Method] Synchronizes the Store with its Proxy
  		* @param options Object
  		* @returns Object
  		*/
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var syncRemovedRecords: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var totalCount: js.UndefOr[Double] = js.native
}

object IStore {
  @scala.inline
  def apply(): IStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStore]
  }
  @scala.inline
  implicit class IStoreOps[Self <: IStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* model */ js.UndefOr[js.Any] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddData(value: /* data */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addData")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyData")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withAverage(value: /* field */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(js.undefined)
        ret
    }
    @scala.inline
    def withClearFilter(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnPageLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnPageLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnPageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyRemovedRecords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyRemovedRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyRemovedRecords")(js.undefined)
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
    def withFields(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
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
    def withFind(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.undefined)
        ret
    }
    @scala.inline
    def withFindBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFindExact(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findExact")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findExact")(js.undefined)
        ret
    }
    @scala.inline
    def withFindRecord(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecord")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutFindRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecord")(js.undefined)
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
    def withGetAllCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllCount")(js.undefined)
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
    def withGetAutoLoad(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoSync(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBuffered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuffered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBuffered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuffered")(js.undefined)
        ret
    }
    @scala.inline
    def withGetById(value: /* id */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClearOnPageLoad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearOnPageLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClearOnPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearOnPageLoad")(js.undefined)
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
    def withGetData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDestroyRemovedRecords(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDestroyRemovedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDestroyRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDestroyRemovedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFields(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGetGroupString(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGetGroupString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGetGroupString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGetGroupString")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroupDir(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupDir")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroupDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupDir")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroupField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroupField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroupString(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetGroupString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupString")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGrouper(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrouper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGrouper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrouper")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroups(value: /* groupName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModelDefaults(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModelDefaults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModelDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModelDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNewRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNewRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParams(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPlugins(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlugins")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRange(value: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array): Self = {
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
    def withGetRemoteFilter(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRemoteFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRemoteGroup(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRemoteGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRemoteSort(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteSort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRemoteSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteSort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRemovedRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemovedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemovedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStoreId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSyncRemovedRecords(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSyncRemovedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSyncRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSyncRemovedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTotalCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUpdatedRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdatedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUpdatedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdatedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDir")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupField")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouper")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: /* record */ js.UndefOr[IModel] => Double): Self = {
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
    def withIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOfId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfId")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAutoLoading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsAutoLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFiltered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFiltered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGrouped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoaded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSorted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSorted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSorted")(js.undefined)
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
    def withLoad(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadPage(
      value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPage")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLoadPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadRecords(value: /* model */ js.UndefOr[js.Any] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: /* field */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: /* field */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPage")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutQueryBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSort")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* records */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withRemoveAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withRemoveAt(value: /* index */ js.UndefOr[Double] => Unit): Self = {
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
    def withSetAutoLoad(value: /* autoLoad */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoSync(value: /* autoSync */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBuffered(value: /* buffered */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBuffered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBuffered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBuffered")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClearOnPageLoad(value: /* clearOnPageLoad */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearOnPageLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetClearOnPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearOnPageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDestroyRemovedRecords(value: /* destroyRemovedRecords */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDestroyRemovedRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDestroyRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDestroyRemovedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFields(value: /* fields */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.undefined)
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
    @scala.inline
    def withSetGetGroupString(value: /* getGroupString */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGetGroupString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGetGroupString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGetGroupString")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGroupDir(value: /* groupDir */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupDir")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGroupDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGroupField(value: /* groupField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGroupField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGrouper(value: /* grouper */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrouper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGrouper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrouper")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModel(value: /* model */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModelDefaults(value: /* modelDefaults */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModelDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModelDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModelDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPageSize(value: /* pageSize */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPlugins(value: /* plugins */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlugins")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProxy(value: /* proxy */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRemoteFilter(value: /* remoteFilter */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRemoteFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRemoteFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRemoteFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRemoteGroup(value: /* remoteGroup */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRemoteGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRemoteGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRemoteGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRemoteSort(value: /* remoteSort */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRemoteSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRemoteSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRemoteSort")(js.undefined)
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
    def withSetStoreId(value: /* storeId */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStoreId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStoreId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSyncRemovedRecords(value: /* syncRemovedRecords */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSyncRemovedRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSyncRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSyncRemovedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTotalCount(value: /* totalCount */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(
      value: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], /* where */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
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
    @scala.inline
    def withStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: /* field */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: /* options */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncRemovedRecords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRemovedRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRemovedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(js.undefined)
        ret
    }
  }
  
}

