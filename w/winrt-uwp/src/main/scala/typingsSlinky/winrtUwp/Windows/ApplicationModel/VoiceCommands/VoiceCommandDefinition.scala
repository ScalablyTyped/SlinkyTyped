package typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables operations on a specific installed command set. */
@js.native
trait VoiceCommandDefinition extends StObject {
  
  /** Gets the language ( xml:lang ) value of the CommandSet element in the Voice Command Definition (VCD) file. */
  var language: String = js.native
  
  /** Gets the Name attribute value of the CommandSet element in the Voice Command Definition (VCD) file. */
  var name: String = js.native
  
  /**
    * Populates a PhraseList element with an array of Item elements.
    * @param phraseListName The string that corresponds to the label attribute of the PhraseList element.
    * @param phraseList A string array of values that will be added to the PhraseList element as Item elements.
    * @return A string array of values that will be added to the PhraseList element as Item elements.
    */
  def setPhraseListAsync(phraseListName: String, phraseList: IIterable[String]): IPromiseWithIAsyncAction = js.native
}
object VoiceCommandDefinition {
  
  @scala.inline
  def apply(
    language: String,
    name: String,
    setPhraseListAsync: (String, IIterable[String]) => IPromiseWithIAsyncAction
  ): VoiceCommandDefinition = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setPhraseListAsync = js.Any.fromFunction2(setPhraseListAsync))
    __obj.asInstanceOf[VoiceCommandDefinition]
  }
  
  @scala.inline
  implicit class VoiceCommandDefinitionMutableBuilder[Self <: VoiceCommandDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPhraseListAsync(value: (String, IIterable[String]) => IPromiseWithIAsyncAction): Self = StObject.set(x, "setPhraseListAsync", js.Any.fromFunction2(value))
  }
}
