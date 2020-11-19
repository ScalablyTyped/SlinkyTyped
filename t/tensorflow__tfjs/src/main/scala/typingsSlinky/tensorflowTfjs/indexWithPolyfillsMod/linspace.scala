package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linspace")
@js.native
object linspace extends js.Object {
  
  /**
    * Return an evenly spaced sequence of numbers over the given interval.
    *
    * ```js
    * tf.linspace(0, 9, 10).print();
    * ```
    * @param start The start value of the sequence.
    * @param stop The end value of the sequence.
    * @param num The number of values to generate.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply(start: Double, stop: Double, num: Double): Tensor1D = js.native
}
