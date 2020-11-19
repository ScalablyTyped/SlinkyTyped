package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon extends poly {
  
  def marker(position: String): Marker = js.native
  def marker(position: String, marker: Marker): Marker = js.native
  def marker(
    position: String,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    block: js.Function1[/* marker */ Marker, Unit]
  ): Marker = js.native
  def marker(position: String, width: js.UndefOr[scala.Nothing], height: Double): Marker = js.native
  def marker(
    position: String,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    block: js.Function1[/* marker */ Marker, Unit]
  ): Marker = js.native
  def marker(position: String, width: Double): Marker = js.native
  def marker(
    position: String,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    block: js.Function1[/* marker */ Marker, Unit]
  ): Marker = js.native
  def marker(position: String, width: Double, height: Double): Marker = js.native
  def marker(position: String, width: Double, height: Double, block: js.Function1[/* marker */ Marker, Unit]): Marker = js.native
}
