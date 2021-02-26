package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unaryTypesMod {
  
  type SimpleUnaryImpl = js.Function3[
    /* values */ TypedArray, 
    /* dtype */ DataType, 
    /* attrs */ js.UndefOr[NamedAttrMap], 
    TypedArray
  ]
  
  type SimpleUnaryOperation = js.Function2[/* x */ Double, /* attrs */ js.UndefOr[NamedAttrMap], Double]
}
