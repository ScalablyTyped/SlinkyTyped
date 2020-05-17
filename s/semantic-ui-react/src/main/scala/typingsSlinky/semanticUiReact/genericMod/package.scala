package typingsSlinky.semanticUiReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object genericMod {
  type SemanticShorthandCollection[TProps] = js.Array[typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem[TProps]]
  type SemanticShorthandContent = slinky.core.TagMod[scala.Any]
  type SemanticShorthandItemFunc[TProps] = js.Function3[
    /* component */ slinky.core.ReactComponentClass[TProps], 
    /* props */ TProps, 
    /* children */ js.UndefOr[slinky.core.TagMod[scala.Any] | typingsSlinky.react.mod.ReactNodeArray], 
    slinky.core.facade.ReactElement | scala.Null
  ]
}
