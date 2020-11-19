package typingsSlinky.svgJs.mod

import typingsSlinky.svgJs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends Shape {
  
  def array(): PathArray = js.native
  
  def length(): Double = js.native
  
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
  
  var morphArray: PathArray = js.native
  
  def plot(d: PathArrayAlias): this.type = js.native
  
  def pointAt(length: Double): X = js.native
}
