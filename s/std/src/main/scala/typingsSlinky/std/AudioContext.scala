package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An audio-processing graph built from audio modules linked together, each represented by an AudioNode. */
@js.native
trait AudioContext extends BaseAudioContext {
  
  val baseLatency: Double = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def createMediaElementSource(mediaElement: org.scalajs.dom.raw.HTMLMediaElement): org.scalajs.dom.raw.MediaElementAudioSourceNode = js.native
  
  def createMediaStreamDestination(): org.scalajs.dom.raw.MediaStreamAudioDestinationNode = js.native
  
  def createMediaStreamSource(mediaStream: org.scalajs.dom.experimental.mediastream.MediaStream): org.scalajs.dom.raw.MediaStreamAudioSourceNode = js.native
  
  def createMediaStreamTrackSource(mediaStreamTrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): org.scalajs.dom.raw.AudioNode = js.native
  
  def getOutputTimestamp(): AudioTimestamp = js.native
  
  val outputLatency: Double = js.native
  
  def resume(): js.Promise[Unit] = js.native
  
  def suspend(): js.Promise[Unit] = js.native
}
