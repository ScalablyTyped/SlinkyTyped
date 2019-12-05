package typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod

import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.ConstantArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.IdentityArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.OrthogonalArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.RandomNormalArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.RandomUniformArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.SeedOnlyInitializerArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.TruncatedNormalArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.VarianceScalingArgs
import typingsSlinky.atTensorflowTfjsDashLayers.distInitializersMod.Zeros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "initializers")
@js.native
object initializers extends js.Object {
  def constant(args: ConstantArgs): Initializer = js.native
  def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def heNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def heUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def identity(args: IdentityArgs): Initializer = js.native
  def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def ones(): Initializer = js.native
  def orthogonal(args: OrthogonalArgs): Initializer = js.native
  def randomNormal(args: RandomNormalArgs): Initializer = js.native
  def randomUniform(args: RandomUniformArgs): Initializer = js.native
  def truncatedNormal(args: TruncatedNormalArgs): Initializer = js.native
  def varianceScaling(config: VarianceScalingArgs): Initializer = js.native
  def zeros(): Zeros = js.native
}

