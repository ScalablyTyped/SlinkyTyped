package typingsSlinky.seatsio.anon

import typingsSlinky.seatsio.seatsioStrings.row
import typingsSlinky.seatsio.seatsioStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var `type`: row | table = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: row | table): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: row | table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
