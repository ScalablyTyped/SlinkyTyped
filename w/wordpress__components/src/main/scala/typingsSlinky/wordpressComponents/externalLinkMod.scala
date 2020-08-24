package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.wordpressComponents.externalLinkMod.ExternalLink.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/external-link", JSImport.Namespace)
@js.native
object externalLinkMod extends js.Object {
  @js.native
  object ExternalLink extends js.Object {
    type Props = HTMLProps[HTMLAnchorElement]
  }
  
  @js.native
  object default extends TopLevel[ReactComponentClass[Props]]
  
}

