package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
trait AudioListener extends js.Object {
  val forwardX: org.scalajs.dom.raw.AudioParam
  val forwardY: org.scalajs.dom.raw.AudioParam
  val forwardZ: org.scalajs.dom.raw.AudioParam
  val positionX: org.scalajs.dom.raw.AudioParam
  val positionY: org.scalajs.dom.raw.AudioParam
  val positionZ: org.scalajs.dom.raw.AudioParam
  val upX: org.scalajs.dom.raw.AudioParam
  val upY: org.scalajs.dom.raw.AudioParam
  val upZ: org.scalajs.dom.raw.AudioParam
  /** @deprecated */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit
  /** @deprecated */
  def setPosition(x: Double, y: Double, z: Double): Unit
}

@JSGlobal("AudioListener")
@js.native
object AudioListener extends Instantiable0[AudioListener]

