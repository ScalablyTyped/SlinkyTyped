package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsHttpConnectionOptionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Connection HTTP header on an HTTP request. */
@js.native
trait HttpConnectionOptionHeaderValueCollection extends Array[HttpConnectionOptionHeaderValue] {
  
  /**
    * Adds a new HttpConnectionOptionHeaderValue item to the end of the collection.
    * @param value The HttpConnectionOptionHeaderValue object to append.
    */
  def append(value: HttpConnectionOptionHeaderValue): Unit = js.native
  
  /** Removes all HttpConnectionOptionHeaderValue objects from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator to the first HttpConnectionOptionHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpConnectionOptionHeaderValue items in the collection. The iterator points to the first HttpConnectionOptionHeaderValue item in the HttpConnectionOptionHeaderValueCollection .
    */
  def first(): IIterator[HttpConnectionOptionHeaderValue] = js.native
  
  /**
    * Returns the HttpConnectionOptionHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the HttpConnectionOptionHeaderValueCollection .
    * @return The HttpConnectionOptionHeaderValue at the specified index in the HttpConnectionOptionHeaderValueCollection .
    */
  def getAt(index: Double): HttpConnectionOptionHeaderValue = js.native
  
  /**
    * Retrieves the HttpConnectionOptionHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpConnectionOptionHeaderValue items in the HttpConnectionOptionHeaderValueCollection .
    */
  def getMany(startIndex: Double): ItemsHttpConnectionOptionHeaderValue = js.native
  
  /**
    * Returns an immutable view of the HttpConnectionOptionHeaderValueCollection .
    * @return The view of the HttpConnectionOptionHeaderValueCollection .
    */
  def getView(): IVectorView[HttpConnectionOptionHeaderValue] = js.native
  
  def indexOf(value: HttpConnectionOptionHeaderValue, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of an HttpConnectionOptionHeaderValue in the collection.
    * @param value The HttpConnectionOptionHeaderValue to find in the HttpConnectionOptionHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Index(value: HttpConnectionOptionHeaderValue): Index = js.native
  
  /**
    * Inserts an HttpConnectionOptionHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpConnectionOptionHeaderValue): Unit = js.native
  
  /**
    * Parses and adds an entry to the HttpConnectionOptionHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  
  /**
    * Removes the entry at the specified index from the HttpConnectionOptionHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last HttpConnectionOptionHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all the HttpConnectionOptionHeaderValue items in the collection with the specified HttpConnectionOptionHeaderValue items.
    * @param items The collection of HttpConnectionOptionHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpConnectionOptionHeaderValue): Unit = js.native
  
  /**
    * Sets the HttpConnectionOptionHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpConnectionOptionHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpConnectionOptionHeaderValue): Unit = js.native
  
  /** Gets the number of HttpConnectionOptionHeaderValue objects in the collection. */
  var size: Double = js.native
  
  /**
    * Tries to parse and add the specified item to the HttpConnectionOptionHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}
