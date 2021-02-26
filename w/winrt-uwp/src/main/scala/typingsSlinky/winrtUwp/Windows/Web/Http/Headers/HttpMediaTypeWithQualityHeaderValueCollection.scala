package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsHttpMediaTypeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Accept HTTP header on an HTTP request. */
@js.native
trait HttpMediaTypeWithQualityHeaderValueCollection extends Array[HttpMediaTypeWithQualityHeaderValue] {
  
  /**
    * Adds a new HttpMediaTypeWithQualityHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpMediaTypeWithQualityHeaderValue): Unit = js.native
  
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator to the first HttpMediaTypeWithQualityHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpMediaTypeWithQualityHeaderValue items in the collection. The iterator points to the first HttpMediaTypeWithQualityHeaderValue item in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def first(): IIterator[HttpMediaTypeWithQualityHeaderValue] = js.native
  
  /**
    * Returns the HttpMediaTypeWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpMediaTypeWithQualityHeaderValue at the specified index in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def getAt(index: Double): HttpMediaTypeWithQualityHeaderValue = js.native
  
  /**
    * Retrieves the HttpMediaTypeWithQualityHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpMediaTypeWithQualityHeaderValue items in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def getMany(startIndex: Double): ItemsHttpMediaTypeWithQualityHeaderValue = js.native
  
  /**
    * Returns an immutable view of the HttpMediaTypeWithQualityHeaderValueCollection .
    * @return The view of the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  def getView(): IVectorView[HttpMediaTypeWithQualityHeaderValue] = js.native
  
  def indexOf(value: HttpMediaTypeWithQualityHeaderValue, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of an HttpMediaTypeWithQualityHeaderValue in the collection.
    * @param value The HttpMediaTypeWithQualityHeaderValue to find in the HttpMediaTypeWithQualityHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Index(value: HttpMediaTypeWithQualityHeaderValue): Index = js.native
  
  /**
    * Inserts an HttpMediaTypeWithQualityHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpMediaTypeWithQualityHeaderValue): Unit = js.native
  
  /**
    * Parses and adds an entry to the HttpMediaTypeWithQualityHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  
  /**
    * Removes the entry at the specified index from the HttpMediaTypeWithQualityHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last HttpMediaTypeWithQualityHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all the HttpMediaTypeWithQualityHeaderValue items in the collection with the specified HttpMediaTypeWithQualityHeaderValue items.
    * @param items The HttpMediaTypeWithQualityHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpMediaTypeWithQualityHeaderValue): Unit = js.native
  
  /**
    * Sets the HttpMediaTypeWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpMediaTypeWithQualityHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpMediaTypeWithQualityHeaderValue): Unit = js.native
  
  /** Gets the number of HttpMediaTypeWithQualityHeaderValue objects in the collection. */
  var size: Double = js.native
  
  /**
    * Tries to parse and add the specified item to the HttpMediaTypeWithQualityHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}
