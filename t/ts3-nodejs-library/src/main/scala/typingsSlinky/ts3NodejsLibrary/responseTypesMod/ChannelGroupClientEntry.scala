package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelGroupClientEntry extends ResponseEntry {
  
  var cgid: js.UndefOr[String] = js.native
  
  var cid: js.UndefOr[String] = js.native
  
  var cldbid: js.UndefOr[String] = js.native
}
object ChannelGroupClientEntry {
  
  @scala.inline
  def apply(): ChannelGroupClientEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupClientEntry]
  }
  
  @scala.inline
  implicit class ChannelGroupClientEntryMutableBuilder[Self <: ChannelGroupClientEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCgid(value: String): Self = StObject.set(x, "cgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCgidUndefined: Self = StObject.set(x, "cgid", js.undefined)
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCldbidUndefined: Self = StObject.set(x, "cldbid", js.undefined)
  }
}
