package typingsSlinky.svgJs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformation
  extends Instantiable1[/* source */ Transform, Transformation]
     with Instantiable2[/* source */ Transform, /* inversed */ Boolean, Transformation] {
  
  def at(pos: Double): Matrix = js.native
  
  def undo(transform: Transform): this.type = js.native
}
