package typingsSlinky.sinonMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonStub extends js.Object {
  
  /**
    * When called, the stub will create a new stub to represent a mongoose chained function.
    */
  def chain(name: String): SinonStub = js.native
}
object SinonStub {
  
  @scala.inline
  def apply(chain: String => SinonStub): SinonStub = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain))
    __obj.asInstanceOf[SinonStub]
  }
  
  @scala.inline
  implicit class SinonStubOps[Self <: SinonStub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChain(value: String => SinonStub): Self = this.set("chain", js.Any.fromFunction1(value))
  }
}
