package typingsSlinky.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object preactMod {
  
  type LinkProps[H /* <: typingsSlinky.wouter.useLocationMod.BaseLocationHook */] = typingsSlinky.wouter.anon.OmitHTMLAttributesEventTa with typingsSlinky.wouter.preactMod.NavigationalProps[H]
  
  type NavigationalProps[H /* <: typingsSlinky.wouter.useLocationMod.BaseLocationHook */] = (typingsSlinky.wouter.anon.HrefTo | typingsSlinky.wouter.anon.HrefPath) with typingsSlinky.wouter.useLocationMod.HookNavigationOptions[H]
  
  type RedirectProps[H /* <: typingsSlinky.wouter.useLocationMod.BaseLocationHook */] = typingsSlinky.wouter.preactMod.NavigationalProps[H] with typingsSlinky.wouter.anon.Children
}
