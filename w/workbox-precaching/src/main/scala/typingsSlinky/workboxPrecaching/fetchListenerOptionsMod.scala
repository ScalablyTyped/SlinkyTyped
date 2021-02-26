package typingsSlinky.workboxPrecaching

import org.scalajs.dom.experimental.URL
import typingsSlinky.workboxPrecaching.anon.Url
import typingsSlinky.workboxPrecaching.urlmanipulationMod.URLManipulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchListenerOptionsMod {
  
  @js.native
  trait FetchListenerOptions extends StObject {
    
    var cleanURLs: js.UndefOr[Boolean] = js.native
    
    var directoryIndex: js.UndefOr[String] = js.native
    
    var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.native
    
    var urlManipulation: js.UndefOr[URLManipulation] = js.native
  }
  object FetchListenerOptions {
    
    @scala.inline
    def apply(): FetchListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchListenerOptions]
    }
    
    @scala.inline
    implicit class FetchListenerOptionsMutableBuilder[Self <: FetchListenerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanURLs(value: Boolean): Self = StObject.set(x, "cleanURLs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanURLsUndefined: Self = StObject.set(x, "cleanURLs", js.undefined)
      
      @scala.inline
      def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
      
      @scala.inline
      def setIgnoreURLParametersMatching(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignoreURLParametersMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreURLParametersMatchingUndefined: Self = StObject.set(x, "ignoreURLParametersMatching", js.undefined)
      
      @scala.inline
      def setIgnoreURLParametersMatchingVarargs(value: js.RegExp*): Self = StObject.set(x, "ignoreURLParametersMatching", js.Array(value :_*))
      
      @scala.inline
      def setUrlManipulation(value: /* url */ Url => js.Array[URL]): Self = StObject.set(x, "urlManipulation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlManipulationUndefined: Self = StObject.set(x, "urlManipulation", js.undefined)
    }
  }
}
