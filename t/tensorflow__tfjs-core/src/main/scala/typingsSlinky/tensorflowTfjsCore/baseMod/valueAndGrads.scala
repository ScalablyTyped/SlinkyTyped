package typingsSlinky.tensorflowTfjsCore.baseMod

import typingsSlinky.tensorflowTfjsCore.anon.Grads
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "valueAndGrads")
@js.native
object valueAndGrads extends js.Object {
  
  /**
    * Like `tf.grads`, but returns also the value of `f()`. Useful when `f()`
    * returns a metric you want to show.
    *
    * The result is a rich object with the following properties:
    * - grads: The gradients of `f()` w.r.t each input (result of `tf.grads`).
    * - value: The value returned by `f(x)`.
    *
    * ```js
    * // f(a, b) = a * b
    * const f = (a, b) => a.mul(b);
    * // df/da = b, df/db = a
    * const g = tf.valueAndGrads(f);
    *
    * const a = tf.tensor1d([2, 3]);
    * const b = tf.tensor1d([-2, -3]);
    * const {value, grads} = g([a, b]);
    *
    * const [da, db] = grads;
    *
    * console.log('value');
    * value.print();
    *
    * console.log('da');
    * da.print();
    * console.log('db');
    * db.print();
    * ```
    *
    * @doc {heading: 'Training', subheading: 'Gradients'}
    */
  def apply[O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](f: js.Function1[/* repeated */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], O]): js.Function2[
    /* args */ js.Array[Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]], 
    /* dy */ js.UndefOr[O], 
    Grads[O]
  ] = js.native
}
