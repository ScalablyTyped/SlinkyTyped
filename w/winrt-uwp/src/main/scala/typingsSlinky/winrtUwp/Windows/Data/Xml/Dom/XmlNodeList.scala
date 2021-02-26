package typingsSlinky.winrtUwp.Windows.Data.Xml.Dom

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsIXmlNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a collection of nodes. */
@js.native
trait XmlNodeList extends Array[IXmlNode] {
  
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IXmlNode] = js.native
  
  /**
    * Returns the item at the specified index in the vector view.
    * @param index The zero-based index of the item in the vector view to return.
    * @return The item in the vector view at the specified index.
    */
  def getAt(index: Double): IXmlNode = js.native
  
  /**
    * Returns the items that start at the specified index of the vector view.
    * @param startIndex The zero-based index of the start of the items in the vector to return.
    */
  def getMany(startIndex: Double): ItemsIXmlNode = js.native
  
  def indexOf(value: IXmlNode, extra: js.Any*): Index = js.native
  /**
    * Returns the index of a specified item in the vector.
    * @param value The item to find in the vector.
    */
  @JSName("indexOf")
  def indexOf_Index(value: IXmlNode): Index = js.native
  
  /**
    * Returns the item in the list at the specified index.
    * @param index The zero-based index of the requested item.
    * @return The requested item. This method returns NULL if the index is not valid.
    */
  def item(index: Double): IXmlNode = js.native
  
  /** Gets the number of elements in the vector view. */
  var size: Double = js.native
}
