package typingsSlinky.tarn

import typingsSlinky.tarn.promiseInspectionMod.PromiseInspectionArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error[T] extends PromiseInspectionArgs[T] {
    
    var error: js.UndefOr[js.Error] = js.native
    
    var value: T = js.native
  }
  object Error {
    
    @scala.inline
    def apply[T](value: T): Error[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error[T]]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error[_], T] (val x: Self with Error[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value[T] extends PromiseInspectionArgs[T] {
    
    var error: js.Error = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  object Value {
    
    @scala.inline
    def apply[T](error: js.Error): Value[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[_], T] (val x: Self with Value[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
