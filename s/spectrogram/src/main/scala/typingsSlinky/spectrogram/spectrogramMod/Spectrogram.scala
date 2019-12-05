package typingsSlinky.spectrogram.spectrogramMod

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.std.AnalyserNode
import typingsSlinky.std.AudioBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spectrogram extends js.Object {
  def clear(canvasContext: CanvasRenderingContext2D): Unit = js.native
  def connectSource(analyserNode: AnalyserNode, audioContext: AudioContext): Unit = js.native
  def connectSource(audioBuffer: AudioBuffer): Unit = js.native
  def connectSource(audioBuffer: AudioBuffer, audioContext: AudioContext): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def start(): Unit = js.native
  def start(offset: Double): Unit = js.native
  def stop(): Unit = js.native
}

