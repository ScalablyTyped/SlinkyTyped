package typingsSlinky.storybookApi.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: ReactComponentClass[js.Object] | (js.Function1[/* props */ Combo, ReactComponentClass[js.Object]])
}

object Children {
  @scala.inline
  def apply(
    children: ReactComponentClass[js.Object] | (js.Function1[/* props */ Combo, ReactComponentClass[js.Object]])
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

