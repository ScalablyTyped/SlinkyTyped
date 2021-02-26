package typingsSlinky.storybookAddonLinks

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routedLinkMod extends Shortcut {
  
  @JSImport("@storybook/addon-links/dist/react/components/RoutedLink", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]] = js.native
  
  type _To = ReactComponentClass[DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]]
  
  /* This means you don't have to write `default`, but can instead just say `routedLinkMod.foo` */
  override def _to: ReactComponentClass[DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]] = default
}
