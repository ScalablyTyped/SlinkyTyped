package typingsSlinky.wordpressData.anon

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.wordpressData.mod.Store
import typingsSlinky.wordpressData.mod.StoreConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = js.native
}
