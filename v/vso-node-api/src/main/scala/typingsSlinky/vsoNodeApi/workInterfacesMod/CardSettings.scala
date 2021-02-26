package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardSettings extends StObject {
  
  /**
    * A collection of settings related to rendering of fields on cards
    */
  var fields: CardFieldSettings = js.native
}
object CardSettings {
  
  @scala.inline
  def apply(fields: CardFieldSettings): CardSettings = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardSettings]
  }
  
  @scala.inline
  implicit class CardSettingsMutableBuilder[Self <: CardSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: CardFieldSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
