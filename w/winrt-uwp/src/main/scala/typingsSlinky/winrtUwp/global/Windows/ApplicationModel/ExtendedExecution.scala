package typingsSlinky.winrtUwp.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a mechanism for applications to execute when they are not in the foreground. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution")
@js.native
object ExtendedExecution extends js.Object {
  
  /** Describes the reason for the background execution request. */
  @js.native
  object ExtendedExecutionReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason with Double
      ] = js.native
    
    /* 1 */ val locationTracking: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.locationTracking with Double = js.native
    
    /* 2 */ val savingData: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.savingData with Double = js.native
    
    /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.unspecified with Double = js.native
  }
  
  /** Specifies the possible background execution request result values. */
  @js.native
  object ExtendedExecutionResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult with Double
      ] = js.native
    
    /* 0 */ val allowed: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.allowed with Double = js.native
    
    /* 1 */ val denied: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.denied with Double = js.native
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when the system revokes background execution. */
  @js.native
  abstract class ExtendedExecutionRevokedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedEventArgs
  
  /** Describes the reason background execution was revoked. */
  @js.native
  object ExtendedExecutionRevokedReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason with Double
      ] = js.native
    
    /* 0 */ val resumed: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.resumed with Double = js.native
    
    /* 1 */ val systemPolicy: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.systemPolicy with Double = js.native
  }
  
  /** Supports managing a request for background execution. */
  @js.native
  /** Creates an ExtendedExecutionSession object. */
  class ExtendedExecutionSession ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession
  
  /** Provides a mechanism for applications to perform extended execution while they are in the foreground. */
  @js.native
  object Foreground extends js.Object {
    
    /** Describes the reason for the extended execution request. */
    @js.native
    object ExtendedExecutionForegroundReason extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason with Double
          ] = js.native
      
      /* 2 */ val backgroundAudio: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.backgroundAudio with Double = js.native
      
      /* 1 */ val savingData: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.savingData with Double = js.native
      
      /* 3 */ val unconstrained: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.unconstrained with Double = js.native
      
      /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.unspecified with Double = js.native
    }
    
    /** Specifies the possible extended execution request result values. */
    @js.native
    object ExtendedExecutionForegroundResult extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult with Double
          ] = js.native
      
      /* 0 */ val allowed: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult.allowed with Double = js.native
      
      /* 1 */ val denied: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult.denied with Double = js.native
    }
    
    /** Passed to the event handler that is invoked when the system revokes extended execution. */
    @js.native
    abstract class ExtendedExecutionForegroundRevokedEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedEventArgs
    
    /** Describes the reason extended execution was revoked. */
    @js.native
    object ExtendedExecutionForegroundRevokedReason extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason with Double
          ] = js.native
      
      /* 0 */ val resumed: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason.resumed with Double = js.native
      
      /* 1 */ val systemPolicy: typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason.systemPolicy with Double = js.native
    }
    
    /** Supports managing a request for extended foreground execution. */
    @js.native
    /** Creates an ExtendedExecutionForegroundSession object */
    class ExtendedExecutionForegroundSession ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundSession
  }
}
