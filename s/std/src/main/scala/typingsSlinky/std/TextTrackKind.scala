package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.captions
  - typingsSlinky.std.stdStrings.chapters
  - typingsSlinky.std.stdStrings.descriptions
  - typingsSlinky.std.stdStrings.metadata
  - typingsSlinky.std.stdStrings.subtitles
*/
trait TextTrackKind extends js.Object

object TextTrackKind {
  @scala.inline
  def captions: typingsSlinky.std.stdStrings.captions = this.cast("captions")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chapters: typingsSlinky.std.stdStrings.chapters = this.cast("chapters")
  @scala.inline
  def descriptions: typingsSlinky.std.stdStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def metadata: typingsSlinky.std.stdStrings.metadata = this.cast("metadata")
  @scala.inline
  def subtitles: typingsSlinky.std.stdStrings.subtitles = this.cast("subtitles")
}

