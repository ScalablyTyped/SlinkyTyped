package typingsSlinky.typescript.anon

import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeArguments extends js.Object {
  
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
object TypeArguments {
  
  @scala.inline
  def apply(): TypeArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeArguments]
  }
  
  @scala.inline
  implicit class TypeArgumentsOps[Self <: TypeArguments] (val x: Self) extends AnyVal {
    
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
    def setTypeArguments(value: NodeArray[TypeNode]): Self = this.set("typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeArguments: Self = this.set("typeArguments", js.undefined)
  }
}
