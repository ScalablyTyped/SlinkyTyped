package typingsSlinky.smartystreetsJavascriptSdk.mod.core

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "core.StaticCredentials")
@js.native
class StaticCredentials protected () extends js.Object {
  def this(authId: String, authToken: String) = this()
  
  def sign(request: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
}
