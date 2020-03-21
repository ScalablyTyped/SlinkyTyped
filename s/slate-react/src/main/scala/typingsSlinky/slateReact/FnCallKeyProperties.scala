package typingsSlinky.slateReact

import typingsSlinky.slate.mod.BlockProperties
import typingsSlinky.slate.mod.Controller
import typingsSlinky.slate.mod.InlineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallKeyProperties extends js.Object {
  def apply(key: String, properties: String): Controller = js.native
  def apply(key: String, properties: BlockProperties): Controller = js.native
  def apply(key: String, properties: InlineProperties): Controller = js.native
}

