package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraints {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "constraints.maxNorm")
  @js.native
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "constraints.minMaxNorm")
  @js.native
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "constraints.nonNeg")
  @js.native
  def nonNeg(): Constraint = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "constraints.unitNorm")
  @js.native
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}
