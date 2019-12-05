package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.MarkJSON
import typingsSlinky.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Key extends js.Object {
  def apply(key: String, offset: Double, length: Double, mark: String): Editor = js.native
  def apply(key: String, offset: Double, length: Double, mark: Mark): Editor = js.native
  def apply(key: String, offset: Double, length: Double, mark: MarkJSON): Editor = js.native
  def apply(key: String, offset: Double, length: Double, mark: MarkProperties): Editor = js.native
}

