package typingsSlinky.underscore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.underscore.underscoreBooleans.`false`
    - typingsSlinky.underscore.underscoreStrings._empty
    - typingsSlinky.underscore.underscoreNumbers.`0`
  */
  type AnyFalsy = js.UndefOr[typingsSlinky.underscore.mod._AnyFalsy | scala.Null]
  
  type ChainSingle[V] = typingsSlinky.underscore.mod.Chain[typingsSlinky.underscore.mod.TypeOfCollection[V, scala.Nothing], V]
  
  type Collection[T] = typingsSlinky.underscore.mod.List[T] | typingsSlinky.underscore.mod.Dictionary[T]
  
  type CollectionIterator[T /* <: typingsSlinky.underscore.mod.TypeOfList[V] | (typingsSlinky.underscore.mod.TypeOfDictionary[V, _]) */, TResult, V] = js.Function3[
    /* element */ T, 
    /* key */ typingsSlinky.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  
  type CollectionKey[V] = js.UndefOr[java.lang.String | scala.Double]
  
  // unfortunately it's not possible to recursively collapse all possible list dimensions to T[] at this time,
  // so give up after one dimension since that's likely the most common case
  // '& object' prevents strings from being matched by list checks so types like string[] don't end up resulting in any
  type DeepestListItemOrSelf[T] = T | js.Any
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Iteratee[V, R, T /* <: typingsSlinky.underscore.mod.TypeOfCollection[V, _] */] = js.UndefOr[
    (typingsSlinky.underscore.mod.CollectionIterator[T, R, V]) | java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typingsSlinky.std.Partial[T] | scala.Null
  ]
  
  type IterateeResult[I, T] = T | scala.Boolean | (/* import warning: importer.ImportType#apply Failed type conversion: T[I] */ js.Any)
  
  type ListItemOrSelf[T] = T
  
  type ListIterator[T /* <: typingsSlinky.underscore.mod.TypeOfList[V] */, TResult, V] = typingsSlinky.underscore.mod.CollectionIterator[T, TResult, V]
  
  type MemoCollectionIterator[T /* <: typingsSlinky.underscore.mod.TypeOfList[V] | (typingsSlinky.underscore.mod.TypeOfDictionary[V, _]) */, TResult, V] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* key */ typingsSlinky.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  
  type MemoIterator[T /* <: typingsSlinky.underscore.mod.TypeOfList[V] */, TResult, V] = typingsSlinky.underscore.mod.MemoCollectionIterator[T, TResult, V]
  
  type MemoObjectIterator[T /* <: typingsSlinky.underscore.mod.TypeOfDictionary[V, scala.Nothing] */, TResult, V] = typingsSlinky.underscore.mod.MemoCollectionIterator[T, TResult, V]
  
  type ObjectIterator[T /* <: typingsSlinky.underscore.mod.TypeOfDictionary[V, _] */, TResult, V] = typingsSlinky.underscore.mod.CollectionIterator[T, TResult, V]
  
  // switch to Omit when the minimum TS version moves past 3.5
  type Omit[V, K /* <: java.lang.String */] = (typingsSlinky.std.Pick[V, typingsSlinky.std.Exclude[/* keyof V */ java.lang.String, K]]) | typingsSlinky.std.Partial[V]
  
  // if T is an inferrable pair, the value type for the pair
  // if T is a list, assume that it contains pairs of some type, so any
  // if T isn't a list, there's no way that it can provide pairs, so never
  type PairValue[T] = js.Any
  
  type Pick[V, K /* <: java.lang.String */] = (typingsSlinky.std.Pick[V, typingsSlinky.std.Extract[K, /* keyof V */ java.lang.String]]) | typingsSlinky.std.Partial[V]
  
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
  
  type PropertyTypeOrAny[T, K] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type Truthy[T] = typingsSlinky.std.Exclude[T, typingsSlinky.underscore.mod.AnyFalsy]
  
  type TypeOfCollection[V, TObjectDefault] = (typingsSlinky.underscore.mod.TypeOfDictionary[V, TObjectDefault]) | typingsSlinky.underscore.mod.TypeOfList[V]
  
  type TypeOfDictionary[V, TDefault] = TDefault
  
  type TypeOfList[V] = js.Any
}
