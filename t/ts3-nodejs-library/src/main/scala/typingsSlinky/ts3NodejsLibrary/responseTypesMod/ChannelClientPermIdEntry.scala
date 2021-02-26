package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelClientPermIdEntry extends ResponseEntry {
  
  var cid: String = js.native
  
  var cldbid: String = js.native
  
  var permid: Double = js.native
  
  var permnegated: Boolean = js.native
  
  var permskip: Boolean = js.native
  
  var permvalue: Double = js.native
}
object ChannelClientPermIdEntry {
  
  @scala.inline
  def apply(
    cid: String,
    cldbid: String,
    permid: Double,
    permnegated: Boolean,
    permskip: Boolean,
    permvalue: Double
  ): ChannelClientPermIdEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelClientPermIdEntry]
  }
  
  @scala.inline
  implicit class ChannelClientPermIdEntryMutableBuilder[Self <: ChannelClientPermIdEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}
