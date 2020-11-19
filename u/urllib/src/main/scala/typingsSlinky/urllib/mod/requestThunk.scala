package typingsSlinky.urllib.mod

import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urllib", "requestThunk")
@js.native
object requestThunk extends js.Object {
  
  def apply[T](url: String): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def apply[T](url: String, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def apply[T](url: URL_): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def apply[T](url: URL_, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
}
