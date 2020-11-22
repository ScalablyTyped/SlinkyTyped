package typingsSlinky.storybookClientApi.storyStoreMod

import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.LoaderFunction
import typingsSlinky.storybookAddons.typesMod.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/client-api.@storybook/client-api/dist/types.StoryMetadata & {  order :number} */
@js.native
trait KindMetadata extends js.Object {
  
  var decorators: js.UndefOr[js.Array[DecoratorFunction[_]]] = js.native
  
  var loaders: js.UndefOr[js.Array[LoaderFunction]] = js.native
  
  var order: Double = js.native
  
  var parameters: js.UndefOr[Parameters] = js.native
}
object KindMetadata {
  
  @scala.inline
  def apply(order: Double): KindMetadata = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[KindMetadata]
  }
  
  @scala.inline
  implicit class KindMetadataOps[Self <: KindMetadata] (val x: Self) extends AnyVal {
    
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
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsVarargs(value: DecoratorFunction[js.Any]*): Self = this.set("decorators", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: js.Array[DecoratorFunction[_]]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setLoadersVarargs(value: LoaderFunction*): Self = this.set("loaders", js.Array(value :_*))
    
    @scala.inline
    def setLoaders(value: js.Array[LoaderFunction]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaders: Self = this.set("loaders", js.undefined)
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
