package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.public
  - typings.std.stdStrings.`private`
  - typings.std.stdStrings.secret
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsSlinky.std.stdStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsSlinky.std.stdStrings.public = this.cast("public")
  @scala.inline
  def secret: typingsSlinky.std.stdStrings.secret = this.cast("secret")
}

