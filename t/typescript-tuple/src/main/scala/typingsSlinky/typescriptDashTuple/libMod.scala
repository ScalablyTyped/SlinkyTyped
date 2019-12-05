package typingsSlinky.typescriptDashTuple

import typingsSlinky.typescriptDashTuple.libMod.Prepend
import typingsSlinky.typescriptDashTuple.libMod.Reverse
import typingsSlinky.typescriptDashTuple.libUtilsMod._AllIndexesEqual
import typingsSlinky.typescriptDashTuple.libUtilsMod._AllIndexesSubset
import typingsSlinky.typescriptDashTuple.libUtilsMod._AllIndexesSuperset
import typingsSlinky.typescriptDashTuple.libUtilsMod._IndexesNormalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-tuple/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  type AllIndexesEqual[Type, Tuple /* <: js.Array[_] */] = _IndexesNormalize[_AllIndexesEqual[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]]
  type AllIndexesSubset[Type, Tuple /* <: js.Array[_] */] = _IndexesNormalize[_AllIndexesSubset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]]
  type AllIndexesSuperset[Type, Tuple /* <: js.Array[_] */] = _IndexesNormalize[_AllIndexesSuperset[Type, Tuple, js.Array[js.Any], js.Array[js.Any]]]
  type Append[Tuple /* <: js.Array[_] */, Addend] = Reverse[Prepend[Reverse[Tuple], Addend]]
  type CompareLength[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.CompareLength[Left, Right]
  type Concat[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.Concat[Left, Right]
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[_]] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.ConcatMultiple[TupleSet]
  type FillTuple[Tuple /* <: js.Array[_] */, Replacement] = typingsSlinky.typescriptDashTuple.libUtilsMod.FillTuple[Tuple, Replacement, js.Array[js.Any]]
  type First[Tuple /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: Tuple[0] */ js.Any
  type FirstIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptDashTuple.libUtilsMod.FirstIndexEqual[Type, Tuple, NotFound, js.Array[js.Any]]
  type FirstIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptDashTuple.libUtilsMod.FirstIndexSubset[Type, Tuple, NotFound, js.Array[js.Any]]
  type FirstIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptDashTuple.libUtilsMod.FirstIndexSuperset[Type, Tuple, NotFound, js.Array[js.Any]]
  type IsFinite[Tuple /* <: js.Array[_] */, Finite, Infinite] = typingsSlinky.typescriptDashTuple.libUtilsMod.IsFinite[Tuple, Finite, Infinite]
  type Last[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.Last[Tuple, scala.Nothing]
  type LastIndexEqual[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptDashTuple.libUtilsMod.LastIndexEqual[Type, Tuple, NotFound]
  type LastIndexSubset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptDashTuple.libUtilsMod.LastIndexSubset[Type, Tuple, NotFound]
  type LastIndexSuperset[Type, Tuple /* <: js.Array[_] */, NotFound] = typingsSlinky.typescriptDashTuple.libUtilsMod.LastIndexSuperset[Type, Tuple, NotFound]
  type LongestTuple[TupleSet /* <: js.Array[js.Array[_]] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.LongestTuple[TupleSet, js.Array[js.Any]]
  type Prepend[Tuple /* <: js.Array[_] */, Addend] = typingsSlinky.typescriptDashTuple.libUtilsMod.Prepend[Tuple, Addend]
  type Repeat[Type, Count /* <: Double */] = typingsSlinky.typescriptDashTuple.libUtilsMod.Repeat[Type, Count, js.Array[js.Any]]
  type Reverse[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.Reverse[Tuple, js.Array[js.Any]]
  type ShortestTuple[TupleSet /* <: js.Array[js.Array[_]] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.ShortestTuple[TupleSet, js.Array[js.Any]]
  type SingleTupleSet[Types /* <: js.Array[_] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.SingleTupleSet[Types, js.Array[js.Any]]
  type SliceStartQuantity[Tuple /* <: js.Array[_] */, Start /* <: Double */, Quantity /* <: Double */] = typingsSlinky.typescriptDashTuple.libUtilsMod.SliceStartQuantity[Tuple, Start, Quantity, js.Array[js.Any], js.Array[js.Any]]
  type SortTwoTuple[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */, WhenEqual] = typingsSlinky.typescriptDashTuple.libUtilsMod.SortTwoTuple[Left, Right, WhenEqual]
  type SplitInfiniteTuple[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.SplitInfiniteTuple[Tuple]
  type Tail[Tuple /* <: js.Array[_] */] = typingsSlinky.typescriptDashTuple.libUtilsMod.Tail[Tuple]
}

