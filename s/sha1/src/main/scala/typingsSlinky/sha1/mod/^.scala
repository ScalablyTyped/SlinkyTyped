package typingsSlinky.sha1.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * js function for hashing messages with SHA1
    *
    * @param message - a string or buffer to hash
    * @param options - an options object
    * @returns the resultant SHA1 hash of the given message
    */
  def apply(message: String): String = js.native
  def apply(message: String, options: Sha1AsBytesOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: String, options: Sha1AsStringOptions): String = js.native
  def apply(message: String, options: Sha1Options): String | scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Buffer): String = js.native
  def apply(message: Buffer, options: Sha1AsBytesOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Buffer, options: Sha1AsStringOptions): String = js.native
  def apply(message: Buffer, options: Sha1Options): String | scala.scalajs.js.typedarray.Uint8Array = js.native
}

