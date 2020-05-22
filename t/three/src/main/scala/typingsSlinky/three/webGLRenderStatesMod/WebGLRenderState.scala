package typingsSlinky.three.webGLRenderStatesMod

import typingsSlinky.three.anon.Lights
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.lightMod.Light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderState extends js.Object {
  var state: Lights
  def init(): Unit
  def pushLight(light: Light): Unit
  def pushShadow(shadowLight: Light): Unit
  def setupLights(camera: Camera): Unit
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
}

