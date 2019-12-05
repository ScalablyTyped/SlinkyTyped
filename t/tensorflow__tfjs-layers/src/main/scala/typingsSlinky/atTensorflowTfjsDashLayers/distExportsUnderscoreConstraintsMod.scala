package typingsSlinky.atTensorflowTfjsDashLayers

import typingsSlinky.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typingsSlinky.atTensorflowTfjsDashLayers.distConstraintsMod.MaxNormArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distConstraintsMod.MinMaxNormArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distConstraintsMod.UnitNormArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_constraints", JSImport.Namespace)
@js.native
object distExportsUnderscoreConstraintsMod extends js.Object {
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  def nonNeg(): Constraint = js.native
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}

