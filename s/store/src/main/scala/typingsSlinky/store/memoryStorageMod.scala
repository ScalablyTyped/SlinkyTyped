package typingsSlinky.store

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryStorageMod extends Shortcut {
  
  @JSImport("store/storages/memoryStorage", JSImport.Namespace)
  @js.native
  val ^ : StoreJsStorage = js.native
  
  type _To = StoreJsStorage
  
  /* This means you don't have to write `^`, but can instead just say `memoryStorageMod.foo` */
  override def _to: StoreJsStorage = ^
}
