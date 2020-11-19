package typingsSlinky.yadda

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.yadda.chineseMod.Library
import typingsSlinky.yadda.languageMod.Vocabulary
import typingsSlinky.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yadda/lib/localisation", JSImport.Namespace)
@js.native
object localisationMod extends js.Object {
  
  @js.native
  object Chinese extends TopLevel[^[Library]]
  
  @js.native
  object Dutch
    extends TopLevel[^[typingsSlinky.yadda.dutchMod.Library]]
  
  @js.native
  object English
    extends TopLevel[^[typingsSlinky.yadda.englishMod.Library]]
  
  @js.native
  object French
    extends TopLevel[^[typingsSlinky.yadda.frenchMod.Library]]
  
  @js.native
  object German
    extends TopLevel[^[typingsSlinky.yadda.germanMod.Library]]
  
  @js.native
  class Language[TLibrary /* <: typingsSlinky.yadda.languageMod.Library */] protected () extends ^[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @js.native
  object Norwegian
    extends TopLevel[^[typingsSlinky.yadda.norwegianMod.Library]]
  
  @js.native
  object Pirate
    extends TopLevel[^[typingsSlinky.yadda.pirateMod.Library]]
  
  @js.native
  object Polish
    extends TopLevel[^[typingsSlinky.yadda.polishMod.Library]]
  
  @js.native
  object Portuguese
    extends TopLevel[^[typingsSlinky.yadda.portugueseMod.Library]]
  
  @js.native
  object Russian
    extends TopLevel[^[typingsSlinky.yadda.russianMod.Library]]
  
  @js.native
  object Spanish
    extends TopLevel[^[typingsSlinky.yadda.spanishMod.Library]]
  
  @js.native
  object Ukrainian
    extends TopLevel[^[typingsSlinky.yadda.ukrainianMod.Library]]
  
  @js.native
  object default
    extends TopLevel[^[typingsSlinky.yadda.englishMod.Library]]
}
