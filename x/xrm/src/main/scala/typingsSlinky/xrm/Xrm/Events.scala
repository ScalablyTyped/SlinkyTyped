package typingsSlinky.xrm.Xrm

import typingsSlinky.xrm.Xrm.Attributes.Attribute
import typingsSlinky.xrm.Xrm.Controls.Control
import typingsSlinky.xrm.Xrm.ProcessFlow.ProcessStatus
import typingsSlinky.xrm.Xrm.ProcessFlow.Stage
import typingsSlinky.xrm.Xrm.ProcessFlow.StageChangeDirection
import typingsSlinky.xrm.XrmEnum.SaveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  /**
    * Type for a context-sensitive handler.
    * @param context The context.
    */
  type ContextSensitiveHandler = js.Function1[/* context */ EventContext, Unit]
  
  /**
    * Interface for the event context.
    * In the API documentation, this is sometimes refferred to as the executionContext.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/clientapi-execution-context External Link: Client API execution context}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/execution-context External Link: Execution context (Client API reference)}
    */
  @js.native
  trait EventContext extends StObject {
    
    /**
      * Gets the Xrm context.
      * @returns The Xrm context.
      */
    def getContext(): GlobalContext = js.native
    
    /**
      * Gets the handler's depth, which is the order in which the handler is executed.
      * @returns The depth, a 0-based index.
      */
    def getDepth(): Double = js.native
    
    /**
      * Gets a reference to the object for which event occurred.
      * @returns The event source.
      */
    def getEventSource(): Attribute | Control | Entity = js.native
    
    /**
      * Gets a reference to the currnet form context
      * @returns The {@link FormContext form context}
      */
    def getFormContext(): FormContext = js.native
    
    /**
      * @summary Gets the shared variable with the specified key.
      * @param T Generic type parameter.
      * @param key The key.
      * @returns The shared variable.
      * @desc Gets the shared variable with the specified key.
      * Used to pass values between handlers of an event.
      */
    def getSharedVariable[T](key: String): T = js.native
    
    /**
      * @summary Sets a shared variable.
      * @param T Generic type parameter.
      * @param key The key.
      * @param value The value.
      * @desc Sets the shared variable with the specified key.
      * Used to pass values between handlers of an event.
      */
    def setSharedVariable[T](key: String, value: T): Unit = js.native
  }
  object EventContext {
    
    @scala.inline
    def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventSource: () => Attribute | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => js.Any,
      setSharedVariable: (String, js.Any) => Unit
    ): EventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[EventContext]
    }
    
    @scala.inline
    implicit class EventContextMutableBuilder[Self <: EventContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContext(value: () => GlobalContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDepth(value: () => Double): Self = StObject.set(x, "getDepth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEventSource(value: () => Attribute | Control | Entity): Self = StObject.set(x, "getEventSource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFormContext(value: () => FormContext): Self = StObject.set(x, "getFormContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSharedVariable(value: String => js.Any): Self = StObject.set(x, "getSharedVariable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSharedVariable(value: (String, js.Any) => Unit): Self = StObject.set(x, "setSharedVariable", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Type for a process status change handler.
    * @param status The process status.
    */
  type ProcessStatusChangeHandler = js.Function1[/* status */ ProcessStatus, Unit]
  
  /**
    * Interface for save event arguments.
    */
  @js.native
  trait SaveEventArguments extends StObject {
    
    /**
      * @summary Gets save mode, as an integer.
      * @returns The save mode.
      * @description Gets save mode, as an integer.<BR>
      * **Values returned are**:
      * * 1      Save
      * * 2      Save and Close
      * * 59     Save and New
      * * 70     AutoSave (Where enabled; can be used with an OnSave handler to conditionally disable auto-saving)
      * * 58     Save as Completed (Activities)
      * * 5      Deactivate
      * * 6      Reactivate
      * * 47     Assign (All user- or team-owned entities)
      * * 7      Send (Email)
      * * 16     Qualify (Lead)
      * * 15     Disqualify (Lead)
      */
    def getSaveMode(): SaveMode = js.native
    
    /**
      * Returns a boolean value to indicate if the record's save has been prevented.
      * @returns true if saving is prevented, otherwise false.
      */
    def isDefaultPrevented(): Boolean = js.native
    
    /**
      * Prevents the save operation from being submitted to the server.
      * All remaining "on save" handlers will continue execution.
      */
    def preventDefault(): Unit = js.native
  }
  object SaveEventArguments {
    
    @scala.inline
    def apply(getSaveMode: () => SaveMode, isDefaultPrevented: () => Boolean, preventDefault: () => Unit): SaveEventArguments = {
      val __obj = js.Dynamic.literal(getSaveMode = js.Any.fromFunction0(getSaveMode), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[SaveEventArguments]
    }
    
    @scala.inline
    implicit class SaveEventArgumentsMutableBuilder[Self <: SaveEventArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSaveMode(value: () => SaveMode): Self = StObject.set(x, "getSaveMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for a save event context
    */
  @js.native
  trait SaveEventContext extends EventContext {
    
    /**
      * Gets save-event arguments.
      * @returns The event arguments.  Returns null for all but the "save" event.
      */
    def getEventArgs(): SaveEventArguments = js.native
  }
  object SaveEventContext {
    
    @scala.inline
    def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => SaveEventArguments,
      getEventSource: () => Attribute | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => js.Any,
      setSharedVariable: (String, js.Any) => Unit
    ): SaveEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[SaveEventContext]
    }
    
    @scala.inline
    implicit class SaveEventContextMutableBuilder[Self <: SaveEventContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEventArgs(value: () => SaveEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for process stage change event arguments.
    */
  @js.native
  trait StageChangeEventArguments extends StObject {
    
    /**
      * Gets the direction of the stage change.
      * @returns The direction: "next" or "previous"
      */
    def getDirection(): StageChangeDirection = js.native
    
    /**
      * Gets the destination stage object
      * @returns The stage object. For switching between entities, returns the previous stage object
      */
    def getStage(): Stage = js.native
    
    /**
      * Prevents the stage or status change operation from being submitted to the server.
      */
    def preventDefault(): Unit = js.native
  }
  object StageChangeEventArguments {
    
    @scala.inline
    def apply(getDirection: () => StageChangeDirection, getStage: () => Stage, preventDefault: () => Unit): StageChangeEventArguments = {
      val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction0(getDirection), getStage = js.Any.fromFunction0(getStage), preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[StageChangeEventArguments]
    }
    
    @scala.inline
    implicit class StageChangeEventArgumentsMutableBuilder[Self <: StageChangeEventArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDirection(value: () => StageChangeDirection): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStage(value: () => Stage): Self = StObject.set(x, "getStage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for a process stage change event context
    */
  @js.native
  trait StageChangeEventContext extends EventContext {
    
    /**
      * Gets process stage change event arguments.
      * @returns The event arguments.
      */
    def getEventArgs(): StageChangeEventArguments = js.native
  }
  object StageChangeEventContext {
    
    @scala.inline
    def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => StageChangeEventArguments,
      getEventSource: () => Attribute | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => js.Any,
      setSharedVariable: (String, js.Any) => Unit
    ): StageChangeEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[StageChangeEventContext]
    }
    
    @scala.inline
    implicit class StageChangeEventContextMutableBuilder[Self <: StageChangeEventContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEventArgs(value: () => StageChangeEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for process stage selected event arguments.
    */
  @js.native
  trait StageSelectedEventArguments extends StObject {
    
    /**
      * Gets the selected stage object
      * @returns The stage object
      */
    def getStage(): Stage = js.native
  }
  object StageSelectedEventArguments {
    
    @scala.inline
    def apply(getStage: () => Stage): StageSelectedEventArguments = {
      val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage))
      __obj.asInstanceOf[StageSelectedEventArguments]
    }
    
    @scala.inline
    implicit class StageSelectedEventArgumentsMutableBuilder[Self <: StageSelectedEventArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStage(value: () => Stage): Self = StObject.set(x, "getStage", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait StageSelectedEventContext extends EventContext {
    
    /**
      * Gets process stage selected event arguments.
      * @returns The event arguments.
      */
    def getEventArgs(): StageSelectedEventArguments = js.native
  }
  object StageSelectedEventContext {
    
    @scala.inline
    def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => StageSelectedEventArguments,
      getEventSource: () => Attribute | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => js.Any,
      setSharedVariable: (String, js.Any) => Unit
    ): StageSelectedEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[StageSelectedEventContext]
    }
    
    @scala.inline
    implicit class StageSelectedEventContextMutableBuilder[Self <: StageSelectedEventContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEventArgs(value: () => StageSelectedEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
}
