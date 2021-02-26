package typingsSlinky.winrtUwp.Windows.Foundation

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parses a URL query string, and exposes the results as a read-only vector (list) of name-value pairs from the query string. */
@js.native
trait WwwFormUrlDecoder extends Array[IWwwFormUrlDecoderEntry] {
  
  /**
    * Gets an iterator that represents the first name-value pair in the current URL query string.
    * @return The first name-value pair.
    */
  def first(): IIterator[IWwwFormUrlDecoderEntry] = js.native
  
  /**
    * Gets the name-value pair at the specified index in the current URL query string.
    * @param index The index of the name-value pair.
    * @return The name-value pair at the position specified by index.
    */
  def getAt(index: Double): IWwwFormUrlDecoderEntry = js.native
  
  /**
    * Gets the first name-value pair that has the specified name, as obtained from the constructing Uniform Resource Identifier (URI) query string.
    * @param name The name of the value to get.
    * @return The first value in list order that corresponds with name.
    */
  def getFirstValueByName(name: String): String = js.native
  
  /**
    * Gets name-value pairs starting at the specified index in the current URL query string.
    * @param startIndex The index to start getting name-value pairs at.
    */
  def getMany(startIndex: Double): ReturnValue = js.native
  
  def indexOf(value: IWwwFormUrlDecoderEntry, extra: js.Any*): Index = js.native
  /**
    * Gets a value indicating whether the specified IWwwFormUrlDecoderEntry is at the specified index in the current URL query string.
    * @param value The name-value pair to get the index of.
    */
  @JSName("indexOf")
  def indexOf_Index(value: IWwwFormUrlDecoderEntry): Index = js.native
  
  /** Gets the number of the name-value pairs in the current URL query string. */
  var size: Double = js.native
}
