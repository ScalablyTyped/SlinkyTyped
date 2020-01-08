package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.textSlashhtml
  - typings.std.stdStrings.textSlashxml
  - typings.std.stdStrings.applicationSlashxml
  - typings.std.stdStrings.applicationSlashxhtmlPlussignxml
  - typings.std.stdStrings.imageSlashsvgPlussignxml
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

