package typingsSlinky.smartystreetsJavascriptSdk.mod.core

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "core.SharedCredentials")
@js.native
class SharedCredentials protected () extends js.Object {
  def this(authId: String) = this()
  def this(authId: String, hostName: String) = this()
  
  def sign(request: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
}
