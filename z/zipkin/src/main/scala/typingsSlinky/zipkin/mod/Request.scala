package typingsSlinky.zipkin.mod

import typingsSlinky.zipkin.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "Request")
@js.native
object Request extends js.Object {
  
  def addZipkinHeaders[T, H](req: T with `0`, traceId: TraceId): RequestZipkinHeaders[T, H] = js.native
}
