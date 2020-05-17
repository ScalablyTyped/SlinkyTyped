package typingsSlinky.umbraco.anon

import typingsSlinky.angular.mod.IHttpHeadersGetter
import typingsSlinky.angular.mod.IHttpPromiseCallback
import typingsSlinky.angular.mod.IRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMsg[T] extends js.Object {
  var errorMsg: String = js.native
  @JSName("success")
  var success_Original: IHttpPromiseCallback[T] = js.native
  def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
}

