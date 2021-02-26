package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloneOperationInformation extends StObject {
  
  var cloneStatistics: CloneStatistics = js.native
  
  /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
  var completionDate: js.Date = js.native
  
  /**
    * DateTime when the operation was started
    */
  var creationDate: js.Date = js.native
  
  /**
    * Shallow reference of the destination
    */
  var destinationObject: ShallowReference = js.native
  
  /**
    * Shallow reference of the destination
    */
  var destinationPlan: ShallowReference = js.native
  
  /**
    * Shallow reference of the destination
    */
  var destinationProject: ShallowReference = js.native
  
  /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
  var message: String = js.native
  
  /**
    * The ID of the operation
    */
  var opId: Double = js.native
  
  /**
    * The type of the object generated as a result of the Clone operation
    */
  var resultObjectType: ResultObjectType = js.native
  
  /**
    * Shallow reference of the source
    */
  var sourceObject: ShallowReference = js.native
  
  /**
    * Shallow reference of the source
    */
  var sourcePlan: ShallowReference = js.native
  
  /**
    * Shallow reference of the source
    */
  var sourceProject: ShallowReference = js.native
  
  /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
  var state: CloneOperationState = js.native
  
  /**
    * Url for geting the clone information
    */
  var url: String = js.native
}
object CloneOperationInformation {
  
  @scala.inline
  def apply(
    cloneStatistics: CloneStatistics,
    completionDate: js.Date,
    creationDate: js.Date,
    destinationObject: ShallowReference,
    destinationPlan: ShallowReference,
    destinationProject: ShallowReference,
    message: String,
    opId: Double,
    resultObjectType: ResultObjectType,
    sourceObject: ShallowReference,
    sourcePlan: ShallowReference,
    sourceProject: ShallowReference,
    state: CloneOperationState,
    url: String
  ): CloneOperationInformation = {
    val __obj = js.Dynamic.literal(cloneStatistics = cloneStatistics.asInstanceOf[js.Any], completionDate = completionDate.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], destinationObject = destinationObject.asInstanceOf[js.Any], destinationPlan = destinationPlan.asInstanceOf[js.Any], destinationProject = destinationProject.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], opId = opId.asInstanceOf[js.Any], resultObjectType = resultObjectType.asInstanceOf[js.Any], sourceObject = sourceObject.asInstanceOf[js.Any], sourcePlan = sourcePlan.asInstanceOf[js.Any], sourceProject = sourceProject.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneOperationInformation]
  }
  
  @scala.inline
  implicit class CloneOperationInformationMutableBuilder[Self <: CloneOperationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneStatistics(value: CloneStatistics): Self = StObject.set(x, "cloneStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionDate(value: js.Date): Self = StObject.set(x, "completionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationObject(value: ShallowReference): Self = StObject.set(x, "destinationObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPlan(value: ShallowReference): Self = StObject.set(x, "destinationPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationProject(value: ShallowReference): Self = StObject.set(x, "destinationProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpId(value: Double): Self = StObject.set(x, "opId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultObjectType(value: ResultObjectType): Self = StObject.set(x, "resultObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceObject(value: ShallowReference): Self = StObject.set(x, "sourceObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePlan(value: ShallowReference): Self = StObject.set(x, "sourcePlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceProject(value: ShallowReference): Self = StObject.set(x, "sourceProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CloneOperationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
