package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BanAdd extends ResponseEntry {
  
  var banid: String = js.native
}
object BanAdd {
  
  @scala.inline
  def apply(banid: String): BanAdd = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanAdd]
  }
  
  @scala.inline
  implicit class BanAddMutableBuilder[Self <: BanAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanid(value: String): Self = StObject.set(x, "banid", value.asInstanceOf[js.Any])
  }
}
