package typingsSlinky.semanticUiReact.listListMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.listContentMod.ListContentProps
import typingsSlinky.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typingsSlinky.semanticUiReact.listHeaderMod.ListHeaderProps
import typingsSlinky.semanticUiReact.listIconMod.ListIconProps
import typingsSlinky.semanticUiReact.listItemMod.ListItemProps
import typingsSlinky.semanticUiReact.listListListMod.ListListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListComponent extends FunctionComponent[ListProps] {
  
  var Content: ReactComponentClass[ListContentProps] = js.native
  
  var Description: ReactComponentClass[ListDescriptionProps] = js.native
  
  var Header: ReactComponentClass[ListHeaderProps] = js.native
  
  var Icon: ReactComponentClass[ListIconProps] = js.native
  
  var Item: ReactComponentClass[ListItemProps] = js.native
  
  var List: ReactComponentClass[ListListProps] = js.native
}
