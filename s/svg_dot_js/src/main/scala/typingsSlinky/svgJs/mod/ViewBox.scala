package typingsSlinky.svgJs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewBox
  extends Instantiable1[/* source */ ViewBoxAlias, ViewBox]
     with Instantiable4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, ViewBox] {
  
  def at(pos: Double): ViewBox = js.native
  
  var height: Double = js.native
  
  def morph(source: ViewBoxAlias): ViewBox = js.native
  def morph(x: Double, y: Double, width: Double, height: Double): ViewBox = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
