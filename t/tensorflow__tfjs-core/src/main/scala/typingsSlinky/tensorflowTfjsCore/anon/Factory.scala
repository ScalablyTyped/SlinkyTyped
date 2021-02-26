package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory extends StObject {
  
  def factory(): KernelBackend | js.Promise[KernelBackend] = js.native
  
  var priority: Double = js.native
}
object Factory {
  
  @scala.inline
  def apply(factory: () => KernelBackend | js.Promise[KernelBackend], priority: Double): Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory]
  }
  
  @scala.inline
  implicit class FactoryMutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactory(value: () => KernelBackend | js.Promise[KernelBackend]): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
