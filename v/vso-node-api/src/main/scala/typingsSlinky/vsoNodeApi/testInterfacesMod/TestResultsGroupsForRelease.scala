package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsGroupsForRelease extends StObject {
  
  /**
    * The group by results
    */
  var fields: js.Array[FieldDetailsForTestResults] = js.native
  
  /**
    * Release Environment Id for which groupby result is fetched.
    */
  var releaseEnvId: Double = js.native
  
  /**
    * ReleaseId for which groupby result is fetched.
    */
  var releaseId: Double = js.native
}
object TestResultsGroupsForRelease {
  
  @scala.inline
  def apply(fields: js.Array[FieldDetailsForTestResults], releaseEnvId: Double, releaseId: Double): TestResultsGroupsForRelease = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], releaseEnvId = releaseEnvId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsGroupsForRelease]
  }
  
  @scala.inline
  implicit class TestResultsGroupsForReleaseMutableBuilder[Self <: TestResultsGroupsForRelease] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[FieldDetailsForTestResults]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: FieldDetailsForTestResults*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setReleaseEnvId(value: Double): Self = StObject.set(x, "releaseEnvId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
