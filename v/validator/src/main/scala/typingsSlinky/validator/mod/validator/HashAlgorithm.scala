package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.validator.validatorStrings.md4
  - typingsSlinky.validator.validatorStrings.md5
  - typingsSlinky.validator.validatorStrings.sha1
  - typingsSlinky.validator.validatorStrings.sha256
  - typingsSlinky.validator.validatorStrings.sha384
  - typingsSlinky.validator.validatorStrings.sha512
  - typingsSlinky.validator.validatorStrings.ripemd128
  - typingsSlinky.validator.validatorStrings.ripemd160
  - typingsSlinky.validator.validatorStrings.tiger128
  - typingsSlinky.validator.validatorStrings.tiger160
  - typingsSlinky.validator.validatorStrings.tiger192
  - typingsSlinky.validator.validatorStrings.crc32
  - typingsSlinky.validator.validatorStrings.crc32b
*/
trait HashAlgorithm extends js.Object

object HashAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crc32: typingsSlinky.validator.validatorStrings.crc32 = this.cast("crc32")
  @scala.inline
  def crc32b: typingsSlinky.validator.validatorStrings.crc32b = this.cast("crc32b")
  @scala.inline
  def md4: typingsSlinky.validator.validatorStrings.md4 = this.cast("md4")
  @scala.inline
  def md5: typingsSlinky.validator.validatorStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd128: typingsSlinky.validator.validatorStrings.ripemd128 = this.cast("ripemd128")
  @scala.inline
  def ripemd160: typingsSlinky.validator.validatorStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def sha1: typingsSlinky.validator.validatorStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsSlinky.validator.validatorStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsSlinky.validator.validatorStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsSlinky.validator.validatorStrings.sha512 = this.cast("sha512")
  @scala.inline
  def tiger128: typingsSlinky.validator.validatorStrings.tiger128 = this.cast("tiger128")
  @scala.inline
  def tiger160: typingsSlinky.validator.validatorStrings.tiger160 = this.cast("tiger160")
  @scala.inline
  def tiger192: typingsSlinky.validator.validatorStrings.tiger192 = this.cast("tiger192")
}

