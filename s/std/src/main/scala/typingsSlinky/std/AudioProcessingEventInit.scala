package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioProcessingEventInit extends EventInit {
  var inputBuffer: org.scalajs.dom.raw.AudioBuffer
  var outputBuffer: org.scalajs.dom.raw.AudioBuffer
  var playbackTime: Double
}

object AudioProcessingEventInit {
  @scala.inline
  def apply(
    inputBuffer: org.scalajs.dom.raw.AudioBuffer,
    outputBuffer: org.scalajs.dom.raw.AudioBuffer,
    playbackTime: Double,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): AudioProcessingEventInit = {
    val __obj = js.Dynamic.literal(inputBuffer = inputBuffer.asInstanceOf[js.Any], outputBuffer = outputBuffer.asInstanceOf[js.Any], playbackTime = playbackTime.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioProcessingEventInit]
  }
}

