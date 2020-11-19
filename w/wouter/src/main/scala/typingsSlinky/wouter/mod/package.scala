package typingsSlinky.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LinkProps[H /* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */] = typingsSlinky.wouter.anon.OmitAnchorHTMLAttributesH with typingsSlinky.wouter.mod.NavigationalProps[H]
  
  type NavigationalProps[H /* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */] = (typingsSlinky.wouter.anon.Href | typingsSlinky.wouter.anon.To) with typingsSlinky.wouter.wouterUseLocationMod.HookNavigationOptions[H]
  
  type RedirectProps[H /* <: typingsSlinky.wouter.wouterUseLocationMod.BaseLocationHook */] = typingsSlinky.wouter.mod.NavigationalProps[H] with typingsSlinky.wouter.anon.Children
}
