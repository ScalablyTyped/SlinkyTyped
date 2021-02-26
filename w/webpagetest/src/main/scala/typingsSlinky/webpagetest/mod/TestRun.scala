package typingsSlinky.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRun extends StObject {
  
  var firstView: js.Any = js.native
}
object TestRun {
  
  @scala.inline
  def apply(firstView: js.Any): TestRun = {
    val __obj = js.Dynamic.literal(firstView = firstView.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRun]
  }
  
  @scala.inline
  implicit class TestRunMutableBuilder[Self <: TestRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstView(value: js.Any): Self = StObject.set(x, "firstView", value.asInstanceOf[js.Any])
  }
}
