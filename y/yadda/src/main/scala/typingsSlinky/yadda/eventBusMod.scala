package typingsSlinky.yadda

import typingsSlinky.yadda.contextMod.Properties
import typingsSlinky.yadda.yaddaStrings.__ON_DEFINE__
import typingsSlinky.yadda.yaddaStrings.__ON_EXECUTE__
import typingsSlinky.yadda.yaddaStrings.__ON_SCENARIO__
import typingsSlinky.yadda.yaddaStrings.__ON_STEP__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventBusMod {
  
  @JSImport("yadda/lib/EventBus", "EventBus")
  @js.native
  class EventBus () extends StObject {
    
    def on(
      event_pattern: js.RegExp,
      callback: js.Function1[/* event */ ScenarioEvent | StepEvent | ExecuteEvent | DefineEvent, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_ONDEFINE(event_pattern: __ON_DEFINE__, callback: js.Function1[/* event */ DefineEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_ONEXECUTE(event_pattern: __ON_EXECUTE__, callback: js.Function1[/* event */ ExecuteEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_ONSCENARIO(event_pattern: __ON_SCENARIO__, callback: js.Function1[/* event */ ScenarioEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_ONSTEP(event_pattern: __ON_STEP__, callback: js.Function1[/* event */ StepEvent, Unit]): this.type = js.native
    
    @JSName("send")
    def send_ONDEFINE(event_name: __ON_DEFINE__, event_data: DefineEvent): Unit = js.native
    @JSName("send")
    def send_ONDEFINE(
      event_name: __ON_DEFINE__,
      event_data: DefineEvent,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ONEXECUTE(event_name: __ON_EXECUTE__, event_data: ExecuteEvent): Unit = js.native
    @JSName("send")
    def send_ONEXECUTE(
      event_name: __ON_EXECUTE__,
      event_data: ExecuteEvent,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ONSCENARIO(event_name: __ON_SCENARIO__, event_data: ScenarioEventData): Unit = js.native
    @JSName("send")
    def send_ONSCENARIO(
      event_name: __ON_SCENARIO__,
      event_data: ScenarioEventData,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ONSTEP(event_name: __ON_STEP__, event_data: StepEvent): Unit = js.native
    @JSName("send")
    def send_ONSTEP(
      event_name: __ON_STEP__,
      event_data: StepEvent,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
  }
  
  @JSImport("yadda/lib/EventBus", "ON_DEFINE")
  @js.native
  val ON_DEFINE: __ON_DEFINE__ = js.native
  
  @JSImport("yadda/lib/EventBus", "ON_EXECUTE")
  @js.native
  val ON_EXECUTE: __ON_EXECUTE__ = js.native
  
  @JSImport("yadda/lib/EventBus", "ON_SCENARIO")
  @js.native
  val ON_SCENARIO: __ON_SCENARIO__ = js.native
  
  @JSImport("yadda/lib/EventBus", "ON_STEP")
  @js.native
  val ON_STEP: __ON_STEP__ = js.native
  
  @JSImport("yadda/lib/EventBus", "instance")
  @js.native
  def instance(): EventBus = js.native
  
  @js.native
  trait DefineEvent extends StObject {
    
    var data: DefineEventData = js.native
    
    var name: __ON_DEFINE__ = js.native
  }
  object DefineEvent {
    
    @scala.inline
    def apply(data: DefineEventData, name: __ON_DEFINE__): DefineEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineEvent]
    }
    
    @scala.inline
    implicit class DefineEventMutableBuilder[Self <: DefineEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: DefineEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: __ON_DEFINE__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefineEventData extends StObject {
    
    var pattern: String = js.native
    
    var signature: String = js.native
  }
  object DefineEventData {
    
    @scala.inline
    def apply(pattern: String, signature: String): DefineEventData = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineEventData]
    }
    
    @scala.inline
    implicit class DefineEventDataMutableBuilder[Self <: DefineEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecuteEvent extends StObject {
    
    var data: ExecuteEventData = js.native
    
    var name: __ON_EXECUTE__ = js.native
  }
  object ExecuteEvent {
    
    @scala.inline
    def apply(data: ExecuteEventData, name: __ON_EXECUTE__): ExecuteEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteEvent]
    }
    
    @scala.inline
    implicit class ExecuteEventMutableBuilder[Self <: ExecuteEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ExecuteEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: __ON_EXECUTE__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecuteEventData extends StObject {
    
    var args: js.Array[String] = js.native
    
    var ctx: Properties = js.native
    
    var pattern: String = js.native
    
    var step: String = js.native
  }
  object ExecuteEventData {
    
    @scala.inline
    def apply(args: js.Array[String], ctx: Properties, pattern: String, step: String): ExecuteEventData = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteEventData]
    }
    
    @scala.inline
    implicit class ExecuteEventDataMutableBuilder[Self <: ExecuteEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScenarioEvent extends StObject {
    
    var data: ScenarioEventData = js.native
    
    var name: __ON_SCENARIO__ = js.native
  }
  object ScenarioEvent {
    
    @scala.inline
    def apply(data: ScenarioEventData, name: __ON_SCENARIO__): ScenarioEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioEvent]
    }
    
    @scala.inline
    implicit class ScenarioEventMutableBuilder[Self <: ScenarioEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ScenarioEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: __ON_SCENARIO__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScenarioEventData extends StObject {
    
    var ctx: Properties = js.native
    
    var scenario: js.Array[String] = js.native
  }
  object ScenarioEventData {
    
    @scala.inline
    def apply(ctx: Properties, scenario: js.Array[String]): ScenarioEventData = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioEventData]
    }
    
    @scala.inline
    implicit class ScenarioEventDataMutableBuilder[Self <: ScenarioEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenario(value: js.Array[String]): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioVarargs(value: String*): Self = StObject.set(x, "scenario", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StepEvent extends StObject {
    
    var data: StepEventData = js.native
    
    var name: __ON_STEP__ = js.native
  }
  object StepEvent {
    
    @scala.inline
    def apply(data: StepEventData, name: __ON_STEP__): StepEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepEvent]
    }
    
    @scala.inline
    implicit class StepEventMutableBuilder[Self <: StepEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StepEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: __ON_STEP__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepEventData extends StObject {
    
    var ctx: Properties = js.native
    
    var step: String = js.native
  }
  object StepEventData {
    
    @scala.inline
    def apply(ctx: Properties, step: String): StepEventData = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepEventData]
    }
    
    @scala.inline
    implicit class StepEventDataMutableBuilder[Self <: StepEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
