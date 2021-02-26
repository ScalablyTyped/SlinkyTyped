package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsContext extends StObject {
  
  var build: BuildReference = js.native
  
  var contextType: TestResultsContextType = js.native
  
  var release: ReleaseReference = js.native
}
object TestResultsContext {
  
  @scala.inline
  def apply(build: BuildReference, contextType: TestResultsContextType, release: ReleaseReference): TestResultsContext = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsContext]
  }
  
  @scala.inline
  implicit class TestResultsContextMutableBuilder[Self <: TestResultsContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: BuildReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextType(value: TestResultsContextType): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ReleaseReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
