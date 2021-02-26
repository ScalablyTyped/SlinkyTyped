package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.dateMod.DatePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeMod {
  
  object DatePicker extends Shortcut {
    
    @JSImport("@wordpress/components/date-time", "DatePicker")
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `DatePicker.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DateTimePicker extends Shortcut {
    
    @JSImport("@wordpress/components/date-time", "DateTimePicker")
    @js.native
    val ^ : ComponentType[typingsSlinky.wordpressComponents.dateTimeMod.DateTimePicker.Props] = js.native
    
    /* Inlined std.Omit<@wordpress/components.@wordpress/components/date-time/date.default.Props, 'isInvalidDate'> */
    @js.native
    trait Props extends StObject {
      
      var currentDate: js.UndefOr[String] = js.native
      
      var is12Hour: js.UndefOr[Boolean] = js.native
      
      var onChange: js.Function1[/* currentDate */ String, Unit] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onChange: /* currentDate */ String => Unit): typingsSlinky.wordpressComponents.dateTimeMod.DateTimePicker.Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
        __obj.asInstanceOf[typingsSlinky.wordpressComponents.dateTimeMod.DateTimePicker.Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: typingsSlinky.wordpressComponents.dateTimeMod.DateTimePicker.Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
        
        @scala.inline
        def setIs12Hour(value: Boolean): Self = StObject.set(x, "is12Hour", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIs12HourUndefined: Self = StObject.set(x, "is12Hour", js.undefined)
        
        @scala.inline
        def setOnChange(value: /* currentDate */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      }
    }
    
    type _To = ComponentType[typingsSlinky.wordpressComponents.dateTimeMod.DateTimePicker.Props]
    
    /* This means you don't have to write `^`, but can instead just say `DateTimePicker.foo` */
    override def _to: ComponentType[typingsSlinky.wordpressComponents.dateTimeMod.DateTimePicker.Props] = ^
  }
  
  object TimePicker extends Shortcut {
    
    @JSImport("@wordpress/components/date-time", "TimePicker")
    @js.native
    val ^ : ComponentType[typingsSlinky.wordpressComponents.timeMod.TimePicker.Props] = js.native
    
    type _To = ComponentType[typingsSlinky.wordpressComponents.timeMod.TimePicker.Props]
    
    /* This means you don't have to write `^`, but can instead just say `TimePicker.foo` */
    override def _to: ComponentType[typingsSlinky.wordpressComponents.timeMod.TimePicker.Props] = ^
  }
}
