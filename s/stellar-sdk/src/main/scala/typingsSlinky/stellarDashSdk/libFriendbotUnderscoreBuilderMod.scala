package typingsSlinky.stellarDashSdk

import typingsSlinky.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typingsSlinky.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/friendbot_builder", JSImport.Namespace)
@js.native
object libFriendbotUnderscoreBuilderMod extends js.Object {
  @js.native
  class FriendbotBuilder protected ()
    extends CallBuilder[js.Any] {
    def this(serverUrl: URI, address: String) = this()
  }
  
}

