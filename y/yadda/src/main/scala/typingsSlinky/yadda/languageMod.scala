package typingsSlinky.yadda

import typingsSlinky.yadda.yaddaBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageMod {
  
  @JSImport("yadda/lib/localisation/Language", JSImport.Namespace)
  @js.native
  class ^[TLibrary /* <: Library */] protected () extends Language[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @js.native
  trait Language[TLibrary /* <: Library */] extends StObject {
    
    var is_language: `true` = js.native
    
    def library(): TLibrary = js.native
    def library(dictionary: typingsSlinky.yadda.dictionaryMod.^): TLibrary = js.native
    
    def localise(keyword: String): String = js.native
    
    def localise_library(library: Library): TLibrary = js.native
  }
  
  @js.native
  trait Library extends StObject
  
  @js.native
  trait Vocabulary extends StObject {
    
    var _steps: js.Array[String] = js.native
  }
  object Vocabulary {
    
    @scala.inline
    def apply(_steps: js.Array[String]): Vocabulary = {
      val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vocabulary]
    }
    
    @scala.inline
    implicit class VocabularyMutableBuilder[Self <: Vocabulary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_steps(value: js.Array[String]): Self = StObject.set(x, "_steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stepsVarargs(value: String*): Self = StObject.set(x, "_steps", js.Array(value :_*))
    }
  }
}
