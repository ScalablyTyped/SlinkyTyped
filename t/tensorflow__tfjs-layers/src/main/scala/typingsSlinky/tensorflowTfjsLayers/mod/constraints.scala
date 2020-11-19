package typingsSlinky.tensorflowTfjsLayers.mod

import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers", "constraints")
@js.native
object constraints extends js.Object {
  
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  
  def nonNeg(): Constraint = js.native
  
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}
