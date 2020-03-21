package typingsSlinky.shaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.shaJs.shaJsStrings.sha
  - typingsSlinky.shaJs.shaJsStrings.sha1
  - typingsSlinky.shaJs.shaJsStrings.sha224
  - typingsSlinky.shaJs.shaJsStrings.sha256
  - typingsSlinky.shaJs.shaJsStrings.sha384
  - typingsSlinky.shaJs.shaJsStrings.sha512
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha: typingsSlinky.shaJs.shaJsStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typingsSlinky.shaJs.shaJsStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typingsSlinky.shaJs.shaJsStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typingsSlinky.shaJs.shaJsStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsSlinky.shaJs.shaJsStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsSlinky.shaJs.shaJsStrings.sha512 = this.cast("sha512")
}

