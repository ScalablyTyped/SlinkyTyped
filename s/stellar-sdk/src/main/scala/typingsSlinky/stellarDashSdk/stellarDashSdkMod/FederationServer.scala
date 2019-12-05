package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import typingsSlinky.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer.Options
import typingsSlinky.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "FederationServer")
@js.native
class FederationServer protected ()
  extends typingsSlinky.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer {
  def this(serverURL: String, domain: String) = this()
  def this(serverURL: String, domain: String, opts: Options) = this()
}

/* static members */
@JSImport("stellar-sdk", "FederationServer")
@js.native
object FederationServer extends js.Object {
  def createForDomain(domain: String): js.Promise[typingsSlinky.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer] = js.native
  def createForDomain(domain: String, opts: Options): js.Promise[typingsSlinky.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer] = js.native
  def resolve(value: String): js.Promise[Record] = js.native
  def resolve(value: String, opts: Options): js.Promise[Record] = js.native
}

