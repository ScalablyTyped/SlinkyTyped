package typingsSlinky.semanticUiReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object commonjsMod {
  
  type SemanticShorthandCollection[T] = js.Array[typingsSlinky.semanticUiReact.commonjsMod.SemanticShorthandItem[T]]
  
  type SemanticShorthandContent = slinky.core.facade.ReactElement
  
  type SemanticShorthandItem[T] = slinky.core.facade.ReactElement | T
}
