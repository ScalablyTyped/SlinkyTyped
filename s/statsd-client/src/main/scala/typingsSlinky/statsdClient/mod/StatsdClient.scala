package typingsSlinky.statsdClient.mod

import typingsSlinky.statsdClient.anon.GetExpressMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsdClient extends js.Object {
  
  def close(): this.type = js.native
  
  def counter(metric: String, delta: Double): this.type = js.native
  def counter(metric: String, delta: Double, tags: Tags): this.type = js.native
  
  def decrement(metric: String): this.type = js.native
  def decrement(metric: String, delta: js.UndefOr[scala.Nothing], tags: Tags): this.type = js.native
  def decrement(metric: String, delta: Double): this.type = js.native
  def decrement(metric: String, delta: Double, tags: Tags): this.type = js.native
  
  def formatTags(): String = js.native
  def formatTags(tags: Tags): String = js.native
  
  def gauge(name: String, value: Double): this.type = js.native
  def gauge(name: String, value: Double, tags: Tags): this.type = js.native
  
  def gaugeDelta(name: String, delta: Double): this.type = js.native
  def gaugeDelta(name: String, delta: Double, tags: Tags): this.type = js.native
  
  def getChildClient(name: String): StatsdClient = js.native
  
  var helpers: GetExpressMiddleware = js.native
  
  def histogram(name: String, value: Double): this.type = js.native
  def histogram(name: String, value: Double, tags: Tags): this.type = js.native
  
  def increment(metric: String): this.type = js.native
  def increment(metric: String, delta: js.UndefOr[scala.Nothing], tags: Tags): this.type = js.native
  def increment(metric: String, delta: Double): this.type = js.native
  def increment(metric: String, delta: Double, tags: Tags): this.type = js.native
  
  def raw(rawData: String): this.type = js.native
  
  def set(name: String, value: Double): this.type = js.native
  def set(name: String, value: Double, tags: Tags): this.type = js.native
  
  def timing(name: String, startOrDuration: Double): this.type = js.native
  def timing(name: String, startOrDuration: Double, tags: Tags): this.type = js.native
  def timing(name: String, startOrDuration: js.Date): this.type = js.native
  def timing(name: String, startOrDuration: js.Date, tags: Tags): this.type = js.native
}
