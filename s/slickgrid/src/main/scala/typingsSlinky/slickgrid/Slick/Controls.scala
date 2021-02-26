package typingsSlinky.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  @js.native
  trait ColumnPicker[T /* <: SlickData */] extends StObject {
    
    def destroy(): Unit = js.native
    
    def getAllColumns(): js.Array[Column[T]] = js.native
  }
  object ColumnPicker {
    
    @scala.inline
    def apply[T /* <: SlickData */](destroy: () => Unit, getAllColumns: () => js.Array[Column[T]]): ColumnPicker[T] = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAllColumns = js.Any.fromFunction0(getAllColumns))
      __obj.asInstanceOf[ColumnPicker[T]]
    }
    
    @scala.inline
    implicit class ColumnPickerMutableBuilder[Self <: ColumnPicker[_], T /* <: SlickData */] (val x: Self with ColumnPicker[T]) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllColumns(value: () => js.Array[Column[T]]): Self = StObject.set(x, "getAllColumns", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SlickColumnPickerOptions extends StObject {
    
    var fadeSpeed: js.UndefOr[Double] = js.native
  }
  object SlickColumnPickerOptions {
    
    @scala.inline
    def apply(): SlickColumnPickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlickColumnPickerOptions]
    }
    
    @scala.inline
    implicit class SlickColumnPickerOptionsMutableBuilder[Self <: SlickColumnPickerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFadeSpeed(value: Double): Self = StObject.set(x, "fadeSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeSpeedUndefined: Self = StObject.set(x, "fadeSpeed", js.undefined)
    }
  }
}
