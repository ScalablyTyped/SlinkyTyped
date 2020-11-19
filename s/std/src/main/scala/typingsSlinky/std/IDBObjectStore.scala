package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This example shows a variety of different uses of object stores, from updating the data structure with IDBObjectStore.createIndex inside an onupgradeneeded function, to adding a new item to our object store with IDBObjectStore.add. For a full working example, see our To-do Notifications app (view example live.) */
@js.native
trait IDBObjectStore extends js.Object {
  
  /**
    * Adds or updates a record in store with the given value and key.
    * 
    * If the store uses in-line keys and key is specified a "DataError" DOMException will be thrown.
    * 
    * If put() is used, any existing record with the key will be replaced. If add() is used, and if a record with the key already exists the request will fail, with request's error set to a "ConstraintError" DOMException.
    * 
    * If successful, request's result will be the record's key.
    */
  def add(value: js.Any): org.scalajs.dom.raw.IDBRequest = js.native
  def add(value: js.Any, key: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Returns true if the store has a key generator, and false otherwise.
    */
  val autoIncrement: scala.Boolean = js.native
  
  /**
    * Deletes all records in store.
    * 
    * If successful, request's result will be undefined.
    */
  def clear(): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Retrieves the number of records matching the given key or key range in query.
    * 
    * If successful, request's result will be the count.
    */
  def count(): org.scalajs.dom.raw.IDBRequest = js.native
  def count(key: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def count(key: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Creates a new index in store with the given name, keyPath and options and returns a new IDBIndex. If the keyPath and options define constraints that cannot be satisfied with the data already in store the upgrade transaction will abort with a "ConstraintError" DOMException.
    * 
    * Throws an "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def createIndex(name: java.lang.String, keyPath: java.lang.String): org.scalajs.dom.raw.IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: java.lang.String, options: IDBIndexParameters): org.scalajs.dom.raw.IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: js.Array[java.lang.String]): org.scalajs.dom.raw.IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: js.Array[java.lang.String], options: IDBIndexParameters): org.scalajs.dom.raw.IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: js.Iterable[java.lang.String]): org.scalajs.dom.raw.IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: js.Iterable[java.lang.String], options: IDBIndexParameters): org.scalajs.dom.raw.IDBIndex = js.native
  
  def delete(key: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Deletes records in store with the given key or in the given key range in query.
    * 
    * If successful, request's result will be undefined.
    */
  def delete(key: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Deletes the index in store with the given name.
    * 
    * Throws an "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def deleteIndex(name: java.lang.String): Unit = js.native
  
  def get(query: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Retrieves the value of the first record matching the given key or key range in query.
    * 
    * If successful, request's result will be the value, or undefined if there was no matching record.
    */
  def get(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Retrieves the values of the records matching the given key or key range in query (up to count if given).
    * 
    * If successful, request's result will be an Array of the values.
    */
  def getAll(): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: js.UndefOr[IDBValidKey], count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: Null, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: org.scalajs.dom.raw.IDBKeyRange, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Retrieves the keys of records matching the given key or key range in query (up to count if given).
    * 
    * If successful, request's result will be an Array of the keys.
    */
  def getAllKeys(): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: js.UndefOr[IDBValidKey], count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: Null, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: org.scalajs.dom.raw.IDBKeyRange, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  def getKey(query: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Retrieves the key of the first record matching the given key or key range in query.
    * 
    * If successful, request's result will be the key, or undefined if there was no matching record.
    */
  def getKey(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  def index(name: java.lang.String): org.scalajs.dom.raw.IDBIndex = js.native
  
  /**
    * Returns a list of the names of indexes in the store.
    */
  val indexNames: org.scalajs.dom.raw.DOMStringList = js.native
  
  /**
    * Returns the key path of the store, or null if none.
    */
  val keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  
  /**
    * Returns the name of the store.
    */
  var name: java.lang.String = js.native
  
  /**
    * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in store are matched.
    * 
    * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
    */
  def openCursor(): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: js.UndefOr[IDBValidKey], direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: Null, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: org.scalajs.dom.raw.IDBKeyRange, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
    * 
    * If successful, request's result will be an IDBCursor pointing at the first matching record, or null if there were no matching records.
    */
  def openKeyCursor(): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: js.UndefOr[IDBValidKey], direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: Null, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: org.scalajs.dom.raw.IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: org.scalajs.dom.raw.IDBKeyRange, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Adds or updates a record in store with the given value and key.
    * 
    * If the store uses in-line keys and key is specified a "DataError" DOMException will be thrown.
    * 
    * If put() is used, any existing record with the key will be replaced. If add() is used, and if a record with the key already exists the request will fail, with request's error set to a "ConstraintError" DOMException.
    * 
    * If successful, request's result will be the record's key.
    */
  def put(value: js.Any): org.scalajs.dom.raw.IDBRequest = js.native
  def put(value: js.Any, key: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  
  /**
    * Returns the associated transaction.
    */
  val transaction: org.scalajs.dom.raw.IDBTransaction = js.native
}
