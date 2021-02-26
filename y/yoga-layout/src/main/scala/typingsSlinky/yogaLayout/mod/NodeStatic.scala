package typingsSlinky.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeStatic extends StObject {
  
  def create(): YogaNode = js.native
  
  def createDefault(): YogaNode = js.native
  
  def createWithConfig(config: YogaConfig): YogaNode = js.native
  
  def destroy(node: YogaNode): js.Any = js.native
}
object NodeStatic {
  
  @scala.inline
  def apply(
    create: () => YogaNode,
    createDefault: () => YogaNode,
    createWithConfig: YogaConfig => YogaNode,
    destroy: YogaNode => js.Any
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), createDefault = js.Any.fromFunction0(createDefault), createWithConfig = js.Any.fromFunction1(createWithConfig), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[NodeStatic]
  }
  
  @scala.inline
  implicit class NodeStaticMutableBuilder[Self <: NodeStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => YogaNode): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateDefault(value: () => YogaNode): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWithConfig(value: YogaConfig => YogaNode): Self = StObject.set(x, "createWithConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: YogaNode => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
  }
}
