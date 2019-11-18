package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.default
  - typings.std.stdStrings.`no-store`
  - typings.std.stdStrings.reload
  - typings.std.stdStrings.`no-cache`
  - typings.std.stdStrings.`force-cache`
  - typings.std.stdStrings.`only-if-cached`
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.std.stdStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typingsSlinky.std.stdStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typingsSlinky.std.stdStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typingsSlinky.std.stdStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typingsSlinky.std.stdStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typingsSlinky.std.stdStrings.reload = this.cast("reload")
}

