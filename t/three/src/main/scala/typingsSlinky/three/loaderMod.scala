package typingsSlinky.three

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/loaders/Loader", JSImport.Namespace)
@js.native
object loaderMod extends js.Object {
  
  @js.native
  class Loader () extends js.Object {
    def this(manager: LoadingManager) = this()
    
    var crossOrigin: String = js.native
    
    /*
    	load(): void;
    	parse(): void;
    	*/
    def loadAsync(url: String): js.Promise[_] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent, Unit]): js.Promise[_] = js.native
    
    var manager: LoadingManager = js.native
    
    var path: String = js.native
    
    var requestHeader: StringDictionary[String] = js.native
    
    var resourcePath: String = js.native
    
    def setCrossOrigin(crossOrigin: String): this.type = js.native
    
    def setPath(path: String): this.type = js.native
    
    def setRequestHeader(requestHeader: StringDictionary[String]): this.type = js.native
    
    def setResourcePath(resourcePath: String): this.type = js.native
  }
}
