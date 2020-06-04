package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information required to correctly render a scene for a given eye, including field of view information. */
trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView
  val offset: js.typedarray.Float32Array
  val renderHeight: Double
  val renderWidth: Double
}

object VREyeParameters {
  @scala.inline
  def apply(
    fieldOfView: VRFieldOfView,
    offset: js.typedarray.Float32Array,
    renderHeight: Double,
    renderWidth: Double
  ): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VREyeParameters]
  }
  @scala.inline
  implicit class VREyeParametersOps[Self <: VREyeParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldOfView(value: VRFieldOfView): Self = this.set("fieldOfView", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: js.typedarray.Float32Array): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderHeight(value: Double): Self = this.set("renderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderWidth(value: Double): Self = this.set("renderWidth", value.asInstanceOf[js.Any])
  }
  
}

