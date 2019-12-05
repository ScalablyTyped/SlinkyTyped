package typingsSlinky.sha1.sha1Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(message: String): String | scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: String, options: Sha1AsBytesOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: String, options: Sha1AsStringOptions): String = js.native
  def apply(message: String, options: Sha1Options): String | scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Buffer): String | scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Buffer, options: Sha1AsBytesOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Buffer, options: Sha1AsStringOptions): String = js.native
  def apply(message: Buffer, options: Sha1Options): String | scala.scalajs.js.typedarray.Uint8Array = js.native
}

