package typingsSlinky.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createDialogNode` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants")
@js.native
object CreateDialogNodeConstants extends js.Object {
  /** Whether this top-level dialog node can be digressed into. */
  @js.native
  object DigressIn extends js.Object {
    /* "does_not_return" */ val DOES_NOT_RETURN: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.DOES_NOT_RETURN with String = js.native
    /* "not_available" */ val NOT_AVAILABLE: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.NOT_AVAILABLE with String = js.native
    /* "returns" */ val RETURNS: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.RETURNS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn with String
      ] = js.native
  }
  
  /** Whether this dialog node can be returned to after a digression. */
  @js.native
  object DigressOut extends js.Object {
    /* "allow_all" */ val ALLOW_ALL: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL with String = js.native
    /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN with String = js.native
    /* "allow_returning" */ val ALLOW_RETURNING: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_RETURNING with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut with String
      ] = js.native
  }
  
  /** Whether the user can digress to top-level nodes while filling out slots. */
  @js.native
  object DigressOutSlots extends js.Object {
    /* "allow_all" */ val ALLOW_ALL: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_ALL with String = js.native
    /* "allow_returning" */ val ALLOW_RETURNING: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING with String = js.native
    /* "not_allowed" */ val NOT_ALLOWED: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots with String
      ] = js.native
  }
  
  /** How an `event_handler` node is processed. */
  @js.native
  object EventName extends js.Object {
    /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT with String = js.native
    /* "filled" */ val FILLED: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED with String = js.native
    /* "filled_multiple" */ val FILLED_MULTIPLE: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED_MULTIPLE with String = js.native
    /* "focus" */ val FOCUS: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FOCUS with String = js.native
    /* "generic" */ val GENERIC: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.GENERIC with String = js.native
    /* "input" */ val INPUT: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.INPUT with String = js.native
    /* "nomatch" */ val NOMATCH: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH with String = js.native
    /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED with String = js.native
    /* "validate" */ val VALIDATE: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.VALIDATE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName with String
      ] = js.native
  }
  
  /** How the dialog node is processed. */
  @js.native
  object NodeType extends js.Object {
    /* "event_handler" */ val EVENT_HANDLER: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.EVENT_HANDLER with String = js.native
    /* "folder" */ val FOLDER: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FOLDER with String = js.native
    /* "frame" */ val FRAME: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FRAME with String = js.native
    /* "response_condition" */ val RESPONSE_CONDITION: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.RESPONSE_CONDITION with String = js.native
    /* "slot" */ val SLOT: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.SLOT with String = js.native
    /* "standard" */ val STANDARD: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.STANDARD with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType with String
      ] = js.native
  }
  
}

