package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.encodeMod.AreaEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.Encodable
import typingsSlinky.vegaTypings.vegaTypingsStrings.area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaMark
  extends BaseMark
     with Encodable[AreaEncodeEntry]
     with Mark {
  
  var `type`: area = js.native
}
object AreaMark {
  
  @scala.inline
  def apply(`type`: area): AreaMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMark]
  }
  
  @scala.inline
  implicit class AreaMarkMutableBuilder[Self <: AreaMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: area): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
