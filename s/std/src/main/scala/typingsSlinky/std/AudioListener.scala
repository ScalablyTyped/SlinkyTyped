package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
@js.native
trait AudioListener extends js.Object {
  val forwardX: org.scalajs.dom.raw.AudioParam = js.native
  val forwardY: org.scalajs.dom.raw.AudioParam = js.native
  val forwardZ: org.scalajs.dom.raw.AudioParam = js.native
  val positionX: org.scalajs.dom.raw.AudioParam = js.native
  val positionY: org.scalajs.dom.raw.AudioParam = js.native
  val positionZ: org.scalajs.dom.raw.AudioParam = js.native
  val upX: org.scalajs.dom.raw.AudioParam = js.native
  val upY: org.scalajs.dom.raw.AudioParam = js.native
  val upZ: org.scalajs.dom.raw.AudioParam = js.native
  /** @deprecated */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit = js.native
  /** @deprecated */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
}

@JSGlobal("AudioListener")
@js.native
object AudioListener
  extends Instantiable0[org.scalajs.dom.raw.AudioListener]

