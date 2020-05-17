package typingsSlinky.std

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
  @scala.inline
  implicit class AudioListenerOps[Self <: org.scalajs.dom.raw.AudioListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardX(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardY(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardZ(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionX(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionY(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionZ(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetOrientation(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrientation")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpX(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpY(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpZ(value: org.scalajs.dom.raw.AudioParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upZ")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

