package typingsSlinky.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type BackendValues = scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | js.Array[scala.scalajs.js.typedarray.Uint8Array]
  type DataValues = js.Array[String] | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
  type FlatVector = (js.Array[Boolean | Double]) | TypedArray
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  type ScalarLike = Double | Boolean | String | scala.scalajs.js.typedarray.Uint8Array
  type TensorLike = TypedArray | Double | Boolean | String | (RecursiveArray[js.Array[Double] | Boolean | Double | String | TypedArray]) | js.Array[scala.scalajs.js.typedarray.Uint8Array]
  type TensorLike1D = TypedArray | (js.Array[Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array])
  type TensorLike2D = TypedArray | (js.Array[
    (js.Array[Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array]) | Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike3D = TypedArray | (js.Array[
    (js.Array[js.Array[Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array]]) | Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike4D = TypedArray | (js.Array[
    (js.Array[
      js.Array[js.Array[Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array]]
    ]) | Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike5D = TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[js.Array[Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array]]
      ]
    ]) | Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike6D = TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          js.Array[(js.Array[Boolean | Double | String]) | scala.scalajs.js.typedarray.Uint8Array]
        ]
      ]
    ]) | Boolean | Double | String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TypedArray = scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
}
