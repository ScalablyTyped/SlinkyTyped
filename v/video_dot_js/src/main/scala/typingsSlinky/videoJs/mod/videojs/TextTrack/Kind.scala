package typingsSlinky.videoJs.mod.videojs.TextTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.videoJs.videoJsStrings.subtitles
  - typingsSlinky.videoJs.videoJsStrings.captions
  - typingsSlinky.videoJs.videoJsStrings.descriptions
  - typingsSlinky.videoJs.videoJsStrings.chapters
  - typingsSlinky.videoJs.videoJsStrings.metadata
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def captions: typingsSlinky.videoJs.videoJsStrings.captions = this.cast("captions")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chapters: typingsSlinky.videoJs.videoJsStrings.chapters = this.cast("chapters")
  @scala.inline
  def descriptions: typingsSlinky.videoJs.videoJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def metadata: typingsSlinky.videoJs.videoJsStrings.metadata = this.cast("metadata")
  @scala.inline
  def subtitles: typingsSlinky.videoJs.videoJsStrings.subtitles = this.cast("subtitles")
}

