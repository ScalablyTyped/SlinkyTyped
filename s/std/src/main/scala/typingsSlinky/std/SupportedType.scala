package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.applicationSlashxhtmlPlussignxml
  - typingsSlinky.std.stdStrings.applicationSlashxml
  - typingsSlinky.std.stdStrings.imageSlashsvgPlussignxml
  - typingsSlinky.std.stdStrings.textSlashhtml
  - typingsSlinky.std.stdStrings.textSlashxml
*/
trait SupportedType extends js.Object

object SupportedType {
  @scala.inline
  def applicationSlashxhtmlPlussignxml: typingsSlinky.std.stdStrings.applicationSlashxhtmlPlussignxml = this.cast("application/xhtml+xml")
  @scala.inline
  def applicationSlashxml: typingsSlinky.std.stdStrings.applicationSlashxml = this.cast("application/xml")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imageSlashsvgPlussignxml: typingsSlinky.std.stdStrings.imageSlashsvgPlussignxml = this.cast("image/svg+xml")
  @scala.inline
  def textSlashhtml: typingsSlinky.std.stdStrings.textSlashhtml = this.cast("text/html")
  @scala.inline
  def textSlashxml: typingsSlinky.std.stdStrings.textSlashxml = this.cast("text/xml")
}

