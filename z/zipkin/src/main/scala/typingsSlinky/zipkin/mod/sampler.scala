package typingsSlinky.zipkin.mod

import typingsSlinky.zipkin.mod.option.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "sampler")
@js.native
object sampler extends js.Object {
  
  def alwaysSample(traceId: TraceId): Boolean = js.native
  
  def neverSample(traceId: TraceId): Boolean = js.native
  
  @js.native
  class CountingSampler () extends Sampler {
    def this(sampleRate: Double) = this()
  }
  
  @js.native
  class Sampler protected () extends js.Object {
    def this(evaluator: js.Function1[/* traceId */ TraceId, Boolean]) = this()
    
    def shouldSample(traceId: TraceId): IOption[Boolean] = js.native
  }
}
