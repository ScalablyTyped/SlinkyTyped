package typingsSlinky.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorMod {
  
  @js.native
  trait Job extends StObject {
    
    var arg: js.Any = js.native
    
    var context: js.Any = js.native
    
    def handle(arg: js.Any): js.Any = js.native
    
    def reject(arg: js.Any): js.Any = js.native
    
    def resolve(arg: js.Any): js.Any = js.native
    
    var task: Task = js.native
  }
  object Job {
    
    @scala.inline
    def apply(
      arg: js.Any,
      context: js.Any,
      handle: js.Any => js.Any,
      reject: js.Any => js.Any,
      resolve: js.Any => js.Any,
      task: Task
    ): Job = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], handle = js.Any.fromFunction1(handle), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve), task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    @scala.inline
    implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: js.Any => js.Any): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReject(value: js.Any => js.Any): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: js.Any => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JobExecutor extends StObject {
    
    def add(task: Task, context: js.Any, arg: js.Any, errorHandler: js.Any): js.Any = js.native
  }
  object JobExecutor {
    
    @scala.inline
    def apply(add: (Task, js.Any, js.Any, js.Any) => js.Any): JobExecutor = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add))
      __obj.asInstanceOf[JobExecutor]
    }
    
    @scala.inline
    implicit class JobExecutorMutableBuilder[Self <: JobExecutor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (Task, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait Task extends StObject
}
