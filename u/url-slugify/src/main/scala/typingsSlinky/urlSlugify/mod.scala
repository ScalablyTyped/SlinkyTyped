package typingsSlinky.urlSlugify

import typingsSlinky.urlSlugify.urlSlugifyStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-slugify", JSImport.Namespace)
  @js.native
  class ^ () extends URLSlugify
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.urlSlugify.urlSlugifyStrings.`-_`
    - typingsSlinky.urlSlugify.urlSlugifyStrings._underscore
    - typingsSlinky.urlSlugify.urlSlugifyStrings.Tilde
    - typingsSlinky.urlSlugify.urlSlugifyStrings.ApostropheApostrophe
  */
  trait Separator extends StObject
  object Separator {
    
    @scala.inline
    def ApostropheApostrophe: typingsSlinky.urlSlugify.urlSlugifyStrings.ApostropheApostrophe = "''".asInstanceOf[typingsSlinky.urlSlugify.urlSlugifyStrings.ApostropheApostrophe]
    
    @scala.inline
    def Tilde: typingsSlinky.urlSlugify.urlSlugifyStrings.Tilde = "~".asInstanceOf[typingsSlinky.urlSlugify.urlSlugifyStrings.Tilde]
    
    @scala.inline
    def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    @scala.inline
    def _underscore: typingsSlinky.urlSlugify.urlSlugifyStrings._underscore = "_".asInstanceOf[typingsSlinky.urlSlugify.urlSlugifyStrings._underscore]
  }
  
  @js.native
  trait URLSlugify extends StObject {
    
    def slugify(title: String): String = js.native
    def slugify(title: String, separator: Separator): String = js.native
  }
}
