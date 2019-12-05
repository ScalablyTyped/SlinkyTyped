package typingsSlinky.atStorybookComponents.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookComponents.distSyntaxhighlighterSyntaxhighlighterMod.ReactSyntaxHighlighterProps
import typingsSlinky.atStorybookComponents.distSyntaxhighlighterSyntaxhighlighterMod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object SyntaxHighlighter
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atStorybookComponents.atStorybookComponentsMod.SyntaxHighlighter
    ] {
  @JSImport("@storybook/components", "SyntaxHighlighter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SyntaxHighlighterProps with ReactSyntaxHighlighterProps
}

