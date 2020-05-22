package typingsSlinky.wordpressComponents.anon

import typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.Order
import typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.OrderBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnOrderByChange extends js.Object {
  var order: Order
  var orderBy: OrderBy
  def onOrderByChange(orderBy: OrderBy): Unit
  def onOrderChange(order: Order): Unit
}

object OnOrderByChange {
  @scala.inline
  def apply(onOrderByChange: OrderBy => Unit, onOrderChange: Order => Unit, order: Order, orderBy: OrderBy): OnOrderByChange = {
    val __obj = js.Dynamic.literal(onOrderByChange = js.Any.fromFunction1(onOrderByChange), onOrderChange = js.Any.fromFunction1(onOrderChange), order = order.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOrderByChange]
  }
}

