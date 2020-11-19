package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsHttpContentCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Encoding HTTP header on HTTP content in a request or a response. */
@js.native
trait HttpContentCodingHeaderValueCollection extends Array[HttpContentCodingHeaderValue] {
  
  /**
    * Adds a new HttpContentCodingHeaderValue item to the end of the collection.
    * @param value The HttpContentCodingHeaderValue object to append.
    */
  def append(value: HttpContentCodingHeaderValue): Unit = js.native
  
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator to the first HttpContentCodingHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpContentCodingHeaderValue items in the collection. The iterator points to the first HttpContentCodingHeaderValue item in the HttpContentCodingHeaderValueCollection .
    */
  def first(): IIterator[HttpContentCodingHeaderValue] = js.native
  
  /**
    * Returns the HttpContentCodingHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the HttpContentCodingHeaderValueCollection .
    * @return The HttpContentCodingHeaderValue at the specified index in the HttpContentCodingHeaderValueCollection .
    */
  def getAt(index: Double): HttpContentCodingHeaderValue = js.native
  
  /**
    * Retrieves the HttpContentCodingHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpContentCodingHeaderValue items in the HttpContentCodingHeaderValueCollection .
    */
  def getMany(startIndex: Double): ItemsHttpContentCodingHeaderValue = js.native
  
  /**
    * Returns an immutable view of the HttpContentCodingHeaderValueCollection .
    * @return The view of the HttpContentCodingHeaderValueCollection .
    */
  def getView(): IVectorView[HttpContentCodingHeaderValue] = js.native
  
  def indexOf(value: HttpContentCodingHeaderValue, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of an HttpContentCodingHeaderValue in the collection.
    * @param value The HttpContentCodingHeaderValue to find in the HttpContentCodingHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Index(value: HttpContentCodingHeaderValue): Index = js.native
  
  /**
    * Inserts an HttpContentCodingHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpContentCodingHeaderValue): Unit = js.native
  
  /**
    * Parses and adds an entry to the HttpContentCodingHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  
  /**
    * Removes the entry at the specified index from the HttpContentCodingHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last HttpContentCodingHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all the HttpContentCodingHeaderValue items in the collection with the specified HttpContentCodingHeaderValue items.
    * @param items The HttpContentCodingHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpContentCodingHeaderValue): Unit = js.native
  
  /**
    * Sets the HttpContentCodingHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpContentCodingHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpContentCodingHeaderValue): Unit = js.native
  
  /** Gets the number of HttpContentCodingHeaderValue objects in the collection. */
  var size: Double = js.native
  
  /**
    * Tries to parse and add the specified item to the HttpContentCodingHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}
