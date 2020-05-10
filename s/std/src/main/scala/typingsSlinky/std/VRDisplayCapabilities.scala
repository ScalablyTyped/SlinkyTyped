package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface describes the capabilities of a VRDisplay — its features can be used to perform VR device capability tests, for example can it return position information. */
@js.native
trait VRDisplayCapabilities extends js.Object {
  val canPresent: scala.Boolean = js.native
  val hasExternalDisplay: scala.Boolean = js.native
  val hasOrientation: scala.Boolean = js.native
  val hasPosition: scala.Boolean = js.native
  val maxLayers: Double = js.native
}

@JSGlobal("VRDisplayCapabilities")
@js.native
object VRDisplayCapabilities extends Instantiable0[VRDisplayCapabilities]

