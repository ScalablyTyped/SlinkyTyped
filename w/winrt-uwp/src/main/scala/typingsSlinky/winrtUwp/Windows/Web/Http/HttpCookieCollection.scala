package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsHttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a collection container for instances of the HttpCookie class. */
@js.native
trait HttpCookieCollection extends Array[HttpCookie] {
  /** Gets the number of cookies in the HttpCookieCollection . */
  var size: Double = js.native
  /**
    * Retrieves an iterator to the first HttpCookie item in the HttpCookieCollection .
    * @return An iterator to the first HttpCookie item in the HttpCookieCollection .
    */
  def first(): IIterator[HttpCookie] = js.native
  /**
    * Returns the HttpCookie at the specified index from the HttpCookieCollection .
    * @param index The zero-based index of a specified item in the HttpCookieCollection .
    * @return The HTTP cookie at the specified index from the HttpCookieCollection .
    */
  def getAt(index: Double): HttpCookie = js.native
  /**
    * Retrieves the HttpCookie items that start at the specified index in the HttpCookieCollection .
    * @param startIndex The zero-based index of the start of the HttpCookie items in the HttpCookieCollection .
    */
  def getMany(startIndex: Double): ItemsHttpCookie = js.native
  def indexOf(value: HttpCookie, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of an HttpCookie in the HttpCookieCollection .
    * @param value The HttpCookie to find in the HttpCookieCollection .
    */
  @JSName("indexOf")
  def indexOf_Index(value: HttpCookie): Index = js.native
}

