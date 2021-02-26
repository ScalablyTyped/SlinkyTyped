package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsHttpProductInfoHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the User-Agent HTTP header on an HTTP request. */
@js.native
trait HttpProductInfoHeaderValueCollection extends Array[HttpProductInfoHeaderValue] {
  
  /**
    * Adds a new HttpProductInfoHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpProductInfoHeaderValue): Unit = js.native
  
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator to the first HttpProductInfoHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpProductInfoHeaderValue items in the collection. The iterator points to the first HttpProductInfoHeaderValue item in the HttpProductInfoHeaderValueCollection .
    */
  def first(): IIterator[HttpProductInfoHeaderValue] = js.native
  
  /**
    * Returns the HttpProductInfoHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpProductInfoHeaderValue at the specified index in the HttpProductInfoHeaderValueCollection .
    */
  def getAt(index: Double): HttpProductInfoHeaderValue = js.native
  
  /**
    * Retrieves the HttpProductInfoHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpProductInfoHeaderValue items in the HttpProductInfoHeaderValueCollection .
    */
  def getMany(startIndex: Double): ItemsHttpProductInfoHeaderValue = js.native
  
  /**
    * Returns an immutable view of the HttpProductInfoHeaderValueCollection .
    * @return The view of the HttpProductInfoHeaderValueCollection .
    */
  def getView(): IVectorView[HttpProductInfoHeaderValue] = js.native
  
  def indexOf(value: HttpProductInfoHeaderValue, extra: js.Any*): Index = js.native
  /**
    * Determines whether an element is in the collection.
    * @param item The item to find in the collection.
    * @return true if the item was found in the collection; otherwise, false.
    */
  @JSName("indexOf")
  def indexOf_Boolean(item: HttpProductInfoHeaderValue): Boolean = js.native
  /**
    * Retrieves the index of an HttpProductInfoHeaderValue in the collection.
    * @param value The HttpProductInfoHeaderValue to find in the HttpProductInfoHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Index(value: HttpProductInfoHeaderValue): Index = js.native
  
  /**
    * Inserts an HttpProductInfoHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpProductInfoHeaderValue): Unit = js.native
  
  /**
    * Parses and adds an entry to the HttpProductInfoHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  
  /**
    * Removes the entry at the specified index from the HttpMethodHeaderValueCollection.
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last HttpProductInfoHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all the HttpProductInfoHeaderValue items in the collection with the specified HttpProductInfoHeaderValue items.
    * @param items The HttpProductInfoHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpProductInfoHeaderValue): Unit = js.native
  
  /**
    * Sets the HttpProductInfoHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpProductInfoHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpProductInfoHeaderValue): Unit = js.native
  
  /** Gets the number of HttpProductInfoHeaderValue objects in the collection. */
  var size: Double = js.native
  
  /**
    * Tries to parse and add the specified item to the HttpProductInfoHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}
