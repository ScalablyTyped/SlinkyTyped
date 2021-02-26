package typingsSlinky.store

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeEngineMod extends Shortcut {
  
  @JSImport("store/src/store-engine", JSImport.Namespace)
  @js.native
  val ^ : StoreJsEngine = js.native
  
  type _To = StoreJsEngine
  
  /* This means you don't have to write `^`, but can instead just say `storeEngineMod.foo` */
  override def _to: StoreJsEngine = ^
}
