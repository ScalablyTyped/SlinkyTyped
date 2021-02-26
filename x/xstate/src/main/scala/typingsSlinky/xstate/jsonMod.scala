package typingsSlinky.xstate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.xstate.anon.ContextAny
import typingsSlinky.xstate.mod.StateNode
import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.Guard
import typingsSlinky.xstate.typesMod.InvokeDefinition
import typingsSlinky.xstate.xstateStrings.`final`
import typingsSlinky.xstate.xstateStrings.atomic
import typingsSlinky.xstate.xstateStrings.compound
import typingsSlinky.xstate.xstateStrings.history
import typingsSlinky.xstate.xstateStrings.parallel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("xstate/lib/json", "jsonify")
  @js.native
  def jsonify[T /* <: Record[String, _] */](value: T): T = js.native
  
  @JSImport("xstate/lib/json", "machineToJSON")
  @js.native
  def machineToJSON(stateNode: StateNode[_, _, EventObject, ContextAny]): StateNodeConfig = js.native
  
  @JSImport("xstate/lib/json", "parse")
  @js.native
  def parse(machineString: String): StateNodeConfig = js.native
  
  @JSImport("xstate/lib/json", "stringify")
  @js.native
  def stringify(machine: StateNode[_, _, EventObject, ContextAny]): String = js.native
  
  @JSImport("xstate/lib/json", "stringifyFunction")
  @js.native
  def stringifyFunction(fn: js.Function): JSONFunction = js.native
  
  @js.native
  trait JSONFunction extends StObject {
    
    @JSName("$function")
    var $function: String = js.native
  }
  object JSONFunction {
    
    @scala.inline
    def apply($function: String): JSONFunction = {
      val __obj = js.Dynamic.literal($function = $function.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONFunction]
    }
    
    @scala.inline
    implicit class JSONFunctionMutableBuilder[Self <: JSONFunction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$function(value: String): Self = StObject.set(x, "$function", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateNodeConfig extends StObject {
    
    var entry: js.Array[ActionObject[_, _]] = js.native
    
    var exit: js.Array[ActionObject[_, _]] = js.native
    
    var id: String = js.native
    
    var initial: js.UndefOr[String] = js.native
    
    var invoke: js.Array[InvokeDefinition[_, _]] = js.native
    
    var key: String = js.native
    
    var on: StringDictionary[js.Array[TransitionConfig]] = js.native
    
    var states: Record[String, StateNodeConfig] = js.native
    
    var `type`: atomic | compound | parallel | `final` | history = js.native
  }
  object StateNodeConfig {
    
    @scala.inline
    def apply(
      entry: js.Array[ActionObject[_, _]],
      exit: js.Array[ActionObject[_, _]],
      id: String,
      invoke: js.Array[InvokeDefinition[_, _]],
      key: String,
      on: StringDictionary[js.Array[TransitionConfig]],
      states: Record[String, StateNodeConfig],
      `type`: atomic | compound | parallel | `final` | history
    ): StateNodeConfig = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateNodeConfig]
    }
    
    @scala.inline
    implicit class StateNodeConfigMutableBuilder[Self <: StateNodeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: js.Array[ActionObject[_, _]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryVarargs(value: (ActionObject[js.Any, js.Any])*): Self = StObject.set(x, "entry", js.Array(value :_*))
      
      @scala.inline
      def setExit(value: js.Array[ActionObject[_, _]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitVarargs(value: (ActionObject[js.Any, js.Any])*): Self = StObject.set(x, "exit", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setInvoke(value: js.Array[InvokeDefinition[_, _]]): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeVarargs(value: (InvokeDefinition[js.Any, js.Any])*): Self = StObject.set(x, "invoke", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: StringDictionary[js.Array[TransitionConfig]]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStates(value: Record[String, StateNodeConfig]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: atomic | compound | parallel | `final` | history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransitionConfig extends StObject {
    
    var actions: js.Array[ActionObject[_, _]] = js.native
    
    var cond: js.UndefOr[Guard[_, _]] = js.native
    
    var eventType: String = js.native
    
    var source: String = js.native
    
    var target: js.Array[String] = js.native
  }
  object TransitionConfig {
    
    @scala.inline
    def apply(actions: js.Array[ActionObject[_, _]], eventType: String, source: String, target: js.Array[String]): TransitionConfig = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionConfig]
    }
    
    @scala.inline
    implicit class TransitionConfigMutableBuilder[Self <: TransitionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ActionObject[_, _]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: (ActionObject[js.Any, js.Any])*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setCond(value: Guard[_, _]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
      
      @scala.inline
      def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
    }
  }
}
