package typingsSlinky.synaptic.mod

import typingsSlinky.synaptic.anon.Test
import typingsSlinky.synaptic.mod.Trainer.DSROptions
import typingsSlinky.synaptic.mod.Trainer.DSRTrainingResult
import typingsSlinky.synaptic.mod.Trainer.ERGOptions
import typingsSlinky.synaptic.mod.Trainer.ERGTrainingResult
import typingsSlinky.synaptic.mod.Trainer.TrainingOptions
import typingsSlinky.synaptic.mod.Trainer.TrainingResult
import typingsSlinky.synaptic.mod.Trainer.TrainingSet
import typingsSlinky.synaptic.mod.Trainer.XOROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("synaptic", "Trainer")
@js.native
class Trainer_ protected () extends js.Object {
  /**
    * The Trainer makes it easier to train any set to any network, no matter its architecture. The trainer also contains built-in tasks to test the performance of your network.
    * @param network
    */
  def this(network: Network) = this()
  
  /**
    * This method trains the network to complete a Discrete Sequence Recall, which is a task for testing context memory in neural networks.
    */
  def DSR(): DSRTrainingResult = js.native
  def DSR(options: DSROptions): DSRTrainingResult = js.native
  
  /**
    * This method trains the network to pass an Embedded Reber Grammar test.
    */
  def ERG(): ERGTrainingResult = js.native
  def ERG(options: ERGOptions): ERGTrainingResult = js.native
  
  /**
    * This method trains an XOR to the network, is useful when you are experimenting with different architectures and you want to test and compare their performances.
    */
  def XOR(): TrainingResult = js.native
  def XOR(options: XOROptions): TrainingResult = js.native
  
  /**
    * This method accepts the same arguments as train(dataSet, options). It will iterate over the dataSet, activating the network.
    * @returns It returns the elapsed time and the error (by default, the MSE, but you can specify the cost function in the options, same way as in train()).
    */
  def test(trainingSet: TrainingSet): TrainingResult = js.native
  def test(trainingSet: TrainingSet, trainingOptions: TrainingOptions): TrainingResult = js.native
  
  /**
    * This test challenges the network to complete a timing task.
    */
  def timingTask(): Test = js.native
  def timingTask(options: js.Any): Test = js.native
  
  /**
    * This method allows you to train any training set to a Network.
    * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
    */
  def train(trainingSet: TrainingSet): TrainingResult = js.native
  def train(trainingSet: TrainingSet, trainingOptions: TrainingOptions): TrainingResult = js.native
  
  /**
    * This method allows you to train any training set to a Network.
    * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
    */
  def trainAsync(trainingSet: TrainingSet): js.Promise[TrainingResult] = js.native
  def trainAsync(trainingSet: TrainingSet, trainingOptions: TrainingOptions): js.Promise[TrainingResult] = js.native
}
