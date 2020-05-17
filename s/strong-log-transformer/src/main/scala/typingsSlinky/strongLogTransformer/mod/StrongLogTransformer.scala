package typingsSlinky.strongLogTransformer.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.strongLogTransformer.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrongLogTransformer extends js.Object {
  var DEFAULTS: Options = js.native
  def apply(): ReadWriteStream = js.native
  def apply(options: PartialOptions): ReadWriteStream = js.native
  def cli(args: js.Array[String]): Unit = js.native
}

