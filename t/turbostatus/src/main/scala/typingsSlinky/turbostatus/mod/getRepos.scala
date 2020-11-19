package typingsSlinky.turbostatus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("turbostatus", "getRepos")
@js.native
object getRepos extends js.Object {
  
  def apply(folder: String): js.Promise[js.Array[Repository]] = js.native
  def apply(folder: String, wildcard: String): js.Promise[js.Array[Repository]] = js.native
}
