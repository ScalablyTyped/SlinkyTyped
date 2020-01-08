package typingsSlinky.slateDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.slateDashReact.slateDashReactMod.EditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(slateDashReact), Name(slateDashReactMod), Name(EditorProps))) was not a @ScalaJSDefined trait */
object Editor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.slateDashReact.slateDashReactMod.Editor] {
  @JSImport("slate-react", "Editor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = EditorProps[typingsSlinky.slateDashReact.slateDashReactMod.Editor]
}

