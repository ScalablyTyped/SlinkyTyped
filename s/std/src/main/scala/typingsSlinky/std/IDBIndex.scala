package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IDBIndex interface of the IndexedDB API provides asynchronous access to an index in a database. An index is a kind of object store for looking up records in another object store, called the referenced object store. You use this interface to retrieve data. */
@js.native
trait IDBIndex extends js.Object {
  val keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  val multiEntry: scala.Boolean = js.native
  /**
    * Returns the name of the index.
    */
  var name: java.lang.String = js.native
  /**
    * Returns the IDBObjectStore the index belongs to.
    */
  val objectStore: org.scalajs.dom.raw.IDBObjectStore = js.native
  val unique: scala.Boolean = js.native
  /**
    * Retrieves the number of records matching the given key or key range in query.
    * 
    * If successful, request's result will be the count.
    */
  def count(): org.scalajs.dom.raw.IDBRequest = js.native
  def count(key: IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def count(key: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  def get(key: IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Retrieves the value of the first record matching the given key or key range in query.
    * 
    * If successful, request's result will be the value, or undefined if there was no matching record.
    */
  def get(key: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Retrieves the values of the records matching the given key or key range in query (up to count if given).
    * 
    * If successful, request's result will be an Array of the values.
    */
  def getAll(): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: Null, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: IDBKeyRange, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  def getAll(query: IDBValidKey, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Retrieves the keys of records matching the given key or key range in query (up to count if given).
    * 
    * If successful, request's result will be an Array of the keys.
    */
  def getAllKeys(): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: Null, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: IDBKeyRange, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  def getAllKeys(query: IDBValidKey, count: Double): org.scalajs.dom.raw.IDBRequest = js.native
  def getKey(key: IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Retrieves the key of the first record matching the given key or key range in query.
    * 
    * If successful, request's result will be the key, or undefined if there was no matching record.
    */
  def getKey(key: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in index are matched.
    * 
    * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
    */
  def openCursor(): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: Null, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: IDBKeyRange, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  def openCursor(query: IDBValidKey, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  /**
    * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
    * 
    * If successful, request's result will be an IDBCursor, or null if there were no matching records.
    */
  def openKeyCursor(): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: Null, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: IDBKeyRange): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: IDBKeyRange, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: IDBValidKey): org.scalajs.dom.raw.IDBRequest = js.native
  def openKeyCursor(query: IDBValidKey, direction: IDBCursorDirection): org.scalajs.dom.raw.IDBRequest = js.native
}

@JSGlobal("IDBIndex")
@js.native
object IDBIndex extends Instantiable0[IDBIndex]

