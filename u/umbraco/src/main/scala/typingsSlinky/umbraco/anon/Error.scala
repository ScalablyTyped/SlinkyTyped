package typingsSlinky.umbraco.anon

import typingsSlinky.angular.mod.IHttpHeadersGetter
import typingsSlinky.angular.mod.IHttpPromiseCallback
import typingsSlinky.angular.mod.IRequestConfig
import typingsSlinky.umbraco.mod.resources.IResourcePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error[T] extends js.Object {
  @JSName("error")
  var error_Original: IHttpPromiseCallback[IResourcePromise] = js.native
  @JSName("success")
  var success_Original: IHttpPromiseCallback[T] = js.native
  def error(data: IResourcePromise, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
  def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
}

