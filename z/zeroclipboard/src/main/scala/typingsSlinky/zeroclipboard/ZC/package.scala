package typingsSlinky.zeroclipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ZC {
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  // Generic version EventHandler containers.
  // Mimicking native interfaces in lib.dom.d.ts of the same name.
  type EventListener[T /* <: typingsSlinky.zeroclipboard.ZC.ZeroClipboardEvent */] = js.Function1[/* ev */ T, scala.Unit]
  
  type EventListenerOrEventListenerObject[T /* <: typingsSlinky.zeroclipboard.ZC.ZeroClipboardEvent */] = typingsSlinky.zeroclipboard.ZC.EventListener[T] | typingsSlinky.zeroclipboard.ZC.EventListenerObject[T]
  
  type ZeroClipboardBeforeCopyEvent = typingsSlinky.zeroclipboard.ZC.ZeroClipboardEvent
}
