package typingsSlinky.slocket

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("slocket", JSImport.Namespace)
  @js.native
  class ^ protected () extends Slocket {
    def this(lockFile: String) = this()
    def this(lockFile: String, cb: js.Function2[/* error */ js.Error | Null, /* lock */ Lock, Unit]) = this()
  }
  @JSImport("slocket", JSImport.Namespace)
  @js.native
  val ^ : Slocket = js.native
  
  @js.native
  trait Lock extends StObject {
    
    def release(): Unit = js.native
    def release(sync: Boolean): Unit = js.native
  }
  
  @js.native
  trait Slocket
    extends EventEmitter
       with Instantiable1[/* lockFile */ String, Slocket]
       with Instantiable2[
          /* lockFile */ String, 
          /* cb */ js.Function2[/* error */ js.Error | Null, /* lock */ Lock, Unit], 
          Slocket
        ] {
    
    def apply(lockFile: String): Slocket = js.native
    def apply(lockFile: String, cb: js.Function2[/* error */ js.Error | Null, /* lock */ Lock, Unit]): Slocket = js.native
    
    def `catch`[TResult](): js.Promise[Lock | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Lock | TResult] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Lock, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Lock, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  type _To = Slocket
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Slocket = ^
}
