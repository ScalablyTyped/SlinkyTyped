package typingsSlinky.tsMockito

import typingsSlinky.tsMockito.methodActionMod.MethodAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argCaptorMod {
  
  @JSImport("ts-mockito/lib/capture/ArgCaptor", "ArgCaptor")
  @js.native
  class ArgCaptor protected () extends StObject {
    def this(actions: js.Array[MethodAction]) = this()
    
    var actions: js.Any = js.native
    
    def beforeLast(): js.Any = js.native
    
    def byCallIndex(index: Double): js.Any = js.native
    
    def first(): js.Any = js.native
    
    def last(): js.Any = js.native
    
    def second(): js.Any = js.native
    
    def third(): js.Any = js.native
  }
  
  @js.native
  trait ArgCaptor1[T] extends StObject {
    
    def beforeLast(): js.Array[T] = js.native
    
    def byCallIndex(index: Double): js.Array[T] = js.native
    
    def first(): js.Array[T] = js.native
    
    def last(): js.Array[T] = js.native
    
    def second(): js.Array[T] = js.native
    
    def third(): js.Array[T] = js.native
  }
  object ArgCaptor1 {
    
    @scala.inline
    def apply[T](
      beforeLast: () => js.Array[T],
      byCallIndex: Double => js.Array[T],
      first: () => js.Array[T],
      last: () => js.Array[T],
      second: () => js.Array[T],
      third: () => js.Array[T]
    ): ArgCaptor1[T] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor1[T]]
    }
    
    @scala.inline
    implicit class ArgCaptor1MutableBuilder[Self <: ArgCaptor1[_], T] (val x: Self with ArgCaptor1[T]) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Array[T]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Array[T]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Array[T]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Array[T]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Array[T]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Array[T]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] extends StObject {
    
    def beforeLast(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
    
    def byCallIndex(index: Double): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
    
    def first(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
    
    def last(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
    
    def second(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
    
    def third(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  }
  object ArgCaptor10 {
    
    @scala.inline
    def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
      beforeLast: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      byCallIndex: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      first: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      last: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      second: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      third: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
    ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
    }
    
    @scala.inline
    implicit class ArgCaptor10MutableBuilder[Self <: ArgCaptor10[_, _, _, _, _, _, _, _, _, _], T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] (val x: Self with (ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor2[T0, T1] extends StObject {
    
    def beforeLast(): js.Tuple2[T0, T1] = js.native
    
    def byCallIndex(index: Double): js.Tuple2[T0, T1] = js.native
    
    def first(): js.Tuple2[T0, T1] = js.native
    
    def last(): js.Tuple2[T0, T1] = js.native
    
    def second(): js.Tuple2[T0, T1] = js.native
    
    def third(): js.Tuple2[T0, T1] = js.native
  }
  object ArgCaptor2 {
    
    @scala.inline
    def apply[T0, T1](
      beforeLast: () => js.Tuple2[T0, T1],
      byCallIndex: Double => js.Tuple2[T0, T1],
      first: () => js.Tuple2[T0, T1],
      last: () => js.Tuple2[T0, T1],
      second: () => js.Tuple2[T0, T1],
      third: () => js.Tuple2[T0, T1]
    ): ArgCaptor2[T0, T1] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor2[T0, T1]]
    }
    
    @scala.inline
    implicit class ArgCaptor2MutableBuilder[Self <: ArgCaptor2[_, _], T0, T1] (val x: Self with (ArgCaptor2[T0, T1])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple2[T0, T1]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor3[T0, T1, T2] extends StObject {
    
    def beforeLast(): js.Tuple3[T0, T1, T2] = js.native
    
    def byCallIndex(index: Double): js.Tuple3[T0, T1, T2] = js.native
    
    def first(): js.Tuple3[T0, T1, T2] = js.native
    
    def last(): js.Tuple3[T0, T1, T2] = js.native
    
    def second(): js.Tuple3[T0, T1, T2] = js.native
    
    def third(): js.Tuple3[T0, T1, T2] = js.native
  }
  object ArgCaptor3 {
    
    @scala.inline
    def apply[T0, T1, T2](
      beforeLast: () => js.Tuple3[T0, T1, T2],
      byCallIndex: Double => js.Tuple3[T0, T1, T2],
      first: () => js.Tuple3[T0, T1, T2],
      last: () => js.Tuple3[T0, T1, T2],
      second: () => js.Tuple3[T0, T1, T2],
      third: () => js.Tuple3[T0, T1, T2]
    ): ArgCaptor3[T0, T1, T2] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor3[T0, T1, T2]]
    }
    
    @scala.inline
    implicit class ArgCaptor3MutableBuilder[Self <: ArgCaptor3[_, _, _], T0, T1, T2] (val x: Self with (ArgCaptor3[T0, T1, T2])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor4[T0, T1, T2, T3] extends StObject {
    
    def beforeLast(): js.Tuple4[T0, T1, T2, T3] = js.native
    
    def byCallIndex(index: Double): js.Tuple4[T0, T1, T2, T3] = js.native
    
    def first(): js.Tuple4[T0, T1, T2, T3] = js.native
    
    def last(): js.Tuple4[T0, T1, T2, T3] = js.native
    
    def second(): js.Tuple4[T0, T1, T2, T3] = js.native
    
    def third(): js.Tuple4[T0, T1, T2, T3] = js.native
  }
  object ArgCaptor4 {
    
    @scala.inline
    def apply[T0, T1, T2, T3](
      beforeLast: () => js.Tuple4[T0, T1, T2, T3],
      byCallIndex: Double => js.Tuple4[T0, T1, T2, T3],
      first: () => js.Tuple4[T0, T1, T2, T3],
      last: () => js.Tuple4[T0, T1, T2, T3],
      second: () => js.Tuple4[T0, T1, T2, T3],
      third: () => js.Tuple4[T0, T1, T2, T3]
    ): ArgCaptor4[T0, T1, T2, T3] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
    }
    
    @scala.inline
    implicit class ArgCaptor4MutableBuilder[Self <: ArgCaptor4[_, _, _, _], T0, T1, T2, T3] (val x: Self with (ArgCaptor4[T0, T1, T2, T3])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor5[T0, T1, T2, T3, T4] extends StObject {
    
    def beforeLast(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
    
    def byCallIndex(index: Double): js.Tuple5[T0, T1, T2, T3, T4] = js.native
    
    def first(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
    
    def last(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
    
    def second(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
    
    def third(): js.Tuple5[T0, T1, T2, T3, T4] = js.native
  }
  object ArgCaptor5 {
    
    @scala.inline
    def apply[T0, T1, T2, T3, T4](
      beforeLast: () => js.Tuple5[T0, T1, T2, T3, T4],
      byCallIndex: Double => js.Tuple5[T0, T1, T2, T3, T4],
      first: () => js.Tuple5[T0, T1, T2, T3, T4],
      last: () => js.Tuple5[T0, T1, T2, T3, T4],
      second: () => js.Tuple5[T0, T1, T2, T3, T4],
      third: () => js.Tuple5[T0, T1, T2, T3, T4]
    ): ArgCaptor5[T0, T1, T2, T3, T4] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
    }
    
    @scala.inline
    implicit class ArgCaptor5MutableBuilder[Self <: ArgCaptor5[_, _, _, _, _], T0, T1, T2, T3, T4] (val x: Self with (ArgCaptor5[T0, T1, T2, T3, T4])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor6[T0, T1, T2, T3, T4, T5] extends StObject {
    
    def beforeLast(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
    
    def byCallIndex(index: Double): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
    
    def first(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
    
    def last(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
    
    def second(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
    
    def third(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
  }
  object ArgCaptor6 {
    
    @scala.inline
    def apply[T0, T1, T2, T3, T4, T5](
      beforeLast: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      byCallIndex: Double => js.Tuple6[T0, T1, T2, T3, T4, T5],
      first: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      last: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      second: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      third: () => js.Tuple6[T0, T1, T2, T3, T4, T5]
    ): ArgCaptor6[T0, T1, T2, T3, T4, T5] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
    }
    
    @scala.inline
    implicit class ArgCaptor6MutableBuilder[Self <: ArgCaptor6[_, _, _, _, _, _], T0, T1, T2, T3, T4, T5] (val x: Self with (ArgCaptor6[T0, T1, T2, T3, T4, T5])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] extends StObject {
    
    def beforeLast(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6] = js.native
    
    def byCallIndex(index: Double): js.Tuple7[T0, T1, T2, T3, T4, T5, T6] = js.native
    
    def first(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6] = js.native
    
    def last(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6] = js.native
    
    def second(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6] = js.native
    
    def third(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6] = js.native
  }
  object ArgCaptor7 {
    
    @scala.inline
    def apply[T0, T1, T2, T3, T4, T5, T6](
      beforeLast: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      byCallIndex: Double => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      first: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      last: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      second: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      third: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
    ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor7[T0, T1, T2, T3, T4, T5, T6]]
    }
    
    @scala.inline
    implicit class ArgCaptor7MutableBuilder[Self <: ArgCaptor7[_, _, _, _, _, _, _], T0, T1, T2, T3, T4, T5, T6] (val x: Self with (ArgCaptor7[T0, T1, T2, T3, T4, T5, T6])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] extends StObject {
    
    def beforeLast(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
    
    def byCallIndex(index: Double): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
    
    def first(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
    
    def last(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
    
    def second(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
    
    def third(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
  }
  object ArgCaptor8 {
    
    @scala.inline
    def apply[T0, T1, T2, T3, T4, T5, T6, T7](
      beforeLast: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      byCallIndex: Double => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      first: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      last: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      second: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      third: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
    ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
    }
    
    @scala.inline
    implicit class ArgCaptor8MutableBuilder[Self <: ArgCaptor8[_, _, _, _, _, _, _, _], T0, T1, T2, T3, T4, T5, T6, T7] (val x: Self with (ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] extends StObject {
    
    def beforeLast(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    
    def byCallIndex(index: Double): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    
    def first(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    
    def last(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    
    def second(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    
    def third(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
  }
  object ArgCaptor9 {
    
    @scala.inline
    def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8](
      beforeLast: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      byCallIndex: Double => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      first: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      last: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      second: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      third: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
    ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
    }
    
    @scala.inline
    implicit class ArgCaptor9MutableBuilder[Self <: ArgCaptor9[_, _, _, _, _, _, _, _, _], T0, T1, T2, T3, T4, T5, T6, T7, T8] (val x: Self with (ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8])) extends AnyVal {
      
      @scala.inline
      def setBeforeLast(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setByCallIndex(value: Double => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirst(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLast(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSecond(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThird(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
}
