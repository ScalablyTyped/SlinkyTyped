package typingsSlinky.storybookComponents.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(storybookComponents), Name(syntaxhighlighterMod), Name(Props))),IArray(),NoComments) because: Not a trait, Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object SyntaxHighlighter
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@storybook/components", "SyntaxHighlighter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.storybookComponents.syntaxhighlighterMod.Props
}

