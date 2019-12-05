package typingsSlinky.weixinDashApp.wx

import typingsSlinky.weixinDashApp.Anon_Bottom
import typingsSlinky.weixinDashApp.Anon_Dataset
import typingsSlinky.weixinDashApp.Anon_Height
import typingsSlinky.weixinDashApp.Anon_Id
import typingsSlinky.weixinDashApp.Anon_PropertiesAny
import typingsSlinky.weixinDashApp.Anon_ScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: Anon_Dataset
  var id: Anon_Id
  var properties: Anon_PropertiesAny
  var rect: Anon_Bottom
  var scrollOffset: Anon_ScrollLeft
  var size: Anon_Height
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: Anon_Dataset,
    id: Anon_Id,
    properties: Anon_PropertiesAny,
    rect: Anon_Bottom,
    scrollOffset: Anon_ScrollLeft,
    size: Anon_Height
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}

