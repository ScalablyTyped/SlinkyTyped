package typingsSlinky.vueNiceDates.anon

import typingsSlinky.vueNiceDates.sharedMod.DateLocale
import typingsSlinky.vueNiceDates.sharedMod.Modifiers
import typingsSlinky.vueNiceDates.sharedMod.ModifiersClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends StObject {
  
  var date: js.Date | String = js.native
  
  var enableGridSwitch: Boolean = js.native
  
  var initialDate: js.UndefOr[js.Date] = js.native
  
  var locale: DateLocale = js.native
  
  var maximumDate: js.Date | Null = js.native
  
  var minimumDate: js.Date | Null = js.native
  
  var modifiers: Modifiers = js.native
  
  var modifiersClassNames: ModifiersClassNames = js.native
}
object Date {
  
  @scala.inline
  def apply(
    date: js.Date | String,
    enableGridSwitch: Boolean,
    locale: DateLocale,
    modifiers: Modifiers,
    modifiersClassNames: ModifiersClassNames
  ): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    @scala.inline
    def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
    
    @scala.inline
    def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
    
    @scala.inline
    def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
  }
}
