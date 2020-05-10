package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.mountNodeMod.default
import typingsSlinky.semanticUiReact.mountNodeMountNodeMod.MountNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MountNode {
  @JSImport("semantic-ui-react/dist/commonjs/addons/MountNode", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeRefObject(value: ReactRef[_]): this.type = set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeFunction1(value: /* instance */ _ | Null => Unit): this.type = set("node", js.Any.fromFunction1(value))
    @scala.inline
    def nodeHTMLElement(value: HTMLElement): this.type = set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def node(value: HTMLElement | typingsSlinky.react.mod.Ref[_]): this.type = set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeNull: this.type = set("node", null)
  }
  
  def withProps(p: MountNodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MountNode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

