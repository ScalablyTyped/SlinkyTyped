package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`40`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsRange extends StObject {
  
  var className: operator = js.native
  
  var cooldown: typingsSlinky.screeps.screepsNumbers.`8` = js.native
  
  var duration: typingsSlinky.screeps.screepsNumbers.`10` = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`20`, 
    typingsSlinky.screeps.screepsNumbers.`21`, 
    typingsSlinky.screeps.screepsNumbers.`22`, 
    typingsSlinky.screeps.screepsNumbers.`23`, 
    typingsSlinky.screeps.screepsNumbers.`24`
  ] = js.native
  
  var ops: js.Tuple5[
    `50`, 
    `40`, 
    typingsSlinky.screeps.screepsNumbers.`30`, 
    typingsSlinky.screeps.screepsNumbers.`20`, 
    typingsSlinky.screeps.screepsNumbers.`10`
  ] = js.native
  
  var range: `50` = js.native
}
object OpsRange {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: typingsSlinky.screeps.screepsNumbers.`8`,
    duration: typingsSlinky.screeps.screepsNumbers.`10`,
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`20`, 
      typingsSlinky.screeps.screepsNumbers.`21`, 
      typingsSlinky.screeps.screepsNumbers.`22`, 
      typingsSlinky.screeps.screepsNumbers.`23`, 
      typingsSlinky.screeps.screepsNumbers.`24`
    ],
    ops: js.Tuple5[
      `50`, 
      `40`, 
      typingsSlinky.screeps.screepsNumbers.`30`, 
      typingsSlinky.screeps.screepsNumbers.`20`, 
      typingsSlinky.screeps.screepsNumbers.`10`
    ],
    range: `50`
  ): OpsRange = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsRange]
  }
  
  @scala.inline
  implicit class OpsRangeMutableBuilder[Self <: OpsRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: typingsSlinky.screeps.screepsNumbers.`8`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: typingsSlinky.screeps.screepsNumbers.`10`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`20`, 
          typingsSlinky.screeps.screepsNumbers.`21`, 
          typingsSlinky.screeps.screepsNumbers.`22`, 
          typingsSlinky.screeps.screepsNumbers.`23`, 
          typingsSlinky.screeps.screepsNumbers.`24`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(
      value: js.Tuple5[
          `50`, 
          `40`, 
          typingsSlinky.screeps.screepsNumbers.`30`, 
          typingsSlinky.screeps.screepsNumbers.`20`, 
          typingsSlinky.screeps.screepsNumbers.`10`
        ]
    ): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: `50`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
