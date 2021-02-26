package typingsSlinky.sinon.mod

import typingsSlinky.sinon.anon.Get
import typingsSlinky.sinon.sinonStrings.get
import typingsSlinky.sinon.sinonStrings.set
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSpyStatic extends StObject {
  
  /**
    * Creates an anonymous function that records arguments, this value, exceptions and return values for all calls.
    */
  def apply(): SinonSpy[js.Array[_], _] = js.native
  /**
    * Spies on the provided function
    */
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](func: F): SinonSpy[Parameters[F], ReturnType[F]] = js.native
  /**
    * Creates a spy for object.method and replaces the original method with the spy.
    * An exception is thrown if the property is not already a function.
    * The spy acts exactly like the original method in all cases.
    * The original method can be restored by calling object.method.restore().
    * The returned spy is the function object which replaced the original method. spy === object.method.
    */
  def apply[T, K /* <: /* keyof T */ String */](obj: T, method: K): SinonSpy[_ | js.Array[_], _] = js.native
  def apply[T, K /* <: /* keyof T */ String */](obj: T, method: K, types: js.Array[get | set]): js.PropertyDescriptor with (Get[T, K]) = js.native
}
