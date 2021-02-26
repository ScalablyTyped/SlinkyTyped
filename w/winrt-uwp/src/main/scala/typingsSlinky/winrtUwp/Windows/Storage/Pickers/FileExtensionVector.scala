package typingsSlinky.winrtUwp.Windows.Storage.Pickers

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a random-access collection of file name extensions. */
@js.native
trait FileExtensionVector extends Array[String] {
  
  /**
    * Appends a file name extension to the end of the collection.
    * @param value The file name extension to append.
    */
  def append(value: String): Unit = js.native
  
  /** Removes all file name extensions from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator that iterates through the file name extensions in the collection.
    * @return The iterator.
    */
  def first(): IIterator[String] = js.native
  
  /**
    * Retrieves the file name extension at the specified index in the collection.
    * @param index The zero-based index of the file name extension to retrieve.
    * @return The file name extension at the specified index.
    */
  def getAt(index: Double): String = js.native
  
  /**
    * Retrieves the file name extensions that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the file name extensions in the collection to retrieve.
    */
  def getMany(startIndex: Double): ItemsArray = js.native
  
  /**
    * Retrieves an immutable view of the collection of file name extensions.
    * @return The view of the collection.
    */
  def getView(): IVectorView[String] = js.native
  
  def indexOf(value: String, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of a specified file name extension in the collection.
    * @param value The file name extension to find in the collection.
    */
  @JSName("indexOf")
  def indexOf_Index(value: String): Index = js.native
  
  /**
    * Inserts a file name extension into a collection at a specified index.
    * @param index Zero-based index of the location at which to insert the file name extension.
    * @param value The file name extension to insert.
    */
  def insertAt(index: Double, value: String): Unit = js.native
  
  /**
    * Removes the file name extension at the specified index in the collection.
    * @param index The zero-based index of the file name extension to remove.
    */
  def removeAt(index: Double): Unit = js.native
  
  /** Removes the last file name extension from the collection. */
  def removeAtEnd(): Unit = js.native
  
  /**
    * Replaces all file name extensions in the collection with the specified file name extensions.
    * @param items The collection of file name extensions to put in the vector.
    */
  def replaceAll(items: js.Array[String]): Unit = js.native
  
  /**
    * Sets the file name extension at the specified index of the collection.
    * @param index The zero-based index of the location at which to set the file name extension.
    * @param value The file name extension.
    */
  def setAt(index: Double, value: String): Unit = js.native
  
  /** Gets the number of file name extensions in the collection. */
  var size: Double = js.native
}
