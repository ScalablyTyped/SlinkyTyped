package typingsSlinky.zipkin.mod

import typingsSlinky.zipkin.anon.Debug
import typingsSlinky.zipkin.mod.option.IOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "TraceId")
@js.native
class TraceId () extends StObject {
  def this(args: Debug) = this()
  
  def isDebug(): Boolean = js.native
  
  def isShared(): Boolean = js.native
  
  val parentSpanId: IOption[String] = js.native
  
  val sampled: IOption[Boolean] = js.native
  
  val spanId: String = js.native
  
  val traceId: String = js.native
}
