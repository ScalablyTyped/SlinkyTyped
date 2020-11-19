package typingsSlinky.staleLruCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OptionsCallback[K, V] = js.Function3[
    /* error */ js.Any, 
    /* value */ js.UndefOr[V], 
    /* options */ js.UndefOr[java.lang.String | (typingsSlinky.staleLruCache.mod.SetOptions[K, V])], 
    scala.Unit
  ]
  
  type RevalidationCallback[K, V] = js.Function2[
    /* key */ K, 
    /* callback */ typingsSlinky.staleLruCache.mod.OptionsCallback[K, V], 
    scala.Unit
  ]
}
