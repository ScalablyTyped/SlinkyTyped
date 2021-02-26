package typingsSlinky.stylableUniDriver

import typingsSlinky.stylableUniDriver.typesMod.ElementRemoteApi
import typingsSlinky.stylableUniDriver.typesMod.MinimalStylesheet
import typingsSlinky.stylableUniDriver.typesMod.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniDriverMod {
  
  @JSImport("@stylable/uni-driver/cjs/uni-driver", "StylableUnidriverUtil")
  @js.native
  class StylableUnidriverUtil protected () extends StObject {
    def this(stylesheet: MinimalStylesheet) = this()
    
    var getBaseStateWithParam: js.Any = js.native
    
    def getStateValueFromClassName(cls: String, baseState: String): String = js.native
    
    def getStyleState(base: ElementRemoteApi, stateName: String): js.Promise[String | Boolean | Null] = js.native
    
    def hasStyleState(base: ElementRemoteApi, stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: ElementRemoteApi, stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    var stylesheet: js.Any = js.native
  }
}
