package typingsSlinky.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var upgradeController: typingsSlinky.screeps.screepsNumbers.`2` = js.native
}
object `5` {
  
  @scala.inline
  def apply(upgradeController: typingsSlinky.screeps.screepsNumbers.`2`): `5` = {
    val __obj = js.Dynamic.literal(upgradeController = upgradeController.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpgradeController(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = StObject.set(x, "upgradeController", value.asInstanceOf[js.Any])
  }
}
