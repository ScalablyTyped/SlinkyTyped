package typingsSlinky.videoJs.mod.videojs.AudioTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All possible `AudioTrackKind`s
  *
  * @see https://html.spec.whatwg.org/multipage/embedded-content.html#dom-audiotrack-kind
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.videoJs.videoJsStrings.alternative
  - typingsSlinky.videoJs.videoJsStrings.descriptions
  - typingsSlinky.videoJs.videoJsStrings.main
  - typingsSlinky.videoJs.videoJsStrings.`main-desc`
  - typingsSlinky.videoJs.videoJsStrings.translation
  - typingsSlinky.videoJs.videoJsStrings.commentary
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def alternative: typingsSlinky.videoJs.videoJsStrings.alternative = this.cast("alternative")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def commentary: typingsSlinky.videoJs.videoJsStrings.commentary = this.cast("commentary")
  @scala.inline
  def descriptions: typingsSlinky.videoJs.videoJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def main: typingsSlinky.videoJs.videoJsStrings.main = this.cast("main")
  @scala.inline
  def `main-desc`: typingsSlinky.videoJs.videoJsStrings.`main-desc` = this.cast("main-desc")
  @scala.inline
  def translation: typingsSlinky.videoJs.videoJsStrings.translation = this.cast("translation")
}

