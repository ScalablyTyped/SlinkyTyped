package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraints {
  
  @JSImport("@tensorflow/tfjs-node", "constraints.maxNorm")
  @js.native
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs-node", "constraints.minMaxNorm")
  @js.native
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs-node", "constraints.nonNeg")
  @js.native
  def nonNeg(): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs-node", "constraints.unitNorm")
  @js.native
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}
