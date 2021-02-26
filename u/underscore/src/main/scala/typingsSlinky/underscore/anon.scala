package typingsSlinky.underscore

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.underscore.mod.Chain
import typingsSlinky.underscore.mod.ChainSingle
import typingsSlinky.underscore.mod.Collection
import typingsSlinky.underscore.mod.CollectionIterator
import typingsSlinky.underscore.mod.Iteratee
import typingsSlinky.underscore.mod.IterateeResult
import typingsSlinky.underscore.mod.List
import typingsSlinky.underscore.mod.MemoCollectionIterator
import typingsSlinky.underscore.mod.TypeOfCollection
import typingsSlinky.underscore.mod.TypeOfList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0[T, V] extends StObject {
    
    def apply(): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def apply(iteratee: js.UndefOr[scala.Nothing], context: js.Any): Chain[
        IterateeResult[js.UndefOr[scala.Nothing], T], 
        js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]]
      ] = js.native
    def apply(iteratee: String): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def apply(iteratee: String, context: js.Any): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def apply(iteratee: js.Array[String | Double]): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    def apply(iteratee: js.Array[String | Double], context: js.Any): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    def apply(iteratee: Double): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def apply(iteratee: Double, context: js.Any): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def apply(iteratee: Null, context: js.Any): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typingsSlinky.underscore.underscoreStrings.Fn0 with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typingsSlinky.underscore.underscoreStrings.Fn0 with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: js.Any): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
  }
  
  @js.native
  trait Fn1[V] extends StObject {
    
    def apply[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): ChainSingle[js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])]] = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def apply[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: js.Any
    ): ChainSingle[TResult] = js.native
  }
  
  @js.native
  trait Fn2[T] extends StObject {
    
    def apply(): ChainSingle[js.UndefOr[T]] = js.native
    def apply(n: Double): Chain[T, js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[V /* <: Collection[_] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: String, context: js.Any): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: js.Array[String | Double], context: js.Any): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */](collection: V, iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typingsSlinky.underscore.underscoreStrings.FnCall with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
    def apply[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typingsSlinky.underscore.underscoreStrings.FnCall with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I, context: js.Any): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
  }
  
  @js.native
  trait FnCallCollectionIterateeMemoContext extends StObject {
    
    def apply[V /* <: Collection[_] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
    def apply[V /* <: Collection[_] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult
    ): TResult = js.native
    def apply[V /* <: Collection[_] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: js.Any
    ): TResult = js.native
  }
  
  @js.native
  trait FnCallIsSortedIterateeContext[V, T] extends StObject {
    
    def apply(): Chain[T, js.Array[T]] = js.native
    def apply(
      isSorted: js.UndefOr[scala.Nothing],
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
      context: js.Any
    ): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean): Chain[T, js.Array[T]] = js.native
    def apply(
      isSorted: Boolean,
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
      context: js.Any
    ): Chain[T, js.Array[T]] = js.native
    def apply(isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def apply(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): Chain[T, js.Array[T]] = js.native
    def apply(iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCallIsSortedIterateeCotext[V, T] extends StObject {
    
    def apply(): js.Array[T] = js.native
    def apply(
      isSorted: js.UndefOr[scala.Nothing],
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
      cotext: js.Any
    ): js.Array[T] = js.native
    def apply(isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def apply(isSorted: Boolean): js.Array[T] = js.native
    def apply(
      isSorted: Boolean,
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
      cotext: js.Any
    ): js.Array[T] = js.native
    def apply(isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def apply(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[T] = js.native
    def apply(iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallIterateeContext[T, V] extends StObject {
    
    def apply(): js.Array[IterateeResult[Null, T]] = js.native
    def apply(iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]] = js.native
    def apply(iteratee: String): js.Array[IterateeResult[String, T]] = js.native
    def apply(iteratee: String, context: js.Any): js.Array[IterateeResult[String, T]] = js.native
    def apply(iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    def apply(iteratee: js.Array[String | Double], context: js.Any): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    def apply(iteratee: Double): js.Array[IterateeResult[Double, T]] = js.native
    def apply(iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, T]] = js.native
    def apply(iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, T]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typingsSlinky.underscore.underscoreStrings.FnCallIterateeContext with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): js.Array[IterateeResult[I, T]] = js.native
    def apply[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typingsSlinky.underscore.underscoreStrings.FnCallIterateeContext with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: js.Any): js.Array[IterateeResult[I, T]] = js.native
  }
  
  @js.native
  trait FnCallIterateeMemoContext[V] extends StObject {
    
    def apply[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
    def apply[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): TResult = js.native
    def apply[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: js.Any
    ): TResult = js.native
  }
  
  @js.native
  trait FnCallListIsSortedIterateeContext extends StObject {
    
    def apply[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](
      list: V,
      isSorted: js.UndefOr[scala.Nothing],
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
      context: js.Any
    ): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](
      list: V,
      isSorted: js.UndefOr[scala.Nothing],
      iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]
    ): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](
      list: V,
      isSorted: Boolean,
      iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
      context: js.Any
    ): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
  }
  
  @js.native
  trait FnCallListN extends StObject {
    
    def apply[V /* <: List[_] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
    def apply[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  }
  
  @js.native
  trait FnCallN[T] extends StObject {
    
    def apply(): js.UndefOr[T] = js.native
    def apply(n: Double): js.Array[T] = js.native
  }
}
