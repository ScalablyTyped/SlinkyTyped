package typingsSlinky.tstl.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "Singleton")
@js.native
class Singleton[T] protected ()
  extends typingsSlinky.tstl.tstlModuleMod.Singleton[T] {
  /**
    * Initializer Constructor.
    *
    * Create a new `Singleton` instance with the *lazy consturctor*.
    *
    * @param lazyConstructor Lazy constructor function returning the promised value.
    */
  def this(lazyConstructor: js.Function0[js.Promise[T]]) = this()
}
