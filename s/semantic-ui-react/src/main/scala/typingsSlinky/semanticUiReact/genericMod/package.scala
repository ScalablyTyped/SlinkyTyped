package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object genericMod {
  
  type SemanticShorthandCollection[TProps] = js.Array[typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem[TProps]]
  
  type SemanticShorthandContent = slinky.core.facade.ReactElement
  
  type SemanticShorthandItem[TProps /* <: typingsSlinky.std.Record[java.lang.String, _] */] = slinky.core.facade.ReactElement | typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItemFunc[TProps] | ((typingsSlinky.std.Omit[TProps, typingsSlinky.semanticUiReact.semanticUiReactStrings.children]) with typingsSlinky.semanticUiReact.anon.`0`[TProps])
  
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ slinky.core.facade.ReactElement, 
    /* props */ TProps, 
    /* children */ js.UndefOr[slinky.core.facade.ReactElement | typingsSlinky.react.mod.ReactNodeArray], 
    slinky.core.facade.ReactElement | scala.Null
  ]
  
  type ShorthandRenderFunction[C /* <: slinky.core.facade.ReactElement */, P] = js.Function2[/* Component */ C, /* props */ P, slinky.core.facade.ReactElement]
}
