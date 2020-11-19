package typingsSlinky.sinonChrome.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "contentSettings")
@js.native
object contentSettings extends js.Object {
  
  var cookies: StubbedContentSetting = js.native
  
  var images: StubbedContentSetting = js.native
  
  var javascript: StubbedContentSetting = js.native
  
  var notifications: StubbedContentSetting = js.native
  
  var plugins: StubbedContentSetting = js.native
  
  var popups: StubbedContentSetting = js.native
  
  @js.native
  trait StubbedContentSetting extends js.Object {
    
    // Methods
    def clear(args: js.Any*): js.Any = js.native
    @JSName("clear")
    var clear_Original: SinonChromeStub = js.native
    
    // Methods
    def get(args: js.Any*): js.Any = js.native
    
    // Methods
    def getResourceIdentifiers(args: js.Any*): js.Any = js.native
    @JSName("getResourceIdentifiers")
    var getResourceIdentifiers_Original: SinonChromeStub = js.native
    
    @JSName("get")
    var get_Original: SinonChromeStub = js.native
    
    // Methods
    def set(args: js.Any*): js.Any = js.native
    @JSName("set")
    var set_Original: SinonChromeStub = js.native
  }
}
