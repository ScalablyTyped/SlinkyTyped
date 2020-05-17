package typingsSlinky.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection within an audio graph. */
@js.native
trait AudioGraphConnection extends js.Object {
  /** Gets the destination node for the connection. */
  var destination: IAudioNode = js.native
  /** Gets the gain associated with the audio graph connection. */
  var gain: Double = js.native
}

object AudioGraphConnection {
  @scala.inline
  def apply(destination: IAudioNode, gain: Double): AudioGraphConnection = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphConnection]
  }
  @scala.inline
  implicit class AudioGraphConnectionOps[Self <: AudioGraphConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: IAudioNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

