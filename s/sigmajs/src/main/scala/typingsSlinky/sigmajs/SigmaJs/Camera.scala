package typingsSlinky.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sigmajs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Camera extends js.Object {
  var angle: Double = js.native
  var ratio: Double = js.native
  var readPrefix: String = js.native
  var x: Double = js.native
  var y: Double = js.native
  def cameraPosition(x: Double, y: Double): X = js.native
  def goTo(settings: StringDictionary[js.Any]): Unit = js.native
  def graphPosition(x: Double, y: Double): X = js.native
  def settings(setting: String): js.Any = js.native
}

object Camera {
  @scala.inline
  def apply(
    angle: Double,
    cameraPosition: (Double, Double) => X,
    goTo: StringDictionary[js.Any] => Unit,
    graphPosition: (Double, Double) => X,
    ratio: Double,
    readPrefix: String,
    settings: String => js.Any,
    x: Double,
    y: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], cameraPosition = js.Any.fromFunction2(cameraPosition), goTo = js.Any.fromFunction1(goTo), graphPosition = js.Any.fromFunction2(graphPosition), ratio = ratio.asInstanceOf[js.Any], readPrefix = readPrefix.asInstanceOf[js.Any], settings = js.Any.fromFunction1(settings), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  @scala.inline
  implicit class CameraOps[Self <: Camera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameraPosition(value: (Double, Double) => X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGoTo(value: StringDictionary[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGraphPosition(value: (Double, Double) => X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

