package typingsSlinky.tabris

import typingsSlinky.tabris.tabrisStrings.basic
import typingsSlinky.tabris.tabrisStrings.cors
import typingsSlinky.tabris.tabrisStrings.default
import typingsSlinky.tabris.tabrisStrings.error
import typingsSlinky.tabris.tabrisStrings.opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
@js.native
trait Response extends js.Object {
  val bodyUsed: Boolean = js.native
  val headers: Headers = js.native
  val ok: Boolean = js.native
  val status: Double = js.native
  val statusText: String = js.native
  val `type`: basic | cors | default | error | opaque = js.native
  val url: String = js.native
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def json(): js.Promise[_] = js.native
  @JSName("json")
  def json_T[T](): js.Promise[T] = js.native
  def text(): js.Promise[String] = js.native
}

