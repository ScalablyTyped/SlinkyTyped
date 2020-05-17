package typingsSlinky.three.webGLRenderStatesMod

import typingsSlinky.three.anon.Lights
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.lightMod.Light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRenderState extends js.Object {
  var state: Lights = js.native
  def init(): Unit = js.native
  def pushLight(light: Light): Unit = js.native
  def pushShadow(shadowLight: Light): Unit = js.native
  def setupLights(camera: Camera): Unit = js.native
}

object WebGLRenderState {
  @scala.inline
  def apply(
    init: () => Unit,
    pushLight: Light => Unit,
    pushShadow: Light => Unit,
    setupLights: Camera => Unit,
    state: Lights
  ): WebGLRenderState = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), pushLight = js.Any.fromFunction1(pushLight), pushShadow = js.Any.fromFunction1(pushShadow), setupLights = js.Any.fromFunction1(setupLights), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderState]
  }
  @scala.inline
  implicit class WebGLRenderStateOps[Self <: WebGLRenderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPushLight(value: Light => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushLight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPushShadow(value: Light => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushShadow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetupLights(value: Camera => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupLights")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: Lights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

