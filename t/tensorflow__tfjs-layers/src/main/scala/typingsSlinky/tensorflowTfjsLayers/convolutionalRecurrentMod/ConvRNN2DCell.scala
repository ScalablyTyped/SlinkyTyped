package typingsSlinky.tensorflowTfjsLayers.convolutionalRecurrentMod

import typingsSlinky.tensorflowTfjsLayers.activationsMod.Activation
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNCell
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvRNN2DCell extends RNNCell {
  
  val activation: Activation = js.native
  
  val biasConstraint: Constraint = js.native
  
  val biasInitializer: Initializer = js.native
  
  val biasRegularizer: Regularizer = js.native
  
  val dataFormat: DataFormat = js.native
  
  val dilationRate: js.Array[Double] = js.native
  
  val dropout: Double = js.native
  
  val filters: Double = js.native
  
  val kernelConstraint: Constraint = js.native
  
  val kernelInitializer: Initializer = js.native
  
  val kernelRegularizer: Regularizer = js.native
  
  val kernelSize: js.Array[Double] = js.native
  
  val padding: PaddingMode = js.native
  
  val recurrentConstraint: Constraint = js.native
  
  val recurrentDropout: Double = js.native
  
  val recurrentInitializer: Initializer = js.native
  
  val recurrentRegularizer: Regularizer = js.native
  
  val strides: js.Array[Double] = js.native
  
  val useBias: Boolean = js.native
}
