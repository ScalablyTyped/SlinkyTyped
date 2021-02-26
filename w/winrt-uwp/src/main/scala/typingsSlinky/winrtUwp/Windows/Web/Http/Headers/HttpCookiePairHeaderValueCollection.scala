package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsHttpCookiePairHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Cookie HTTP header on an HTTP request. */
@js.native
trait HttpCookiePairHeaderValueCollection extends Array[HttpCookiePairHeaderValue] {
  
  /**
    * Adds a new HttpCookiePairHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpCookiePairHeaderValue): Unit = js.native
  
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator to the first HttpCookiePairHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpCookiePairHeaderValue items in the collection. The iterator points to the first HttpCookiePairHeaderValue item in the HttpCookiePairHeaderValueCollection .
    */
  def first(): IIterator[HttpCookiePairHeaderValue] = js.native
  
  /**
    * Returns the HttpCookiePairHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpCookiePairHeaderValue at the specified index in the HttpCookiePairHeaderValueCollection .
    */
  def getAt(index: Double): HttpCookiePairHeaderValue = js.native
  
  /**
    * Retrieves the HttpCookiePairHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpCookiePairHeaderValue items in the HttpCookiePairHeaderValueCollection .
    */
  def getMany(startIndex: Double): ItemsHttpCookiePairHeaderValue = js.native
  
  /**
    * Returns an immutable view of the HttpCookiePairHeaderValueCollection .
    * @return The view of the HttpCookiePairHeaderValueCollection .
    */
  def getView(): IVectorView[HttpCookiePairHeaderValue] = js.native
  
  def indexOf(value: HttpCookiePairHeaderValue, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of an HttpCookiePairHeaderValue in the collection.
    * @param value The HttpCookiePairHeaderValue to find in the HttpCookiePairHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Index(value: HttpCookiePairHeaderValue): Index = js.native
  
  /**
    * Inserts an HttpCookiePairHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpCookiePairHeaderValue): Unit = js.native
  
  /**
    * Parses and adds an entry to the HttpCookiePairHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  
  /**
    * Removes the entry at the specified index from the HttpCookiePairHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last HttpCookiePairHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all the HttpCookiePairHeaderValue items in the collection with the specified HttpCookiePairHeaderValue items.
    * @param items The HttpCookiePairHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpCookiePairHeaderValue): Unit = js.native
  
  /**
    * Sets the HttpCookiePairHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpCookiePairHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpCookiePairHeaderValue): Unit = js.native
  
  /** Gets the number of HttpCookiePairHeaderValue objects in the collection. */
  var size: Double = js.native
  
  /**
    * Tries to parse and add the specified item to the HttpCookiePairHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}
