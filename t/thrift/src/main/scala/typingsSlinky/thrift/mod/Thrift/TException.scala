package typingsSlinky.thrift.mod.Thrift

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Thrift.TException")
@js.native
class TException protected () extends Error {
  def this(message: String) = this()
  def getMessage(): String = js.native
}

