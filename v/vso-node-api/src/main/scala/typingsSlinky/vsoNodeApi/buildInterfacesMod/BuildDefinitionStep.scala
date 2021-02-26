package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionStep extends StObject {
  
  /**
    * Indicates whether this step should run even if a previous step fails.
    */
  var alwaysRun: Boolean = js.native
  
  /**
    * A condition that determines whether this step should run.
    */
  var condition: String = js.native
  
  /**
    * Indicates whether the phase should continue even if this step fails.
    */
  var continueOnError: Boolean = js.native
  
  /**
    * The display name for this step.
    */
  var displayName: String = js.native
  
  /**
    * Indicates whether the step is enabled.
    */
  var enabled: Boolean = js.native
  
  var environment: StringDictionary[String] = js.native
  
  var inputs: StringDictionary[String] = js.native
  
  /**
    * The reference name for this step.
    */
  var refName: String = js.native
  
  /**
    * The task associated with this step.
    */
  var task: TaskDefinitionReference = js.native
  
  /**
    * The time, in minutes, that this step is allowed to run.
    */
  var timeoutInMinutes: Double = js.native
}
object BuildDefinitionStep {
  
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    environment: StringDictionary[String],
    inputs: StringDictionary[String],
    refName: String,
    task: TaskDefinitionReference,
    timeoutInMinutes: Double
  ): BuildDefinitionStep = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionStep]
  }
  
  @scala.inline
  implicit class BuildDefinitionStepMutableBuilder[Self <: BuildDefinitionStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefName(value: String): Self = StObject.set(x, "refName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: TaskDefinitionReference): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
