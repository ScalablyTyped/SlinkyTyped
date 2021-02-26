package typingsSlinky.watsonDeveloperCloud.sdkMod

import typingsSlinky.watsonDeveloperCloud.mod.Options
import typingsSlinky.watsonDeveloperCloud.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IBM Watson&trade; Assistant service combines machine learning, natural language understanding, and integrated dialog tools to create conversation flows between your apps and your users.
  */
@JSImport("watson-developer-cloud/sdk", "AssistantV1")
@js.native
class AssistantV1 protected () extends ^ {
  /**
    * Construct a AssistantV1 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/assistant/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.username] - The username used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.password] - The password used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {AssistantV1}
    * @throws {Error}
    */
  def this(options: Options) = this()
}
object AssistantV1 {
  
  @JSImport("watson-developer-cloud/sdk", "AssistantV1")
  @js.native
  val ^ : js.Any = js.native
  
  /** Constants for the `createDialogNode` operation. */
  object CreateDialogNodeConstants {
    
    /** Whether this top-level dialog node can be digressed into. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.DigressIn")
    @js.native
    object DigressIn extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn with String
          ] = js.native
      
      /* "does_not_return" */ val DOES_NOT_RETURN: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.DOES_NOT_RETURN with String = js.native
      
      /* "not_available" */ val NOT_AVAILABLE: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.NOT_AVAILABLE with String = js.native
      
      /* "returns" */ val RETURNS: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressIn.RETURNS with String = js.native
    }
    
