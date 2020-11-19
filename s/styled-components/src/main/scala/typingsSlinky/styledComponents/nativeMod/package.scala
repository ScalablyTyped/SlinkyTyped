package typingsSlinky.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nativeMod {
  
  type AnyIfEmpty[T /* <: js.Object */] = T
  
  type ReactNativeThemedStyledFunction[C /* <: slinky.core.ReactComponentClass[_] */, T /* <: js.Object */] = typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = typingsSlinky.styledComponents.nativeMod.ReactNativeThemedBaseStyledInterface[typingsSlinky.styledComponents.nativeMod.AnyIfEmpty[T]]
}
