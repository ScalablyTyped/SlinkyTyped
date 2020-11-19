package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsLayers.initializersMod.ConstantArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.IdentityArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.OrthogonalArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.RandomNormalArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.RandomUniformArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.SeedOnlyInitializerArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.TruncatedNormalArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.VarianceScalingArgs
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Zeros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "initializers")
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
