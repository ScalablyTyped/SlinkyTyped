package typingsSlinky.std

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

object AudioListener {
  @scala.inline
  def apply(
    forwardX: org.scalajs.dom.raw.AudioParam,
    forwardY: org.scalajs.dom.raw.AudioParam,
    forwardZ: org.scalajs.dom.raw.AudioParam,
    positionX: org.scalajs.dom.raw.AudioParam,
    positionY: org.scalajs.dom.raw.AudioParam,
    positionZ: org.scalajs.dom.raw.AudioParam,
    setOrientation: (Double, Double, Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double, Double) => Unit,
    upX: org.scalajs.dom.raw.AudioParam,
    upY: org.scalajs.dom.raw.AudioParam,
    upZ: org.scalajs.dom.raw.AudioParam
  ): AudioListener = {
    val __obj = js.Dynamic.literal(forwardX = forwardX.asInstanceOf[js.Any], forwardY = forwardY.asInstanceOf[js.Any], forwardZ = forwardZ.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], positionZ = positionZ.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction6(setOrientation), setPosition = js.Any.fromFunction3(setPosition), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListener]
  }
}

