package typingsSlinky.xRayCrawler

import typingsSlinky.httpContext.mod.Context
import typingsSlinky.httpContext.mod.Request
import typingsSlinky.httpContext.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("x-ray-crawler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Instance = js.native
  def apply(driver: Driver): Instance = js.native
  
  @js.native
  trait Instance extends js.Object {
    
    def apply(url: String, callback: Callback[Context]): Unit = js.native
    
    def concurrency(): Double = js.native
    def concurrency(n: Double): this.type = js.native
    
    def delay(): RandomDelay = js.native
    def delay(from: String): this.type = js.native
    def delay(from: String, to: String): this.type = js.native
    def delay(from: String, to: Double): this.type = js.native
    def delay(from: Double): this.type = js.native
    def delay(from: Double, to: String): this.type = js.native
    def delay(from: Double, to: Double): this.type = js.native
    
    def driver(): Driver = js.native
    def driver(driver: Driver): this.type = js.native
    
    def limit(): Double = js.native
    def limit(n: Double): this.type = js.native
    
    def request(): RequestHook = js.native
    def request(fn: RequestHook): this.type = js.native
    
    def response(): ResponseHook = js.native
    def response(fn: ResponseHook): this.type = js.native
    
    def throttle(): Double = js.native
    def throttle(requests: String, rate: String): this.type = js.native
    def throttle(requests: String, rate: Double): this.type = js.native
    def throttle(requests: Double, rate: String): this.type = js.native
    def throttle(requests: Double, rate: Double): this.type = js.native
    
    def timeout(): Double = js.native
    def timeout(n: String): this.type = js.native
    def timeout(n: Double): this.type = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ js.Error, /* obj */ T, Unit]
  
  type Driver = js.Function2[/* context */ Context, /* callback */ Callback[Context], Unit]
  
  type RandomDelay = js.Function0[Double]
  
  type RequestHook = js.Function1[/* request */ Request, Unit]
  
  type ResponseHook = js.Function1[/* response */ Response, Unit]
}
