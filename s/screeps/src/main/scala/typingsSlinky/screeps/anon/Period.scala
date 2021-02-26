package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`100`
import typingsSlinky.screeps.screepsNumbers.`150`
import typingsSlinky.screeps.screepsNumbers.`200`
import typingsSlinky.screeps.screepsNumbers.`250`
import typingsSlinky.screeps.screepsNumbers.`300`
import typingsSlinky.screeps.screepsNumbers.`50`
import typingsSlinky.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Period extends StObject {
  
  var className: operator = js.native
  
  var cooldown: `100` = js.native
  
  var duration: `300` = js.native
  
  var effect: js.Tuple5[`50`, `100`, `150`, `200`, `250`] = js.native
  
  var level: js.Tuple5[
    typingsSlinky.screeps.screepsNumbers.`10`, 
    typingsSlinky.screeps.screepsNumbers.`11`, 
    typingsSlinky.screeps.screepsNumbers.`12`, 
    typingsSlinky.screeps.screepsNumbers.`14`, 
    typingsSlinky.screeps.screepsNumbers.`22`
  ] = js.native
  
  var period: typingsSlinky.screeps.screepsNumbers.`15` = js.native
  
  var range: typingsSlinky.screeps.screepsNumbers.`3` = js.native
}
object Period {
  
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: `300`,
    effect: js.Tuple5[`50`, `100`, `150`, `200`, `250`],
    level: js.Tuple5[
      typingsSlinky.screeps.screepsNumbers.`10`, 
      typingsSlinky.screeps.screepsNumbers.`11`, 
      typingsSlinky.screeps.screepsNumbers.`12`, 
      typingsSlinky.screeps.screepsNumbers.`14`, 
      typingsSlinky.screeps.screepsNumbers.`22`
    ],
    period: typingsSlinky.screeps.screepsNumbers.`15`,
    range: typingsSlinky.screeps.screepsNumbers.`3`
  ): Period = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Period]
  }
  
  @scala.inline
  implicit class PeriodMutableBuilder[Self <: Period] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `100`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `300`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Tuple5[`50`, `100`, `150`, `200`, `250`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typingsSlinky.screeps.screepsNumbers.`10`, 
          typingsSlinky.screeps.screepsNumbers.`11`, 
          typingsSlinky.screeps.screepsNumbers.`12`, 
          typingsSlinky.screeps.screepsNumbers.`14`, 
          typingsSlinky.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: typingsSlinky.screeps.screepsNumbers.`15`): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typingsSlinky.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
