package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An audio-processing graph built from audio modules linked together, each represented by an AudioNode. */
@js.native
trait AudioContext extends BaseAudioContext {
  val baseLatency: Double = js.native
  val outputLatency: Double = js.native
  def close(): js.Promise[Unit] = js.native
  def createMediaElementSource(mediaElement: org.scalajs.dom.raw.HTMLMediaElement): org.scalajs.dom.raw.MediaElementAudioSourceNode = js.native
  def createMediaStreamDestination(): org.scalajs.dom.raw.MediaStreamAudioDestinationNode = js.native
  def createMediaStreamSource(mediaStream: org.scalajs.dom.experimental.mediastream.MediaStream): org.scalajs.dom.raw.MediaStreamAudioSourceNode = js.native
  def createMediaStreamTrackSource(mediaStreamTrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): org.scalajs.dom.raw.AudioNode = js.native
  def getOutputTimestamp(): AudioTimestamp = js.native
  def resume(): js.Promise[Unit] = js.native
  def suspend(): js.Promise[Unit] = js.native
}

@JSGlobal("AudioContext")
@js.native
object AudioContext
  extends Instantiable0[org.scalajs.dom.raw.AudioContext]
     with Instantiable1[/* contextOptions */ AudioContextOptions, org.scalajs.dom.raw.AudioContext]

