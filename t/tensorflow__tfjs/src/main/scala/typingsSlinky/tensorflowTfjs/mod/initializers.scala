package typingsSlinky.tensorflowTfjs.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializers {
  
  @JSImport("@tensorflow/tfjs", "initializers.constant")
  @js.native
  def constant(args: ConstantArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.glorotNormal")
  @js.native
  def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.glorotUniform")
  @js.native
  def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.heNormal")
  @js.native
  def heNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.heUniform")
  @js.native
  def heUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.identity")
  @js.native
  def identity(args: IdentityArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.leCunNormal")
  @js.native
  def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.leCunUniform")
  @js.native
  def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.ones")
  @js.native
  def ones(): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.orthogonal")
  @js.native
  def orthogonal(args: OrthogonalArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.randomNormal")
  @js.native
  def randomNormal(args: RandomNormalArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.randomUniform")
  @js.native
  def randomUniform(args: RandomUniformArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.truncatedNormal")
  @js.native
  def truncatedNormal(args: TruncatedNormalArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.varianceScaling")
  @js.native
  def varianceScaling(config: VarianceScalingArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs", "initializers.zeros")
  @js.native
  def zeros(): Zeros = js.native
}
