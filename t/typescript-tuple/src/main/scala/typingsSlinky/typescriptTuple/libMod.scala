package typingsSlinky.typescriptTuple

import typingsSlinky.typescriptTuple.utilsMod.IndexesNormalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-tuple/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  
  type AllIndexesEqual[Type, Tuple /* <: js.Array[_] */] = IndexesNormalize[
    typingsSlinky.typescriptTuple.utilsMod.AllIndexesEqual[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]
  ]
  
  type AllIndexesSubset[Type, Tuple /* <: js.Array[_] */] = IndexesNormalize[
    typingsSlinky.typescriptTuple.utilsMod.AllIndexesSubset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]
  ]
  
  type AllIndexesSuperset[Type, Tuple /* <: js.Array[_] */] = IndexesNormalize[
    typingsSlinky.typescriptTuple.utilsMod.AllIndexesSuperset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]
  ]
  
  type Append[Tuple /* <: js.Array[_] */, Addend] = Reverse[Prepend[Reverse[Tuple], Addend]]
  
  type CompareLength[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.utilsMod.CompareLength[Left, Right]
  
  type Concat[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.utilsMod.Concat[Left, Right]
  
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[_]] */] = typingsSlinky.typescriptTuple.utilsMod.ConcatMultiple[TupleSet]
  
  type FillTuple[Tuple /* <: js.Array[_] */, Replacement] = typingsSlinky.typescriptTuple.utilsMod.FillTuple[Tuple, Replacement, js.Array[js.Any]]
  
  type First[Tuple /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: Tuple[0] */ js.Any
  
  type FirstIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptTuple.utilsMod.FirstIndexEqual[Type, Tuple, NotFound, js.Array[js.Any]]
  
  type FirstIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptTuple.utilsMod.FirstIndexSubset[Type, Tuple, NotFound, js.Array[js.Any]]
  
  type FirstIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptTuple.utilsMod.FirstIndexSuperset[Type, Tuple, NotFound, js.Array[js.Any]]
  
  type IsFinite[Tuple /* <: js.Array[_] */, Finite, Infinite] = typingsSlinky.typescriptTuple.utilsMod.IsFinite[Tuple, Finite, Infinite]
  
  type Last[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.utilsMod.Last[Tuple, scala.Nothing]
  
  type LastIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptTuple.utilsMod.LastIndexEqual[Type, Tuple, NotFound]
  
  type LastIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptTuple.utilsMod.LastIndexSubset[Type, Tuple, NotFound]
  
  type LastIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptTuple.utilsMod.LastIndexSuperset[Type, Tuple, NotFound]
  
  type LongestTuple[TupleSet /* <: Array[js.Array[_]] */] = typingsSlinky.typescriptTuple.utilsMod.LongestTuple[TupleSet, js.Array[js.Any]]
  
  type Prepend[Tuple /* <: js.Array[_] */, Addend] = typingsSlinky.typescriptTuple.utilsMod.Prepend[Tuple, Addend]
  
  type Repeat[Type, Count /* <: Double */] = typingsSlinky.typescriptTuple.utilsMod.Repeat[Type, Count, js.Array[js.Any]]
  
  type Reverse[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.utilsMod.Reverse[Tuple, js.Array[js.Any]]
  
  type ShortestTuple[TupleSet /* <: Array[js.Array[_]] */] = typingsSlinky.typescriptTuple.utilsMod.ShortestTuple[TupleSet, js.Array[js.Any]]
  
  type SingleTupleSet[Types /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.utilsMod.SingleTupleSet[Types, js.Array[js.Any]]
  
  type SliceStartQuantity[Tuple /* <: js.Array[_] */, Start /* <: Double */, Quantity /* <: Double */] = typingsSlinky.typescriptTuple.utilsMod.SliceStartQuantity[Tuple, Start, Quantity, js.Array[js.Any], js.Array[js.Any]]
  
  type SortTwoTuple[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */, WhenEqual] = typingsSlinky.typescriptTuple.utilsMod.SortTwoTuple[Left, Right, WhenEqual]
  
  type SplitInfiniteTuple[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.utilsMod.SplitInfiniteTuple[Tuple]
  
  type Tail[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.utilsMod.Tail[Tuple]
}
