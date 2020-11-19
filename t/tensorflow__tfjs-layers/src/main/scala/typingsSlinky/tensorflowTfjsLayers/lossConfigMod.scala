package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.categorical_crossentropy
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.categorical_hinge
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.cosine_proximity
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hinge
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.kullback_leibler_divergence
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.logcosh
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_absolute_error
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_absolute_percentage_error
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_squared_error
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_squared_logarithmic_error
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.poisson
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sparse_categorical_crossentropy
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.squared_hinge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/loss_config", JSImport.Namespace)
@js.native
object lossConfigMod extends js.Object {
  
  val lossOptions: js.Array[
    mean_squared_error | mean_absolute_error | mean_absolute_percentage_error | mean_squared_logarithmic_error | squared_hinge | hinge | categorical_hinge | logcosh | categorical_crossentropy | sparse_categorical_crossentropy | kullback_leibler_divergence | poisson | cosine_proximity
  ] = js.native
  
  type LossIdentifier = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'mean_squared_error' | 'mean_absolute_error' | 'mean_absolute_percentage_error' | 'mean_squared_logarithmic_error' | 'squared_hinge' | 'hinge' | 'categorical_hinge' | 'logcosh' | 'categorical_crossentropy' | 'sparse_categorical_crossentropy' | 'kullback_leibler_divergence' | 'poisson' | 'cosine_proximity'>[number] */ js.Any
}
