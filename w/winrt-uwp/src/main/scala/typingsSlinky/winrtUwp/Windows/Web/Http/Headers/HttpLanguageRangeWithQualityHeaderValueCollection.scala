package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsHttpLanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Accept-Language HTTP header on an HTTP request. */
@js.native
trait HttpLanguageRangeWithQualityHeaderValueCollection extends Array[HttpLanguageRangeWithQualityHeaderValue] {
  
  /**
    * Adds a new HttpLanguageRangeWithQualityHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpLanguageRangeWithQualityHeaderValue): Unit = js.native
  
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator to the first HttpLanguageRangeWithQualityHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpLanguageRangeWithQualityHeaderValue items in the collection. The iterator points to the first HttpLanguageRangeWithQualityHeaderValue item in the HttpLanguageRangeWithQualityHeaderValueCollection .
    */
  def first(): IIterator[HttpLanguageRangeWithQualityHeaderValue] = js.native
  
  /**
    * Returns the HttpLanguageRangeWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpLanguageRangeWithQualityHeaderValue at the specified index in the HttpLanguageRangeWithQualityHeaderValueCollection .
    */
  def getAt(index: Double): HttpLanguageRangeWithQualityHeaderValue = js.native
  
  /**
    * Retrieves the HttpLanguageRangeWithQualityHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpLanguageRangeWithQualityHeaderValue items in the HttpLanguageRangeWithQualityHeaderValueCollection .
    */
  def getMany(startIndex: Double): ItemsHttpLanguageRangeWithQualityHeaderValue = js.native
  
  /**
    * Returns an immutable view of the HttpLanguageRangeWithQualityHeaderValueCollection .
    * @return The view of the HttpLanguageRangeWithQualityHeaderValueCollection .
    */
  def getView(): IVectorView[HttpLanguageRangeWithQualityHeaderValue] = js.native
  
  def indexOf(value: HttpLanguageRangeWithQualityHeaderValue, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of an HttpLanguageRangeWithQualityHeaderValue in the collection.
    * @param value The HttpLanguageRangeWithQualityHeaderValue to find in the HttpLanguageRangeWithQualityHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Index(value: HttpLanguageRangeWithQualityHeaderValue): Index = js.native
  
  /**
    * Inserts an HttpLanguageRangeWithQualityHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: Double, value: HttpLanguageRangeWithQualityHeaderValue): Unit = js.native
  
  /**
    * Parses and adds an entry to the HttpLanguageRangeWithQualityHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: String): Unit = js.native
  
  /**
    * Removes the entry at the specified index from the HttpLanguageRangeWithQualityHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last HttpLanguageRangeWithQualityHeaderValue item from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all the HttpLanguageRangeWithQualityHeaderValue items in the collection with the specified HttpLanguageRangeWithQualityHeaderValue items.
    * @param items The HttpLanguageRangeWithQualityHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpLanguageRangeWithQualityHeaderValue): Unit = js.native
  
  /**
    * Sets the HttpLanguageRangeWithQualityHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpLanguageRangeWithQualityHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: Double, value: HttpLanguageRangeWithQualityHeaderValue): Unit = js.native
  
  /** Gets the number of HttpLanguageRangeWithQualityHeaderValue objects in the collection. */
  var size: Double = js.native
  
  /**
    * Tries to parse and add the specified item to the HttpLanguageRangeWithQualityHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: String): Boolean = js.native
}
