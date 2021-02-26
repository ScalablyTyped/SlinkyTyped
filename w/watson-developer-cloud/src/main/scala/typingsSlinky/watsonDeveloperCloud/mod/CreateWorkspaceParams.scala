package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createWorkspace` operation. */
@js.native
trait CreateWorkspaceParams extends StObject {
  
  /** An array of objects defining input examples that have been marked as irrelevant input. */
  var counterexamples: js.UndefOr[js.Array[Counterexample]] = js.native
  
  /** The description of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** An array of objects describing the dialog nodes in the workspace. */
  var dialog_nodes: js.UndefOr[js.Array[DialogNode]] = js.native
  
  /** An array of objects describing the entities for the workspace. */
  var entities: js.UndefOr[js.Array[CreateEntity]] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** An array of objects defining the intents for the workspace. */
  var intents: js.UndefOr[js.Array[CreateIntent]] = js.native
  
  /** The language of the workspace. */
  var language: js.UndefOr[String] = js.native
  
  /** Whether training data from the workspace (including artifacts such as intents and entities) can be used by IBM for general service improvements. `true` indicates that workspace training data is not to be used. */
  var learning_opt_out: js.UndefOr[Boolean] = js.native
  
  /** Any metadata related to the workspace. */
  var metadata: js.UndefOr[js.Object] = js.native
  
  /** The name of the workspace. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 64 characters. */
  var name: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Global settings for the workspace. */
  var system_settings: js.UndefOr[WorkspaceSystemSettings] = js.native
}
object CreateWorkspaceParams {
  
  @scala.inline
  def apply(): CreateWorkspaceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceParams]
  }
  
  @scala.inline
  implicit class CreateWorkspaceParamsMutableBuilder[Self <: CreateWorkspaceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounterexamples(value: js.Array[Counterexample]): Self = StObject.set(x, "counterexamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterexamplesUndefined: Self = StObject.set(x, "counterexamples", js.undefined)
    
    @scala.inline
    def setCounterexamplesVarargs(value: Counterexample*): Self = StObject.set(x, "counterexamples", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDialog_nodes(value: js.Array[DialogNode]): Self = StObject.set(x, "dialog_nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_nodesUndefined: Self = StObject.set(x, "dialog_nodes", js.undefined)
    
    @scala.inline
    def setDialog_nodesVarargs(value: DialogNode*): Self = StObject.set(x, "dialog_nodes", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[CreateEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: CreateEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIntents(value: js.Array[CreateIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: CreateIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLearning_opt_out(value: Boolean): Self = StObject.set(x, "learning_opt_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearning_opt_outUndefined: Self = StObject.set(x, "learning_opt_out", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setSystem_settings(value: WorkspaceSystemSettings): Self = StObject.set(x, "system_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_settingsUndefined: Self = StObject.set(x, "system_settings", js.undefined)
  }
}
