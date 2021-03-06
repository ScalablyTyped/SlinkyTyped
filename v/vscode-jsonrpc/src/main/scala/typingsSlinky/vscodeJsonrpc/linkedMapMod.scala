package typingsSlinky.vscodeJsonrpc

import typingsSlinky.vscodeJsonrpc.vscodeJsonrpcNumbers.`0`
import typingsSlinky.vscodeJsonrpc.vscodeJsonrpcNumbers.`1`
import typingsSlinky.vscodeJsonrpc.vscodeJsonrpcNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedMapMod {
  
  @JSImport("vscode-jsonrpc/lib/linkedMap", "LinkedMap")
  @js.native
  class LinkedMap[K, V] () extends StObject {
    
    var _head: js.Any = js.native
    
    var _map: js.Any = js.native
    
    var _size: js.Any = js.native
    
    var _tail: js.Any = js.native
    
    var addItemFirst: js.Any = js.native
    
    var addItemLast: js.Any = js.native
    
    def clear(): Unit = js.native
    
    def delete(key: K): Boolean = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def forEachReverse(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit]): Unit = js.native
    def forEachReverse(
      callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ LinkedMap[K, V], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def keys(): js.Array[K] = js.native
    
    var removeItem: js.Any = js.native
    
    def set(key: K, value: V): Unit = js.native
    def set(key: K, value: V, touch: Touch): Unit = js.native
    
    def shift(): js.UndefOr[V] = js.native
    
    def size: Double = js.native
    
    var touch: js.Any = js.native
    
    def values(): js.Array[V] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcNumbers.`0`
    - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcNumbers.`1`
    - typingsSlinky.vscodeJsonrpc.vscodeJsonrpcNumbers.`2`
  */
  trait Touch extends StObject
  object Touch {
    
    @JSImport("vscode-jsonrpc/lib/linkedMap", "Touch.First")
    @js.native
    val First: `1` = js.native
    
    @JSImport("vscode-jsonrpc/lib/linkedMap", "Touch.Last")
    @js.native
    val Last: `2` = js.native
    
    @JSImport("vscode-jsonrpc/lib/linkedMap", "Touch.None")
    @js.native
    val None: `0` = js.native
  }
}
