package typingsSlinky.teenyRequest.mod

import typingsSlinky.node.httpsMod.Agent
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.teenyRequest.teenyRequestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends Transform {
  
  var agent: Agent | `false` = js.native
  
  var headers: Headers = js.native
  
  var href: js.UndefOr[String] = js.native
}
