package typingsSlinky.sentryTypes

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types/dist/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  type Context = Record[String, js.Any]
  
  type Contexts = Record[String, Context]
}
