package typingsSlinky.webpackbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait File extends StObject {
    
    val file: Null | String = js.native
    
    val loaders: js.Array[String] = js.native
  }
  object File {
    
    @scala.inline
    def apply(loaders: js.Array[String]): File = {
      val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNull: Self = StObject.set(x, "file", null)
      
      @scala.inline
      def setLoaders(value: js.Array[String]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadersVarargs(value: String*): Self = StObject.set(x, "loaders", js.Array(value :_*))
    }
  }
}
