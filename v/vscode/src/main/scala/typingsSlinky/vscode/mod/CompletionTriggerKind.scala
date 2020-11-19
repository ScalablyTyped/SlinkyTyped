package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionTriggerKind extends js.Object
@JSImport("vscode", "CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
  
  /**
    * Completion was triggered normally.
    */
  @js.native
  sealed trait Invoke extends CompletionTriggerKind
  /* 0 */ @js.native
  object Invoke extends TopLevel[Invoke with Double]
  
  /**
    * Completion was triggered by a trigger character.
    */
  @js.native
  sealed trait TriggerCharacter extends CompletionTriggerKind
  /* 1 */ @js.native
  object TriggerCharacter extends TopLevel[TriggerCharacter with Double]
  
  /**
    * Completion was re-triggered as current completion list is incomplete
    */
  @js.native
  sealed trait TriggerForIncompleteCompletions extends CompletionTriggerKind
  /* 2 */ @js.native
  object TriggerForIncompleteCompletions extends TopLevel[TriggerForIncompleteCompletions with Double]
}
