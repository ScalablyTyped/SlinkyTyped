package typingsSlinky.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.IterableIterator
import typingsSlinky.whatwgUrl.anon.DoNotStripQMark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whatwg-url/lib/URLSearchParams-impl", JSImport.Namespace)
@js.native
object urlsearchparamsImplMod extends js.Object {
  
  @js.native
  trait URLSearchParamsImpl extends js.Object {
    
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
  
  @js.native
  class implementation protected () extends URLSearchParamsImpl {
    def this(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ) = this()
  }
}
