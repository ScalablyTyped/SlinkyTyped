package typingsSlinky.three

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("three/src/loaders/Loader", "Loader")
  @js.native
  class Loader () extends StObject {
    def this(manager: LoadingManager) = this()
    
    /**
    	 * @default 'anonymous'
    	 */
    var crossOrigin: String = js.native
    
    /*
    	load(): void;
    	parse(): void;
    	*/
    def loadAsync(url: String): js.Promise[_] = js.native
    def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent, Unit]): js.Promise[_] = js.native
    
    var manager: LoadingManager = js.native
    
    /**
    	 * @default ''
    	 */
    var path: String = js.native
    
    /**
    	 * @default {}
    	 */
    var requestHeader: StringDictionary[String] = js.native
    
    /**
    	 * @default ''
    	 */
    var resourcePath: String = js.native
    
    def setCrossOrigin(crossOrigin: String): this.type = js.native
    
    def setPath(path: String): this.type = js.native
    
    def setRequestHeader(requestHeader: StringDictionary[String]): this.type = js.native
    
    def setResourcePath(resourcePath: String): this.type = js.native
    
    def setWithCredentials(value: Boolean): this.type = js.native
    
    /**
    	 * @default: false
    	 */
    var withCredentials: Boolean = js.native
  }
}
