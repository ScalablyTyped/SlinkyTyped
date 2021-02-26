package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.systemMod.DayOfWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamSettingsPatch extends StObject {
  
  var backlogIteration: String = js.native
  
  var backlogVisibilities: StringDictionary[Boolean] = js.native
  
  var bugsBehavior: BugsBehavior = js.native
  
  var defaultIteration: String = js.native
  
  var defaultIterationMacro: String = js.native
  
  var workingDays: js.Array[DayOfWeek] = js.native
}
object TeamSettingsPatch {
  
  @scala.inline
  def apply(
    backlogIteration: String,
    backlogVisibilities: StringDictionary[Boolean],
    bugsBehavior: BugsBehavior,
    defaultIteration: String,
    defaultIterationMacro: String,
    workingDays: js.Array[DayOfWeek]
  ): TeamSettingsPatch = {
    val __obj = js.Dynamic.literal(backlogIteration = backlogIteration.asInstanceOf[js.Any], backlogVisibilities = backlogVisibilities.asInstanceOf[js.Any], bugsBehavior = bugsBehavior.asInstanceOf[js.Any], defaultIteration = defaultIteration.asInstanceOf[js.Any], defaultIterationMacro = defaultIterationMacro.asInstanceOf[js.Any], workingDays = workingDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsPatch]
  }
  
  @scala.inline
  implicit class TeamSettingsPatchMutableBuilder[Self <: TeamSettingsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklogIteration(value: String): Self = StObject.set(x, "backlogIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklogVisibilities(value: StringDictionary[Boolean]): Self = StObject.set(x, "backlogVisibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBugsBehavior(value: BugsBehavior): Self = StObject.set(x, "bugsBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIteration(value: String): Self = StObject.set(x, "defaultIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIterationMacro(value: String): Self = StObject.set(x, "defaultIterationMacro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDays(value: js.Array[DayOfWeek]): Self = StObject.set(x, "workingDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDaysVarargs(value: DayOfWeek*): Self = StObject.set(x, "workingDays", js.Array(value :_*))
  }
}
