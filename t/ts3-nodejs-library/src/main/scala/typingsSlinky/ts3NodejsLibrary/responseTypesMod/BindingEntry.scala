package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingEntry extends ResponseEntry {
  
  var ip: String = js.native
}
object BindingEntry {
  
  @scala.inline
  def apply(ip: String): BindingEntry = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingEntry]
  }
  
  @scala.inline
  implicit class BindingEntryMutableBuilder[Self <: BindingEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
