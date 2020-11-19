package typingsSlinky.wordpressComponents.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Icon {
  
  // prettier-ignore
  type AdditionalProps[T] = js.Object | typingsSlinky.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement]
  
  type IconType[P] = typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon | slinky.core.ReactComponentClass[P] | slinky.core.facade.ReactElement
  
  type Props[P] = typingsSlinky.wordpressComponents.iconMod.Icon.BaseProps[P] with typingsSlinky.wordpressComponents.iconMod.Icon.AdditionalProps[typingsSlinky.wordpressComponents.iconMod.Icon.IconType[P]]
}
