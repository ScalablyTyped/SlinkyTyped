package typingsSlinky.sentryCore

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.sentryTypes.clientMod.Client
import typingsSlinky.sentryTypes.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core/dist/sdk", JSImport.Namespace)
@js.native
object sdkMod extends js.Object {
  
  def initAndBind[F /* <: Client[Options] */, O /* <: Options */](clientClass: ClientClass[F, O], options: O): Unit = js.native
  
  type ClientClass[F /* <: Client[Options] */, O /* <: Options */] = Instantiable1[/* options */ O, F]
}
