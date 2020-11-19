package typingsSlinky.whatwgUrl.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whatwg-url", "URLSearchParams")
@js.native
class URLSearchParams () extends js.Object {
  def this(init: String) = this()
  def this(init: js.Array[js.Tuple2[String, String]]) = this()
  def this(init: StringDictionary[String]) = this()
  def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): Unit = js.native
  
  def get(name: String): String | Null = js.native
  
  def getAll(name: String): js.Array[String] = js.native
  
  def has(name: String): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
  
  def set(name: String, value: String): Unit = js.native
  
  def sort(): Unit = js.native
}
