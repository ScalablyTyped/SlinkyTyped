package typingsSlinky.speedtestNet.mod

import typingsSlinky.speedtestNet.anon.Dynamic
import typingsSlinky.speedtestNet.anon.Latency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteData extends StObject {
  
  var global: Dynamic = js.native
  
  var testStage: Latency = js.native
}
object SuiteData {
  
  @scala.inline
  def apply(global: Dynamic, testStage: Latency): SuiteData = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], testStage = testStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteData]
  }
  
  @scala.inline
  implicit class SuiteDataMutableBuilder[Self <: SuiteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobal(value: Dynamic): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStage(value: Latency): Self = StObject.set(x, "testStage", value.asInstanceOf[js.Any])
  }
}
