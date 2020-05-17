package typingsSlinky.ssri.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.TypedArray
import typingsSlinky.ssri.anon.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromData")
@js.native
object fromData extends js.Object {
  def apply(data: String): IntegrityMap = js.native
  def apply(data: String, opts: Algorithms): IntegrityMap = js.native
  def apply(data: Buffer): IntegrityMap = js.native
  def apply(data: Buffer, opts: Algorithms): IntegrityMap = js.native
  def apply(data: TypedArray): IntegrityMap = js.native
  def apply(data: TypedArray, opts: Algorithms): IntegrityMap = js.native
  def apply(data: js.typedarray.DataView): IntegrityMap = js.native
  def apply(data: js.typedarray.DataView, opts: Algorithms): IntegrityMap = js.native
}

