package typingsSlinky.storybookUi

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.storybookUi.anon.WithLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containersPreviewMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/containers/preview", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WithLoader] = js.native
  
  /* Inlined @storybook/api.@storybook/api.StoriesHash[keyof @storybook/api.@storybook/api.StoriesHash] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookUi.storybookUiStrings.kind
    - typingsSlinky.storybookUi.storybookUiStrings.children
    - typingsSlinky.storybookUi.storybookUiStrings.refId
    - typingsSlinky.storybookUi.storybookUiStrings.isComponent
    - typingsSlinky.storybookUi.storybookUiStrings.depth
    - typingsSlinky.storybookUi.storybookUiStrings.parent
    - typingsSlinky.storybookUi.storybookUiStrings.isLeaf
    - typingsSlinky.storybookUi.storybookUiStrings.args
    - typingsSlinky.storybookUi.storybookUiStrings.parameters
    - typingsSlinky.storybookUi.storybookUiStrings.name
    - typingsSlinky.storybookUi.storybookUiStrings.id
    - typingsSlinky.storybookUi.storybookUiStrings.isRoot
  */
  trait Item extends StObject
  object Item {
    
    @scala.inline
    def args: typingsSlinky.storybookUi.storybookUiStrings.args = "args".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.args]
    
    @scala.inline
    def children: typingsSlinky.storybookUi.storybookUiStrings.children = "children".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.children]
    
    @scala.inline
    def depth: typingsSlinky.storybookUi.storybookUiStrings.depth = "depth".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.depth]
    
    @scala.inline
    def id: typingsSlinky.storybookUi.storybookUiStrings.id = "id".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.id]
    
    @scala.inline
    def isComponent: typingsSlinky.storybookUi.storybookUiStrings.isComponent = "isComponent".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.isComponent]
    
    @scala.inline
    def isLeaf: typingsSlinky.storybookUi.storybookUiStrings.isLeaf = "isLeaf".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.isLeaf]
    
    @scala.inline
    def isRoot: typingsSlinky.storybookUi.storybookUiStrings.isRoot = "isRoot".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.isRoot]
    
    @scala.inline
    def kind: typingsSlinky.storybookUi.storybookUiStrings.kind = "kind".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.kind]
    
    @scala.inline
    def name: typingsSlinky.storybookUi.storybookUiStrings.name = "name".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.name]
    
    @scala.inline
    def parameters: typingsSlinky.storybookUi.storybookUiStrings.parameters = "parameters".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.parameters]
    
    @scala.inline
    def parent: typingsSlinky.storybookUi.storybookUiStrings.parent = "parent".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.parent]
    
    @scala.inline
    def refId: typingsSlinky.storybookUi.storybookUiStrings.refId = "refId".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.refId]
  }
  
  type _To = ReactComponentClass[WithLoader]
  
  /* This means you don't have to write `default`, but can instead just say `containersPreviewMod.foo` */
  override def _to: ReactComponentClass[WithLoader] = default
}
