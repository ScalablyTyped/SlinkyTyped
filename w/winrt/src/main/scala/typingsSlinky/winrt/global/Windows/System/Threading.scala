package typingsSlinky.winrt.global.Windows.System

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.System.Threading.Core.SignalHandler
import typingsSlinky.winrt.Windows.System.Threading.TimerDestroyedHandler
import typingsSlinky.winrt.Windows.System.Threading.TimerElapsedHandler
import typingsSlinky.winrt.Windows.System.Threading.WorkItemHandler
import typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions
import typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading")
@js.native
object Threading extends js.Object {
  @js.native
  class ThreadPool ()
    extends typingsSlinky.winrt.Windows.System.Threading.ThreadPool
  
  @js.native
  class ThreadPoolTimer ()
    extends typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer
  
  @js.native
  object Core extends js.Object {
    @js.native
    class PreallocatedWorkItem protected ()
      extends typingsSlinky.winrt.Windows.System.Threading.Core.PreallocatedWorkItem {
      def this(handler: WorkItemHandler) = this()
      def this(handler: WorkItemHandler, priority: WorkItemPriority) = this()
      def this(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions) = this()
    }
    
    @js.native
    class SignalNotifier ()
      extends typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier
    
    /* static members */
    @js.native
    object SignalNotifier extends js.Object {
      def attachToEvent(name: String, handler: SignalHandler): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
      def attachToEvent(name: String, handler: SignalHandler, timeout: Double): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
      def attachToSemaphore(name: String, handler: SignalHandler): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
      def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object ThreadPool extends js.Object {
    def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
    def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
  }
  
  /* static members */
  @js.native
  object ThreadPoolTimer extends js.Object {
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
    def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
    def createTimer(handler: TimerElapsedHandler, delay: Double): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
    def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
  }
  
  @js.native
  object WorkItemOptions extends js.Object {
    /* 0 */ val none: typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions.none with Double = js.native
    /* 1 */ val timeSliced: typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions.timeSliced with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions with Double] = js.native
  }
  
  @js.native
  object WorkItemPriority extends js.Object {
    /* 2 */ val high: typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority.high with Double = js.native
    /* 0 */ val low: typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority.low with Double = js.native
    /* 1 */ val normal: typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority with Double] = js.native
  }
  
}

