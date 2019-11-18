package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamAudioSourceOptions extends js.Object {
  var mediaStream: org.scalajs.dom.experimental.mediastream.MediaStream
}

object MediaStreamAudioSourceOptions {
  @scala.inline
  def apply(mediaStream: org.scalajs.dom.experimental.mediastream.MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStream = mediaStream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
}

