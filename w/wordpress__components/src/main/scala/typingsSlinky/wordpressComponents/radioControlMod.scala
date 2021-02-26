package typingsSlinky.wordpressComponents

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.baseControlMod.BaseControl.ControlProps
import typingsSlinky.wordpressComponents.radioControlMod.RadioControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioControlMod {
  
  object default {
    
    // tslint:disable-next-line:no-unnecessary-generics
    @JSImport("@wordpress/components/radio-control", JSImport.Default)
    @js.native
    def apply[T](props: Props[T]): ReactElement = js.native
  }
  
  object RadioControl {
    
    @js.native
    trait Option[T] extends StObject {
      
      /**
        * The label to be shown to the user.
        */
      var label: String = js.native
      
      /**
        * The internal value compared against select and passed to `onChange`.
        */
      var value: T = js.native
    }
    object Option {
      
      @scala.inline
      def apply[T](label: String, value: T): Option[T] = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option[T]]
      }
      
      @scala.inline
      implicit class OptionMutableBuilder[Self <: Option[_], T] (val x: Self with Option[T]) extends AnyVal {
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Props[T] extends ControlProps {
      
      /**
        * A function that receives the value of the new option that is being
        * selected as input.
        */
      def onChange(): Unit = js.native
      def onChange(value: T): Unit = js.native
      
      var options: js.UndefOr[js.Array[Option[T]]] = js.native
      
      /**
        * The value property of the currently selected option.
        */
      var selected: js.UndefOr[T] = js.native
    }
  }
}
