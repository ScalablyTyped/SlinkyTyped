package typingsSlinky.xRay.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInvocation extends ScalarSelector {
  def apply(callback: Callback): Unit = js.native
  def apply(source: String, callback: Callback): Unit = js.native
  def abort(arg: AbortHandler): this.type = js.native
  def limit(n: Double): this.type = js.native
  def paginate(selector: Selector): this.type = js.native
  def stream(): ReadStream = js.native
  def `then`[U](): typingsSlinky.bluebird.mod.^[U] = js.native
  def `then`[U](fn: js.Function1[/* value */ js.Any, U | js.Thenable[U]]): typingsSlinky.bluebird.mod.^[U] = js.native
  def write(): js.Function1[/* err */ ErrnoException, Unit] = js.native
  def write(path: String): js.Function1[/* err */ ErrnoException, Unit] = js.native
}

