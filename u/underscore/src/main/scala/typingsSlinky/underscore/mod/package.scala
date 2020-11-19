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
  
  // temporary iteratee type for _Chain until _Chain return types have been fixed
  type ChainIteratee[V, R, T] = typingsSlinky.underscore.mod.Iteratee[js.Array[T] | V, R, typingsSlinky.underscore.mod.TypeOfCollection[js.Array[T] | V]]
  
  type ChainSingle[V] = typingsSlinky.underscore.mod.Chain[typingsSlinky.underscore.mod.TypeOfCollection[V], V]
  
  type Collection[T] = typingsSlinky.underscore.mod.List[T] | typingsSlinky.underscore.mod.Dictionary[T]
  
  type CollectionIterator[T /* <: typingsSlinky.underscore.mod.TypeOfCollection[V] */, TResult, V] = js.Function3[
    /* element */ T, 
    /* key */ typingsSlinky.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  
  type CollectionKey[V] = java.lang.String | scala.Double
  
  // unfortunately it's not possible to recursively collapse all possible list dimensions to T[] at this time,
  // so give up after one dimension since that's likely the most common case
  // '& object' prevents strings from being matched by list checks so types like string[] don't end up resulting in any
  type DeepestListItemOrSelf[T] = T | js.Any
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type EnumerableKey = java.lang.String | scala.Double
  
  type Iteratee[V, R, T /* <: typingsSlinky.underscore.mod.TypeOfCollection[V] */] = js.UndefOr[
    (typingsSlinky.underscore.mod.CollectionIterator[T, R, V]) | typingsSlinky.underscore.mod.EnumerableKey | js.Array[typingsSlinky.underscore.mod.EnumerableKey] | typingsSlinky.std.Partial[T] | scala.Null
  ]
  
  type IterateeResult[I, T] = T | scala.Boolean | (/* import warning: importer.ImportType#apply Failed type conversion: T[I] */ js.Any)
  
  type ListItemOrSelf[T] = T
  
  type ListIterator[T /* <: typingsSlinky.underscore.mod.TypeOfList[V] */, TResult, V] = typingsSlinky.underscore.mod.CollectionIterator[T, TResult, V]
  
  type MemoCollectionIterator[T /* <: typingsSlinky.underscore.mod.TypeOfCollection[V] */, TResult, V] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* key */ typingsSlinky.underscore.mod.CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  
  type MemoIterator[T /* <: typingsSlinky.underscore.mod.TypeOfList[V] */, TResult, V] = typingsSlinky.underscore.mod.MemoCollectionIterator[T, TResult, V]
  
  type MemoObjectIterator[T /* <: typingsSlinky.underscore.mod.TypeOfDictionary[V] */, TResult, V] = typingsSlinky.underscore.mod.MemoCollectionIterator[T, TResult, V]
  
  type ObjectIterator[T /* <: typingsSlinky.underscore.mod.TypeOfDictionary[V] */, TResult, V] = typingsSlinky.underscore.mod.CollectionIterator[T, TResult, V]
  
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
  
  type PropertyTypeOrAny[T, K] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  type Truthy[T] = typingsSlinky.std.Exclude[T, typingsSlinky.underscore.mod.AnyFalsy]
  
  type TypeOfCollection[V] = typingsSlinky.underscore.mod.TypeOfList[V] | typingsSlinky.underscore.mod.TypeOfDictionary[V]
  
  type TypeOfDictionary[V] = js.Any
  
  type TypeOfList[V] = js.Any
}
