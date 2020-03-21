package typingsSlinky.slateReact

import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.Operation
import typingsSlinky.slate.mod.OperationJSON
import typingsSlinky.slate.mod.OperationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOperation extends js.Object {
  def apply(operation: Operation): Controller = js.native
  def apply(operation: OperationJSON): Controller = js.native
  def apply(operation: OperationProperties): Controller = js.native
}

