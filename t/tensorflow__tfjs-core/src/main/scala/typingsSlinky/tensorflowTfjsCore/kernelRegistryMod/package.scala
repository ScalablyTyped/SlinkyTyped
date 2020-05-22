package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kernelRegistryMod {
  type Attribute = typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.AttributeValue | typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray[typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.AttributeValue]
  type AttributeValue = scala.Double | (js.Array[scala.Boolean | scala.Double | java.lang.String]) | scala.Boolean | java.lang.String | typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
  type DataId = js.Object
  type GradFunc = js.Function3[
    /* dy */ typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]), 
    /* saved */ js.Array[
      typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    /* attrs */ typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap, 
    typingsSlinky.tensorflowTfjsCore.tapeMod.NamedGradientMap
  ]
  type KernelDisposeFunc = typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelSetupFunc
  type KernelFunc = js.Function1[
    /* params */ typingsSlinky.tensorflowTfjsCore.anon.Attrs, 
    typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo | js.Array[typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo]
  ]
  type KernelSetupFunc = js.Function1[/* backend */ js.Object, scala.Unit]
  type NamedTensorInfoMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo]
}
