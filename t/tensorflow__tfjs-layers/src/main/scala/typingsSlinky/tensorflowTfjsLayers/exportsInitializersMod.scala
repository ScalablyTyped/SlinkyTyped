package typingsSlinky.tensorflowTfjsLayers

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

object exportsInitializersMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "constant")
  @js.native
  def constant(args: ConstantArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "glorotNormal")
  @js.native
  def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "glorotUniform")
  @js.native
  def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "heNormal")
  @js.native
  def heNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "heUniform")
  @js.native
  def heUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "identity")
  @js.native
  def identity(args: IdentityArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "leCunNormal")
  @js.native
  def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "leCunUniform")
  @js.native
  def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "ones")
  @js.native
  def ones(): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "orthogonal")
  @js.native
  def orthogonal(args: OrthogonalArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "randomNormal")
  @js.native
  def randomNormal(args: RandomNormalArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "randomUniform")
  @js.native
  def randomUniform(args: RandomUniformArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "truncatedNormal")
  @js.native
  def truncatedNormal(args: TruncatedNormalArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "varianceScaling")
  @js.native
  def varianceScaling(config: VarianceScalingArgs): Initializer = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_initializers", "zeros")
  @js.native
  def zeros(): Zeros = js.native
}
