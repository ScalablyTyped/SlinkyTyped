package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type BackendValues = scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | js.Array[scala.scalajs.js.typedarray.Uint8Array]
  type DataValues = scala.scalajs.js.typedarray.Int32Array | js.Array[java.lang.String] | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Uint8Array
  type FlatVector = (js.Array[scala.Boolean | scala.Double]) | typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  type ScalarLike = scala.Double | scala.Boolean | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  type TensorLike = typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray | scala.Double | scala.Boolean | java.lang.String | (typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
  ]) | js.Array[scala.scalajs.js.typedarray.Uint8Array]
  type TensorLike1D = typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike2D = typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike3D = typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike4D = typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike5D = typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          js.Array[
            scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
          ]
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TensorLike6D = typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[
          js.Array[
            (js.Array[scala.Boolean | scala.Double | java.lang.String]) | scala.scalajs.js.typedarray.Uint8Array
          ]
        ]
      ]
    ]) | scala.Boolean | scala.Double | java.lang.String | scala.scalajs.js.typedarray.Uint8Array
  ])
  type TypedArray = scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
}
