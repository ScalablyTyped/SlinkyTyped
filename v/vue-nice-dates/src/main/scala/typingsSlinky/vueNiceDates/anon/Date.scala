package typingsSlinky.vueNiceDates.anon

import typingsSlinky.vueNiceDates.sharedMod.DateLocale
import typingsSlinky.vueNiceDates.sharedMod.Modifiers
import typingsSlinky.vueNiceDates.sharedMod.ModifiersClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends js.Object {
  
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
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGridSwitch(value: Boolean): Self = this.set("enableGridSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: DateLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersClassNames(value: ModifiersClassNames): Self = this.set("modifiersClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDate(value: js.Date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    
    @scala.inline
    def setMaximumDate(value: js.Date): Self = this.set("maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDateNull: Self = this.set("maximumDate", null)
    
    @scala.inline
    def setMinimumDate(value: js.Date): Self = this.set("minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDateNull: Self = this.set("minimumDate", null)
  }
}
