package typingsSlinky.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installResultMod {
  
  @js.native
  trait InstallResult extends StObject {
    
    var notUpdatedURLs: js.Array[String] = js.native
    
    var updatedURLs: js.Array[String] = js.native
  }
  object InstallResult {
    
    @scala.inline
    def apply(notUpdatedURLs: js.Array[String], updatedURLs: js.Array[String]): InstallResult = {
      val __obj = js.Dynamic.literal(notUpdatedURLs = notUpdatedURLs.asInstanceOf[js.Any], updatedURLs = updatedURLs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallResult]
    }
    
    @scala.inline
    implicit class InstallResultMutableBuilder[Self <: InstallResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotUpdatedURLs(value: js.Array[String]): Self = StObject.set(x, "notUpdatedURLs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotUpdatedURLsVarargs(value: String*): Self = StObject.set(x, "notUpdatedURLs", js.Array(value :_*))
      
      @scala.inline
      def setUpdatedURLs(value: js.Array[String]): Self = StObject.set(x, "updatedURLs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedURLsVarargs(value: String*): Self = StObject.set(x, "updatedURLs", js.Array(value :_*))
    }
  }
}
