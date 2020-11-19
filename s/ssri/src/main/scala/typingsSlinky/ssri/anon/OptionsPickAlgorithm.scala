package typingsSlinky.ssri.anon

import typingsSlinky.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsPickAlgorithm extends js.Object {
  
  var Promise: js.UndefOr[PromiseConstructorLike] = js.native
  
  var options: js.UndefOr[js.Array[String]] = js.native
  
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object OptionsPickAlgorithm {
  
  @scala.inline
  def apply(): OptionsPickAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPickAlgorithm]
  }
  
  @scala.inline
  implicit class OptionsPickAlgorithmOps[Self <: OptionsPickAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setPromise(value: PromiseConstructorLike): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPickAlgorithm(value: (/* algo1 */ String, /* algo2 */ String) => String): Self = this.set("pickAlgorithm", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePickAlgorithm: Self = this.set("pickAlgorithm", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
