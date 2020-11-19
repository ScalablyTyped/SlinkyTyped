package typingsSlinky.storybookApi.storiesMod

import typingsSlinky.storybookApi.anon.DictparameterName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryInput extends js.Object {
  
  var children: js.Array[String] = js.native
  
  var id: StoryId = js.native
  
  var isLeaf: Boolean = js.native
  
  var kind: String = js.native
  
  var name: String = js.native
  
  var parameters: DictparameterName = js.native
}
object StoryInput {
  
  @scala.inline
  def apply(
    children: js.Array[String],
    id: StoryId,
    isLeaf: Boolean,
    kind: String,
    name: String,
    parameters: DictparameterName
  ): StoryInput = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryInput]
  }
  
  @scala.inline
  implicit class StoryInputOps[Self <: StoryInput] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: String*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[String]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: DictparameterName): Self = this.set("parameters", value.asInstanceOf[js.Any])
  }
}
