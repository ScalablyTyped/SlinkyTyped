package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.encodeMod.Encodable
import typingsSlinky.vegaTypings.encodeMod.GroupEncodeEntry
import typingsSlinky.vegaTypings.scopeMod.Scope
import typingsSlinky.vegaTypings.vegaTypingsStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMark
  extends BaseMark
     with Scope
     with Encodable[GroupEncodeEntry]
     with Mark {
  
  @JSName("from")
  var from_GroupMark: js.UndefOr[FromFacet] = js.native
  
  var `type`: group = js.native
}
object GroupMark {
  
  @scala.inline
  def apply(`type`: group): GroupMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMark]
  }
  
  @scala.inline
  implicit class GroupMarkMutableBuilder[Self <: GroupMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: FromFacet): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
