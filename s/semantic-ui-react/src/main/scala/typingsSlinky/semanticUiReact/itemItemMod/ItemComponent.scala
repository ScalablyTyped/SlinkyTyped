package typingsSlinky.semanticUiReact.itemItemMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.itemContentMod.ItemContentProps
import typingsSlinky.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typingsSlinky.semanticUiReact.itemExtraMod.ItemExtraProps
import typingsSlinky.semanticUiReact.itemGroupMod.ItemGroupProps
import typingsSlinky.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typingsSlinky.semanticUiReact.itemImageMod.ItemImageProps
import typingsSlinky.semanticUiReact.itemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemComponent extends FunctionComponent[ItemProps] {
  var Content: ReactComponentClass[ItemContentProps] = js.native
  var Description: ReactComponentClass[ItemDescriptionProps] = js.native
  var Extra: ReactComponentClass[ItemExtraProps] = js.native
  var Group: ReactComponentClass[ItemGroupProps] = js.native
  var Header: ReactComponentClass[ItemHeaderProps] = js.native
  var Image: ReactComponentClass[ItemImageProps] = js.native
  var Meta: ReactComponentClass[ItemMetaProps] = js.native
}

