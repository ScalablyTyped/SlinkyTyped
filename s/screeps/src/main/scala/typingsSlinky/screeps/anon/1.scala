package typingsSlinky.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var harvest: typingsSlinky.screeps.screepsNumbers.`7` = js.native
}
object `1` {
  
  @scala.inline
  def apply(harvest: typingsSlinky.screeps.screepsNumbers.`7`): `1` = {
    val __obj = js.Dynamic.literal(harvest = harvest.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHarvest(value: typingsSlinky.screeps.screepsNumbers.`7`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