    /** Whether this dialog node can be returned to after a digression. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.DigressOut")
    @js.native
    object DigressOut extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut with String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL with String = js.native
      
      /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN with String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOut.ALLOW_RETURNING with String = js.native
    }
    
    /** Whether the user can digress to top-level nodes while filling out slots. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.DigressOutSlots")
    @js.native
    object DigressOutSlots extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots with String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_ALL with String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING with String = js.native
      
      /* "not_allowed" */ val NOT_ALLOWED: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED with String = js.native
    }
    
    /** How an `event_handler` node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.EventName")
    @js.native
    object EventName extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName with String
          ] = js.native
      
      /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT with String = js.native
      
      /* "filled" */ val FILLED: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED with String = js.native
      
      /* "filled_multiple" */ val FILLED_MULTIPLE: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FILLED_MULTIPLE with String = js.native
      
      /* "focus" */ val FOCUS: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.FOCUS with String = js.native
      
      /* "generic" */ val GENERIC: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.GENERIC with String = js.native
      
      /* "input" */ val INPUT: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.INPUT with String = js.native
      
      /* "nomatch" */ val NOMATCH: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH with String = js.native
      
      /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED with String = js.native
      
      /* "validate" */ val VALIDATE: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.EventName.VALIDATE with String = js.native
    }
    
    /** How the dialog node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateDialogNodeConstants.NodeType")
    @js.native
    object NodeType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType with String
          ] = js.native
      
      /* "event_handler" */ val EVENT_HANDLER: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.EVENT_HANDLER with String = js.native
      
      /* "folder" */ val FOLDER: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FOLDER with String = js.native
      
      /* "frame" */ val FRAME: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.FRAME with String = js.native
      
      /* "response_condition" */ val RESPONSE_CONDITION: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.RESPONSE_CONDITION with String = js.native
      
      /* "slot" */ val SLOT: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.SLOT with String = js.native
      
      /* "standard" */ val STANDARD: typingsSlinky.watsonDeveloperCloud.mod.CreateDialogNodeConstants.NodeType.STANDARD with String = js.native
    }
  }
  
  /** Constants for the `createValue` operation. */
  object CreateValueConstants {
    
    /** Specifies the type of entity value. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateValueConstants.ValueType")
    @js.native
    object ValueType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.CreateValueConstants.ValueType with String
          ] = js.native
      
      /* "patterns" */ val PATTERNS: typingsSlinky.watsonDeveloperCloud.mod.CreateValueConstants.ValueType.PATTERNS with String = js.native
      
      /* "synonyms" */ val SYNONYMS: typingsSlinky.watsonDeveloperCloud.mod.CreateValueConstants.ValueType.SYNONYMS with String = js.native
    }
  }
  
  /** Constants for the `getWorkspace` operation. */
  object GetWorkspaceConstants {
    
    /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.GetWorkspaceConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.GetWorkspaceConstants.Sort with String] = js.native
      
      /* "stable" */ val STABLE: typingsSlinky.watsonDeveloperCloud.mod.GetWorkspaceConstants.Sort.STABLE with String = js.native
    }
  }
  
  /** Constants for the `listCounterexamples` operation. */
  object ListCounterexamplesConstants {
    
    /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListCounterexamplesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort with String
          ] = js.native
      
      /* "text" */ val TEXT: typingsSlinky.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort.TEXT with String = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort.UPDATED with String = js.native
    }
  }
  
  /** Constants for the `listDialogNodes` operation. */
  object ListDialogNodesConstants {
    
    /** The attribute by which returned dialog nodes will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListDialogNodesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort with String] = js.native
      
      /* "dialog_node" */ val DIALOG_NODE: typingsSlinky.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort.DIALOG_NODE with String = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort.UPDATED with String = js.native
    }
  }
  
  /** Constants for the `listEntities` operation. */
  object ListEntitiesConstants {
    
    /** The attribute by which returned entities will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListEntitiesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort with String] = js.native
      
      /* "entity" */ val ENTITY: typingsSlinky.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort.ENTITY with String = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort.UPDATED with String = js.native
    }
  }
  
  /** Constants for the `listExamples` operation. */
  object ListExamplesConstants {
    
    /** The attribute by which returned examples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListExamplesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListExamplesConstants.Sort with String] = js.native
      
      /* "text" */ val TEXT: typingsSlinky.watsonDeveloperCloud.mod.ListExamplesConstants.Sort.TEXT with String = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListExamplesConstants.Sort.UPDATED with String = js.native
    }
  }
  
  /** Constants for the `listIntents` operation. */
  object ListIntentsConstants {
    
    /** The attribute by which returned intents will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListIntentsConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListIntentsConstants.Sort with String] = js.native
      
      /* "intent" */ val INTENT: typingsSlinky.watsonDeveloperCloud.mod.ListIntentsConstants.Sort.INTENT with String = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListIntentsConstants.Sort.UPDATED with String = js.native
    }
  }
  
  /** Constants for the `listSynonyms` operation. */
  object ListSynonymsConstants {
    
    /** The attribute by which returned entity value synonyms will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListSynonymsConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListSynonymsConstants.Sort with String] = js.native
      
      /* "synonym" */ val SYNONYM: typingsSlinky.watsonDeveloperCloud.mod.ListSynonymsConstants.Sort.SYNONYM with String = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListSynonymsConstants.Sort.UPDATED with String = js.native
    }
  }
  
  /** Constants for the `listValues` operation. */
  object ListValuesConstants {
    
    /** The attribute by which returned entity values will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListValuesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListValuesConstants.Sort with String] = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListValuesConstants.Sort.UPDATED with String = js.native
      
      /* "value" */ val VALUE: typingsSlinky.watsonDeveloperCloud.mod.ListValuesConstants.Sort.VALUE with String = js.native
    }
  }
  
  /** Constants for the `listWorkspaces` operation. */
  object ListWorkspacesConstants {
    
    /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.ListWorkspacesConstants.Sort")
    @js.native
    object Sort extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.watsonDeveloperCloud.mod.ListWorkspacesConstants.Sort with String] = js.native
      
      /* "name" */ val NAME: typingsSlinky.watsonDeveloperCloud.mod.ListWorkspacesConstants.Sort.NAME with String = js.native
      
      /* "updated" */ val UPDATED: typingsSlinky.watsonDeveloperCloud.mod.ListWorkspacesConstants.Sort.UPDATED with String = js.native
    }
  }
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "AssistantV1.URL")
  @js.native
  def URL: String = js.native
  @scala.inline
  def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  
  /** Constants for the `updateDialogNode` operation. */
  object UpdateDialogNodeConstants {
    
    /** Whether this top-level dialog node can be digressed into. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.DigressIn")
    @js.native
    object DigressIn extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn with String
          ] = js.native
      
      /* "does_not_return" */ val DOES_NOT_RETURN: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn.DOES_NOT_RETURN with String = js.native
      
      /* "not_available" */ val NOT_AVAILABLE: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn.NOT_AVAILABLE with String = js.native
      
      /* "returns" */ val RETURNS: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn.RETURNS with String = js.native
    }
    
    /** Whether this dialog node can be returned to after a digression. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.DigressOut")
    @js.native
    object DigressOut extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut with String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL with String = js.native
      
      /* "allow_all_never_return" */ val ALLOW_ALL_NEVER_RETURN: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut.ALLOW_ALL_NEVER_RETURN with String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut.ALLOW_RETURNING with String = js.native
    }
    
    /** Whether the user can digress to top-level nodes while filling out slots. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.DigressOutSlots")
    @js.native
    object DigressOutSlots extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots with String
          ] = js.native
      
      /* "allow_all" */ val ALLOW_ALL: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_ALL with String = js.native
      
      /* "allow_returning" */ val ALLOW_RETURNING: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots.ALLOW_RETURNING with String = js.native
      
      /* "not_allowed" */ val NOT_ALLOWED: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots.NOT_ALLOWED with String = js.native
    }
    
    /** How an `event_handler` node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.EventName")
    @js.native
    object EventName extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName with String
          ] = js.native
      
      /* "digression_return_prompt" */ val DIGRESSION_RETURN_PROMPT: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.DIGRESSION_RETURN_PROMPT with String = js.native
      
      /* "filled" */ val FILLED: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.FILLED with String = js.native
      
      /* "filled_multiple" */ val FILLED_MULTIPLE: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.FILLED_MULTIPLE with String = js.native
      
      /* "focus" */ val FOCUS: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.FOCUS with String = js.native
      
      /* "generic" */ val GENERIC: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.GENERIC with String = js.native
      
      /* "input" */ val INPUT: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.INPUT with String = js.native
      
      /* "nomatch" */ val NOMATCH: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.NOMATCH with String = js.native
      
      /* "nomatch_responses_depleted" */ val NOMATCH_RESPONSES_DEPLETED: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.NOMATCH_RESPONSES_DEPLETED with String = js.native
      
      /* "validate" */ val VALIDATE: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName.VALIDATE with String = js.native
    }
    
    /** How the dialog node is processed. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateDialogNodeConstants.NodeType")
    @js.native
    object NodeType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType with String
          ] = js.native
      
      /* "event_handler" */ val EVENT_HANDLER: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.EVENT_HANDLER with String = js.native
      
      /* "folder" */ val FOLDER: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.FOLDER with String = js.native
      
      /* "frame" */ val FRAME: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.FRAME with String = js.native
      
      /* "response_condition" */ val RESPONSE_CONDITION: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.RESPONSE_CONDITION with String = js.native
      
      /* "slot" */ val SLOT: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.SLOT with String = js.native
      
      /* "standard" */ val STANDARD: typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType.STANDARD with String = js.native
    }
  }
  
  /** Constants for the `updateValue` operation. */
  object UpdateValueConstants {
    
    /** Specifies the type of entity value. */
    @JSImport("watson-developer-cloud/sdk", "AssistantV1.UpdateValueConstants.ValueType")
    @js.native
    object ValueType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType with String
          ] = js.native
      
      /* "patterns" */ val PATTERNS: typingsSlinky.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType.PATTERNS with String = js.native
      
      /* "synonyms" */ val SYNONYMS: typingsSlinky.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType.SYNONYMS with String = js.native
    }
  }
}
